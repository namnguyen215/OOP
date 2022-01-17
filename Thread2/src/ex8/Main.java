/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

/**
 *
 * @author NamNguyen
 */
public class Main {
    public static void main(String[] args) {
        Data d=new Data();
        Clock t1=new Clock(d);
        Dog t2=new Dog(d);
        Person t3=new Person(d);
        t1.start();
        t2.start();
        t3.start();
    }
}
