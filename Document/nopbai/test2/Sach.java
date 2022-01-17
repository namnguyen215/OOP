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
public class Sach extends TaiLieu implements ITinhAnPham{
    private String tensach,tentg;
    private int sotrang;
    public Sach(String tensach, String tentg, String matl, String nhaxb, int soban) {
        super(matl, nhaxb, soban);
        this.tensach = tensach;
        this.tentg = tentg;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTentg() {
        return tentg;
    }

    public void setTentg(String tentg) {
        this.tentg = tentg;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    @Override
    public String toString() {
        return "Sach{" + "tensach=" + tensach + ", tentg=" + tentg + ", sotrang=" + sotrang + ", matl="+getMatl() +", nhaxb=" +getNhaxb()+", soban="+getSoban() +'}';
    }

    @Override
    public int getAnPham() {
        if(this.getSoban()<500){
            return this.getSoban()/10;
        }
        else
            return this.getSoban()/5;
    }
    
}
