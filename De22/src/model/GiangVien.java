/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import controller.DTex;
import controller.Trongex;
import java.io.*;
import java.util.*;
/**
 *
 * @author NamNguyen
 */
public class GiangVien implements Serializable{
    //((mã GV, Họ tên, Số ĐT, Khoa)
    private int ma;
    private String ten,sdt,khoa;
    private static int sma=10000;

    public GiangVien(int ma, String ten, String sdt, String khoa) throws Trongex,DTex {
        if(ten.isEmpty()) throw new Trongex();
        if(!sdt.matches("\\d+")) throw new DTex();
        this.ma = sma++;
        this.ten = ten;
        this.sdt = sdt;
        this.khoa = khoa;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        GiangVien.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
          ma,ten,sdt,khoa 
        };
    }
    
}
