/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author NamNguyen
 */
public class EXMTBufferedReader {
    public static void main(String[] args) {
        String filename="src/iofile/matran.txt";
        int sum=0;
        try {
            //Doi so la FileReader
            //Doc tung dong
            BufferedReader br=new BufferedReader(new FileReader(filename));
            String line="";
            line=br.readLine();
            String[] size=line.split("\\s+");
            int hang=Integer.parseInt(size[0]);
            int cot=Integer.parseInt(size[1]);

            while((line=br.readLine())!=null){
                String[] s=line.split("\\s+");
                for(int i=0;i<s.length;i++){
                    System.out.println(s[i]);
                    sum+=Integer.parseInt(s[i]);
                }
            }
            System.out.println(sum);
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
        String mtout="src/iofile/matranout.txt";
        try{
            PrintWriter pw=new PrintWriter(mtout);
            pw.print("Tong la: "+sum);
            pw.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
