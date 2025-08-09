import java.util.Random;
import java.util.Scanner;
class game{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
    }
    boolean isCorrectNumber() {
        noOfGuesses ++;
    if (inputNumber==number) {
        System.out.format("yes you guessed it right,it was %d\n you guessed it in %d attempts ",number,noOfGuesses);
        return true;
    }
    else if(inputNumber<number){
        System.out.println("too low....");
    } else if (inputNumber>number) {
        System.out.println("too high....");
    }
        return false;
    }
}
public class guessGame {
    public static void main(String[] args) {
        //guess the number game
        game g=new game();
        boolean b=false;
        while(!b){
        g.takeUserInput();
      b= g.isCorrectNumber();
            System.out.println(b);
    }
}}
