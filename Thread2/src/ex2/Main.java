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
public class Main {
    public static void main(String[] args) {
        Thread1 t1=new Thread1(30);
        Thread2 t2=new Thread2(30);
        t1.start();
        t2.start();
    }
}
