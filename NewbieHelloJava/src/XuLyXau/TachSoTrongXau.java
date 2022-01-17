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
public class TachSoTrongXau {

    public static void main(String[] args) {
        String s = "d3ay12 l3a 1 xa4 c0 c441. 3k";
        int sum = 0;
        String[] a = s.split("[\\sa-zA-Z\\.,]+");
        for(String x:a){
            if(x!="")
                sum+=Integer.parseInt(x);
        }
        System.out.println(sum);
    }
}
