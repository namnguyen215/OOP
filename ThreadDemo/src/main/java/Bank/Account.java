/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NamNguyen
 */
public class Account {
    private long balance=3000;
    public synchronized boolean check(long value){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        return value<balance;
    }
    public synchronized void withdraw(String name, long value){
        System.out.println(name+" withdraw "+value);
        
        while(!check(value)){
            try {
                System.out.println(name+" waiting!");
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
        }
       }      

        balance-=value;
        System.out.println(name+" withdraw successfull, "+balance+" left!");
    }
    
    public synchronized void diposite(String name,long value){
        System.out.println(name+" diposite "+value);
        try{
               Thread.sleep(1000);
        }catch(InterruptedException e){
               System.out.println(e);
        }
        balance+=value;
        System.out.println(name+" diposit successfull "+value+"$");
        notify();
    }
}
