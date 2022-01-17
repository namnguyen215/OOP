/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbiehellojava;
import java.util.*;
public class SoNguyenTo {
    private static boolean isPrime(int x){
        if(x==2 || x==3)    return true;
        if(x%2==0 || x<2)   return false;
        for (int i = 3; i < (int)(Math.sqrt(x))+1; i+=2) {
            if(x%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(isPrime(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
