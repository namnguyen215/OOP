/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author NamNguyen
 */
public class QLTV implements IChucNang{
    private List<TaiLieu> list=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    
    private TaiLieu tontai(String ma){
        for(TaiLieu i:list)
            if(i.getMatl().equalsIgnoreCase(ma))
                return i;
        return null;
    }
    
    private TaiLieu nhap(){
        String matl,nhaxb;
        int soban;
        TaiLieu t=null;
        while(true){
            System.out.println("Nhap ma tai lieu:   ");
            matl=sc.nextLine();            
            String reg="^[a-zA-Z]{2}[0-9]{4}";
            if(matl.matches(reg) && (tontai(matl)==null))
                break;
            System.err.println("Nhap lai!!!");
        }

        System.out.println("Nhap nha xuat ban:   ");
        nhaxb=sc.nextLine();
        System.out.println("Nhap so ban:    ");
        soban=Integer.parseInt(sc.nextLine());
        t=new TaiLieu(matl, nhaxb, soban);
        return t;
    }
    
    @Override
    public void nhapSach() {
        TaiLieu t=nhap();
        System.out.println("Nhap ten tac gia:     ");
        String tentg=sc.nextLine();
        System.out.println("Nhap ten sach:      ");
        String tensach=sc.nextLine();
        System.out.println("Nhap so trang");
        int sotrang=Integer.parseInt(sc.nextLine());
        list.add(new Sach(tensach, tentg, t.getMatl(), t.getNhaxb(), t.getSoban()));
    }

    @Override
    public void nhapTapChi() {
        TaiLieu t=nhap();
         System.out.println("Nhap thang phat hanh:  ");
         int thangph=Integer.parseInt(sc.nextLine());
         list.add(new TapChi(thangph, t.getMatl(), t.getNhaxb(), t.getSoban()));
    }

    @Override
    public void inDS() {
        for(TaiLieu i:list){
            System.out.println(i);
        }
        System.out.println("Kich thuoc la: "+list.size());
    }

    @Override
    public void timTheoNXB() {
        System.out.println("Nhap ten nha xb");
        String nhaxb=sc.nextLine();
        boolean ok=false;
        for(TaiLieu i:list){
            if(i.getNhaxb().equalsIgnoreCase(nhaxb)){
                ok=true;
                System.out.println(i);
            }
        }
        if(ok==false){
            System.out.println("Khong Co");
        }
    }

    @Override
    public void sua() {
        System.out.println("Nhap ma sach");
        String masach=sc.nextLine();
        TaiLieu t=tontai(masach);
        if(t==null){
            System.out.println("Khong tim thay ma sach");
        }
        else{
            System.out.println("Nhap nha xuat ban moi: ");
            String nxb=sc.nextLine();
            System.out.println("Nhap so ban phat hanh moi:   ");
            int soban=Integer.parseInt(sc.nextLine());
            t.setNhaxb(nxb);
            t.setSoban(soban);
            System.out.println(t);
        }
    }

    @Override
    public void PHThapNhat() {
        
    }
    
}
