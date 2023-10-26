package collc;

import java.util.Scanner;

public class nestedtry {

    public static void password(){
        int num=122;
        int otp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter password");
        otp=sc.nextInt();
        if (otp==num){
            System.out.println("yes you can go");
        }
        if (otp!=num){
            System.out.println("wrong answer");
            try{
                System.out.println("enter password");
                otp= sc.nextInt();
                if (otp==num){
                    System.out.println("yes you can go");
                }
                if (otp!=num){
                    System.out.println("wrong answer");
                    try{
                        System.out.println("enter password");
                        otp=sc.nextInt();
                        if (otp==num){
                            System.out.println("yes you can go");
                        }
                        if (otp!=num) {
                            System.out.println("wrong answer");
                        }
                            }catch (Exception ae){
                                System.out.println(ae);
                            }
                        }
                    }catch (Exception ee){
                        System.out.println(ee);
                    }
                }

            }


    public static void main(String[] args) {
        password();
    }
}
