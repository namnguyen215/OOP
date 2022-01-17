/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SoDTEx;
import controller.TrongEx;
import java.io.Serializable;

/**
 *
 * @author NamNguyen
 */
public class MatHang implements Serializable{
    private int ma;
    private String ten,nhom;
    private double gia;
    private int soluong;
    private static int sma=1000;

    public MatHang(int ma, String ten, String nhom, double gia, int soluong) throws TrongEx {
        if(ten.isEmpty() ) throw new TrongEx();
        this.ma = sma++;
        this.ten = ten;
        this.nhom = nhom;
        this.gia = gia;
        this.soluong = soluong;
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

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MatHang.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,nhom,gia,soluong
        };
    }
    
}
