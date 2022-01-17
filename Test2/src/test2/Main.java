package test2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLTV q=new QLTV();
        
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. nhap Sach ");
            System.out.println("2. Nhap Tap Chi");
            System.out.println("3. Viet ra ds");
            
            System.out.println("4. Tim Kiem theo ten nxb");
            System.out.println("5. Sua tai lieu");
            System.out.println("6. Dua ra tai lieu co so ban phat hanh thap nhat");      
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->6):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=in.nextInt();
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);//safe exit
                case 1:q.nhapSach();
                       break;
                case 2:q.nhapTapChi();
                       break;
                case 3:q.inDS();
                       break;
                case 4:q.timTheoNXB();
                       break; 
                case 5:q.sua();
                       break; 
                case 6:q.PHThapNhat();
                    break;
                default:System.out.println("chi chon 0->6");
                      break; 
            }
        }
        
    }
    
}
