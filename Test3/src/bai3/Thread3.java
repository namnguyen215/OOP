/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author NamNguyen
 */
public class Thread3 extends Thread{
    Data d;

    public Thread3(Data d) {
        this.d = d;
    }
    public void run(){
        System.out.println("Ban tui");
    }
}
