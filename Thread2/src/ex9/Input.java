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
public class Input extends Thread {
    private Data d;

    public Input(Data d) {
        this.d = d;
    }
    public void run(){
        Scanner sc=new Scanner(System.in);
        while(d.isRunning()){
            synchronized(d){
                System.out.println("Nhap vao so thu nhat: ");
                int num1=sc.nextInt();
                d.add(num1);
                if(num1==0){
                    d.setRunning(false);
                    d.notify();
                    break;
                }
                System.out.println("Nhap vao so thu hai: ");
                int num2=sc.nextInt();
                d.add(num2);
                System.out.println("Chuyen sang luong 2");
                d.setIndex(2);
                d.notify();
                try{
                    System.out.println("Luong 1 dang cho");
                    d.wait();
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
}
