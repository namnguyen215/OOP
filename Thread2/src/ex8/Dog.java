/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

/**
 *
 * @author NamNguyen
 */
public class Dog extends Thread{
    Data d;

    public Dog(Data d) {
        this.d = d;
    }
    
    public  void run(){
        for(int i=0;i<5;i++){
            System.out.println("Dog: Watching!! Watching!!");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Dog: GO Go go");

        synchronized(d){
            d.setRunning(false);
            d.notify();
        }
        
    }
}
