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
public class MonHoc implements Serializable {
//    (mã môn học, Tên môn, Tổng số tiết, Loại môn học
    private int ma;
    private String mon;
    private int sotiet;
    private String loaimon;
    private static int sma=100;

    public MonHoc(int ma, String mon, int sotiet, String loaimon) throws TrongEx{
        if(mon.isEmpty() || loaimon.isEmpty()) throw new TrongEx();
        this.ma = sma++;
        this.mon = mon;
        this.sotiet = sotiet;
        this.loaimon = loaimon;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public int getSotiet() {
        return sotiet;
    }

    public void setSotiet(int sotiet) {
        this.sotiet = sotiet;
    }

    public String getLoaimon() {
        return loaimon;
    }

    public void setLoaimon(String loaimon) {
        this.loaimon = loaimon;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        MonHoc.sma = sma;
    }
    public Object[] toObjects(){
        return new Object[]{
            ma,mon,sotiet,loaimon
        };
    }
}
