import java.util.Scanner;

class ExceptionClass extends Exception{
    @Override
    public String toString(){
        return super.toString()+"  I am toString()";
    }
    @Override
    public String getMessage(){
        return super.getMessage()+"  I am getMessage()";
    }
}
public class MyException {
    public static void main(String[] args) throws ArithmeticException {
int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<9){
            try {
              //  throw new ExceptionClass();
                throw new ArithmeticException("an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("finished");
            }
            System.out.println("yes done");
        }
    }
}
