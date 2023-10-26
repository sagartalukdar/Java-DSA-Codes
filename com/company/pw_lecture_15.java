//package com.company;
//
//import java.util.Scanner;
//
//public class pw_lecture_15 {
//    public static void main(String[] args) {
//

//        public class mth {
//            public static void printarrary(int[]arr){
//                for (int i=0;i< arr.length;i++){
//                    System.out.print(arr[i]+" ");
//                }
//            }
//            public static void main(String[] args){
//                Scanner sc=new Scanner(System.in);
//                System.out.println("enter the size of array");
//                int n=sc.nextInt();
//                int []marks=new int[n];
//                System.out.println ("enter the elements");
//                for(int i=0;i<n;i++){
//                    marks[i]=sc.nextInt();
//                }
//                for (int i=0;i<n;i++){
//                    System.out.print(marks[i]+" ");
//                }
//                System.out.println();
//                System.out.println("second array");
//                int []mark=marks;
//                printarrary(mark);
//                mark[0]=0;
//                mark[1]=0;
//                System.out.println();
//                printarrary(mark);
//                System.out.println();
//                printarrary(marks);
//
//
//            }
//        }
//
//
//        pw lecture 16
//*********foun pair in array which is equals to given target number************
//import java.util.Scanner;
//        public class mth {
//            public static int targetsum(int []arr,int target){
//                int sount=0;
//                for(int i=0;i<arr.length;i++){
//                    for(int j=i+1;j<arr.length;j++){
//                        for (int k=j+1;k< arr.length;k++){
//                            if(arr[i]+arr[j]+arr[k]==target){
//                                sount++;
//                            }
//
//                        }
//                    }
//                }
//
//                System.out.println("the pair numbers which equals to target:"+sount);
//                return sount;
//            }
//            public static void main(String[] args) {
//                System.out.println("enter the size of array");
//                Scanner sc=new Scanner(System.in);
//                int n=sc.nextInt();
//                int[]marks=new int[n];
//                System.out.println("enter the elements");
//                for(int i=0;i<n;i++){
//                    marks[i]=sc.nextInt();
//                }
//                for (int i=0;i<n;i++){
//                    System.out.print(marks[i]+" ");
//                }
//                System.out.println();
//
//                System.out.println(targetsum(marks,5));
//
//            }
//        }
//
//****if a number is unique in a given array but the others are twice repeated****
//import java.util.Scanner;
//public class mth {
//    public static void arrayManupulation(int[] zrr) {
//        for (int i = 0; i < zrr.length; i++) {
//            for (int j = i + 1; j < zrr.length; j++) {
//                if (zrr[i] == zrr[j]) {
//                    zrr[i] = -1;
//                    zrr[j] = -1;
//
//                }
//            }
//
//        }
//        int ans = 0;
//        for (int i = 0; i < zrr.length; i++) {
//            if (zrr[i] > 0) {
//                ans = zrr[i];
//            }
//
//        }
//        System.out.println(ans);
//    }
//
//    public static void main(String[] args) {
//        System.out.println("enter the size of array");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] marks = new int[n];
//        System.out.println("enter the elements");
//        for (int i = 0; i < n; i++) {
//            marks[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(marks[i] + " ");
//        }
//        System.out.println();
//        arrayManupulation(marks);
//
//
//    }
           // *** bit manupulation****
//package com.company;
//public class mth {
//    public static void main(String[] args) {
        //***** get the bit of a number and check if the bit 1 or 0*****
//       int number=5;
//       int possition=1;
//       int bitmask=1<<possition;
//       if ((bitmask&number)==0){
//           System.out.println("the bit is zero");
//       }else {
//           System.out.println("the bit is one");
//       }
        // ***** set 1 the bit of a number ********
//        int num=5;
//       int position=1;
//       int bitmask=1<<position;
//      int newnumber= bitmask | num;
//        System.out.println(newnumber);

        // **********   clear the bit of a number  *******
//        int num=5;
//        int possition=2;
//        int bitmask=1<<possition;
//        int not=~bitmask;
//        int newnumber=not&num;
//        System.out.println(newnumber);
//    }
//}










