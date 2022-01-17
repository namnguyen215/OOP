/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbiehellojava;
import java.util.*;
/**
 *
 * @author NamNguyen
 */
public class XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            int res;
            if(s1.equals(s2)){
                res=-1;
            }
            else{
                res=Math.max(s1.length(),s2.length());
            }
            System.out.println(res);
        }
    }
}
