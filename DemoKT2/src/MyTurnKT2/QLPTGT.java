package MyTurnKT2;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QLPTGT implements functions {

    private List<PTGT> db = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public PTGT nhap() {
        PTGT t = null;
        String code, color, brand;
        double price;
        int year;
        System.out.println("Nhap ma xe: ");
        code = sc.nextLine();
        System.out.println("Nhap brand: ");
        brand = sc.nextLine();
        System.out.println("Nhap color: ");
        color = sc.nextLine();
        System.out.println("Nhap manufactured year: ");
        year = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap price: ");
        price = Double.parseDouble(sc.nextLine());
        t = new PTGT(code, color, brand, price, year);
        return t;

    }

    @Override
    public void nhapOto() {
        PTGT t = nhap();
        String engine;
        int seats;
        System.out.println("Please type in engine: ");
        engine = sc.nextLine();
        System.out.println("Please type in number of seats: ");
        seats = Integer.parseInt(sc.nextLine());
        db.add(new Oto(engine, seats, t.getCode(), t.getColor(), t.getBrand(), t.getPrice(), t.getYear()));
    }

    @Override
    public void nhapXeMay() {
        PTGT t = nhap();
        int cylinderCapacity;
        System.out.println("Nhap vao dung tich xy lanh");
        cylinderCapacity = Integer.parseInt(sc.nextLine());
        db.add(new XeMay(cylinderCapacity, t.getCode(), t.getColor(), t.getBrand(), t.getPrice(), t.getYear()));
    }

    @Override
    public void inDS() {
        System.out.println("------Danh sach Oto---------");
        for (PTGT t : db) {
            if (t instanceof Oto) {
                System.out.println(t.getCode() + "\t" + t.getColor() + "\t" + t.getBrand() + "\t" + t.getPrice() + "\t" + t.getYear() + "\t" + ((Oto) t).getEngine() + "\t" + ((Oto) t).getSeats());
            }
        }
        System.out.println("------Danh sach Xe May---------");
        for (PTGT t : db) {
            if (t instanceof XeMay) {
                System.out.println(t.getCode() + "\t" + t.getColor() + "\t" + t.getBrand() + "\t" + t.getPrice() + "\t" + t.getYear());
            }
        }
        System.out.println("-----------------------------");

    }

    @Override
    public void sua() {
        PTGT t = searchByCode();
        if (t == null) {
            System.out.println("Cannot find your code!");
        } else {
            int pos = db.indexOf(t);
            PTGT p = db.get(pos);
            System.out.println("Insert new color: ");
            p.setColor(sc.nextLine());
            System.out.println("Insert new brand: ");
            p.setBrand(sc.nextLine());
            System.out.println("Insert new price: ");
            p.setPrice(Double.parseDouble(sc.nextLine()));
            System.out.println("Insert new manufactured year: ");
            p.setYear(Integer.parseInt(sc.nextLine()));
            System.out.println("Fix complete!!!");
        }
    }

    @Override
    public void xoa() {
        PTGT t = searchByCode();
        if (t == null) {
            System.out.println("Cannot find your code!");
        } else {
            db.remove(t);

        }
    }

    @Override
    public void sortByPrice() {
        db.sort(new Comparator<>() {
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return o1.getYear()-o2.getYear();
            }
        });
    }

    @Override
    public PTGT searchByCode() {
        String fixcode;
        System.out.println("Nhap vao ma muon sua/xoa:");
        fixcode = sc.nextLine();
        for (PTGT item : db) {
            if (item.getCode().equalsIgnoreCase(fixcode)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public void countByYear() {
        //Group by manufactured year and then count the numbers of vehicle by year
        Map<Integer,Long> count=db.stream().collect(
                Collectors.groupingBy(PTGT::getYear,
                Collectors.counting()));
        System.out.println(count);
    }
}
