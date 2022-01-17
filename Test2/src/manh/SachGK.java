
package manh;

public class SachGK extends Sach implements ITaoMa {
    private String lop;

    public SachGK(String lop, String ma, String tensach, int nhaxb, String tacgia, int dongia) {
        super(ma, tensach, nhaxb, tacgia, dongia);
        this.lop = lop;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SachGK{" + "lop=" + lop + this.getMa()+"\t"+this.getTensach()+"\t"+this.getTacgia()+'}';
    }
    
    @Override
    public String getMa() {
        return "1"+super.getMa()+lop;
    }

    

}
