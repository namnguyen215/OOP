
package manh;


public class SachTK extends Sach implements ITaoMa {
    private boolean ngonngu;

    public SachTK(boolean ngonngu, String ma, String tensach, int nhaxb, String tacgia, int dongia) {
        super(ma, tensach, nhaxb, tacgia, dongia);
        this.ngonngu = ngonngu;
    }

    public boolean isNgonngu() {
        return ngonngu;
    }

    public void setNgonngu(boolean ngonngu) {
        this.ngonngu = ngonngu;
    }

    @Override
    public String toString() {
        return "SachTK{" + "ngonngu=" + ngonngu + this.getMa()+"\t"+this.getTensach()+"\t"+this.getTacgia()+ '}';
    }
    
    @Override
    public String getMa() {
        String nn="";
        if(ngonngu==true)
            nn="V";
        else
            nn="NN";
        return super.getNhaxb()+super.getMa()+nn;
    }   
}
