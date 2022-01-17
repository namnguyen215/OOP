package manh;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLSachTV q=new QLSachTV();      
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. nhap Sach Giao Khoa ");
            System.out.println("2. Nhap Sach Tham Khao");
            System.out.println("3. Viet ra ds");
            
            System.out.println("4. Tim Kiem Sach");
            System.out.println("5. Sap xep sach");
            System.out.println("6. Dua ra sach co gia dat nhat");      
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->6):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=in.nextInt();
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);//safe exit
                case 1:q.nhapSachGK();
                       break;
                case 2:q.nhapSachTK();
                       break;
                case 3:q.inDS();
                       break;
                case 4:q.timSachTK();
                       break; 
                case 5:q.sapxepSach();
                       break; 
                case 6:q.giaDatNhat();
                    break;
                default:System.out.println("chi chon 0->6");
                      break; 
            }
        }
        
    }
    
}
