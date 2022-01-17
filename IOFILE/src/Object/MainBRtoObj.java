/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;
import Object.ObjectIO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NamNguyen
 */
public class MainBRtoObj {
    public static void main(String[] args) {
        String filename="src/Object/otoIn.txt";
        List<Oto> list=new ArrayList<>();
        try{
            BufferedReader br=new BufferedReader(new FileReader(filename));
            String line="";
            while((line=br.readLine())!= null){
                String[] s=line.split("\\,\\s*");
                list.add(new Oto(s[0],Integer.parseInt(s[1])));
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
//        ObjectIO.ghivao("src/Object/otoOut.dat", list);
        ObjectIO.ghivao("src/Object/otoOut2.txt", list);

    }
}
