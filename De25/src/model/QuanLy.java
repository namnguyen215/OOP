/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Trongex;
import controller.dtex;
import java.io.Serializable;
import java.io.*;
import java.util.*;
/**
 *
 * @author NamNguyen
 */
public class QuanLy implements Serializable{
    //cn,xuong,songay
    private CongNhan cn;
    private Xuong x;
    private int songay;

    public QuanLy(CongNhan cn, Xuong x, int songay) {
        this.cn = cn;
        this.x = x;
        this.songay = songay;
    }

    public CongNhan getCn() {
        return cn;
    }

    public void setCn(CongNhan cn) {
        this.cn = cn;
    }

    public Xuong getX() {
        return x;
    }

    public void setX(Xuong x) {
        this.x = x;
    }

    public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }
    
    
    public Object[] toObjects(){
        return new Object[]{
          cn.getMa(),cn.getTen(),x.getMa(),x.getTen(),songay
        };
    }
    
}
