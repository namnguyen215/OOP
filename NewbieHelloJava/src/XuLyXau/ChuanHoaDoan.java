
package XuLyXau;
public class ChuanHoaDoan {
	public static void main(String[] args) {
            String s="dAy  la mot     doAn VAN  ban sai .  minh cAn phai   sua lai ,chac la se OK. abcxyz";
            // Xu ly viet hoa va dau cach
            s=s.trim().replaceAll("\\s+"," ").toLowerCase();  
            //Xu ly dau cau
            s=s.replaceAll("\\s+\\.\\s*","\\. ");
            s=s.replaceAll("\\s+\\,\\s*","\\, ");
            s=s.replaceAll("\\s+\\?\\s*","\\? ");
            s=s.replaceAll("\\s+\\!\\s*","\\! ");
            //Viet hoa dau cau
            String [] a=s.split("\\.\\s");
            for (int i=0;i<a.length;i++) {
                a[i]=a[i].substring(0, 1).toUpperCase() + a[i].substring(1);
            }
            String res="";
            for(int i=0;i<a.length;i++){
                res+=a[i]+". ";
            }
            System.out.println(res);
	}
}
