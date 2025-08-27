public class final_example {
    public static int greet(){
        try{
        int a =24;
        int b=2;
        int c=a/b;
        return c;
    } catch (Exception e) {
        System.out.println(e);
    }
    finally{
        System.out.println("end of program");
    }
    return 0;
    }
    public static void main(String[] args) {
        int k=greet();
        System.out.println(k);
        int a=24;
        int b=2;
        while(b>=3) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("i am finally for b" + b);
            }
        }
        try{
            System.out.println(50/2);
        }
        finally {
            System.out.println("this if finally");
        }
    }
}
