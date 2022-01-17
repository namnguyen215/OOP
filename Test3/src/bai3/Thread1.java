/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NamNguyen
 */
public class Thread1 extends Thread{
    Data d;

    public Thread1(Data d) {
        this.d = d;
    }
    public void run(){
        SimpleDateFormat f = new SimpleDateFormat("ss");
        while(true){
            Date date = new Date();
            int time=Integer.parseInt(f.format(date));
            System.out.println(time);
            if(time%2==0){
                System.out.println("San xuat tui cap");
                d.setIndex(2);
            }
            else{
                System.out.println("San xuat giay");
                d.setIndex(3);
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
}
