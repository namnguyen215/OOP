/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newbiehellojava;

public class SangNguyenTo {
    static void sangNT(){
        int [] a=new int[10000];
        for (int i = 0; i < 10000; i++) {
            a[i]=0;
        }
        a[0]=a[1]=1;
        for(int i=2;i<10000;i++){
            if(a[i]==0){
                for(int j=i*2;j<10000;j+=i){
                    a[j]=1;
                }
            }
        }
    }
}
