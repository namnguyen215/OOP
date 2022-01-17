package Q1_PhoneNumber;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import ktra2.PTGT;

public class PhoneBook implements Functions {
    private List<PhoneNumber> db=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);
    
//    public void addPhoneNumber();
//
//    public void searchPhoneNumberByMaVung();
//
//    public void printAllPhoneNumber();
//
//    public void sumPhoneNumberByNoiVung();
//
//    public void searchByTail();
//
//    public void sortPhoneNumber();
    @Override
    public void addPhoneNumber(){
        System.out.println("Enter 'I' for international or 'L' for local:  ");
        char choice=sc.next().toUpperCase().charAt(0);
        if(choice=='I'){
            addInter();
        }
        else{
            addLocal();
        }
    }
    private void addInter() {
        String reg1="^[0-9]{2}-[0-9]{2}-[0-9]{8}";
        String reg2="^[0-9]{2}-[0-9]{3}-[0-9]{7}";
        String[] data=null;
        while(true){
            System.out.println("Enter international phone number:  ");
            String pn=sc.nextLine();
            if(pn.matches(reg1) || pn.matches(reg2)){
                System.out.println("Enter sucessfully!");
                data=pn.split("-");
                break;
            }
        }
        db.add(new IntlPhoneNumber(Integer.parseInt(data[0]),Integer.parseInt(data[1]),Integer.parseInt(data[2])));
    }

    private void addLocal() {
        String reg1="^0[0-9]{2}-[0-9]{8}";
        String reg2="^0[0-9]{3}-[0-9]{7}";
        String[] data=null;
        while(true){
            System.out.println("Enter local phone number:  ");
            String pn=sc.nextLine();
            if(pn.matches(reg1) || pn.matches(reg2)){
                System.out.println("Enter sucessfully!");
                data=pn.split("-");
                break;
            }
        }
        db.add(new PhoneNumber(Integer.parseInt(data[0]),Integer.parseInt(data[1])));
    }

    @Override
    public void searchPhoneNumberByMaVung() {
        System.out.println("Please enter ma vung:   ");
        int mv=Integer.parseInt(sc.nextLine());
        for(PhoneNumber i:db){
            if(i.getMavung()==mv){
                System.out.println(i);
            }
        }
    }

    @Override
    public void printAllPhoneNumber() {
        System.out.println("Please choose 1/2/3: ");
        System.out.println("1.Print international phone number.");
        System.out.println("2.Print local phone number.");
        System.out.println("3.Print all phone number.");
        int choice=sc.nextInt();
        boolean ok=false;
        if(choice==1){
            for(PhoneNumber i:db){
                if(i instanceof IntlPhoneNumber){
                    ok=true;
                    System.out.println(i);
                }
            }
        }
        else if(choice==2){
            for(PhoneNumber i:db){
                if(i instanceof IntlPhoneNumber == false){
                    ok=true;
                    System.out.println(i);
                }
            }           
        }
        else{
            for(PhoneNumber i:db){
                ok=true;
                System.out.println(i);
            }            
        }
        if(ok==false){
            System.out.println("Cannot find1");
        }
    }

    @Override
    public void sumPhoneNumberByNoiVung() {
        Map<Integer,Long> count=db.stream().collect(
                Collectors.groupingBy(PhoneNumber::getMavung,
                Collectors.counting()));
        System.out.println(count);
    }

    @Override
    public void searchByTail() {
        System.out.println("Nhap vao duoi dien thoai:  ");
        String tail=sc.nextLine();
        String re = tail+"$";
        boolean ok=false;
        for(PhoneNumber i:db){
            if(Pattern.compile(re).matcher(i.toString()).find()){
                ok=true;
                System.out.println(i);
            }
        }
        if(ok==false){
            System.out.println("Cannot find!");
        }
    }

    @Override
    public void sortPhoneNumber() {
            db.sort(new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return Double.compare(o1.getMavung(),o2.getMavung());//1 0 -1
            }
        });
        for(PhoneNumber i:db){
            System.out.println(i);
        }       
    }


}
