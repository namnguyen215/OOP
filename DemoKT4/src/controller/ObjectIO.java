/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NamNguyen
 */
public class ObjectIO {
    public static <T> List<T> docra(String filepath){
       List<T> lst=new ArrayList<>();
       try{
           ObjectInputStream o=new ObjectInputStream(new FileInputStream(filepath));
           lst=(List<T>)o.readObject();
           o.close();
       }catch(IOException e){
            System.out.println(e);
       }catch(ClassNotFoundException e){
           System.out.println(e);
       }
       return lst;
    }
    public static <T> void ghivao(String filepath,List<T> lst){
        try{
            ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(filepath));
            o.writeObject(lst);
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
