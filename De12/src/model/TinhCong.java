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
public class TinhCong implements Serializable{
//(mã CN,tencn,masp,tensp,loaisp,soluong)
    private int macn,masp;
    private String tencn,tensp;
    private int soluong;
    private static int sma=10000;

    public TinhCong(int macn, int masp, String tencn, String tensp, int soluong) {
        this.macn = macn;
        this.masp = masp;
        this.tencn = tencn;
        this.tensp = tensp;
        this.soluong = soluong;
    }

    public int getMacn() {
        return macn;
    }

    public void setMacn(int macn) {
        this.macn = macn;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public String getTencn() {
        return tencn;
    }

    public void setTencn(String tencn) {
        this.tencn = tencn;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }



    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        TinhCong.sma = sma;
    }

    
    
    
    public Object[] toObjects(){
        return new Object[]{
           macn,tencn,masp,tensp,soluong
        };
    }
}
