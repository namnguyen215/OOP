package sach;


import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        DSSach ds=null;
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. Nhap So luong sach");
            System.out.println("2. Nhap 1 quyen sach");
            System.out.println("3. Hien thi ds sach");
            
            System.out.println("4. tim theo ma");
            System.out.println("4. lua chon 4");
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->4):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);//safe exit
                case 1:ds=new DSSach();
                       break;
                case 2:ds.nhapSach();
                       break;
                case 3:ds.viet();
                       break;
                case 4:ds.timTheoMa();
                       break;       
                default:System.out.println("chi chon 0->4");
                      break; 
            }
        }
        
    }
    
}
