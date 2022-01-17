/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongEx;
import java.io.Serializable;
import java.io.*;
import java.util.*;
/**
 *
 * @author NamNguyen
 */
public class CauThu implements Serializable{
    //mã cầu thủ, Họ Tên, Tuổi, Bằng cấp, Mức lương
    private int ma;
    private String ten;
    private int tuoi;
    private String bang;
    private double luong;
    private static int sma=100;

    public CauThu(int ma, String ten, int tuoi, String bang, double luong) throws TrongEx {
        if(ten.isEmpty() || bang.isEmpty()) throw new TrongEx();
        this.ma = sma++;
        this.ten = ten;
        this.tuoi = tuoi;
        this.bang = bang;
        this.luong = luong;
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

    public String getBang() {
        return bang;
    }

    public void setBang(String bang) {
        this.bang = bang;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        CauThu.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
          ma,ten,tuoi,bang,luong  
        };
    }
           
}
