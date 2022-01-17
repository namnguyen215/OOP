
package Q1_PhoneNumber;

public class PhoneNumber {
    private int mavung,noivung;

    public PhoneNumber(int mavung, int noivung) {
        this.mavung = mavung;
        this.noivung = noivung;
    }

    public int getMavung() {
        return mavung;
    }

    public void setMavung(int mavung) {
        this.mavung = mavung;
    }

    public int getNoivung() {
        return noivung;
    }

    public void setNoivung(int noivung) {
        this.noivung = noivung;
    }

    @Override
    public String toString() {
        return "0"+ mavung + "-" + noivung;
    }
    
}
