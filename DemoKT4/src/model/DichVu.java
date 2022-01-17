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
public class DichVu implements Serializable{
    //mã dịch vụ, Tên dịch vụ, Nhóm dịch vụ, Chi phí, Giá cước
    private int ma;
    private String ten,nhom;
    private double chiphi,giacuoc;
    private static int sma=1000;

    public DichVu(int ma, String ten, String nhom, double chiphi, double giacuoc) {
        this.ma = sma++;
        this.ten = ten;
        this.nhom = nhom;
        this.chiphi = chiphi;
        this.giacuoc = giacuoc;
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

    public double getChiphi() {
        return chiphi;
    }

    public void setChiphi(double chiphi) {
        this.chiphi = chiphi;
    }

    public double getGiacuoc() {
        return giacuoc;
    }

    public void setGiacuoc(double giacuoc) {
        this.giacuoc = giacuoc;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        DichVu.sma = sma;
    }
    public Object[] toObject(){
        return new Object[]{
            ma,ten,nhom,chiphi,giacuoc
        };
    }
}
