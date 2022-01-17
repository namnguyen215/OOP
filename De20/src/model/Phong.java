/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.DTex;
import controller.Trongex;
import java.io.Serializable;
import java.io.*;
/**
 *
 * @author NamNguyen
 */
public class Phong implements Serializable{
    //mã phòng, tên phòng, loại phòng
    private int ma;
    private String ten,loai;
    private static int sma=100;

    public Phong(int ma, String ten, String loai) throws Trongex,DTex {
        if(ten.isEmpty() ) throw new Trongex();
        this.ma = sma++;
        this.ten = ten;
        this.loai = loai;
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


    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Phong.sma = sma;
    }
    
   
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,loai
        };
    }
}
