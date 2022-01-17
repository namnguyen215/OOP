/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author NamNguyen
 */
public class Thread2 extends Thread {

    private int n, now = 2;

    public Thread2(int n) {
        this.n = n;
    }

    public boolean isPrime(int i) {
        if (i == 2 || i == 3) {
            return true;
        }
        if (i < 2 || i % 2 == 0) {
            return false;
        }
        for (int j = 3; j * j <= i + 1; j += 2) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean check(int i) {
        String l = Integer.toString(i);
        if (l.charAt(l.length() - 1) == '3' && (isPrime(i) == true)) {
            return true;
        }
        return false;
    }

    public void run() {
        while (n >= 0) {
            int i = now+1;
            while (true) {
                if (check(i)) {
                    now = i;
                    break;
                } else {
                    i++;
                }
            }
            System.out.println("So nguyen to: " + now);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            n--;
        }
    }
}
