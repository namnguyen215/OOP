/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;

/**
 *
 * @author NamNguyen
 */
public class Main {
    public static void main(String[] args) {
        Data d=new Data();
        Input t=new Input(d);
        Out t1=new Out(d);
        t.start();
        t1.start();
    }
}
