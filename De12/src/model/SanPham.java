/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SoEx;
import controller.TrongEx;
import java.io.Serializable;

/**
 *
 * @author NamNguyen
 */
public class SanPham implements Serializable{
//(mã SP, tên SP, đơn giá)
    private int ma;
    private String ten;
    private double dongia;
    private static int sma=10000;

    public SanPham(int ma, String ten, double dongia) throws TrongEx,SoEx {
        if(ten.isEmpty()) throw new TrongEx();
//        || !(dongia+"").matches("\\d+\\.\\d+")
        if(!(dongia+"").matches("\\d+\\.\\d+")  ) throw new SoEx();
        this.ma = sma++;
        this.ten = ten;
        this.dongia = dongia;
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

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        SanPham.sma = sma;
    }

    
    
    public Object[] toObjects(){
        return new Object[]{
           ma,ten,dongia
        };
    }
}
