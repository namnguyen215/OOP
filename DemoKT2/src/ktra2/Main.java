package ktra2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLPTGT q=new QLPTGT();
        
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. nhap Oto ");
            System.out.println("2. Nhap xe may");
            System.out.println("3. Viet ra ds");
            
            System.out.println("4. Xoa");
            System.out.println("5. Tim theo ma");
            System.out.println("6. Sua");
            
            System.out.println("7. Tim theo hang");
            System.out.println("8. tim theo nam");
            System.out.println("9. tim theo gia");
            
            System.out.println("10. Sap xep");
            System.out.println("11. Sap xep theo gia");
            
            System.out.println("12. Dem theo nam");
            System.out.println("13. Dem theo mau");
            
            System.out.println("14. Tong theo nam");
            System.out.println("15. Tong theo mau");
            System.out.println("16. PT dat nhat");
            System.out.println("17. PT dat nhat theo mau sac");
            
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->5):");
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
                case 3:q.vietDS();
                       break;
                case 4:q.xoa();
                       break; 
                case 5:q.tkTheoMa();
                       break; 
                case 6:q.sua();
                break;
                case 7:q.tkTheoHang();
                break;
                case 8:q.tkTheoNam();
                break;
                case 9:q.tkGiaCao();
                break;
                case 10:q.sapxepTheoGia();
                q.vietDS();
                break;
                case 12:q.countTheoNam();
                break;
                case 13:q.countTheoMau();
                
                    break;
                case 14:q.sumGiaTheoNam();
                break;
                case 15:q.sumGiaTheoMau();
                
                    break;    
                case 16:q.maxByGia();
                    break;
                case 17:q.maxGiaByMau();
                    break;    
                default:System.out.println("chi chon 0->9");
                      break; 
            }
        }
        
    }
    
}
