/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author NamNguyen
 */
public class TaiLieu {
    private String matl,nhaxb;
    private int soban,soanpham;
    public TaiLieu(String matl, String nhaxb, int soban) {
        this.matl = matl;
        this.nhaxb = nhaxb;
        this.soban = soban;
    }

    public TaiLieu() {
    }
    

    public String getMatl() {
        return matl;
    }

    public void setMatl(String matl) {
        this.matl = matl;
    }

    public String getNhaxb() {
        return nhaxb;
    }

    public void setNhaxb(String nhaxb) {
        this.nhaxb = nhaxb;
    }

    public int getSoban() {
        return soban;
    }

    public void setSoban(int soban) {
        this.soban = soban;
    }

    public int getSoanpham() {
        return soanpham;
    }

    public void setSoanpham(int soanpham) {
        this.soanpham = soanpham;
    }
    
}
