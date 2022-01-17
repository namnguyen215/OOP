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
    private String manv,tennv,mapb,tenpb;
    private int songay;

    public QuanLy(String manv, String tennv, String mapb, String tenpb, int songay) {
        this.manv = manv;
        this.tennv = tennv;
        this.mapb = mapb;
        this.tenpb = tenpb;
        this.songay = songay;
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

    public String getMapb() {
        return mapb;
    }

    public void setMapb(String mapb) {
        this.mapb = mapb;
    }

    public String getTenpb() {
        return tenpb;
    }

    public void setTenpb(String tenpb) {
        this.tenpb = tenpb;
    }

    public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }
    public Object[] toObjects(){
        return new Object[]{
            manv,tennv,mapb,tenpb,songay
        };
    }
}
