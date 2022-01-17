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
public class CauThu implements Serializable {
    //(mã cầu thủ, Họ Tên, Tuổi, Mức lương)
    private int ma;
    private String ten;
    private int tuoi;
    private double mucluong;
    private static int sma=100;

    public CauThu() {
    }

    
    public CauThu(int ma, String ten, int tuoi, double mucluong) throws Trongex {
        if(ten.isEmpty()) throw new Trongex();
        this.ma = sma++;
        this.ten = ten;
        this.tuoi = tuoi;
        this.mucluong = mucluong;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getMucluong() {
        return mucluong;
    }

    public void setMucluong(double mucluong) {
        this.mucluong = mucluong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        CauThu.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
          ma,ten,tuoi,mucluong  
        };
    }
    
    
}
