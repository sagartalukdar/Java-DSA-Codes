import javax.sound.midi.Soundbank;
import java.awt.geom.QuadCurve2D;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.Callable;

//    public static void print(int[]marks,int index){
//        if (index==marks.length){
//            return;
//        }
//        System.out.println(marks[index]);
//        print(marks,index+1);
//    public static int max(int[]arr,int i){
//        if (i== arr.length-1){
//            return arr[i];
//        }
//        int sp=max(arr,i+1);
//        return Math.max(arr[i],sp);
//    }
//    public static int sum(int []arr,int i){
//
//        if (i== arr.length){
//            return 0;
//        }
//        return arr[i]+sum(arr,i+1);
//    }
//       int[]marks={1,4,5};
//        //System.out.println(max(marks,0));
////       print(marks,0);
//        System.out.println(sum(marks,0));
//        public static boolean has(int []a,int target,int i){
////      if (i>=a.length){
////          return false;
////      }
////      if (a[i]==target){
////          return true;
////      }
////      return has(a,target,i+1);
////  }if (has(arr,target,0)){
////    System.out.println("found");
////}else {
////    System.out.println("not found");
////}public static int has(int[]a,int x,int i){
////     if (i>=a.length){
////         return -1;
////     }
////     if (a[i]==x){
////         return i;
////     }
////     return has(a,x,i+1);
//// }//            System.out.println(has(arr,4,0));
// public static void has(int []arr,int x,int i){
////    if (i>=arr.length){
////        return;
////    }
////    if (arr[i]==x){
////        System.out.println(i);
////    }
//    has(arr,x,i+1);
////}
//public static ArrayList<Integer> ha(int[]a,int x,int i){
//    ArrayList<Integer>ans=new ArrayList<>();
//    if (i>=a.length){
//        return new ArrayList<>();
//    }
//    if (a[i]==x){
//        ans.add(i);
//    }
//   ArrayList<Integer>sans= ha(a,x,i+1);
//    ans.addAll(sans);
//    return ans;
//}System.out.println(ha(arr,2,0));

//public static int has (int[]a,int x,int i){
//    int d=-1;
//    if (i>=a.length) {
//        return d;
//    }
//    if (a[i]==x){
//        d=i;
//    }
//     has(a,x,i+1);
//    return d;
//} if (i==a.length-1){
////            return true;
////        }
////            if (a[i]>a[i+1]){
////            return false;
////        }
////       return issorted(a,i+1);
////    }
//            stem.out.println( has(arr,2,0));
////            if (issorted(arr,0)){
////                System.out.println(" sorted");
////            }Syelse {
////                System.out.println("not sorted");
////            }
    //public static boolean issorted(int []a,int i){
