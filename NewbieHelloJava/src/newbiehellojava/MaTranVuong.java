package newbiehellojava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NamNguyen
 */
import java.util.Scanner;
public class MaTranVuong {
    private int [][] m;
    private int n;
    public MaTranVuong() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc cua ma tran: ");
        n=sc.nextInt();
        m=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j]=sc.nextInt();
            }
        }
        
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.println(m[i][j]+" ");
//            }
//            System.out.println("");
//        }
    }
    public void tongHang(){
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=m[i][j];
            }
        }      
        System.out.println("Tong cac hang cua ma tran la: "+sum);
    }
    
}
