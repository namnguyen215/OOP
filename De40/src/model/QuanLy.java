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
    private int manv,madv,soluong;

    public QuanLy(int manv, int madv, int soluong) {
        this.manv = manv;
        this.madv = madv;
        this.soluong = soluong;
    }

    public int getManv() {
        return manv;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public int getMadv() {
        return madv;
    }

    public void setMadv(int madv) {
        this.madv = madv;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public Object[] toObjects(){
        return new Object[]{
           manv,madv,soluong
        };
    }
}
