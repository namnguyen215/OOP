/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;
//Doc ra
import java.io.ObjectInputStream;
import java.io.FileInputStream;
//Ghi vao
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ObjectIO {
    //doc ra
    public static <T> List<T> docra(String file){
        List<T> list = new ArrayList<>();
        try{
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
            list=(List<T>)o.readObject();   //Vi nhap vao nhieu object nen su dung list 
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        return list;
    }
    //ghi vao 
    public static <T> void ghivao(String file, List<T> arr){
        try{
            ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(file));
            o.writeObject(arr); 
            o.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
