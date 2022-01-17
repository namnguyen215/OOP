/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XuLyXau;

import java.util.Scanner;

public class HandleString {

    private String s;

    public HandleString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot xau:");
        s = sc.nextLine();
    }

    public void tachTu() {
        String[] a = s.split("[\\d\\s\\.,?!]+");
        for (String x : a) {
            System.out.print(x + ' ');
        }
        System.out.println("");
    }

    public void tongSo() {
        int sum = 0;
        String[] a = s.split("[\\sa-zA-Z\\.,]+");
        for (String x : a) {
            if (!"".equals(x)) {
                sum += Integer.parseInt(x);
            }
        }
        System.out.println("Tong cac so trong doan la: "+sum);
    }

    public void tachKTDB() {
        String[] a = s.split("[\\w\\s\\.,]*");
        for (String x : a) {
            if (!"".equals(x)) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
    }
    public void soLanXH(){
        
    }

}
