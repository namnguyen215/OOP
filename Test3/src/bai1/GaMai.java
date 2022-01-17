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
public class GaMai extends Thread{
    Data d;

    public GaMai(Data d) {
        this.d = d;
    }
    public void run(){
        while(true){
            System.out.println("thoc thoc an an");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }            
        }
    }
}
