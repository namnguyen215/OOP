/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XuLyXau;
import java.util.*;
/**
 *
 * @author NamNguyen
 */
public class TachTuTrongXau {
    public static void main(String[] args) {
        String s = "d3ay12 l3a 1 xa4 c0 c441. 3k";
        String[] a=s.split("[\\d\\s\\.,?!]+");
        for(String x:a){
            System.out.println(x);
        }
    }
}
