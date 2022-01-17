/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import controller.Trongex;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author NamNguyen
 */
public class QuanLy implements Serializable{
    //cauthu,vitri,sotran
    private CauThu ct;
    private ViTri vt;
    private int sotran;

    public QuanLy(CauThu ct, ViTri vt, int sotran) {
        this.ct = ct;
        this.vt = vt;
        this.sotran = sotran;
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

    public int getSotran() {
        return sotran;
    }

    public void setSotran(int sotran) {
        this.sotran = sotran;
    }
    
    public Object[] toObjects(){
        return new Object[]{
          ct.getMa(),ct.getTen(),vt.getMa(),vt.getTen(),sotran
        };
    }
    
    
}
