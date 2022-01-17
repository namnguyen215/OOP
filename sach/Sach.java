
package sach;


public class Sach {
    //thuoc tinh private
    private String ma;
    private String ten;
    private boolean tviet;
    private String tgia;
    private double gia;
    private int sluong;

    public Sach() {
    }
    
    public Sach(String ma, String ten, boolean tviet, 
            String tgia, double gia, int sluong) {
        this.ma = ma;
        this.ten = ten;
        this.tviet = tviet;
        this.tgia = tgia;
        this.gia = gia;
        this.sluong = sluong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isTviet() {
        return tviet;
    }

    public void setTviet(boolean tviet) {
        this.tviet = tviet;
    }

    public String getTgia() {
        return tgia;
    }

    public void setTgia(String tgia) {
        this.tgia = tgia;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSluong() {
        return sluong;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }
    public double getTongTien(){
        return (sluong*gia);
    }
    //viet ra
    public String toString(){
        return (ma+"\t"+ten+"\t"+(tviet?"Tieng Viet":"Nuoc ngoai")+
                "\t"+tgia+"\t"+getTongTien());
    }
    
}