// public static int index(int[]a,int x,int i){
//        if (i<0){
//            return -1;
//        }
//        if (a[i]==x){
//            return i;
//        }
//        return index(a,x,i-1);
//    } System.out.println(index(arr,2,6));
//   public static String ans(String s,int i,char c) {
//       if (i==s.length()){
//           return "";
//       }
//       String small = ans(s, i + 1,c);
//      char a=s.charAt(i);
//      if (a!=c){
//          return a+small;
//      }else {
//          return small;
//      }
//
//
//   }
//    public static String ans(String s){
//        if (s.length()==0){
//            return "";
//        }
//       String small= ans(s.substring(1));
//       char c=s.charAt(0);
//       if (c!='a'){
//           return c+small;
//       }else {
//           return small;
//       }
//
//    }
//    if (i==s.length()){
//            return "";
//        }
//        String a=ans(s,i+1);
//        char c=s.charAt(i);
//        return a+c;
//
//    }
//    public static String ans(String s,int i){
//    System.out.println(ans("sagar",0));
//    public static String is(String s,int i){
//    if (i==s.length()) {
//        return "";
//    }
//        String small=is(s,i+1);
//        char c=s.charAt(i);
//        return small+c;
//} System.out.println(reverse.equals(s));
//public class newe {
//    public static boolean is(String s,int l,int r){
//        if (l>=r){
//            return true;
//        }
//        if (s.charAt(l)!=s.charAt(r)){
//            return false;
//        }
//        return is(s,l+1,r-1);
//    }
//    String s="poop";
////        if (is(s,0,s.length()-1)){
////            System.out.println("yes");
////        }else {
////            System.out.println("no");
////        }
// public static ArrayList<String> getS(String s){
//            ArrayList<String> ans=new ArrayList<>();
//            if (s.length()==0){
//                ans.add(" ");
//                return ans;
//            }
//            char c=s.charAt(0);
//            ArrayList<String> small=getS(s.substring(1));
//            for (String e:small){
//                ans.add(e);
//                ans.add(c+e);
//            }return ans;
//        } System.out.println(getS("abc"));
//public static void isornot(String s,String ans){
//          if (s.length()==0){
//              System.out.println(ans);
//              return;
//          }
//          char c=s.charAt(0);
//          String amall=s.substring(1);
//          isornot(amall,ans+c);
//          isornot(amall,ans);
//      }isornot("abc","");public static int best(int[]a,int i){
//   if (i==a.length-1){
//    return 0;
//}
//    int op1=Math.abs(a[i]-a[i+1])+ best(a,i+1);
//   if (i==a.length-2){
//        return op1;
//    }
//    int op2=Math.abs(a[i]-a[i+2])+best(a,i+2);
//   return Math.min(op1,op2);
//} System.out.println(best(arr,0));
// public static void permutation(String dig,String[]kp,String ans){
//    if (dig.length()==0){
//        System.out.println(ans);
//        return;
//    }
//
//    int num=dig.charAt(0)-'0';
//    String ter=kp[num];
//    for (int i=0;i<ter.length();i++){
//        permutation(dig.substring(1),kp,ans+ter.charAt(i));
//    }
//} permutation(dig,digits,""); public static void bs(int[]arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            boolean flag = false;
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    flag = true;
//
//                }
//
//            } if (!flag) {
//                return;
//            }
//        }
//    } bs(arr);public static void selectionsort(int[]arr){
//       for (int i=0;i<arr.length-1;i++){
//           int minindex=i;
//           for (int j=i+1;j<arr.length;j++){
//               if (arr[minindex]>arr[j]){
//                   minindex=j;
//               }
//           }
//           if (minindex!=i){
//               int temp=arr[i];
//               arr[i]=arr[minindex];
//               arr[minindex]=temp;
//           }
//
//       }
//
//   } selectionsort(ar); public static void insertionsort(int[]arr){
//      for (int i=1;i< arr.length;i++){
//          int j=i;
//          while (j>0 && arr[j]<arr[j-1]){
//              int temp=arr[j];
//              arr[j]=arr[j-1];
//              arr[j-1]=temp;
//              j--;
//          }
//      }
//   } insertionsort(ar);public static void turnzero(int[]arr){
//      for (int i=0;i< arr.length-1;i++){
//          boolean flag=false;
//          for (int j=0;j< arr.length-1-i;j++){
//              if (arr[j]==0&&arr[j+1]!=0){
//                  int temp=arr[j];
//                  arr[j]=arr[j+1];
//                  arr[j+1]=temp;
//                  flag=true;
//              }
//          }
//          if (!flag){
//              return;
//          }
//      }
//  } turnzero(ar);  public static void ts(String[]arr){
//         for (int i=0;i< arr.length-1;i++){
//             int minindex=i;
//             for (int j=i+1;j< arr.length;j++){
//                 if (arr[minindex].compareTo(arr[j])>0){
//                     minindex=j;
//                 }
//             }
//             String temp=arr[i];
//             arr[i]=arr[minindex];
//             arr[minindex]=temp;
//         }
//     }    int[]ar={4,0,4,2,0,41};
//     String[]arr={"kiwi","mango","apple","papaya","watermelon"};
//     ts(arr);
//        for (String e:arr){
//            System.out.println(e);
//        }




