/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbiehellojava;

import java.util.*;
public class ChuanHoaHoTen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine();
            s=s.trim().replaceAll("\\s+"," ").toLowerCase();
            String a[]=s.split(" ");
            for(String x:a)
            {
                System.out.print(x.substring(0,1).toUpperCase()+x.substring(1)+" ");
            }
            System.out.print("\n");
        }
    }
}
