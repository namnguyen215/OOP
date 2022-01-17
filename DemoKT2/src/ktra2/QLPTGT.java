
package ktra2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;


public class QLPTGT implements ChucNang{
    private List<PTGT> list;
    private Scanner in=new Scanner(System.in);

    public QLPTGT() {
        list=new ArrayList<>();
        
        list.add(new Oto("HN432","Yaris", 2012, 800000,"BB765", 4, "do"));
        list.add(new Oto("HN987","Kia morning", 2010, 230000,"KK765", 4, "non chuoi"));
        list.add(new Oto("HN965","Kia", 2020, 800000,"KK765", 4, "non chuoi"));
        list.add(new XeMay("HN542","SH", 2010, 80000, "Do", 150));
        list.add(new XeMay("HN900","vision", 2020, 36000, "tim", 125));
    }
    
    private PTGT tontai(String ma){
        for(PTGT i:list)
            if(i.getMa().equalsIgnoreCase(ma))
                return i;
        return null;
    }
    private PTGT nhap(){
        PTGT t=null;
        String ma,hang;
        int nam;
        double gia;
        String mau;
        String reg="^HN\\d{3}";
        while(true){
            System.out.print("nhap ma:");
            ma=in.nextLine().toUpperCase();
            if(ma.matches(reg) && (tontai(ma)==null))
                break;
            System.err.println("Nhap lai!!!");
        }
        System.out.print("nhap hang:");
        hang=in.nextLine();
        System.out.print("nhap nam:");
        nam=Integer.parseInt(in.nextLine());
        System.out.print("nhap gia:");
        gia=Double.parseDouble(in.nextLine());
        System.out.print("nhap mau:");
        mau=in.nextLine();
        t=new PTGT(ma, hang, nam, gia, mau);
        return t;
    }
    
    
    @Override
    public void nhapOto() {
        PTGT t=nhap();
        System.out.print("nhap dong co:");
        String dc=in.nextLine();
        System.out.print("nhap so cho:");
        int sc=Integer.parseInt(in.nextLine());
        list.add(new Oto(t.getMa(),t.getHang(),
                t.getNam(),t.getGia(), dc, sc, t.getMau()));
    }

    @Override
    public void nhapXeMay() {
        PTGT t=nhap();
        System.out.print("nhap cong suat:");
        double cs=Double.parseDouble(in.nextLine());
        list.add(new XeMay(t.getMa(),t.getHang(),
                t.getNam(),t.getGia(),t.getMau(),cs));
    }

    @Override
    public void vietDS() {
        System.out.println("------Danh sach Oto---------");
        for(PTGT i:list){
            if(i instanceof Oto)
                System.out.println(i);
        }
        System.out.println("------Danh sach Xe May---------");
        for(PTGT i:list){
            if(i instanceof XeMay)
                System.out.println(i);
        }
        System.out.println("-----------------------------");
    }

    @Override
    public void sua() {
        System.out.print("nhap ma can sua:");
        String ma=in.nextLine();
        PTGT t=tontai(ma);
        if(t==null){
            System.out.println("co dau ma sua!!!");
        }else{
            int pos=list.indexOf(t);
            //nhap cac thu can sua
            System.out.print("nhap hang moi:");
            String hang=in.nextLine();
            System.out.print("nhap nam moi:");
            int nam=Integer.parseInt(in.nextLine());
            System.out.print("nhap gia moi:");
            double gia=Double.parseDouble(in.nextLine());
            System.out.print("nhap mau moi:");
            String mau=in.nextLine();
            PTGT p=list.get(pos);
            p.setHang(hang);
            p.setNam(nam);
            p.setGia(gia);
            p.setMau(mau);
            System.out.println("Sua thanh cong!!!");
        }
    }

    @Override
    public void xoa() {
        System.out.print("nhap ma can xoa:");
        String ma=in.nextLine();
        PTGT t=tontai(ma);
        if(t==null){
            System.out.println("co dau ma xoa!!!");
        }else{
            list.remove(t);
            System.out.println("Xoa thanh cong!!!");
        }
    }

    @Override
    public void tkTheoMa() {
            //tim chinh xac
         System.out.print("nhap ma can tim:");
        String ma=in.nextLine();
        PTGT t=tontai(ma);   
        if(t==null){
            System.out.println("Khong tim thay");
        }else
            System.out.println(t);
    }

