/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Trongex;
import java.io.Serializable;

/**
 *
 * @author NamNguyen
 */
public class Lop implements Serializable{
   // (mã lớp, tên lớp, số sinh viên
    private int ma;
    private String ten;
    private int sosv;
    private static int sma=100;

    public Lop(int ma, String ten,int sosv)throws Trongex {
        if(ten.isEmpty()) throw new Trongex();
        this.ma = sma++;
        this.ten = ten;
        this.sosv = sosv;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSosv() {
        return sosv;
    }

    public void setSosv(int sosv) {
        this.sosv = sosv;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Lop.sma = sma;
    }

    
    public Object[] toObjects(){
        return new Object[]{
          ma,ten,sosv
        };
    }
    
}
