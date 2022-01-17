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
public class KhachHang implements Serializable{
    //mã KH, Tên khách hàng, Địa chỉ, SDT, Loại KH
    private int ma;
    private String ten,diachi,sdt,loai;
    private static int sma=10000;

    public KhachHang(int ma, String ten, String diachi, String sdt, String loai) throws Trongex,DTex {
        if(ten.isEmpty() || diachi.isEmpty()) throw new Trongex();
        if(!sdt.matches("\\d+")) throw new DTex();
        this.ma = sma++;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
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
        KhachHang.sma = sma;
    }
    
   
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,diachi,sdt,loai
        };
    }
}