    @Override
    public void tkTheoHang() {
        //tim co chua xau
        System.out.print("nhap hang can tim:");
        String hang=in.nextLine().toLowerCase();
        boolean co=false;
        for(PTGT i:list){
            if(i.getHang().toLowerCase().indexOf(hang)>=0){
               System.out.println(i);
               co=true;
            }
        }
        if(!co)
            System.out.println("Khong thay!!!");
            
    }

    @Override
    public void tkTheoNam() {
        //tu nam.... cho den nam....
        System.out.print("nhap tu nam:");
        int n1=Integer.parseInt(in.nextLine());
        System.out.print("nhap den nam:");
        int n2=Integer.parseInt(in.nextLine());
        boolean co=false;
        for(PTGT i:list){
            if(i.getNam()>=n1 && i.getNam()<=n2){
                System.out.println(i);
                co=true;
            }    
        }
        if(!co)
            System.out.println("Khong thay!!!");
    }

    @Override
    public void tkGiaCao() {
        System.out.print("nhap vao gia :");
        double n=Double.parseDouble(in.nextLine());
        boolean co=false;
        for(PTGT i:list){
            if(i.getGia()>=n){
                System.out.println(i);
                co=true;
            }    
        }
        if(!co)
            System.out.println("Khong thay!!!");
        
    }

    @Override
    public void sapxepTheoMa() {
        Collections.sort(list, new Comparator<PTGT>(){
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return o1.getMa().compareToIgnoreCase(o2.getMa());
            }
        
        });
    }
    //tang dan
    @Override
    public void sapxepTheoNam() {
        list.sort(new Comparator<PTGT>() {
            @Override
            public int compare(PTGT o1, PTGT o2) {
                //return o1.getNam()-o2.getNam();//tang dan
                return o2.getNam()-o1.getNam();//giam dan
            }
        });
    }
    //tang dan
    public void sapxepTangDanTheoNam(){
        sapxepTheoNam();//giam dan
        Collections.reverse(list); //tang dan
        
    }
    @Override
    public void sapxepTheoGia() {
        //Collections.sort(list);
        list.sort(new Comparator<PTGT>() {
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return Double.compare(o1.getGia(),o2.getGia());//1 0 -1
            }
        });
    }

    @Override
    public void thongke() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //sap xep theo 2 thuoc tinhs
    @Override
    public void sapxepNamvaGia() {
        list.sort(new Comparator<PTGT>() {
            @Override
            public int compare(PTGT o1, PTGT o2) {
                //nam giong nhau thi theo gia
                if(o1.getNam()==o2.getNam())
                    return Double.compare(o1.getGia(), o2.getGia());
                else
                    return o1.getNam()-o2.getNam();
            }
        });
    }
    //ho va ten (To An An)  - tenHo va ten - AnTo An An
    //ngay thang nam sinh (12/06/2000)- namthangngay - 20000612
    public void countTheoNam(){
        Map<Integer,Long> count=list.stream().collect(
                Collectors.groupingBy(PTGT::getNam,
                Collectors.counting()));
        System.out.println(count);
    }
    public void countTheoMau(){
        Map<String,Long> count=list.stream().collect(
                Collectors.groupingBy(PTGT::getMau,
                Collectors.counting()));
        System.out.println(count);
    }
    public void sumGiaTheoNam(){
        Map<Integer,Double> sum=list.stream().collect(
                Collectors.groupingBy(PTGT::getNam,
                        Collectors.summingDouble(PTGT::getGia)));
        System.out.println(sum);

    }
    public void sumGiaTheoMau(){
        Map<String,Double> sum=list.stream().collect(
                Collectors.groupingBy(PTGT::getMau,
                        Collectors.summingDouble(PTGT::getGia)));
        System.out.println(sum);

    }
    public void maxByGia(){
        
            Optional<PTGT> max =list.stream().collect(
                    Collectors.maxBy(Comparator.comparing(PTGT::getGia)));
        System.out.println("PT co gia max:"+(max.isPresent()? max.get():"Khong co"));

    }
    public void maxGiaByMau(){
        
        Map<String, PTGT> o = list.stream().collect(Collectors.groupingBy(
                PTGT::getMau,
         Collectors.collectingAndThen(
         Collectors.reducing((PTGT t1, PTGT t2) ->  
                 t1.getGia()> t2.getGia()? t1 : t2),  Optional::get)));    
        Iterator i=o.keySet().iterator();
        while(i.hasNext()){
            String key=(String)i.next();
            System.out.println(key+"- gia cao nhat:"+o.get(key));
        }
        //System.out.println(o);
    }
}
