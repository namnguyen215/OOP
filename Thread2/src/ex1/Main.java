/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author NamNguyen
 */
public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
                while (true) {
                    Date date = new Date();
                    System.out.println("\33[31m" + f.format(date));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        };
        t1.start();
        String line = null;
        Scanner sc = new Scanner(System.in);
        if ((line=sc.nextLine()).equalsIgnoreCase("x")) {
            t1.stop();
        }
    }
}
