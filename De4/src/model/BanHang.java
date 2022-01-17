/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.SoDTEx;
import controller.TrongEx;
import java.io.Serializable;

/**
 *
 * @author NamNguyen
 */
public class BanHang implements Serializable{
    private String manv,tennv,mamh,tenmh;
    private int soluong;

    public BanHang(String manv, String tennv, String mamh, String tenmh, int soluong) {
        this.manv = manv;
        this.tennv = tennv;
        this.mamh = mamh;
        this.tenmh = tenmh;
        this.soluong = soluong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getMamh() {
        return mamh;
    }

    public void setMamh(String mamh) {
        this.mamh = mamh;
    }

    public String getTenmh() {
        return tenmh;
    }

    public void setTenmh(String tenmh) {
        this.tenmh = tenmh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public Object[] toObject(){
        return new Object[]{
            manv,tennv,mamh,tenmh,soluong
        };
    }
    
}
