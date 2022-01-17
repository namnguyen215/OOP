/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.*;
import java.util.*;
/**
 *
 * @author NamNguyen
 */
public class IOFile {
    public static <T> List<T> doc(String path){
        List<T> list=new ArrayList<>();
        try{
            ObjectInputStream o =new ObjectInputStream(new FileInputStream(path));
            list=(List<T>)o.readObject();
            o.close();
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        return list;
    }
    
    public static <T> void ghi(String file,List<T> list){
        try{
            ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(file));
            o.writeObject(list);
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
