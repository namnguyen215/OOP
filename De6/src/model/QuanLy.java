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
public class QuanLy implements Serializable{
    //mã PH, tên phòng, ma tb,ten tb,so luong, tinh trang
    private int maph,matb;
    private String tenph,tentb;
    private int soluong;
    private String tinhtrang;

    public QuanLy(int maph, int matb, String tenph, String tentb, int soluong, String tinhtrang) {
        this.maph = maph;
        this.matb = matb;
        this.tenph = tenph;
        this.tentb = tentb;
        this.soluong = soluong;
        this.tinhtrang = tinhtrang;
    }

    public int getMaph() {
        return maph;
    }

    public void setMaph(int maph) {
        this.maph = maph;
    }

    public int getMatb() {
        return matb;
    }

    public void setMatb(int matb) {
        this.matb = matb;
    }

    public String getTenph() {
        return tenph;
    }

    public void setTenph(String tenph) {
        this.tenph = tenph;
    }

    public String getTentb() {
        return tentb;
    }

    public void setTentb(String tentb) {
        this.tentb = tentb;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

   
    public Object[] toObjects(){
        return new Object[]{
           maph,tenph,matb,tentb,soluong,tinhtrang 
        } ;
    }
    
}
