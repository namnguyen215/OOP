/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.DienThoaiException;
import controller.TrongException;
import java.io.Serializable;

/**
 *
 * @author NamNguyen
 */
public class NhanVien implements Serializable {

    private int ma;
    private String hoten, diachi, sodt;
    private static int sma = 1000;

    public NhanVien(int ma, String hoten, String diachi, String sodt) throws TrongException,DienThoaiException{
        if (hoten.isEmpty() || diachi.isEmpty()) {
            throw new TrongException();
        }
        if(!sodt.matches("\\d+")) throw new DienThoaiException();
        this.ma = sma++;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sodt = sodt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
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
        NhanVien.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
           ma,hoten,diachi,sodt 
        };
    }
}
