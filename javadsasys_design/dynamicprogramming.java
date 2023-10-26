package javadsasys_design;

//   fibonacci by dp iterative way time com o(n),space o(1)
//public class dynamicprogramming {
//    public static int fibonacci(int n){
//        if(n==0 || n==1)return n;
//        int a=0,b=1,c=0;
//        for (int i=2;i<=n;i++){
//            c=a+b;
//            a=b;
//            b=c;
//        }
//        return b;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(fibonacci(1));
//        System.out.println(fibonacci(5));
//        System.out.println(fibonacci(7));
//    }
//}

//  fibonacci by dp recursive way time com o(n),space o(n+1)
//public class dynamicprogramming {
//    public static int fibonacciHelper(int n,int[]table){
//        if(n==0 || n==1)return n;
//        if(table[n]!=-1)return table[n];
//        int x=fibonacciHelper(n-1,table);
//        int y=fibonacciHelper(n-2,table);
//        table[n]=x+y;
//        return x+y;
//    }
//    public static int fibonacci(int n){
//        int table[]=new int[n+1];
//        for (int i=0;i<=n;i++){
//            table[i]=-1;
//        }
//        return fibonacciHelper(n,table);
//    }
//    public static void main(String[] args) {
//        System.out.println(fibonacci(3));
//    }
//}


import javax.swing.*;

//   staircase problem by dynamic programming
//public class dynamicprogramming {
//    public static int staircase(int n){
//        if(n<=1)return n;
//        int a=1,b=1,c=0;//because fib series is- 0,1,1,2,3,5,8
////                        and  staircase series- 0,1,2,3,5,8
////                        staircase series(n)=fib series(n+1)
//        for(int i=2;i<=n;i++){
//            c=a+b;
//            a=b;
//            b=c;
//        }
//        return c;
//    }
//    public static void main(String[] args) {
//        System.out.println(staircase(5));
//    }
//}

//   frog jump (at a time 1 step or 2 step)
//public class dynamicprogramming {
//    public static int frogJump(int []arr,int idx,int n){
//        if (idx==n)return 0;
//        int x=frogJump(arr,idx+1,n)+Math.abs(arr[idx]-arr[idx+1]);
//        if(idx==n-1)return x;
//        int y=frogJump(arr,idx+2,n)+Math.abs(arr[idx]-arr[idx+2]);
//        return Math.min(x,y);
//    }
//    public static void main(String[] args) {
//        int arr[]={10,30,40,20};
//        System.out.println(frogJump(arr,0,arr.length-1));
//    }
//}
//  by dp memorizetion
//public class dynamicprogramming {
//    public static int frogJump(int []arr,int idx,int n,int []table){
//        if (idx==n)return 0;
//        if (table[idx]!=-1)return table[idx];
//        int x=frogJump(arr,idx+1,n,table)+Math.abs(arr[idx]-arr[idx+1]);
//        table[idx]=x;
//        if(idx==n-1){
//            return x;
//        }
//        int y=frogJump(arr,idx+2,n,table)+Math.abs(arr[idx]-arr[idx+2]);
//        table[idx]=y;
//        return Math.min(x,y);
//    }
//    public static void main(String[] args) {
//        int arr[]={10,30,40,20};
//        int table[]=new int [arr.length];
//        for (int i=0;i<table.length;i++){
//            table[i]=-1;
//        }
//        System.out.println(frogJump(arr,0,arr.length-1,table));
//    }
//}
//   by dp tabulation (iterative)
//public class dynamicprogramming {
//
//    public static void main(String[] args) {
//        int[]arr={10,30,40,20};
//        int a=0;
//        int b=0;
//        int c=0;
//        for(int i=1;i<arr.length;i++){
//            int x=b+Math.abs(arr[i]-arr[i-1]);
//            int y=Integer.MAX_VALUE;
//            if(i>1)y=a+Math.abs(arr[i]-arr[i-2]);
//            c=Math.min(x,y);
//            a=b;
//            b=c;
//        }
//        System.out.println(c);
//
//    }
//}

//public class dynamicprogramming {
//    public static void main(String[] args) {
//        int []arr={5,4,11,1,16,8};
//        int n=arr.length;
//        int []dp=new int [n];
//        int []hash=new int[n];
//        for(int i=0;i<n;i++){
//            dp[i]=1;
//            hash[i]=i;
//        }
//        int max=0;
//        int lastindex=0;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                if(arr[i]>arr[j] && 1+dp[j]>dp[i]) {
//                    dp[i] = 1+dp[j];
//                    hash[i]=j;
//                }
//            }
//            if(dp[i]>max){
//                lastindex=i;
//                max=dp[i];
//            }
//        }
//        while(hash[lastindex]!=lastindex){// that will give reverse order longest increasing subcequence
//            System.out.print(arr[lastindex]+" ");
//            lastindex=hash[lastindex];
//        }
//        System.out.print(arr[lastindex]);
//    }
//}


public class dynamicprogramming {
    public static void main(String[] args) {

        System.out.println(car.getcar().hashCode());
    }
}


