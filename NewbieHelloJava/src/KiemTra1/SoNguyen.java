
package KiemTra1;
import java.util.*;
public class SoNguyen {
    private int n;
    public SoNguyen() {
        Scanner sc=new Scanner(System.in);
        System.out.println("n=");
        n=Integer.parseInt(sc.nextLine());
    }
    public void tinhTong(){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Tong cac so tu 1 den n la: "+sum);
    }
    private boolean isNT(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public void daySoNguyenTo(){
        System.out.println("Day so nguyen to:");
        for(int i=1;i<=n;i++){
            if(isNT(i))
                System.out.print(i+" ");
        }
        System.out.println("");
    }
    
}
