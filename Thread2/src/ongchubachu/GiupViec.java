/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ongchubachu;

/**
 *
 * @author NamNguyen
 */
public class GiupViec extends Thread{
    public void run(){
        for (int i = 0; i < 4; i++) {
            try{
                System.out.println("Giup viec lau tang "+(i+1));
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Giup viec da lau xong nha");
    }
}
