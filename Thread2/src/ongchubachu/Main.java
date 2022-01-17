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
public class Main {
    public static void main(String[] args) {
        GiupViec t1=new GiupViec();
        OngChu t2=new OngChu();
        BaChu t3=new BaChu();
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t2.start();
        try{
            t2.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t3.start();
        try{
            t3.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }        
    }
}
