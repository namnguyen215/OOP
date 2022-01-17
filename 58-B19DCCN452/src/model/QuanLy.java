/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.TrongEx;
import java.io.Serializable;
import java.io.*;
import java.util.*;
/**
 *
 * @author NamNguyen
 */
public class QuanLy implements Serializable{
    //ct,vt,ngay
    private CauThu ct;
    private ViTri vt;
    private String ngay;

    public QuanLy(CauThu ct, ViTri vt, String ngay) {
        this.ct = ct;
        this.vt = vt;
        this.ngay = ngay;
    }

    public CauThu getCt() {
        return ct;
    }

    public void setCt(CauThu ct) {
        this.ct = ct;
    }

    public ViTri getVt() {
        return vt;
    }

    public void setVt(ViTri vt) {
        this.vt = vt;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }
    
    
    
    public Object[] toObjects(){
        return new Object[]{
          ct.getMa(),ct.getTen(),vt.getMa(),vt.getTen(),ngay,ct.getLuong()
        };
    }
           
}
