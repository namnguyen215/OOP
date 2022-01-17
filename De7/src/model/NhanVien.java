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
public class NhanVien implements Serializable{
    //mã NV, Họ tên, địa chỉ, chuyên môn)
    private int ma;
    private String ten,diachi,chuyenmon;
    private static int sma=10000;

    public NhanVien(int ma, String ten, String diachi, String chuyenmon) throws Trongex {
        if(ten.isEmpty() || diachi.isEmpty() || chuyenmon.isEmpty()) throw new Trongex();
        this.ma = sma++;
        this.ten = ten;
        this.diachi = diachi;
        this.chuyenmon = chuyenmon;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getChuyenmon() {
        return chuyenmon;
    }

    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
    }

    
    
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,diachi,chuyenmon
        };
    }
    
    
}
