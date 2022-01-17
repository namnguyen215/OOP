/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NamNguyen
 */
public class CucCu extends Thread{

    public CucCu() {
    }
   public void run(){
       SimpleDateFormat f = new SimpleDateFormat("ss");
       int time;
       while((time=Integer.parseInt(f.format(new Date())))%11!=0){
           System.out.println("Second: "+time);
           System.out.println("cuc cu");
           try{
               Thread.sleep(1000);
           }catch(InterruptedException e){
               System.out.println(e);
           }
       }
       
   }
}
