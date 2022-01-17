/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.io.Serializable;

/**
 *
 * @author NamNguyen
 */
public class Oto implements Serializable {
    private String tenxe;
    private int socho;
    
    public Oto() {
    }

    public Oto(String tenxe, int socho) {
        this.tenxe = tenxe;
        this.socho = socho;
    }

    @Override
    public String toString() {
        return "Oto{" + "dongco=" + tenxe + ", socho=" + socho + '}';
    }
    


}
