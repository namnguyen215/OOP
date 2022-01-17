/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author NamNguyen
 */
public class NhanVien implements Serializable{
    //mã NV, Họ tên, địa chỉ, Số ĐT
    private int ma;
    private String ten,diachi;
    private int sodt;
    private static int sma=1000;
    public NhanVien(int ma, String ten, String diachi, int sodt) {
        this.ma = sma++;
        this.ten = ten;
        this.diachi = diachi;
        this.sodt = sodt;
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

    public int getSodt() {
        return sodt;
    }

    public void setSodt(int sodt) {
        this.sodt = sodt;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        NhanVien.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,diachi,sodt
        };
    }
    
}
