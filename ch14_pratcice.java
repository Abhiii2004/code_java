import java.util.Scanner;
class MaxRetry extends Exception {
    public MaxRetry(String message) {
        super(message);
    }
}
public class ch14_pratcice {
    public static void main(String[] args) {
        //prblm 1 a program to show syntax,logical and run time error
        //int s=ab;
        //int age =40;
        //int year_born=2020-40;
        //System.out.println(6/0);
        //prblm 2 "haha" whn arithmetic exception "hehe" whn illegal argument expression
      /*  try {
            int a = 666 / 9;
        } catch (IllegalArgumentException e) {
            System.out.println("hehe");
        } catch (ArithmeticException e) {
            System.out.println("haha");
        }*/
        //prblm 3
        boolean flag = true;
        int marks[] = {22,21,12,12,12};
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i < 5) {
            try {
                index = sc.nextInt();
                System.out.println("the marks of [index] is" + marks[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("invalid index");
                i++;
            }
        if (i <= 5){
                        try {
                            throw new MaxRetry("Maximum retry attempts reached!");
                        }catch(MaxRetry ex){
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }
}