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
public class Sach implements Serializable {
//    (mã sách, Tên sách, Tác giả, Chuyên ngành, Năm xuất bản, 
//Số lượng
    private String ten,tacgia,cn;
    private int ma,sl;
    public static int sma=10000;
//    public Sach() {
//        ma=sma++;
//    }

    public Sach(String ten, String tacgia, String cn, int ma, int sl) {
        this.ten = ten;
        this.tacgia = tacgia;
        this.cn = cn;
        this.ma = ma;
        this.sl = sl;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Sach.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,tacgia,cn,sl
        };
    }
    
}
