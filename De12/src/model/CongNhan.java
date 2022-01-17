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
public class CongNhan implements Serializable{
//(mã CN, Họ tên, Địa chỉ, Ca sản xuất)
    private int ma;
    private String ten,diachi,ca;
    private static int sma=10000;

    public CongNhan(int ma, String ten, String diachi, String ca) throws TrongEx {
        if(ten.isEmpty() || diachi.isEmpty()) throw new TrongEx();
        this.ma = sma++;
        this.ten = ten;
        this.diachi = diachi;
        this.ca = ca;
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

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        CongNhan.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
           ma,ten,diachi,ca
        };
    }
}
