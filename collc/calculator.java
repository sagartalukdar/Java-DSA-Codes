package collc;

import java.util.Random;
import java.util.Scanner;

class game{
   public int number;
   public int userint;
   public int noOfGuesses=0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    game(){
        Random r=new Random();
        this.number=r.nextInt(100);
    }
    void takeUsserInput(){
        System.out.println("guess the number");
        Scanner sc= new Scanner(System.in);
        userint= sc.nextInt();

        }
    boolean isCorrect(){
        noOfGuesses++;
        if (userint==number){
            System.out.format("this is correct,this was %d and you guess this in %d attempt",number,noOfGuesses);
            return true;
        }
        else if(userint>number){
            System.out.println("too high");
        }
        else if (userint<number){
            System.out.println("too low");
        }
        return false;
    }
}
public class calculator {
    public static void main(String[] args) {
    game g=new game();
    boolean b=false;
    while (!b){
        g.takeUsserInput();
        b=g.isCorrect();
    }
    }
}
