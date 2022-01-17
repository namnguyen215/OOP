/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread2;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NamNguyen
 */
public class Thread2 {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                SimpleDateFormat f= new SimpleDateFormat("hh:mm:ss");
                while(true){
                    System.out.println("\033[32m"+f.format(new Date()));
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        }.start();
    }
}
