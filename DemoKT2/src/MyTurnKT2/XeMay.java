/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTurnKT2;

/**
 *
 * @author NamNguyen
 */
public class XeMay extends PTGT{
    private int cylinderCapacity;

    public XeMay() {
    }

    public XeMay(int cylinderCapacity, String code, String color, String brand, double price, int year) {
        super(code, color, brand, price, year);
        this.cylinderCapacity = cylinderCapacity;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }
    
}
