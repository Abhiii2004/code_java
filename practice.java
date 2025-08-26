import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        //try and catch usages
        int a=600;int b=0;
        try{
        int c=a/b;
            System.out.println("the result "+c);}
        catch(Exception e) {
            System.out.println("we failed");
            System.out.println(e);
        }
        System.out.println("the end program");
        //handling specific exceptions
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int marks[]=new int [size];
        for(int i=0;i<size;i++){
            System.out.println("enter the array elements"+(i+1)+":");
            marks[i]=sc.nextInt();
        }

        System.out.println("enter index of array");
        int ind=sc.nextInt();
        System.out.println("enter the value of the number you want to divide");
        int n=sc.nextInt();
        try{
            System.out.println("the array value entered at index is"+marks[ind]);
            System.out.println("the value of array number is"+marks[ind]/n);
        }
        catch(ArithmeticException e){
            System.out.println("an arithmetic exception occured");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);}
        catch(Exception e){
            System.out.println(e);
        }}}
