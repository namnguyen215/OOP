/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author NamNguyen
 */
public class BangDangKy implements Serializable{
    private String masv,mamh,thoigian,tensv,tenmh;

    public BangDangKy(String masv, String mamh, String thoigian, String tensv, String tenmh) {
        this.masv = masv;
        this.mamh = mamh;
        this.thoigian = thoigian;
        this.tensv = tensv;
        this.tenmh = tenmh;
    }

    

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getMamh() {
        return mamh;
    }

    public void setMamh(String mamh) {
        this.mamh = mamh;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }
    public Object[] toObjects() {
        return new Object[]{
            masv,tensv,mamh,tenmh,thoigian
        };
    }
}
