/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XuLyXau;

/**
 *
 * @author NamNguyen
 */
public class TachKyTuDacBietTrongDoan {
    public static void main(String[] args) {
        String s="12sahsa%diu@#     AD*j 01^Jo&. sda%oi cia(v";
        String[] a=s.split("[\\w\\s\\.,]*");
        for(String x:a){
            if(x!="")
                System.out.print(x+" ");
        }
    }
}
