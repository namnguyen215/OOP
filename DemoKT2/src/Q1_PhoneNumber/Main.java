package Q1_PhoneNumber;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook q=new PhoneBook();
        
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. Add new phone number ");
            System.out.println("2. Search a phone number by ma vung");
            System.out.println("3. Print all phone number");
            
            System.out.println("4. Sum of all phone numbers by region");
            System.out.println("5. Search phone number by its tail");
            System.out.println("6. Sort phone number");    
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->6):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=in.nextInt();
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);//safe exit
                case 1:q.addPhoneNumber();
                       break;
                case 2:q.searchPhoneNumberByMaVung();
                       break;
                case 3:q.printAllPhoneNumber();
                       break;
                case 4:q.sumPhoneNumberByNoiVung();
                       break; 
                case 5:q.searchByTail();
                       break; 
                case 6:q.sortPhoneNumber();
                    break;
                default:System.out.println("chi chon 0->7");
                      break; 
            }
        }
        
    }
    
}
