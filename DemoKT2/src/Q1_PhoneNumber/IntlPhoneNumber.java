/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1_PhoneNumber;

/**
 *
 * @author NamNguyen
 */
public class IntlPhoneNumber extends PhoneNumber {
    private int maqg;
    public IntlPhoneNumber(int maqg, int mavung, int noivung) {
        super(mavung, noivung);
        this.maqg = maqg;
    }

    @Override
    public String toString() {
        return Integer.toString(maqg) + '-'+ this.getMavung() + "-" + this.getNoivung();
    }
    
}
