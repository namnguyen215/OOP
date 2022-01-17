/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Trongex;
import java.io.*;
import java.util.*;

/**
 *
 * @author NamNguyen
 */
public class QuanLy implements Serializable {

    //mã hàng, Tên hàng, Nhóm hàng, Giá mua, Giá bán)
    private NhanVien nv;
    private MatHang mh;
    private int soluong;
    private double tiencong;

    public QuanLy(NhanVien nv, MatHang mh, int soluong) {
        this.nv = nv;
        this.mh = mh;
        this.soluong = soluong;
    }

    public double getTiencong() {
        return tiencong;
    }

    public void setTiencong(double tiencong) {
        this.tiencong = tiencong;
    }

    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public MatHang getMh() {
        return mh;
    }

    public void setMh(MatHang mh) {
        this.mh = mh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Object[] toObjects() {
        return new Object[]{
            nv.getMa(), nv.getTen(), mh.getMa(), mh.getTen(), soluong
        };
    }
}
