
import java.util.*;

public class Menu {

    public static void main(String[] args) {
        SoNguyen x=null;
        Xau s=null;
        DaThuc dt=null;
        while (true) {
            System.out.println("------------MENU------------");
            System.out.println("1.Nhap vao so nguyen n");
            System.out.println("2.Hien thi cac uoc so nguyen to ");
            System.out.println("3.Day so Fibonacci nho hon n");
            System.out.println("4.Nhap vao mot xau");
            System.out.println("5.So cau co trong xau");
            System.out.println("6.Chuan hoa xau");
            System.out.println("7.Nhap vao mot da thuc");
            System.out.println("8.Gia tri da thuc tai x=2");
            System.out.println("9.Tim P(x)^n/Q(x)^n va da thuc du");
            System.out.println("0.Lua chon 0");
            System.out.println("----------------------------");
            Scanner sc = new Scanner(System.in);
            int chon= Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0:
                    System.out.println("Bye!!");
                    System.exit(0);
                    break;
                case 1:
                    x=new SoNguyen();
                    break;
                case 2:
                    x.uocSoNguyenTo();
                    break;
                case 3:
                    x.fibo();
                    break;
                case 4:
                    s=new Xau();
                    break;
                case 5:
                    s.soCau();
                    break;
                case 6:
                    s.chuanhoaXau();
                    break;
                case 7:
                    dt=new DaThuc();
                    break;
                case 8:
                    dt.tinhDaThuc();
                    break;
                case 9:
                    dt.chiaDathuc();
                    break;
                default:
                    System.out.println("Chi chon tu 0->9");
                    break;
            }
            
        }
    }
}
