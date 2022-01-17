/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author NamNguyen
 */
public class InMau extends Thread{    
//    String[] key={"BLACK","RED","GREEN","YELLOW","BLUE","MAGENTA","CYAN","WHITE"};
//    String[] value={"\033[0m","\033[31m","\033[32m","\033[33m","\033[34m","\033[35m","\033[36m","\033[37m"};
    private Map<String, String> map = new HashMap<String, String>();
    private String s;
    private String[] lst;
    public InMau(String s) {
        this.s = s;
        lst=s.split("\\s+");
        map.put("BLACK","\033[0m");
        map.put("RED","\033[31m");
        map.put("GREEN","\033[32m");
        map.put("YELLOW","\033[33m");
        map.put("BLUE","\033[34m");
        map.put("MAGENTA","\033[35m");
        map.put("CYAN","\033[36m");
        map.put("WHITE","\033[37m");
        for (int i = 0; i < lst.length; i++) {
            lst[i]=lst[i].strip().toUpperCase();
        }
    }
 
    public void run(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < lst.length; j++) {
                System.out.println(map.get(lst[j])+lst[j]);
            
                try{
                    sleep(1000);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }

    }
}
