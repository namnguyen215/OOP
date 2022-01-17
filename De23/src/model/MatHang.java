/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import controller.Trongex;
import java.io.*;
import java.util.*;
/**
 *
 * @author NamNguyen
 */
public class MatHang implements Serializable{
    //mã hàng, Tên hàng, Nhóm hàng, Giá mua, Giá bán)
    private int ma;
    private String ten,nhom;
    private double giamua,giaban;
    private static int sma=1000;

    public MatHang(int ma, String ten, String nhom, double giamua, double giaban)throws Trongex {
        if(ten.isEmpty()) throw new Trongex();
        this.ma = sma++;
        this.ten = ten;
        this.nhom = nhom;
        this.giamua = giamua;
        this.giaban = giaban;
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

    public double getGiamua() {
        return giamua;
    }

    public void setGiamua(double giamua) {
        this.giamua = giamua;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MatHang.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,nhom,giamua,giaban
        };
    }
}
