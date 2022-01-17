package KiemTra1;
import java.util.*;
public class Xau {
    private String s;
    public Xau(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot xau: ");
        s=sc.nextLine();
    }
    public void doDai(){
        System.out.println("Do dai xau la: "+s.length());
    }
    public void soCau(){
        
        String[] t=s.split("[\\.?!]");
        System.out.println("So cau trong s la: "+t.length);
        for(String x:t){
            x=x.trim();
            System.out.println(x);
        }
    }
}
