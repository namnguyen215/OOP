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
public class RegularExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap dia chi email: ");
        String email=sc.nextLine();

        String regEmail="\\w+@\\w+\\.\\w+";
        if(email.matches(regEmail)){
            System.out.println("Email hop le");
        }
        else{
            System.out.println("Email khong hop le");
        }
        
        
    }
}
