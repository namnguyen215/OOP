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
public class ThreadBinhPhuong extends Thread{
    Data d;

    public ThreadBinhPhuong(Data d) {
        this.d = d;
    }
    public void run(){
        while(true){
            synchronized(d){
                d.notifyAll();
                while(d.getIndex()!=3 && d.isRunning()){
                    try{
                        d.wait();
                    }catch(InterruptedException e){
                        System.out.println(e);
                    }
                    
                }
                if(d.isRunning()==false){
                    break;
                }
            }   
            System.out.println("Binh phuong cua so "+d.getNum()+" la: "+(d.getNum()*d.getNum()));
//            d.setIndex(1000);
        }
        System.out.println("ThreadBinhPhuong Stop");
        synchronized(d){
            stop();
        }
    }
}
