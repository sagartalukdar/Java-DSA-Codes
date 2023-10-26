//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int []arr={1,2,3,2,1};
//        int n=arr.length;
//        for (int i=0;i<n/2;i++){
//            if (arr[i]!=arr[n-1-i]){
//                System.out.println("non palindrome");
//                return;
//            }
//        }
//        System.out.println("palindrome");
//    }
//}

//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int []arr={1,3,4,5,3,2};
//        int n=arr.length;
//        for (int i=0;i<n/2;i++){
//            int temp=arr[i];
//            arr[i]=arr[n-1-i];
//            arr[n-1-i]=temp;
//        }
//        for (int e:arr){
//            System.out.print(e+" ");
//        }
//    }
//}

import java.awt.font.TextMeasurer;
import java.lang.reflect.Array;
import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.Scanner;

//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int []arr={1,3,7,6,2,5};
//        int n= arr.length+1;
//        int naturalsum=(n*(n+1))/2;
//        int arrsum=0;
//        for (int e:arr){
//            arrsum+=e;
//        }
//        int miss=naturalsum-arrsum;
//        System.out.println(miss);
//
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int[]arr={1,2,3,2,3,7,4,89};
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//            if (arr[i]==arr[j]){
//                System.out.println("duplicate element is:"+arr[i]);
//            }
//            }
//        }
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int[][]arr={{1,2,3},
//                    {4,5,6},
//                    {7,8,9}};
//        for (int i=0;i<arr.length;i++){
//            for (int j=i;j<arr[i].length;j++){
//                int temp=arr[i][j];
//                arr[i][j]=arr[j][i];
//                arr[j][i]=temp;
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            int start=0;
//            int end=arr[i].length-1;
//            while (start<end){
//                int temp=arr[i][start];
//                arr[i][start]=arr[i][end];
//                arr[i][end]=temp;
//                start++;
//                end--;
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter row num o f matrix");
//        int r=sc.nextInt();
//        System.out.println("enter column num of matrix");
//        int c=sc.nextInt();
//        int [][]arr=new int[r][c];
//        System.out.println("enter array elements");
//        for (int i=0;i<r;i++){
//            for (int j=0;j<c;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        System.out.println("enter r1");
//        int r1=sc.nextInt();
//        System.out.println("enter c1");
//        int c1=sc.nextInt();
//        System.out.println("enter r2");
//        int r2=sc.nextInt();
//        System.out.println("enter c2");
//        int c2=sc.nextInt();
//        int sum=0;
//        for (int i=r1;i<=r2;i++){
//            for (int j=c1;j<=c2;j++){
//                sum+=arr[i][j];
//            }
//        }
//        System.out.println(sum);
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int []arr={1,1,1,1,1,1};
//        for (int i=1;i< arr.length;i++){
//           arr[i]=arr[i]+arr[i-1];
//        }
//        for (int e:arr){
//            System.out.println(e);
//        }
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter row num of matrix");
//        int r=sc.nextInt();
//        System.out.println("enter column num of matrix");
//        int c=sc.nextInt();
//        int [][]arr=new int[r][c];
//        System.out.println("enter array elements");
//        for (int i=0;i<r;i++){
//            for (int j=0;j<c;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        for (int i=0;i< arr.length;i++){
//            for (int j=1;j<arr[0].length;j++){
//                arr[i][j]+=arr[i][j-1];
//            }
//        }
//        for (int i=0;i<arr[0].length;i++){
//            for (int j=1;j< arr.length;j++){
//                arr[j][i]+=arr[j-1][i];
//            }
//        }
//        for (int i=0;i< arr.length;i++){
//            for (int j=0;j<arr[0].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("enter r1");
//        int r1=sc.nextInt();
//        System.out.println("enter c1");
//        int c1=sc.nextInt();
//        System.out.println("enter r2");
//        int r2=sc.nextInt();
//        System.out.println("enter c2");
//        int c2=sc.nextInt();
//        int sum=arr[r2][c2];
//        int result=sum-arr[r2][c1-1]-arr[r1-1][c2]+arr[r1-1][c1-1];
//        System.out.println(result);
//    }
//}
//problem1--|
//public class dsapalindromearray {
//    public static void main(String[] args) {
////        int[]arr={3,20,4,6,9};
////        int sum=0;
////        for (int i=0;i< arr.length;i++){
////            if (i%2==0){
////                sum+=arr[i];
////            }
////        }
////        System.out.println(sum);
//        int[]arr={4,3,6,7,1};
//        int sum=0;
//        for (int i=0;i< arr.length;i++){
//            if (i%2==0){
//                sum+=arr[i];
//            }
//        }
//        System.out.println(sum);
//    }
//}
//problem2
//public class dsapalindromearray {
//    public static void main(String[] args) {
////        int arr[]={34,21,54,65,43};
////        for (int e:arr){
////            if (e%2==0){
////                System.out.println(e);
////            }
////        }
//        int []arr={4,3,6,7,1};
//        for (int e:arr){
//            if (e%2==0){
//                System.out.println(e);
//            }
//        }
//    }
//}
//problem3--
//public class dsapalindromearray {
//    public static void main(String[] args) {
////       int[]arr={34,21,54,65,43};
////       int max=Integer.MIN_VALUE;
////       for (int e:arr){
////           if (e>max){
////               max=e;
////           }
////       }
////        System.out.println(max);
//        int[]arr={4,3,6,7,1};
//        int min=Integer.MAX_VALUE;
//        int max=Integer.MIN_VALUE;
//        for (int e:arr){
//            if (e<min){
//                min=e;
//            }
//        }
//        System.out.println(min);
//}
//}
//
//problem4
//public class dsapalindromearray {
//    public static int max(int[]arr){
//        int max=Integer.MIN_VALUE;
//        for (int e:arr){
//            if (e>max){
//                max=e;
//            }
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//int []arr={4,54,5,85,52,2};
//int max=max(arr);
//for (int i=0;i<arr.length;i++){
//    if (arr[i]==max){
//        arr[i]=Integer.MIN_VALUE;
//    }
//}
//int sm=max(arr);
//        System.out.println(sm);
//    }
//}
//
//public class dsapalindromearray {
//    public static int max(int []ar){
//        int max=Integer.MIN_VALUE;
//        for (int e:ar){
//            if (e>max){
//                max=e;
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        int []arr={4,3,6,7,1};
//        int fmax=max(arr);
//      for (int i=0;i<arr.length;i++){
//          if (arr[i]==fmax){
//              arr[i]=Integer.MIN_VALUE;
//          }
//      }
//
//        System.out.println(max(arr));
//    }
//}
//problem5
//public class dsapalindromearray {
//    public static void main(String[] args) {
////      int[]arr={1,3,2,6,5};
////      for (int i=1;i<arr.length-1;i++){
////          if (arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
////              System.out.println(arr[i]);
////          }
////      }
//        int []arr={4,2,5,41,2,7};
//        for (int i=1;i<arr.length-1;i++){
//            if (arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
//                System.out.println(arr[i]);
//            }
//        }
//    }
//}


//public class dsapalindromearray {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter row num :");
//        int r=sc.nextInt();
//        System.out.println("enter column num:");
//        int c=sc.nextInt();
//        int arr[][]=new int[r][c];
//        System.out.println("enter array elements:");
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        int zeros=0,even=0,odd=0,poss=0,neg=0;
//
//        for (int []a:arr){
//            for (int e:a){
//                if (e==0){
//                   zeros++;
//                }
//                if (e%2==0){
//                    even++;
//                }
//                if (e%2!=0){
//                    odd++;
//                }
//                if (e>0){
//                    poss++;
//                }
//                if (e<0){
//                    neg++;
//                }
//            }
//        } System.out.print(zeros+" "+even+" "+odd+" "+poss+" "+neg);
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int [][]arr={{1,2,3},
//                     {4,5,6},
//                     {7,8,9}};
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[0].length;j++){
//                if ( i+j== arr.length-1){
//                    System.out.println(arr[i][j]);
//                }
//                if (i==j){
//                    System.out.println(arr[i][j]);
//                }
//            }
//        }
//    }
//}


//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int [][]arr={{1,2,3},
//                     {4,5,6},
//                     {7,8,9}};
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[0].length;j++){
//                if (){
//                    System.out.println(arr[i][j]);
//                }
//            }
//        }
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int [][]arr={{1,2,4,0},
//                     {2,5,7,-1},
//                     {4,2,6,9}};
//        int max=Integer.MIN_VALUE;
//        for (int []a:arr){
//            for (int e:a){
//                if ( e>max){
//                    max=e;
//                }
//            }
//        }
//        System.out.println(max);
//    }
//}
//public class dsapalindromearray {
//    public static void meth(int[][]a,int n){
//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a[0].length;j++){
//                if (i==n/2){
//                    System.out.println(a[i][j]);
//                }
//            }
//        }
//        for (int i=0;i<a.length;i++){
//            for (int j=0;j<a[0].length;j++){
//                if (j==n/2){
//                    System.out.println(a[i][j]);
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int [][]arr={{1,2,3,54,6},
//                {4,5,32,85,6},
//                {7,5,21,2,32},
//                {8,52,1,2,6},
//                {7,5,63,2,3}};
//        int len=arr.length;
//        meth(arr,len);
//
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int [][]arr={{1,2,3},
//                     {4,5,6},
//                     {7,8,9}};
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[0].length;j++) {
//     if (j==arr.length/2){
//         System.out.println(arr[i][j]);
//     }
//            }
//            }
//    }

//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int [][]arr={{1,2,3},
//                     {4,5,6},
//                     {7,8,9}};
//        for (int i=1;i<arr.length;i++){
//            for (int j=i-1;j>=0;j--){
//                System.out.println(arr[i][j]);
//            }
//        }
//    }
//}
//public class dsapalindromearray {
//    public static int target(int[]a,int n){
//        if (a.length==0){
//            return -1;
//        }
//        int start=0,end=a.length-1,output=-1;
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            if (a[mid]==n){
//                output=mid;
//                end=mid-1;
//            } else if (a[mid]>n) {
//                end=mid-1;
//            }else {
//                start=mid+1;
//            }
//        }
//        return output;
//    }
//    public static void main(String[] args) {
//        int[]arr={4,5,3,6,8,6};
//        System.out.println(target(arr,60));
//
//    }
//}

//public class dsapalindromearray {
//    public static int squareroot(int n){
//        int start=0,end=n,result=0;
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            int val=mid*mid;
//            if (val==n){
//                return mid;
//            } else if (val>n) {
//                end=mid-1;
//            }else {
//                result=mid;
//                start=mid+1;
//            }
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        System.out.println(squareroot(9));
//    }
//}
//public class dsapalindromearray {
//    public static void bublesort(int[]arr){
//        boolean flag=true;
//        for (int i=0;i<arr.length;i++){
//            for (int j=1;j<arr.length-i;j++){
//                if (arr[j-1]>arr[j]){
//                    int temp=arr[j-1];
//                    arr[j-1]=arr[j];
//                    arr[j]=temp;
//                    flag=false;
//                }
//            }
//        } if (flag){
//            return;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        int []arr={4,2,2,87,2132,4};
//        bublesort(arr);
//    }
//}
//public class dsapalindromearray {
//    public static void insertionsort(int[]arr){
//        for (int i=1;i<arr.length;i++){
//            boolean flag=true;
//            int j=i;
//            while (j>0 && arr[j-1]>arr[j]){
//                int temp=arr[j-1];
//                arr[j-1]=arr[j];
//                arr[j]=temp;
//                j--;
//                flag=false;
//            }
//            if (flag){
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void main(String[] args) {
//        int[]arr={8,5,7,6,2,9};
//        insertionsort(arr);
//    }
//}
//public class dsapalindromearray {
//    public static void selectionsort(int []arr){
//        for (int i=0;i<arr.length-1;i++){
//            int minindex=i;
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[minindex]>arr[j]){
//                    minindex=j;
//                }
//            }
//            if (minindex!=i){
//                int temp=arr[i];
//                arr[i]=arr[minindex];
//                arr[minindex]=temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void main(String[] args) {
//        int []arr={4,7,2,1,52,2};
//        selectionsort(arr);
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int n=1101;
//        int multiply=1;
//        int result=0;
//        while (n>0){
//           int ans=n%10;
//            result+=ans*multiply;
//            multiply*=2;
//            n/=10;
//
//        }
//        System.out.println(result);
//    }
//}

//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int n=13;
//        int ans=0;
//        int mul=1;
//        while (n>0){
//            int box=n%2;
//            n/=2;
//            ans+=box*mul;
//            mul*=10;
//        }
//        System.out.println(ans);
//    }
//}
//public class dsapalindromearray {
//    public static void bubblesort(int[]arr){
//        if (arr.length==0){
//            return ;
//        }
//        for (int i=0;i<arr.length-1;i++){
//            boolean flag=true;
//            for (int j=1;j<arr.length-i;j++){
//                if (arr[j-1]<arr[j]){
//                    int temp=arr[j-1];
//                    arr[j-1]=arr[j];
//                    arr[j]=temp;
//                    flag=false;
//                }
//            }
//            if (flag){
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void main(String[] args) {
//        int[]arr={3,5,1,6,0};
//        bubblesort(arr);
//    }
//}
//public class dsapalindromearray {
//    public static void selectionsort(int[]arr){
//        if (arr.length==0){
//            return;
//        }
//        for (int i=0;i<arr.length-2;i++){
//            int maxidx=i;
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[maxidx]<arr[j]){
//                    maxidx=j;
//                }
//            }
//            if (maxidx!=i){
//                int temp=arr[i];
//                arr[i]=arr[maxidx];
//                arr[maxidx]= temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void main(String[] args) {
//        int[]arr={3,5,1,6,0};
//        selectionsort(arr);
//
//    }
//}
//public class dsapalindromearray {
//    public static void insertionsort(int[]arr){
//        if (arr.length==0){
//            return;
//        }
//        for (int i=1;i<arr.length;i++){
//            for (int j=i;j>0;j--){
//                if (arr[j]>arr[j-1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void main(String[] args) {
//      int[]arr={3,5,1,6,0};
//      insertionsort(arr);
//    }
//}

//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int n=10;
//        int ans=0;
//        int mul=1;
//        while (n>0){
//            int box=n%2;
//            n/=2;
//            ans+=box*mul;
//            mul*=10;
//        }
//        System.out.println(ans);
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//         int n=15;
//         int ans=0;
//         while (n>0){
//              ans=n%2;
//             n/=2;
//         }
//         if (ans){
//             System.out.println("true");
//         }
//         else {
//             System.out.println("false");
//         }
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int n=32;
//        int box=0;
//        boolean flag=true;
//        while (n>=2){
//            box=n%2;
//            n/=2;
//            if (box!=0){
//                flag=false;
//                break;
//            }
//        }
//        if (flag){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int n=3;
//        int box;
//        int ans=0;
//        int mul=1;
//        while (n>0){
//            box=n%2;
//            n/=2;
//            ans+=box*mul;
//            mul*=10;
//        }
//        if (ans%2==0){
//            System.out.println("even");
//        }
//        if (ans%2!=0){
//            System.out.println("odd");
//        }
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int n=1001010;
//        int count=0,ans=0;
//        while (n>0){
//            ans=n%10;
//            n/=10;
//            if (ans==1){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int[]arr={1,6,5,9,4};
//        int n=6;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==n){
//                System.out.println(i);
//                break;
//            }
//        }
//    }
//}
//public class dsapalindromearray {
//    public static int lo(int[]arr){
//        int target=15;
//        int box=-1;
//        int start=0;
//        int end=arr.length-1;
//        while (end>=start){
//            int mid=start+(end-start)/2;
//            if (arr[mid]==target){
//                box=mid;
//                start++;
//            } else if (arr[mid]>target) {
//                end--;
//            }else {
//                start++;
//            }
//        }
//        return box;
//    }
//    public static void main(String[] args) {
//        int[]arr={2,2,2,6,6,18,29,30,30,30};
//        System.out.println(lo(arr));
//
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int []arr={2,4,3,5,64,0};
//        int n=4,box=0;
//        boolean flag=true;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==n){
//                box=i;
//                flag=false;
//                break;
//            }
//        }
//        if (flag){
//            System.out.println("not found");
//        }else {
//            System.out.println(box);
//        }
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int []arr={0,0,0,0,1,1,1,1,1,1};
//        int low=0,end=arr.length-1,count=0;
//        while (low<=end){
//            int mid=low+(end-low)/2;
//            if (arr[mid]==1){
//                count++;
//                end=mid--;
//            }
//            if (arr[mid]<1) {
//                low=mid++;
//            }
//        }
//        System.out.println(count);
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//            int[]arr={2,5,5,5,6,6,8,9,9,9};
//    int target=90,count=0,box=-1;
//    for (int i=0;i<arr.length;i++){
//        if (arr[i]==target){
//            count++;
//            box=i;
//        }
//    }
//    if (box==-1){
//        System.out.println("not found");
//    }else {
//        System.out.println("the target elements present in the array is:"+count+"times");
//    }
//
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int n=167;
//        int st=0,end=n,box=0;
//        while (st<=end){
//            int mid=st+(end-st)/2;
//            int val=mid*mid;
//            if (val==n){
//                box=mid;
//                System.out.println("true");
//                break;
//            }
//            if (val<n){
//                st=mid+1;
//            }
//            if (val>n){
//                end=mid-1;
//            }
//
//        }
//        if (box==0){
//            System.out.println("false");
//        }
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
// int []arr={2,75,7,9,4,0,3};     **printing those elements which is presents
//                                     in even indexes****
//        int i=0;
//        while (i<arr.length){
//            System.out.println(arr[i]);
//            i+=2;
//        }
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        // second largest element printing
//       int[]arr= {3,8,7,5,9,1};
//       int firstmax =Integer.MIN_VALUE,secondmax=Integer.MIN_VALUE;
//       for (int e:arr){
//          firstmax= Math.max(e,firstmax);
//       }
//       for (int i=0;i<arr.length;i++){
//           if (arr[i]!=firstmax){
//              secondmax= Math.max(arr[i],secondmax);
//           }
//       }
//        System.out.println(secondmax);
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        //secondary diagonal above elements in matrix
//        int[][]arr={{1,2,3},
//                    {4,5,6},
//                    {7,8,9}};
//       for (int i=0;i<arr.length;i++){
//           for (int j=0;j<arr[0].length;j++){
//               if (i+j<arr.length-1){
//                   System.out.println(arr[i][j]);
//               }
//           }
//       }
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        //printing primary and secondary diagonal elements *****
////        time complexcity=o(n) here;
//        int [][]arr={{1,2,3},
//                    {3,1,35},
//                    {42,4,2}};
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i][i]);
//        }
//       for (int i=0;i<arr.length;i++){
//           if (i== arr.length-1-i){
//               continue;
//           }
//           System.out.println(arr[i][arr.length-1-i]);
//       }
//
//    }
//}
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int [][]arr={{1,2,3},
//                    {3,1,35},
//                    {1,4,2}};
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i][arr.length/2]);
//        }
//        for (int j=0;j<arr.length;j++){
//            if (j!=arr.length/2){
//                System.out.println(arr[arr.length / 2][j]);
//            }
//        }
//    }
//}

//square root optimize approach
//public class dsapalindromearray {
//    public static void main(String[] args) {
//        int low=0;
//        int n=1;
//        if (n==1){
//            System.out.println(1);
//            return;
//        }
//        int box=-1;
//        int end=n/2;
//        while (low<=end){
//            int mid=low+(end-low)/2;
//            int val=mid*mid;
//            if (n==val){
//                System.out.println(mid);
//                return;
//            }else if (n<val){
//                end=mid-1;
//            }else {
//               box= mid;
//               low=mid+1;
//            }
//        }
//        System.out.println(box);
//    }


//square matrix prefixsum
public class dsapalindromearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row number:");
        int n= sc.nextInt();
        System.out.println("enter column number:");
        int m= sc.nextInt();
        int [][]arr=new int[n+1][m+1];
        System.out.println("enter elements");
        for (int i=1;i<arr.length;i++){
            for (int j=1;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=1;i<arr.length;i++){
            for (int j=1;j<arr[0].length-1;j++){
                arr[i][j+1]+=arr[i][j];
            }
        }
        for (int i=1;i<arr[0].length;i++){
            for (int j=1;j<arr.length-1;j++){
                arr[j+1][i]+=arr[j][i];
            }
        }
        for (int []a:arr){
            for (int e:a){
                System.out.print(e);
            }
            System.out.println();
        }
        System.out.println("enter r1:");
        int r1=sc.nextInt();
        System.out.println("enter c1:");
        int c1= sc.nextInt();
        System.out.println("enter r2:");
        int r2=sc.nextInt();
        System.out.println("enter c2");
        int c2=sc.nextInt();
        int sum=arr[r2][c2]-arr[r1-1][c2]-arr[r2][c1-1]+arr[r1-1][c1-1];
        System.out.println(sum);

    }
}
