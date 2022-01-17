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

/**
 *
 * @author NamNguyen
 */
public class EXBufferedReader {
    public static void main(String[] args) {
        String filename="src/iofile/dayso.txt";
        try {
            //Doi so la FileReader
            //Doc tung dong
            BufferedReader br=new BufferedReader(new FileReader(filename));
            String line="";
            int sum=0;
            while((line=br.readLine())!=null){
                String[] s=line.split("\\s+");
                for(String i:s){
                    sum+=Integer.parseInt(i);
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
    }
}
