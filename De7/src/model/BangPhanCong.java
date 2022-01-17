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
public class BangPhanCong implements Serializable{
    //số ngày tham gia khác nhau và vị trí công việc khác nhau
    private int manv,mada;
    private String tennv,tenda,vitri;
    private int songay;

    public BangPhanCong(int manv, int mada, String tennv, String tenda, String vitri, int songay) {
        this.manv = manv;
        this.mada = mada;
        this.tennv = tennv;
        this.tenda = tenda;
        this.vitri = vitri;
        this.songay = songay;
    }

    public int getManv() {
        return manv;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public int getMada() {
        return mada;
    }

    public void setMada(int mada) {
        this.mada = mada;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getTenda() {
        return tenda;
    }

    public void setTenda(String tenda) {
        this.tenda = tenda;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }

    
    public Object[] toObjects(){
        return new Object[]{
            manv,mada, tennv, tenda, vitri,songay
        };
    }
    
    
}
