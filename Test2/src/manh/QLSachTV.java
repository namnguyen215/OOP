
package manh;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class QLSachTV implements IChucNang{
    private List<Sach> list=new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    private Sach tontai(String ma){
        for(Sach i:list)
            if(i.getMa().equalsIgnoreCase(ma))
                return i;
        return null;
    }
    
    private Sach nhap(){
        String ma="",tensach,tacgia;
        int nhaxb,dongia;
        Sach t=null;
        System.out.println("Nhap ten sach:   ");
        tensach=sc.nextLine();
        System.out.println("Nhap tac gia:    ");
        tacgia=sc.nextLine();
        System.out.println("Nhap nha xuat ban 1/2/3/4: ");
        nhaxb=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap don gia: ");
        dongia=Integer.parseInt(sc.nextLine());       
        t=new Sach(ma, tensach, nhaxb, tacgia, dongia);
        return t;
    }
    
    @Override
    public void nhapSachGK() {
        Sach t=nhap();
        String ma;
        while(true){
            System.out.println("Nhap ma sach:   ");
            ma=sc.nextLine();            
            String reg="^A[A-Z]{2}";
            if(ma.matches(reg) && (tontai(ma)==null))
                break;
            System.err.println("Nhap lai!!!");
        }

        System.out.println("Nhap lop:     ");
        String lop=sc.nextLine();
        list.add(new SachGK(lop,ma, t.getTensach(),t.getNhaxb(), t.getTacgia(), t.getDongia()));
    }

    @Override
    public void nhapSachTK() {
        Sach t=nhap();
        String ma;
        while(true){
            System.out.println("Nhap ma sach:   ");
            ma=sc.nextLine();   
            if(tontai(ma)==null)
                break;
            System.err.println("Nhap lai!!!");
        }
        System.out.println("Nhap ngon ngu true:TV, false: NN:");
        boolean nn=Boolean.parseBoolean(sc.nextLine());
         list.add(new SachTK(nn,ma, t.getTensach(),t.getNhaxb(), t.getTacgia(), t.getDongia()));
    }

    @Override
    public void inDS() {
        for(Sach i:list){
            System.out.println(i);
        }
        System.out.println("So luong sach : "+list.size());
    }

    @Override
    public void timSachTK() {

    }

    @Override
    public void sapxepSach() {

    }

    @Override
    public void giaDatNhat() {
        
    }
    
}
