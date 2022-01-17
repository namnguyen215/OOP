/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author NamNguyen
 */
public class Main {
    public static void main(String[] args) {
        Data d=new Data();
        ColorThread t1=new ColorThread(d);
        GaMai t2=new GaMai(d);
        String line=null;
        Scanner sc=new Scanner(System.in);
        t1.start();
        t2.setDaemon(true);        
        t2.start();
        while(!(line=sc.next()).equalsIgnoreCase("0")){
            if(line.equalsIgnoreCase("1")){
                d.setRunning(false);
                t1.suspend();
            }
            else if(line.equalsIgnoreCase("2")){
                d.setRunning(true);
                t1.resume();
            }
                
        }
        d.setRunning(false);
    }
}
