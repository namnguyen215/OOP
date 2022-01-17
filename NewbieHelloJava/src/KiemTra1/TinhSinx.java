/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KiemTra1;

/**
 *
 * @author NamNguyen
 */

public class TinhSinx {
    static double fact(int x){
        double res=1;
        for(int i=2;i<=x;i++)
            res*=i;
        return res;
    }
    public static void main(String[] args) {
        double sinx=0;
        int x=4;
        System.out.println(Math.pow(2,3));
        for(int i=0;i<=10;i++){
            sinx+=Math.pow(-1,i)*(Math.pow(x,2*i+1)/fact(2*i+1));
        }
        System.out.println(sinx);
    }
}

