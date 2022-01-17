/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author NamNguyen
 */
public class Thread1 extends Thread{
    private int n;

    public Thread1(int n) {
        this.n = n;
    }
    public void run(){
        while(n>=0){
            System.out.println("\33[31m count: "+n--);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
