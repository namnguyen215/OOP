package exception;
public class Exception {
    public static void main(String[] args) {
        int a=9,b=0;
        try{
            //Ko loi thuc hien o try
            int c=a/b;
        }catch(ArithmeticException e){
            //neu co loi bo qua try thuc hien catch
            System.out.println("Fail");
        }
        System.out.println("Task here");
    }
    
}
