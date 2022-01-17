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
public class Person extends Thread {
    Data d;

    public Person(Data d) {
        this.d = d;
    }
    
    public void run() {
        synchronized (d) {
            try {
                d.wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Person: WOW big dog!");
        for (int i = 10; i <= 50; i += 10) {
            System.out.println("Person: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
