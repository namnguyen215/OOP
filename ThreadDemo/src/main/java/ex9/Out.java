/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;

/**
 *
 * @author NamNguyen
 */
public class Out extends Thread{
    Data d;

    public Out(Data d) {
        this.d = d;
    }
    public void run(){
        int x,y,z;
        while(d.stop()){
            synchronized(d){
                try{
                    d.wait();
                    x=d.get();
                    if(x==0){
                        d.setExit(false);
                        d.notify();
                        break;
                    }
                    y=d.get();
                    z=x+y;
                    System.out.println("Tong: "+z);
                    d.setIndex(1);
                    d.notify();
                }catch(InterruptedException e){
                    System.out.println(e);
                }

            }
        }
    }
}
