/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;

import java.util.Scanner;

/**
 *
 * @author NamNguyen
 */
public class Input extends Thread{
    Data d;

    public Input(Data d) {
        this.d = d;
    }
    public void run(){
        int x,y;
        Scanner in=new Scanner(System.in);
        while(d.stop()){
            synchronized(d){
                System.out.println("Nhap so 1: ");
                x=in.nextInt();
                d.add(x);
                if(x==0){
                    d.setExit(false);
                    d.notify();
                    break;
                }
                System.out.println("Nhap so 2: ");
                y=in.nextInt();
                d.add(y);
                d.setIndex(2);
                d.notify();
                try{
                    d.wait();
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
}
