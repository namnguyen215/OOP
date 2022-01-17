/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author NamNguyen
 * Tinh tong cac phan so doc vao
 */
public class main {
    public static void main(String[] args) {
        String line=null;
        PhanSo pst=new PhanSo(0,1);
        try{
            BufferedReader br=new BufferedReader(new FileReader("src/phanso/phanso.txt"));
            while((line=br.readLine())!=null){
            String[] ps=line.split("\\s+");
            int tu=Integer.parseInt(ps[0]);
            int mau=Integer.parseInt(ps[1]);
            PhanSo ps1=new PhanSo(tu,mau);
            pst=pst.congPhanSo(ps1);
            }
        }catch(FileNotFoundException e){
                System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        
        
    }
}
