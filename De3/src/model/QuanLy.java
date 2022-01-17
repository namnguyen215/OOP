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
public class QuanLy implements Serializable{
    private String makh,tenkh,mamh,tenmh,soluong;

    public QuanLy(String makh, String tenkh, String mamh, String tenmh, String soluong) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.mamh = mamh;
        this.tenmh = tenmh;
        this.soluong = soluong;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
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

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }
    public Object[] toObjects(){
        return new Object[]{
            makh,tenkh,mamh,tenmh,soluong
        };
    }
}
