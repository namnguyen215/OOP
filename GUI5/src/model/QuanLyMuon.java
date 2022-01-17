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
public class QuanLyMuon implements Serializable{
    private String maBD,maSach,hoten,tensach;
    private int soLuong;
    private String status;

    public QuanLyMuon() {
    }

    public QuanLyMuon(String maBD, String maSach, String hoten, String tensach, int soLuong, String status) {
        this.maBD = maBD;
        this.maSach = maSach;
        this.hoten = hoten;
        this.tensach = tensach;
        this.soLuong = soLuong;
        this.status = status;
    }

    

    public String getMaBD() {
        return maBD;
    }

    public void setMaBD(String maBD) {
        this.maBD = maBD;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Object[] toObject(){
        return new Object[]{
            maBD,hoten,maSach,tensach,soLuong,status
        };
    }
}
