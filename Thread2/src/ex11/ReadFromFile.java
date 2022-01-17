/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author NamNguyen
 */
public class ReadFromFile extends Thread{
    Data d;

    public ReadFromFile(Data d) {
        this.d = d;
    }
    public void run(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        BufferedReader br=null;
        try{
            br=new BufferedReader(new FileReader("src/ex11/input.txt"));
            synchronized(d){
                String line=null;
                while((line=br.readLine())!=null){
                    int num=Integer.parseInt(line);
                    d.setNum(num);
                    System.out.println("\33[0mDoc vao so "+"\33[31m"+num);
                    if(num%2==0){
                        d.setIndex(2);
                    }else{
                        d.setIndex(3);
                    }
                    d.notifyAll();
                    d.wait();
                    sleep(1000);
                }
                d.setRunning(false);
                br.close();
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Read Stop");
        synchronized(d){
            d.notifyAll();
            stop();
        }
    }
}
