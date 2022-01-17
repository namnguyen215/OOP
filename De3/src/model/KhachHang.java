/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Sodtex;
import controller.TrongEx;
import java.io.Serializable;

/**
 *
 * @author NamNguyen
 */
public class KhachHang implements Serializable{
    private int ma;
    private String ten,diachi,sodt;
    private static int sma=10000;

    public KhachHang(int ma, String ten, String diachi, String sodt)  throws TrongEx,Sodtex {
        if(ten.isEmpty() || diachi.isEmpty()) throw new TrongEx();
        if(!sodt.matches("\\d+")) throw new Sodtex();
        this.ma = sma++;
        this.ten = ten;
        this.diachi = diachi;
        this.sodt = sodt;
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

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        KhachHang.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,diachi,sodt
        };
    }
}
