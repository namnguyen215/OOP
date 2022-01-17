/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XuLyXau;

import java.util.Scanner;

/**
 *
 * @author NamNguyen
 */
public class Menu {

    public static void main(String[] args) {
        HandleString s=null;
        while (true) {
            System.out.println("1.Nhap vao 1 xau");
            System.out.println("2.Tach tu trong doan");
            System.out.println("3.Tong cac so trong doan");
            System.out.println("4.Tach ky tu dac biet trong doan");
            System.out.println("0.Lua chon 0");
            Scanner sc = new Scanner(System.in);
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 0:
                    System.out.println("Bye!!");
                    System.exit(0);
                    break;
                case 1:
                    s=new HandleString();
                    break;
                case 2:
                    s.tachTu();
                    break;
                case 3:
                    s.tongSo();
                    break;
                case 4:
                    s.tachKTDB();
                    break;
                default:
                    System.out.println("Chi chon tu 0->4");
                    break;
            }

        }
    }
}
