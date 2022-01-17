/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NamNguyen
 */
import java.util.*;
public class DaThuc {
    private int bac;
    private double[] heso;

    public DaThuc() {
        System.out.println("Nhap vao mot da thuc: ");
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao bac cua da thuc:    ");
        bac=sc.nextInt();
        heso=new double[bac+1];
        int i;
        for(i=bac ; i>=0 ; i--){
            System.out.print("Nhap he so cua x^"+i+" =   ");
            heso[i]= sc.nextInt();
        }
    }
    public void tinhDaThuc(){
        double res=0;
        for(int i=bac;i>=0;i--){
            res+=Math.pow(2, i)*heso[i];
        }
        System.out.println("Gia tri cua da thuc la:    "+res);
    }
    
    public void chiaDathuc(){
        System.out.println("Em xin loi cau nay kho qua em chiu :(");
    }
    
}
