/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.BacThoEx;
import controller.Trongex;
import controller.dtex;
import java.io.Serializable;
import java.io.*;
import java.util.*;
/**
 *
 * @author NamNguyen
 */
public class CongNhan implements Serializable{
    //mã công nhân, Họ tên, Địa chỉ, Số điện thoại, Bậc thợ
    private int ma;
    private String ten,diachi,sdt;
    private int bac;
    private static int sma=1000;

    public CongNhan(int ma, String ten, String diachi, String sdt, int bac) throws dtex,Trongex,BacThoEx {
        if(ten.isEmpty() || diachi.isEmpty()) throw new Trongex();
        if(!sdt.matches("\\d+")) throw new dtex();
        if(bac<1 || bac>7) throw new BacThoEx();
        this.ma = sma++;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
        this.bac = bac;
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

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        CongNhan.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
          ma,ten,diachi,sdt,bac  
        };
    }
    
}
