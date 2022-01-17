package OOPDemo;

import java.util.Scanner;

public class BookList {

    private Book[] list;
    private Scanner sc;
    private int num;
    int index = 0;

    public BookList() {
        sc = new Scanner(System.in);
        System.out.print("Please type in total number of books:");
        num = Integer.parseInt(sc.nextLine());
        list = new Book[num];
    }

    private boolean isExist(String ID) {
        for (int i = 0; i < num; i++) {
            if(list[i]!=null){
                if (list[i].getID().equalsIgnoreCase(ID)) {
                    return true;
                }                
            }
        }
        return false;
    }

    public void nhapSach() {
        String ID;
        String name;
        String author;
        double price;
        int quantity;
        while (true) {
            System.out.print("Type in book's ID:");
            ID = sc.nextLine();
            if (isExist(ID) == false) {
                break;
            } else {
                System.out.println("Please type in valid ID!");
            }
        }
        System.out.print("Type in book's name:");
        name = sc.nextLine();
        System.out.print("Type in book's author:");
        author = sc.nextLine();
        System.out.print("Type in book's price:");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Type in book's quantity:");
        quantity = Integer.parseInt(sc.nextLine());
        list[index++] = new Book(ID, name, author, price, quantity);
    }

    public void inSach() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
    
    public void timSach(){
        System.out.print("Type in book's ID that you want to find: ");
        String ID=sc.nextLine();
        boolean found=false;
        for (int i = 0; i < list.length; i++) {
            if(list[i].getID().equalsIgnoreCase(ID)){
                System.out.println(list[i]);
                found=true;
                break;
            }
        }        
        if(found==false){
            System.out.println("The book you are searching for is not in out Database!");
        }
    }
}
