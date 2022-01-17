/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofile;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EXFileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String filename="src/iofile/text.txt";
        try{
            FileReader fr=new FileReader(filename);
            int k;
            while(true){
                k=fr.read();
                if(k==-1)   //Doc het file
                    break;
               char c=(char)k;
                System.out.print(c);
            }
            fr.close();
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        
        String fileout="src/iofile/out.dat";
        PrintWriter o;
        try{
            o=new PrintWriter(fileout);
            o.print("Write file");
            o.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        
    }
    
}
