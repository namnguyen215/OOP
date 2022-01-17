/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbiehellojava;

import java.util.*;
import java.math.BigInteger;

public class TongSoNguyenLon_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            BigInteger c = a.add(b);
            String res=c.toString();
            System.out.println(res.getClass().getSimpleName()); 
            int arr[]=new int[res.length()];
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=res.charAt(i)-'0';
            }
            for(int x:arr){
                System.out.print(x);
            }
            System.out.print("\n");
        }
    }
}
