/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongEx;
import java.io.Serializable;

/**
 *
 * @author NamNguyen
 */
public class ThietBi implements Serializable{
    //mã TB, Tên, Xuất xứ, Năm sản xuất
    private int ma;
    private String ten,xuatxu;
    private int namsx;
    private static int sma=10000;

    public ThietBi(int ma, String ten, String xuatxu, int namsx) throws TrongEx {
        if(ten.isEmpty() || xuatxu.isEmpty()) throw new TrongEx();
        this.ma = sma++;
        this.ten = ten;
        this.xuatxu = xuatxu;
        this.namsx = namsx;
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

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        ThietBi.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
           ma,ten,xuatxu,namsx 
        } ;
    }
    
}
