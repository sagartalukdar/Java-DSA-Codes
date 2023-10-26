package javadsasys_design;

//                *****   fractional  knapsack  ******
//public class greedy_algorithm {
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


//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
////  **** greddy algorithm jod scheduling ****
//public class greedy_algorithm {
//    static class jobs{
//        int id;
//        int deadline;
//        int profit;
//        public jobs(int a,int b,int c){
//            this.id=a;
//            this.deadline=b;
//            this.profit=c;
//        }
//
//    }
//    public static int[] job_scheduling(ArrayList<jobs>al){
//        int maxdeadline=0;
//        for (jobs j:al){
//            if (j.deadline>maxdeadline){
//                maxdeadline=j.deadline;
//            }
//        }
//        Collections.sort(al,(a,b)->b.profit-a.profit);
//        int []id=new int[maxdeadline];
//        boolean[]isture=new boolean[maxdeadline];
//        int totalprofit=0;
//        int totaljob=0;
//       for (int x=0;x<al.size();x++){
//           for (int y=al.get(x).deadline-1;y>=0;y--){
//               if (isture[y]==false){
//       // boolean arr spaces are by default filled by false
//                   id[y]=al.get(x).id;
//                   totalprofit+=al.get(x).profit;
//                   totaljob++;
//                   isture[y] = true;
//                   break;
//               }
//           }
//       }
//
////       return id;
////       [2, 5, 4, 7, 8, 0, 3]
//
//        int []a=new int[3];
//       a[0]=totaljob;
//       a[1]=totalprofit;
//       return a;
//       }
//    public static void main(String[] args) {
//
//        ArrayList<jobs>l=new ArrayList<>();
//        l.add(new jobs(1,5,55));
//        l.add(new jobs(2,2,65));
//        l.add(new jobs(3,7,75));
//        l.add(new jobs(4,3,60));
//        l.add(new jobs(5,2,70));
//        l.add(new jobs(6,1,50));
//        l.add(new jobs(7,4,85));
//        l.add(new jobs(8,5,68));
//        l.add(new jobs(9,3,45));
//     int []arr=job_scheduling(l);
//        System.out.println(Arrays.toString(arr));
//    }
//}


//     ****  find median from two sorted array  ****
//  time complexity o(logn) space complexity o(1)
//public class greedy_algorithm {
//    public static  float median(int[]a1,int []a2 ,int m,int n){
//        if(a1.length>a2.length){
//            return median(a2,a1,n,m);
//        }
//       int part=(m+n+1)/2;
//        int low=0,high=m;
//
//        while (low<=high){
//            int cut1=low+(high-low)/2;
//            int cut2=part-cut1;
//            int l1= (cut1==0)?Integer.MIN_VALUE:a1[cut1-1];
//            int l2=(cut2==0)?Integer.MIN_VALUE:a2[cut2-1];
//            int r1=(cut1==m)?Integer.MAX_VALUE:a1[cut1];
//            int r2=(cut2==n)?Integer.MAX_VALUE:a2[cut2];
//
//            if(l1<=r2 && l2<=r1){
//               if((m+n)%2==0){
//                   return ( Math.max(l1,l2)+Math.min(r1,r2))/2;
//               }
//               else return Math.max(l1,l2);
//            }
//            else if (l1>r2)high=cut1-1;
//            else low=cut1+1;
//        }
//return 0.0f;
//    }
//    public static void main(String[] args) {
//        int[]a1={1,4,7,10,12};
//        int[]a2={2,3,6,15};
//        int m=a1.length;
//        int n=a2.length;
//        System.out.println(median(a1,a2,m,n));
//        System.out.printf("%.4f",median(a1,a2,m,n));
//    }
//}


