package javadsasys_design;
//public class Merge_sort {
//    public static void swap(int[]arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static int partition(int []arr,int i,int j){
//        int pivot=arr[i];
//        int k=i;
//        for (int a=i+1;a<=j;a++){
//            if (arr[a]<=pivot){
//                k=k+1;
//                swap(arr,k,a);
//            }
//        }
//        swap(arr,i,k);
//        return k;
//    }
//    public static int kthsmallest(int[]arr,int i,int j,int nth){
//            int pi = partition(arr, i, j);
//            if (pi==nth-1){
//                return arr[pi];
//            }
//            else if(pi<nth-1){
//               return kthsmallest(arr,pi+1,j,nth);
//            }
//            else {
//              return   kthsmallest(arr,i,pi-1,nth);
//            }
//        }
//
//


//   ***     maxima and minima    ***
//public class Merge_sort {
//    static class pair{
//        int max;
//        int min;
//    }
//    public static pair maxandmin(int[]arr,int i,int j){
//        pair ansmaxmin=new pair();
//        pair leftmaxmin=new pair();
//        pair rightmaxmin=new pair();
//        if (i==j){
//           ansmaxmin.min=arr[i];
//           ansmaxmin.max=arr[j];
//           return ansmaxmin;
//        }
//        else if (i==j-1){
//            if (arr[i]<arr[j]){
//                ansmaxmin.min=arr[i];
//                ansmaxmin.max=arr[j];
//            }else {
//                ansmaxmin.min=arr[j];
//                ansmaxmin.max=arr[i];
//            }
//            return ansmaxmin;
//        }
//        else {
//            int mid =i+(j-i)/2;
//           leftmaxmin= maxandmin(arr,i,mid);
//           rightmaxmin= maxandmin(arr,mid+1,j);
//           if (leftmaxmin.min< rightmaxmin.min){
//               ansmaxmin.min= leftmaxmin.min;
//           }else {
//              ansmaxmin.min= rightmaxmin.min;
//           }
//           if (leftmaxmin.max> rightmaxmin.max){
//               ansmaxmin.max= leftmaxmin.max;
//           }else {
//               ansmaxmin.max= rightmaxmin.max;
//           }
//           return ansmaxmin;
//        }
//    }
//    public static void main(String[] args) {
//        int[]arr={8,4,41,2,6,5,0};
//        pair ans=maxandmin(arr,0,arr.length-1);
//        System.out.println(ans.max);
//        System.out.println(ans.min);
//    }
//}



//       ***      kth bigest elements   ****
//public class Merge_sort {
//    public static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public static int partition(int[] arr, int i, int j) {
//        int pivot = arr[i];
//        int k = i;
//        for (int a = i + 1; a <= j; a++) {
//            if (arr[a] >= pivot) {
//                k = k + 1;
//                swap(arr, k, a);
//            }
//        }
//        swap(arr, i, k);
//        return k;
//    }
//
//    public static int kthbigest(int[] arr, int i, int j, int nth) {
//        int pi = partition(arr, i, j);
//        if (pi == nth - 1) {
//            return arr[pi];
//        } else if (pi < nth - 1) {
//            return kthbigest(arr, pi + 1, j, nth);
//        } else {
//            return kthbigest(arr, i, pi - 1, nth);
//        }
//    }
//
//    public static void main(String[] args) {
//        int[]arr={8,4,41,2,6,5,0};
//        System.out.println(kthbigest(arr,0,arr.length-1,5));
//    }
//}


import java.util.Arrays;
import java.util.Collections;

//            *****  assignments problems .1  *****
/*
   Given an array where all its elements are sorted in increasing
   order except two swapped elements ,sort it in linear time ,Assume
   there are no duplicate in Array
 */
//public class Merge_sort {
//    public static void main(String[] args){
//        int []arr={3,8,6,7,5,9,10};
//        int s=0;
//        int e=0;
//        for (int i=0;i<arr.length-1;i++){
//            if (arr[i]>arr[i+1]){
//                s=i;
//                break;
//            }
//        }
//        for (int i=s;i< arr.length-1;i++){
//            if (arr[i]<arr[i-1]){
//                e=i;
//            }
//        }
//        int temp=arr[s];
//        arr[s]=arr[e];
//        arr[e]=temp;
//        System.out.println(Arrays.toString(arr));
//    }
//}

/*       *****  assignments problems .2  *****
      given an array of negetive and possitive integers
      segregate them in linear time and constant space .the output
      should print all negetive numbers followed by all possitve
      numbers .
 */
