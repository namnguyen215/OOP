/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author NamNguyen
 */
public class ChuChay implements Runnable{
    private boolean running;

    public ChuChay() {
        running=true;
    }
    
    @Override
    public void run() {
        String line="HOC VIEN CONG NGHE BUU CHINH VIEN THONG ";
        while(running){
//            line=line.charAt(line.length()-1)+line.substring(0,line.length()-1);
            line=line.substring(1,line.length())+line.charAt(0);
            System.out.println(line);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public void stop(){
        running=false;
    }
    
}
