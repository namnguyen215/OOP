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
public class QuanLy implements Serializable{
    //(mã môn học, Tên môn, Tổng số tiết, Loại môn học
    private GiangVien gv;
    private MonHoc mh;
    private int solop;
    private String time;

    public QuanLy(GiangVien gv, MonHoc mh, int solop,String time) {
        this.gv = gv;
        this.mh = mh;
        this.solop = solop;
        this.time=time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public GiangVien getGv() {
        return gv;
    }

    public void setGv(GiangVien gv) {
        this.gv = gv;
    }

    public MonHoc getMh() {
        return mh;
    }

    public void setMh(MonHoc mh) {
        this.mh = mh;
    }

    public int getSolop() {
        return solop;
    }

    public void setSolop(int solop) {
        this.solop = solop;
    }
    
    
    
    public Object[] toObjects(){
        return new Object[]{
          gv.getMa(),gv.getTen(),mh.getMa(),mh.getTen(),solop,time
        };
    }
    
}
