/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.HeSoEx;
import controller.TrongEx;
import java.io.Serializable;

/**
 *
 * @author NamNguyen
 */
public class PhongBan implements Serializable{
//    (mã phòng, tên phòng, mô tả, Hệ số công việc
    private int ma;
    private String ten,mota;
    private double heso;
    private static int sma=100;

    public PhongBan(int ma, String ten, String mota, double heso) throws TrongEx,HeSoEx {
        if(ten.isEmpty() || mota.isEmpty()) throw new TrongEx();
        if(heso<1 || heso>20) throw new HeSoEx();
        this.ma = sma++;
        this.ten = ten;
        this.mota = mota;
        this.heso = heso;
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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public double getHeso() {
        return heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        PhongBan.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,mota,heso
        };
    }
}
