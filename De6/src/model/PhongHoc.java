/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongEx;
import java.io.Serializable;

/**
 *
 * @author NamNguyen
 */
public class PhongHoc implements Serializable{
    //mã PH, tên phòng, số ghế
    private int ma;
    private String ten;
    private int soghe;
    private static int sma=10000;

    public PhongHoc(int ma, String ten, int soghe) throws TrongEx {
        if(ten.isEmpty()) throw new TrongEx();
        this.ma = sma++;
        this.ten = ten;
        this.soghe = soghe;
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

    public int getSoghe() {
        return soghe;
    }

    public void setSoghe(int soghe) {
        this.soghe = soghe;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        PhongHoc.sma = sma;
    }

    
    public Object[] toObjects(){
        return new Object[]{
           ma,ten,soghe 
        } ;
    }
    
}