//       ****    maximum subarrays   *****
//  space complexity for this code is o(nlogn) ,space complexity is O(1);but for recursion o(logn)
//public class greedy_algorithm {
//    public static int withmidmax(int[]arr,int i,int mid,int j){
//        int leftsum=Integer.MIN_VALUE;
//        int rightsum=Integer.MIN_VALUE;
//        int sum=0;
//        for (int x=mid;x>=i;x--){
//            sum+=arr[x];
//            if (leftsum<sum)leftsum=sum;
//        }
//        sum=0;
//        for (int y=mid+1;y<=j;y++){
//            sum+=arr[y];
//            if (rightsum<sum)rightsum=sum;
//        }
//        return Math.max(Math.max(rightsum,leftsum-arr[mid]),rightsum+leftsum);
//    }
//    public static int maxsubarraysum(int[]arr,int i,int j){
//        if(i>j)return Integer.MIN_VALUE;
//        if (i==j)return arr[i];
//        int mid=i+(j-i)/2;
//        return Math.max(Math.max(maxsubarraysum(arr,i,mid-1),maxsubarraysum(arr,mid+1,j)),
//               withmidmax(arr,i,mid,j)) ;
//    }
//    public static void main(String[] args) {
//
//        int[]arr={-2,-3,4,-1,2,1,-5,4};
//        int[]a={1,2,3,4,5};
//        System.out.println(maxsubarraysum(a,0,a.length-1));
//    }
//}


//             ******* Assignment problems  ********
//problem :find the minimum sum of products of two arrays of the
//same size .given that k modification are allowed on the first array
//in each modification ,one array element of first array can either
//be increased or decreased by 2;
//public class greedy_algorithm {
//    public static void main(String[] args) {
//        int[] a = {1, 2, -3};
//        int b[] = {-2, 3, -5};
//        int k = 5;
//        int diff=0,temp=0,sum=0;
//        for (int i = 0; i < a.length; i++) {
//            int product = a[i] * b[i];
//            sum+=product;
//            int minsum=Integer.MAX_VALUE;
//            if (product < 0 && a[i] < 0) {
//                a[i] -= k * 2;//modificaion allow only on first array
//                // decrease a[i] by 2 ,k times
//                temp=a[i]*b[i];
//            } else if (product < 0 && b[i] < 0) {
//                a[i] += k * 2;
//                temp=a[i]*b[i];
//            } else if (product > 0 && a[i] > 0) {//a[i]>0 it means b[i]>0 also
//// if a[i]*b[i]>0 it means a[i],b[i] both =possitive or negetive;
//                a[i] -= k * 2;
//                temp=a[i]*b[i];
//
//            } else if (product > 0 && a[i] < 0) {//a[i]<0 it means b[i]<0 also
//                a[i] += k * 2;
//                temp=a[i]*b[i];
//            }
//            int d=Math.abs(product-temp);
//            if(d>diff){
//                diff=d;
//            }
//
//        }
//        System.out.println(sum-diff);
//
//
//    }
//
//
//}


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//    ******* Assignment problems  ********
/*
You are given n activities with their start and finish times.
Select the maximum number of activities that can be performed
by a single person, assuming that a person can only work on a
single activity at a time.
 */
public class greedy_algorithm {
   static class start_finish{
        int start;
        int finish;
        public start_finish(int s,int f){
            this.start=s;
            this.finish=f;
        }
    }
    public static void main(String[] args) {
        List<start_finish>l=new ArrayList<>();
        l.add(new start_finish(1,3));
        l.add(new start_finish(1,2));
        l.add(new start_finish(4,7));
        l.add(new start_finish(7,16));
        // sort them according  their finish order
        Collections.sort(l,(a,b)->a.finish-b.finish);
        int count=1;
        for (int i=0;i<l.size()-1;i++){
            if(l.get(i).finish<l.get(i+1).start) count++;

        }
        System.out.println(count);

        for (int i=0;i<l.size();i++){
            System.out.print(l.get(i).start+" ");
            System.out.println (l.get(i).finish);
        }
   }
}

