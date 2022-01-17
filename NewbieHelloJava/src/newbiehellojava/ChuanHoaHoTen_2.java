/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbiehellojava;

import java.util.Scanner;

/**
 *
 * @author NamNguyen
 */
public class ChuanHoaHoTen_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            s = s.trim().replaceAll("\\s+", " ").toLowerCase();
            String a[] = s.split(" ");
            for (int i=1;i<a.length;i++) {
                a[i]=a[i].substring(0, 1).toUpperCase() + a[i].substring(1);
                if(i!=a.length-1){
                    a[i]+=" ";
                }
            }
            for(int i=1;i<a.length;i++)
            {
                System.out.print(a[i]);
            }
            System.out.println(", "+a[0].toUpperCase());
        }
    }
}
