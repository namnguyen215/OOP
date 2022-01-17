/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;

import java.util.Vector;

/**
 *
 * @author NamNguyen
 */
public class Data {
    private Vector<Integer> v;
    private int index;
    private boolean exit;

    public Data() {
        index=1;
        v=new Vector<>();
        exit=true;
    }
    public void add(int x){
        v.add(x);
    }
    public int get(){
        return v.remove(0);
    }
    public boolean stop(){
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
}
