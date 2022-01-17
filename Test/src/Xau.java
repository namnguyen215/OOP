/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NamNguyen
 */
import java.util.Scanner;

public class Xau {

    private String s;

    public Xau() {
        System.out.println("Nhap vao mot xau s:");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
    }

    public void soCau() {
        String[] a;
        a = s.split("[\\.?!]");
        System.out.println("So cau trong xau la: " + a.length);
    }

    public void chuanhoaXau() {
        s = s.trim().replaceAll("\\s+", " ").toLowerCase();
        String a[] = s.split(" ");
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i].substring(0, 1).toUpperCase() + a[i].substring(1);
            if (i != a.length - 1) {
                a[i] += " ";
            }
        }
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println(", " + a[0].toUpperCase());
    }
}
