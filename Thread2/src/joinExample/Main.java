/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joinExample;

/**
 *
 * @author NamNguyen
 */
public class Main {
    public static void main(String[] args) {
        ThreadDemo t1=new ThreadDemo("Truong Son");
        ThreadDemo t2=new ThreadDemo("Route 1A");
        ThreadDemo t3=new ThreadDemo("Route 66");
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
