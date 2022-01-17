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
public class PTGT {
    private String code,color,brand;
    private double price;
    private int year;

    public PTGT() {
    }

    public PTGT(String code, String color, String brand, double price, int year) {
        this.code = code;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
