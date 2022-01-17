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
public class BangSapXep implements Serializable{
   // mã phòng, Tên phòng, Số ghế, Kiểu phòng
    private int mal,map;
    private String tenlop,tenphong;

    public BangSapXep(int mal, int map, String tenlop, String tenphong) {
        this.mal = mal;
        this.map = map;
        this.tenlop = tenlop;
        this.tenphong = tenphong;
    }

    public int getMal() {
        return mal;
    }

    public void setMal(int mal) {
        this.mal = mal;
    }

    public int getMap() {
        return map;
    }

    public void setMap(int map) {
        this.map = map;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }
    
    
    public Object[] toObjects(){
        return new Object[]{
          mal,tenlop,map,tenphong 
        };
    }
    
}
