/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Trongex;
import java.io.Serializable;

/**
 *
 * @author NamNguyen
 */
public class QuanLy implements Serializable {
    //(mã môn học, Tên môn, Tổng số tiết, Số tiết lý thuyết, mức kinh phí
    private int magv;
    private String tengv;
    private int mamon;
    private String tenmon;
    private int solop;

    public QuanLy(int magv, String tengv, int mamon, String tenmon, int solop) {
       
        this.magv = magv;
        this.tengv = tengv;
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.solop = solop;
    }

    public int getMagv() {
        return magv;
    }

    public void setMagv(int magv) {
        this.magv = magv;
    }

    public String getTengv() {
        return tengv;
    }

    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public int getMamon() {
        return mamon;
    }

    public void setMamon(int mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public int getSolop() {
        return solop;
    }

    public void setSolop(int solop) {
        this.solop = solop;
    }

    
    public Object[] toObjects(){
        return new Object[]{
          magv,tengv,mamon,tenmon,solop
        };
    }
}
