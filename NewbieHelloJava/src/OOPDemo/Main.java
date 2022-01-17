package OOPDemo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BookList ds=null;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("-----------MENU----------");
            System.out.println("1. Nhap vao so luong sach");
            System.out.println("2.Nhap sach moi");
            System.out.println("3.Hien thi danh sach sach");
            System.out.println("4.Tim sach theo ID");
            System.out.println("0.Thoat chuong trinh");
            System.out.println("-------------------------");
            int chon=Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0:
                    System.out.println("BYE!");
                    System.exit(0);
                case 1:
                    ds=new BookList();
                    break;
                case 2:
                    ds.nhapSach();
                    break;
                case 3:
                    ds.inSach();
                    break;
                case 4:
                    ds.timSach();
                    break;
                default:
                    System.out.println("Please tyoe in valid number!");
            }
        }
    }
}
