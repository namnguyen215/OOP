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
public class LoaiBo100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine();
            String a=s;
            String regS="100";
            int lastIndex=0,dem=1,max=1;
            boolean ok=false;
            while(s.indexOf(regS)>=0){
                ok=true;
                int i=s.indexOf(regS);
                if(i==lastIndex-1){
                    dem++;
                    if(max<dem)
                         max=dem;
                }
                        
                lastIndex=i;
                s=s.replace(s.substring(i,i+3),"");
            }
            if(ok==false)
                 max=0;
            System.out.println(max*3);
        }
    }
}
