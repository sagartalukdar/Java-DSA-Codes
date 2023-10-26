package com.company;

import java.util.Scanner;

class guesser {
    Scanner sc=new Scanner(System.in);
    int guessnum;
 int guessing(){
     System.out.println("enter guesser num");
guessnum= sc.nextInt();
    return guessnum;
}
}
class player{
    Scanner sc=new Scanner(System.in);
    int playernum;
     int guessing(){
         System.out.println("enter player num");
        playernum=sc.nextInt();
        return playernum;
    }
}
class umpire{
    int limit;
    int guessernum;
    int player1num;
    int player2num;
    int player3num;

    void guesser(){
        guesser g=new guesser();
        guessernum=g.guessing();
    }
    void player(){
       player p1=new player();
       player p2=new player();
       player p3=new player();
       player1num=p1.guessing();
       player2num=p2.guessing();
       player3num=p3.guessing();
    }
    void compare(){
       if (guessernum==player1num){
           if (guessernum==player2num&&guessernum==player3num){
               System.out.println("they all win");
           } else if (guessernum==player2num) {
               System.out.println("1 & 2 win");
           }else if(guessernum==player3num){
               System.out.println("1 & 3 win");
           }else {
               System.out.println("1 win");
           }
       } else if (guessernum==player2num) {
           if (guessernum==player3num){
               System.out.println(" 2 & 3 win");
           }else {
               System.out.println("2 win");
           }
       }
       else if(guessernum==player3num){
           System.out.println("3 win");
       }else {
           System.out.println("they all lost");
       }
    }

}
public class second {

    public static void main(String[] args)  {
   umpire u=new umpire();
   u.guesser();u.player();u.compare();
      }

}