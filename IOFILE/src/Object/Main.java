/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;
import Object.ObjectIO;
import java.util.List;
/**
 *
 * @author NamNguyen
 * read from binary file that created by ObjectIO.ghivao 
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Cach 1:");
        List<Oto> list= ObjectIO.docra("src/Object/otoOut.dat");
        for(Oto i:list)
            System.out.println(i);
        System.out.println("Cach 2:");
        List<Oto> list2=ObjectIO.docra("src/Object/otoOut2.txt");
        for(Oto i:list2)
            System.out.println(i);    
    }
     
}
