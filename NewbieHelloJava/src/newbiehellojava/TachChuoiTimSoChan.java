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
public class TachChuoiTimSoChan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chuoi ngan cach nhau boi dau phay: ");
        String s=sc.nextLine();
        String[] a=s.split(",");
        for(String x:a){
            int num=Integer.parseInt(x);
            if(num%2==0){
                System.out.print(num+" ");
            }
        }
    }
}
