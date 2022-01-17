/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SoTietex;
import controller.Trongex;
import java.io.Serializable;

/**
 *
 * @author NamNguyen
 */
public class MonHoc implements Serializable {

    //(mã môn học, Tên môn, Tổng số tiết, Số tiết lý thuyết, mức kinh phí
    private int ma;
    private String ten;
    private int tongsotiet, sotietlt, sotietth;
    private double kinhphi;
    private static int sma = 100;

    public MonHoc(int ma, String ten, int tongsotiet, int sotietlt, double kinhphi) throws Trongex, SoTietex {
        if (ten.isEmpty()) {
            throw new Trongex();
        }
        if (tongsotiet < sotietlt) {
            throw new SoTietex();
        }
        this.ma = sma++;
        this.ten = ten;
        this.tongsotiet = tongsotiet;
        this.sotietlt = sotietlt;

        this.kinhphi = kinhphi;
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

    public int getTongsotiet() {
        return tongsotiet;
    }

    public void setTongsotiet(int tongsotiet) {
        this.tongsotiet = tongsotiet;
    }

    public int getSotietlt() {
        return sotietlt;
    }

    public void setSotietlt(int sotietlt) {
        this.sotietlt = sotietlt;
    }

    public int getSotietth() {
        return sotietth;
    }

    public void setSotietth(int sotietth) {
         this.sotietth = tongsotiet-sotietlt;
    }

    public double getKinhphi() {
        return kinhphi;
    }

    public void setKinhphi(double kinhphi) {
        this.kinhphi = kinhphi;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MonHoc.sma = sma;
    }

    public Object[] toObjects() {
        return new Object[]{
            ma, ten, tongsotiet, sotietlt, kinhphi
        };
    }
}
