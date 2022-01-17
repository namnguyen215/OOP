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
public class DuAn implements Serializable{
    //(mã dự án, Tên dự án, Kiểu dự án, Tổng kinh phí
    private int ma;
    private String ten,kieu;
    private double kinhphi;
    private static int sma=10000;

    public DuAn(int ma, String ten, String kieu, double kinhphi) throws Trongex{
        if(ten.isEmpty()) throw new Trongex();
        this.ma = sma++;
        this.ten = ten;
        this.kieu = kieu;
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

    public String getKieu() {
        return kieu;
    }

    public void setKieu(String kieu) {
        this.kieu = kieu;
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
        DuAn.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,kieu,kinhphi
        };
    }
    
    
}
