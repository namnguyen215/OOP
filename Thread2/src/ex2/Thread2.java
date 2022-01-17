/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NamNguyen
 */
public class Thread2 extends Thread{
     private int n;

    public Thread2(int n) {
        this.n = n;
    }
    public void run(){
        SimpleDateFormat f=new SimpleDateFormat("hh:mm:ss");
        while(n>=0){
            System.out.println("\33[34m Time: "+f.format(new Date()));
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            n--;
        }
    }
}
