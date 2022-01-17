/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NamNguyen
 */
public class ThreadDemo extends Thread {
    public ThreadDemo(String name){
        super(name);
    }
    public static void main(String[] args) {
        
    }
    public void run(){
        System.out.println(this.getName()+" START");
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName()+i);
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println(this.getName()+" STOP");
    }

}
