package KiemTra1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SoNguyen sn = null;
        Xau s = null;
        while (true) {
            System.out.println("------MENU---------");
            System.out.println("1. Nhap so nguyen n");
            System.out.println("2. Tong");
            System.out.println("3. Day nguyen to");
            System.out.println("4.Nhap vao mot xau");
            System.out.println("5.Do dai cua xau");
            System.out.println("6.So cau co trong xau");
            System.out.println("0.Lua chon 0");
            Scanner sc = new Scanner(System.in);
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 0:
                    System.out.println("Bye!!");
                    System.exit(0);
                    break;
                case 1:
                    sn = new SoNguyen();
                    break;
                case 2:
                    sn.tinhTong();
                    break;
                case 3:
                    sn.daySoNguyenTo();
                    break;
                case 4:
                    s = new Xau();
                    break;
                case 5:
                    s.doDai();
                    break;
                case 6:
                    s.soCau();
                    break;
                default:
                    System.out.println("Chi chon tu 0->4");
                    break;
            }

        }
    }
}
