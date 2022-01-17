/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NamNguyen
 */
public class Main {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        DeamonThreadDemo tt=new DeamonThreadDemo();
        tt.setDaemon(true);
        tt.start();
        System.out.println(t.getName()+" START");
        ThreadDemo tdm=new ThreadDemo("Truong Son");
        tdm.start();
        System.out.println(t.getName()+" STOP");
        RunnableDemo r=new RunnableDemo("Quoc lo 1A");
        Thread t2=new Thread(r);
        t2.start();
        
    }
}
