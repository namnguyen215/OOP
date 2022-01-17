
package sach;
import java.util.Scanner;

public class DSSach {
     private Sach[] list;
     private Scanner in;
     private int m;

    public DSSach() {
        in=new Scanner(System.in);
        System.out.print("So luong loai sach toi da:");
        int n=Integer.parseInt(in.nextLine());
        list=new Sach[n];
        m=0;
        list[m++]=new Sach("B56432","nnnn", true,"gggg",12,6);
        list[m++]=new Sach("B90654","aaaa", true,"gggg",12,6);
        list[m++]=new Sach("B56900","nnnn", true,"gggg",12,6);
        
    }
    private Sach tontaiSach(String ma){
        for (int i = 0; i < m; i++) {
            if(list[i].getMa().equalsIgnoreCase(ma))
                return list[i];
        }
        return null;
    }
    public void nhapSach(){
        /*
        private String ma;
    private String ten;
    private boolean tviet;
    private String tgia;
    private double gia;
    private int sluong;
        */
        String ma,ten,tgia;
        boolean tv;
        double gia;
        int sl;
        //p12345
        String reg="^P\\d{2}\\d{3}";
        while(true){
            System.out.print("Nhap ma:");
            ma=in.nextLine().toUpperCase();
            if(ma.matches(reg) && (tontaiSach(ma)==null))
                break;
            System.err.println("Nhap lai!!");
        }
        System.out.print("Nhap ten:");
        ten=in.nextLine();
        System.out.print("Nhap Tieng viet (true/flase):");
        tv=Boolean.parseBoolean(in.nextLine());
        System.out.print("Nhap tac gia:");
        tgia=in.nextLine();
        System.out.print("Nhap gia:");
        gia=Double.parseDouble(in.nextLine());
        System.out.print("So luong :");
        sl=Integer.parseInt(in.nextLine());
        list[m++]=new Sach(ma, ten, tv, tgia, gia, sl);
    }
    public void viet(){
        System.out.println("Danh sach sach");
        for (int i = 0; i < m; i++) {
            System.out.println(list[i]); 
        }
    }
    public void timTheoMa(){
        System.out.print("Nhap vao ma can tim:");
        String ma=in.nextLine();
        Sach s=tontaiSach(ma);
        if(s==null){
            System.out.println("khong co");
        }else{
            System.out.println("Tim ra:");
            System.out.println(s);
        }
    }
    
     
}
