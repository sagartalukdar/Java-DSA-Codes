package com.company;

public class newfile {
//    public static int count(int n){
//        if (n>=0&&n<=9){
//            return 1;
//        }
//        return 1+count(n/10);
//    }

//    public static void mal(int n,int k){
//        if (k==1){
//            System.out.println(n);
//            return;
//        }
//        mal(n,k-1);
//        System.out.println(n*k);
//
//    }
    public static int sum(int n){
        if (n==1){
            return 1;
        }
       if (n%2==0){
           return sum(n-1)+n;
       }return sum(n-1)-n;
    }
    public static void main(String[] args) {
        //System.out.println(count(54827379));
    //mal(4,5);
        System.out.println(sum(6));
    }
}
