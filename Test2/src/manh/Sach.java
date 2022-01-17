
package manh;

public class Sach {
    private String ma,tensach,tacgia;
    private int dongia,nhaxb;

    public Sach() {
    }

    public Sach(String ma, String tensach, int nhaxb, String tacgia, int dongia) {
        this.ma = ma;
        this.tensach = tensach;
        this.nhaxb = nhaxb;
        this.tacgia = tacgia;
        this.dongia = dongia;
    }
    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getNhaxb() {
        return nhaxb;
    }

    public void setNhaxb(int nhaxb) {
        this.nhaxb = nhaxb;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    
}
