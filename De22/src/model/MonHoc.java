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
public class MonHoc implements Serializable{
    //(mã môn học, Tên môn, Tổng số tiết, Loại môn học
    private int ma;
    private String ten;
    private int sotiet;
    private String loai;
    private static int sma=100;

    public MonHoc(int ma, String ten, int sotiet, String loai) throws Trongex{
        if(ten.isEmpty() ) throw new Trongex();
        this.ma = sma++;
        this.ten = ten;
        this.sotiet = sotiet;
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

    public int getSotiet() {
        return sotiet;
    }

    public void setSotiet(int sotiet) {
        this.sotiet = sotiet;
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
        MonHoc.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
          ma,ten,sotiet,loai  
        };
    }
    
}
