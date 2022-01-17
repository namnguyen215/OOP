/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11;

/**
 *
 * @author NamNguyen
 */
public class ThreadUocSo extends Thread{
    Data d;

    public ThreadUocSo(Data d) {
        this.d = d;
    }
    public void run(){
        while(true){
            synchronized(d){
                d.notifyAll();
                while(d.getIndex()!=2 && d.isRunning()){
                    try{
                        d.wait();
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                    
                }
                if(d.isRunning()==false){
                    break;
                }
                System.out.println("Uoc so cua so "+d.getNum()+": ");
            }   
            for(int i=2;i<d.getNum();i++){
                if(d.getNum()%i==0)
                     System.out.print(i+", ");
            }
            System.out.println("");
//            d.setIndex(1000);
        }
        System.out.println("ThreadUocSo Stop");
        synchronized(d){
            stop();
        }
    }
}