//public class Merge_sort {
//    public static void main(String[] args) {
//     int[]arr={19,-20,7,-4,-13,11,-5,3};
//     int i=0;
//     for (int k=0;k<arr.length;k++){
//         if (arr[k]<0){
//             int temp=arr[i];
//             arr[i]=arr[k];
//             arr[k]=temp;
//             i++;
//         }
//     }
//        System.out.println(Arrays.toString(arr));
//    }
//}


/*       *****  assignments problems .2  *****
      given an array of negetive and possitive integers
      segregate them in linear time and constant space .the output
      should print all negetive numbers followed by all possitve
      numbers .but the relative order must be remain same
 */
//public class Merge_sort {
//    public static void neg_pos(int []arr,int i,int j){
//        if (i>=j)return;
//        int mid=i+(j-i)/2;
//        neg_pos(arr,i,mid);
//        neg_pos(arr,mid+1,j);
//        merge(arr,i,j,mid);
//    }
//    public static void merge(int[]arr,int i,int j,int mid){
//        int n1=mid-i+1;
//        int n2=j-mid;
//        int[]larr=new int[n1];
//        int[]rarr=new int[n2];
//        for (int x=0;x<n1;x++){
//            larr[x]=arr[i+x];
//        }
//        for (int y=0;y<n2;y++){
//            rarr[y]=arr[mid+1+y];
//        }
//        int k=i;
//        for (int a=0;a<n1;a++){
//            if (larr[a]<0)arr[k++]=larr[a];
//        }
//        for (int a=0;a<n2;a++){
//            if (rarr[a]<0)arr[k++]=rarr[a];
//        }
//        for (int a=0;a<n1;a++){
//            if (larr[a]>0)arr[k++]=larr[a];
//        }
//        for (int a=0;a<n2;a++){
//            if (rarr[a]>0)arr[k++]=rarr[a];
//        }
//    }
//    public static void main(String[] args) {
//        int[]arr={19,-20,7,-4,-13,11,-5,3};
//
//        neg_pos(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//}


//   Given two array with equal size and k the task is to
//   permute them and check the each corresponding elements
//   sum is equals or greater then the k
import java.util.*;
//public class Merge_sort {
//    public static boolean istrue(int[]a,int []b,int k){
//        Arrays.sort(a,Collections.reverseOrder());
//        Arrays.sort(b);
//        for (int i=0;i<a.length;i++){
//            if (a[i]+b[i]<k){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        int[]arr1={2,1,3};
//        int []arr2={7,8,9};
//        int k=10;
//        if (istrue(arr1,arr2,k)) System.out.println("yes");
//        else System.out.println("no");
//    }
//}


//public class Merge_sort {
//    public static void main(String[] args) {
//      List<Integer>l=new ArrayList<>();
//      l.add(15);
//      l.add(18);
//      l.add(03);
//      l.add(61);
//      l.add(36);
//      Collections.sort(l);
//     Comparator<Integer>c=(Integer a,Integer b)->
//     {
//        if (a%10>b%10)return 1;
//        else return -1;
//     };
//     Collections.sort(l,c);
//        System.out.println(l);
//    }
//}


//          *****   fractional  knapsack  ******
//public class Merge_sort {
//    static class item{
//        int weight;
//        int value;
//        public item(int a,int b){
//            this.weight=a;
//            this.value=b;
//        }
//    }
//    public static double fractionalknapsack(item[]arr,int capacity){
//        Arrays.sort(arr, new Comparator<item>() {
//            @Override
//            public int compare(item o1, item o2) {
//                if ((o1.value/o1.weight)<o2.value/o2.weight)return 1;
//                else return -1;
//            }
//        });
//        Arrays.sort(arr,(a,b)->{
//            if((a.value/a.weight)<(b.value/b.weight)) return 1;
//            else return -1;
//        });
//         double totalmaxvalue=0;
//         for (item e:arr){
//             int currweight= e.weight;
//             int currvalue= e.value;
//             if (capacity-currweight>=0){
//                 capacity-=currweight;
//                 totalmaxvalue+=currvalue;
//             }
//             else {
//               double fraction=( double)capacity/(double) currweight;
//               totalmaxvalue+=fraction*currvalue;
//               break;
//             }
//         }
//         return  totalmaxvalue;
//
//    }
//    public static void main(String[] args) {
//        item[]weight_values={new item(5,25),
//        new item(10,75),
//        new item(12,100),
//        new item(4,50),
//        new item(7,45),
//        new item(9,90),
//        new item(3,30)};
//        int capacity=37;
//        System.out.println(fractionalknapsack(weight_values,capacity));
//    }
//}


public class Merge_sort {
    public static void main(String[] args) {

    }
}