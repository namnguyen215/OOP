import java.util.Scanner;

public class SoNguyen {
    private int x;

    public SoNguyen() {
        System.out.println("Nhap vao mot so nguyen n: ");
        Scanner sc=new Scanner(System.in);
        x=Integer.parseInt(sc.nextLine());
    }
    
    public SoNguyen(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean isPrime(int i){
        if(i==2 || i==3) return true;
        if(i%2==0 || i<2) return false;
        for(int j=3;j<=Math.sqrt(i)+1;j+=2){
            if(i%j==0)
                return false;
        }
        return true;
    }
    public void uocSoNguyenTo(){
        System.out.println("Cac uoc so nguyen to cua "+x+" la:");
        for (int i=2;i<=x;i++){
            if(isPrime(i) && x%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
    
    public void fibo(){
        System.out.println("Cac so fibo nho hon "+x+" la:");
        long[] f=new long[95];
        f[0]=0;f[1]=1;
        for(int i=2;i<=92;i++){
            f[i]=f[i-1]+f[i-2];
        }
        int i=0;
        while(f[i]<x){
            System.out.print(f[i]+" ");
            i++;
        }
        System.out.println("");
    }
    
}
