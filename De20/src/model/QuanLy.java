/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.DTex;
import controller.Ngayex;
import controller.Trongex;
import java.io.Serializable;
import java.io.*;
/**
 *
 * @author NamNguyen
 */
public class QuanLy implements Serializable{
    //mã KH, Tên khách hàng, Địa chỉ, SDT, Loại KH
    private KhachHang kh;
    private Phong p;
    private String ngay;

    public QuanLy(KhachHang kh, Phong p, String ngay) throws Ngayex {
        if(!ngay.matches("[0-9]{2}-[0-9]{2}-[0-9]{2}")) throw new Ngayex();
        this.kh = kh;
        this.p = p;
        this.ngay = ngay;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public Phong getP() {
        return p;
    }

    public void setP(Phong p) {
        this.p = p;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    
   
    public Object[] toObjects(){
        return new Object[]{
            kh.getMa(),kh.getTen(),p.getMa(),p.getTen(),ngay
        };
    }
}