//public class newe {
//    public static void merge(int[]arr,int l,int mid,int r){
//        int n1=mid-l+1;
//        int n2=r-mid;
//        int[]a1=new int[n1];
//        int[]a2=new int[n2];
//        for (int i=0;i<n1;i++){
//            a1[i]=arr[l+i];
//        }for (int j=0;j<n2;j++){
//            a2[j]=arr[mid+1+j];
//        }
//        int i=0;
//        int j=0;
//        int k=l;
//        while (i<n1&&j<n2){
//            if (a1[i]<=a2[j]){
//                arr[k++]=a1[i++];
//            }else {
//                arr[k++]=a2[j++];
//            }
//        }
//        while (i<n1){
//            arr[k++]=a1[i++];
//        }
//        while (j<n2){
//            arr[k++]=a2[j++];
//        }
//    }
//       public static void mergesort(int[]arr,int l,int r){
//       if (l==r){
//           return;
//       }
//       int mid=(l+r)/2;
//       mergesort(arr,l,mid);
//       mergesort(arr,mid+1,r);
//       merge(arr,l,mid,r);
//   }
//    public static void main(String[] args){
//int[]arr={4,2,4,5,2,101};
//mergesort(arr,0, arr.length-1);
//for (int ar:arr){
//    System.out.print(ar+" ");
//}
//        }
//} public static void swap(int[]arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static int partition(int[]arr,int l,int r){
//        int pivot=arr[l];
//        int count=0;
//        for (int i=l+1;i<=r;i++){
//            if (arr[i]<=pivot){
//                count++;
//            }
//        }int pi=l+count;
//        swap(arr,l,pi);
//        int i=l;
//        int j=r;
//        while (i<pi&&j>pi){
//           while (arr[i]<=pivot) i++;
//           while (arr[j]>pivot) j--;
//         if (i<pi&&j>pi){
//             swap(arr,i,j);
//             i++;
//             j--;
//         }
//
//
//        }
//        return pi;
//    }
//    public static void quicksort(int []arr,int l,int r){
//        if (l>=r){
//            return;
//        }
//       int pi= partition(arr, l, r);
//        quicksort(arr,l,pi-1);
//        quicksort(arr,pi+1,r);
//    }  int[]arr={41,5,4,2,74,7};
//quicksort(arr,0,arr.length-1);
//for (int e:arr){
//    System.out.print(e+" ");
//}
// public static void printarr(int[]arr){
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static int maxarr(int[]arr){
//        int max=Integer.MIN_VALUE;
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        return max;
//    }
//  public static void countsort(int[]arr){
//        int max=maxarr(arr);
//        int[]count=new int[max+1];
//        for (int i=0;i<arr.length;i++){
//            count[arr[i]]++;
//        }
//        int k=0;
//        for (int i=0;i<count.length;i++){
//            for (int j=0;j<count[i];j++){
//             arr[k++]=i;
//            }
//        }
//  } public static void printarr(int[]arr){
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static int maxarr(int[]arr){
//        int max=Integer.MIN_VALUE;
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        return max;
//    }
//    public static void countsort(int[]arr){
//        int max=maxarr(arr);
//        int[] count=new int[max+1];
//        for (int i=0;i<arr.length;i++){
//            count[arr[i]]++;
//        }
//        for (int i=1;i<count.length;i++){
//            count[i]+=count[i-1];
//        }
//        int[]outar=new int[arr.length];
//        for (int i= arr.length-1;i>=0;i--){
//            int idx=count[arr[i]]-1;
//            outar[idx]=arr[i];
//            count[arr[i]]--;
//        }
//       for (int i=0;i<arr.length;i++){
//           arr[i]=outar[i];
//       }
//    }
//    public static void main(String[] args) {
//      int[]a={4,5,7,7,5,8,4,2};
//      countsort(a);
//      printarr(a);
//    }
//} public static void printarr(int[]arr){
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static int maxarr(int[]arr){
//        int max=Integer.MIN_VALUE;
//        for (int i=0;i< arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        return max;
//    }
//    public static void countsort(int[]arr,int place){
//       // int max=maxarr(arr);
//        int[] count=new int[10];
//        for (int i=0;i<arr.length;i++){
//            count[(arr[i]/place)%10]++;
//        }
//        for (int i=1;i<count.length;i++){
//            count[i]+=count[i-1];
//        }
//        int[]outar=new int[arr.length];
//        for (int i= arr.length-1;i>=0;i--){
//            int idx=count[(arr[i]/place)%10]-1;
//            outar[idx]=arr[i];
//            count[(arr[i]/place)%10]--;
//        }
//       for (int i=0;i<arr.length;i++){
//           arr[i]=outar[i];
//       }
//    }
//    public static void redixsort(int[]arr){
//        int max=maxarr(arr);
//        for (int place=1;max/place>0;place*=10){
//            countsort(arr,place);
//        }
//
//    } // countsort(a);
//        redixsort(a);
//      printarr(a);  public static void bucketsort(float[]arr) {
//    ArrayList<Float>[] bucket = new ArrayList[arr.length];
//    for (int i=0;i< arr.length;i++){
//      bucket[i]=new ArrayList<Float>();
//    }
//    for (int i=0;i<bucket.length;i++){
//      int idx=(int)arr[i]* arr.length;
//      bucket[idx].add(arr[i]);
//    }
//    for (int i=0;i< bucket.length;i++){
//      Collections.sort(bucket[i]);
//    }
//    int k=0;
//    for (int i=0;i< bucket.length;i++){
//      ArrayList<Float>current=bucket[i];
//      for (int j=0;j<current.size();j++) {
//        arr[k++] = current.get(j);
//      }
//    }
//  } bucketsort(a);public static void Q1(int[]arr){
//    int x=-1,y=-1;
//    if (arr.length==1){
//        return;
//    }
//    for (int i=1;i< arr.length;i++){
//        if (arr[i]<arr[i-1]){
//            if (x==-1){
//                x=i-1;
//                y=i;
//            }else {
//                y=i;
//            }
//        }
//    }
//    int temp=arr[x];
//    arr[x]=arr[y];
//    arr[y]=temp;
//} int[]a={0,12,2,4,5,8,9,1};
//   Q1(a);
//public static void Q1(int[]arr){
//    int l=0,r= arr.length-1;
//    while (l<r){
//        while (arr[l]<0)l++;
//        while (arr[r]>=0)r--;
//        if (l<r){
//            int temp=arr[l];
//            arr[l]=arr[r];
//            arr[r]=temp;
//        }
//    }
//}
//    public static void main(String[] args) {
//int[]arr={-5,3,8,0,-8,1,-7};
//        Q1(arr);
//    for (int e:arr){
//        System.out.print(e+" ");
//    }
//    }
//}  public static void swap(int[]a,int i,int j){
//        int temp=a[i];
//        a[i]=a[j];
//        a[j]=temp;
//    }
//    public static void zero_one_two(int[]arr,int low,int mid,int high){
//        while (mid<=high){
//            if (arr[mid]==2){
//                swap(arr,mid,high);
//                high--;
//            } else if (arr[mid]==1) {
//                mid++;
//            }else {
//                swap(arr,mid,low);
//                mid++;
//                low++;
//            }
//        }
//    } public static void one_zero_two(int[]arr){
//      int count_0=0,count_1=0,count_2=0;
//      for (int i=0;i< arr.length;i++){
//          if (arr[i]==0){
//              count_0++;
//          }if (arr[i]==1){
//              count_1++;
//          }if (arr[i]==2){
//              count_2++;
//          }
//      }
//      int k=0;
//      while (count_0>0){
//          arr[k++]=0;
//          count_0--;
//      }
//      while (count_1>0){
//          arr[k++]=1;
//          count_1--;
//      }
//      while (count_2>0){
//          arr[k++]=2;
//          count_2--;
//      }
//  }
//    public static void main(String[] args) {
//        int[]arr={0,1,0,1,0,1,2,0,1,2,2,1};
//        one_zero_two(arr);
//        for (int e:arr){
//            System.out.print(e+" ");
//        }
//    }
//    } public static boolean bst(int[]arr,int target){
//        int start=0,end=arr.length-1;
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            if (arr[mid]==target){
//                return true;
//            } else if (arr[mid]<target) {
//                end=mid-1;
//            }
//            else if (arr[mid]>target){
//                start=mid+1;
//            }
//        }
//        return false;
//    } System.out.println(bst(arr,42));
//  public static boolean rebst(int[]arr,int start,int end,int target){
//      if (start>end){
//          return false;
//      }
//      int mid=(start+(end-start))/2;
//      if (arr[mid]==target){
//          return true ;
//      }
//      else if (arr[mid]>target){
//          return rebst(arr,start,mid-1,target);
//      }else {
//          return rebst(arr,mid+1,end,target);
//      }
//   } int[]arr={14,2,4,54,1,41};
//        System.out.println(rebst(arr,0, arr.length-1,14));
//public static int fo(int[]arr,int x){
//    int start=0,end=arr.length-1;
//    int ans=-1;
//    while (start<=end){
//        int mid=start+(end-start)/2;
//        if (arr[mid]==x){
//            ans=mid;
//            end=mid-1;
//        }else if (arr[mid]<x){
//            start=mid+1;
//        }else {
//            end=mid-1;
//        }
//    }
//    return ans;
//} System.out.println(fo(arr,0));public static int lo(int[]arr,int x){
//    int start=0,end=arr.length-1;
//    int ans=-1;
//    while (start<=end){
//        int mid=start+(end-start)/2;
//        if (arr[mid]==x){
//   System.out.println(lo(arr,20));          ans=mid;
//            start=mid+1;
//        }else if (arr[mid]<x){
//            start=mid+1;
//        }else {
//            end=mid-1;
//        }
//    }return ans;
//} public static int sr(int[]arr,int x){
//       int start=0,end= arr.length-1;
//       int ans=0;
//       while (start<=end){
//           int mid=start+(end-start)/2;
//           int val=mid*mid;
//           if (val==x){
//               return mid;
//           }else if (val<x){
//               ans=mid;
//               start=mid+1;
//           }else {
//               end=mid-1;
//           }
//       }
//       return ans;
//   }int[]arr={0,1,2,3,4,5,6,8};
//        System.out.println(sr(arr,25)); public static int findminrotatedarray(int[]arr){
//      int start=0,end=arr.length-1;
//      int ans=-1;
//      while (start<=end){
//          int mid=start+(end-start)/2;
//          if (arr[mid]<=arr[end]){
//              ans=mid;
//              end=mid-1;
//          }else {
//              start=mid+1;
//          }
//      }
//      return ans;
//  } System.out.println(findminrotatedarray(arr));
// public static int index(int[]arr,int target){
//        int start=0,end=arr.length-1;
//        while (start<=end){
//            int mid=start+(end-start)/2;
//            if (arr[mid]==target){
//                return mid;
//            } else if (arr[mid]<arr[end]) {
//                if (arr[mid]<target&&arr[end]>=target){
//                    start=mid+1;
//                }else {
//                    end=mid-1;
//                }
//            }else {
//                if (arr[start]<=target&&arr[mid]>target){
//                    end=mid-1;
//                }else {
//                    start=mid+1;
//                }
//            }
//        }return -1;
//    } System.out.println(index(arr,4));
public class newe {
//   public static int index(int []arr,int target){
//       int start=0,end=arr.length-1;
//       while (start<=end){
//           int mid=start+(end-start)/2;
//           if (arr[mid]==target){
//               return mid;
//           } else if (arr[start]==arr[mid]&&arr[mid]==arr[end]){
//               start++;
//               end--;
//           }else if (arr[mid]<=arr[end]){
//               if (arr[mid]<target&&arr[end]>=target){
//                   start=mid+1;
//               }else {
//                   end=mid-1;
//               }
//           }else {
//               if (arr[start]<=target&&arr[mid]>target){
//                   end=mid-1;
//               }else {
//                   start=mid+1;
//               }
//           }
//       }return -1;
public static int index(int[]arr,int target){
        int start=0,end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }else if (arr[start]==arr[mid]&&arr[mid]==arr[end]){
                start++;
                end--;
            }
            else if (arr[mid]<=arr[end]) {
                if (arr[mid]<target&&arr[end]>=target){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }else {
                if (arr[start]<=target&&arr[mid]>target){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }return -1;
   }
    public static void main(String[] args) {
       int[]arr={1,1,2,2,0,1};
        System.out.println(index(arr,2));

    }
}

