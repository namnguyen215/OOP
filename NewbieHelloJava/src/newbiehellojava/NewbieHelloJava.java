/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbiehellojava;
import java.util.*;
import java.util.Arrays;
/**
 *
 * @author NamNguyen
 */
public class NewbieHelloJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] res=s.toCharArray();
        for(int i=res.length-1;i>=0;i--){
            System.out.print(res[i]);
        }
    }
    
}
