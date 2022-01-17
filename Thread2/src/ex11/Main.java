/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11;

/**
 *
 * @author NamNguyen
 */
public class Main {
    public static void main(String[] args) {
        Data d=new Data();
        ReadFromFile t1=new ReadFromFile(d);
        ThreadUocSo t2=new ThreadUocSo(d);
        ThreadBinhPhuong t3=new ThreadBinhPhuong(d);
        t1.start();
        t2.start();
        t3.start();        
    }
}
