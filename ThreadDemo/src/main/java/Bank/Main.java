/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author NamNguyen
 */
public class Main {
    public static void main(String[] args) {
        Account a=new Account();
        Thread1 h=new Thread1("Husband",3500,a);
        Thread1 k=new Thread1("Kid",2000,a);
        Thread2 w=new Thread2("Wife",10000,a);
        
        h.start();
        k.start();
        w.start();

    }
}
