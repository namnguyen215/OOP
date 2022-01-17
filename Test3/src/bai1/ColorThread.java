/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author NamNguyen
 */
public class ColorThread extends Thread{
    Data d;

    public ColorThread(Data d) {
        this.d = d;
    }
    
    public void run(){
        while(d.isRunning()){
            System.out.println("\033[33mYELLOW");
            System.out.println("\033[31mRED");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
