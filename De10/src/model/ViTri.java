/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import controller.Trongex;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author NamNguyen
 */
public class ViTri implements Serializable {
    //mã vị trí, Tên vị trí, mức thưởng
    private int ma;
    private String ten;
    private double mucthuong;
    private static int sma=100;

    
    public ViTri() {
        
    }

    
    public ViTri(int ma, String ten,double mucthuong) throws Trongex {
        if(ten.isEmpty()) throw new Trongex();
        this.ma = sma++;
        this.ten = ten;
        this.mucthuong=mucthuong;
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

    public double getMucthuong() {
        return mucthuong;
    }

    public void setMucthuong(double mucthuong) {
        this.mucthuong = mucthuong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        ViTri.sma = sma;
    }

   
    public Object[] toObjects(){
        return new Object[]{
          ma,ten,mucthuong
        };
    }
    
    
}
