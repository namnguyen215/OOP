/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbiehellojava;

/**
 *
 * @author NamNguyen
 */
import java.util.*;
public class TinhSoFibonacci {
    static long[] f=new long[95];
    static void Fibo(){
        f[0]=0;f[1]=1;
        for(int i=2;i<92;i++){
            f[i]=f[i-1]+f[i-2];
        }
        
    }
        
    public static void main(String[] args) {
        Fibo();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(f[n]);
        }
    }
}
