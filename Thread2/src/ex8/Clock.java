/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NamNguyen
 */
public class Clock extends Thread {
    Data d;

    public Clock(Data d) {
        this.d = d;
    }
    public synchronized void run() {
        SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
        while (d.isRunning()) {
            Date date = new Date();
            System.out.println("Time: " + f.format(date));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
