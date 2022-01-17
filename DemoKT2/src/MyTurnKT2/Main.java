package MyTurnKT2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLPTGT q=new QLPTGT();
        
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. nhap Oto ");
            System.out.println("2. Nhap xe may");
            System.out.println("3. Viet ra ds");
            
            System.out.println("4. Sua");
            System.out.println("5. Xoa");
            System.out.println("6. Sap xep theo gia");      
            System.out.println("7. Tim theo ma");
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->4):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=in.nextInt();
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);//safe exit
                case 1:q.nhapOto();
                       break;
                case 2:q.nhapXeMay();
                       break;
                case 3:q.inDS();
                       break;
                case 4:q.sua();
                       break; 
                case 5:q.xoa();
                       break; 
                case 6:q.sortByPrice();
                    break;
                case 7:q.searchByCode();
                    break;
                default:System.out.println("chi chon 0->7");
                      break; 
            }
        }
        
    }
    
}
