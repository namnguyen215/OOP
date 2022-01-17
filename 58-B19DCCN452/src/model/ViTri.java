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
public class ViTri implements Serializable{
    //mã vị trí, Tên vị trí, hệ số thưởng
    private int ma;
    private String ten;
    private double heso;
    private static int sma=100;

    public ViTri(int ma, String ten, double heso)throws TrongEx {
        if(ten.isEmpty()) throw new TrongEx();
        this.ma = sma++;
        this.ten = ten;
        this.heso = heso;
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

    public double getHeso() {
        return heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        ViTri.sma = sma;
    }

    
    
    public Object[] toObjects(){
        return new Object[]{
          ma,ten,heso
        };
    }
           
}
