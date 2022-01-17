/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;


public class Sinhvien {
    private String ma;
    private String ten;
    private boolean gtinh;
    private int tuoi;
    private double diem;


    //ham tao mac dinh
    
    //ham tao 1 doi
    public Sinhvien(String ma){
        this.ma=ma;
        
    }
    public Sinhvien(String ma, String ten, boolean gtinh, int tuoi,double diem){
        this.ma=ma;
        this.ten=ten;
        this.gtinh=gtinh;
        this.tuoi=tuoi;
        this.diem=diem;
    }
    public void setMa(String ma){
        this.ma=ma;
    }
    public String getMa(){
        return ma;
    }
    public String getTen(){
        return ten;
    }        
}
