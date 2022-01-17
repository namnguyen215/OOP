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
public class TapChi extends TaiLieu implements ITinhAnPham {

    private int thangph;

    public TapChi(int thangph, String matl, String nhaxb, int soban) {
        super(matl, nhaxb, soban);
        this.thangph = thangph;
    }

    public int getThangph() {
        return thangph;
    }

    public void setThangph(int thangph) {
        this.thangph = thangph;
    }

    @Override
    public String toString() {
        return "TapChi{" + "thangph=" + thangph + ", matl="+getMatl() +", nhaxb=" +getNhaxb()+", soban="+getSoban() + '}';
    }

    @Override
    public int getAnPham() {
        if (this.getSoban() < 500) {
            return this.getSoban() / 20;
        } else {
            return this.getSoban() / 10;
        }
    }

}
