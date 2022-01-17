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
public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        int test=1;
        while(t-->0){
            int n=Integer.parseInt(sc.nextLine());
            int i=2;
            ArrayList lst=new ArrayList();
            while(n>1){
                if(n%i==0){
                    lst.add(i);
                    n=n/i;
                }
                else i++;
            }
            if(lst.isEmpty())
                lst.add(n);
            System.out.print("Test "+(test++)+": ");
            ArrayList res=new ArrayList();
            for(int x=0;x<lst.size();x++){
                if(res.contains(lst.get(x))==false){
                    System.out.print((int)lst.get(x)+"("+Collections.frequency(lst, lst.get(x))+") ");
                    res.add(lst.get(x));
                }    
            }
            System.out.println("");
        }
    }
}
