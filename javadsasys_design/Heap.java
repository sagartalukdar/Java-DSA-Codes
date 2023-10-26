package javadsasys_design;

//public class Heap {
//    public static void swap(int []arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void print(int []arr,int n){
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void maxHeapify(int idx,int []arr){
//        if(idx==0)return;
//  int parent=Math.abs((idx-1)/2);//because child=2*idx+1 or 2*idx+2 so parent=(idx-1)/2
//        if(arr[idx]>arr[parent]){
//            swap(arr,idx,parent);
//            maxHeapify(parent,arr);
//        }
//
//    }
//    public static void minHeapify(int idx,int[]arr){
//        if(idx==0)return;
//        int parent=Math.abs((idx-1)/2);
//        if(arr[idx]<arr[parent]){
//            swap(arr,idx,parent);
//            minHeapify(parent,arr);
//        }
//    }
//    public static int insertInMaxHeap(int arr[],int n,int val){
//        n++;
//        arr[n-1]=val;
//        maxHeapify(n-1,arr);
//        return n;
//    }
//    public static int insertInMinHeap(int[]arr,int val,int n){
//        n++;
//        arr[n-1]=val;
//        minHeapify(n-1,arr);
//        return n;
//    }
//    public static void del_Max_Heapify(int[]arr,int idx,int n){
//        int parent=idx;
//        int lchild=2*idx+1;
//        int rchild=2*idx+2;
//        if(lchild<n && arr[parent]<arr[lchild])parent=lchild;
//        if(rchild<n && arr[parent]<arr[rchild])parent=rchild;
//        if(parent!=idx){
//            swap(arr,idx,parent);
//            del_Max_Heapify(arr,parent,n);
//        }
//    }
//    public static int deleteInMaxHeap(int []arr,int n){
//        arr[0]=arr[n-1];
//        n--;
//        del_Max_Heapify(arr,0,n);
//        return n;
//    }
//    public static void del_Min_Heapify(int[]arr,int n,int idx){
//       int parent=idx;
//       int lchild=2*idx+1;
//       int rchild=2*idx+2;
//       if(lchild<n && arr[parent]>arr[lchild])parent=lchild;
//       if(rchild<n && arr[parent]>arr[rchild])parent=rchild;
//       if(parent!=idx){
//           swap(arr,idx,parent);
//           del_Min_Heapify(arr,n,parent);
//       }
//    }
//    public static int deleteInMinHeap(int []arr,int n){
//        arr[0]=arr[n-1];
//        n--;
//        del_Min_Heapify(arr,n,0);
//        return n;
//    }
//    public static void heapifyForMin(int []arr,int n,int idx){
//        int parent=idx;
//        int lchild=2*idx+1;
//        int rchild=2*idx+2;
//        if(lchild<n && arr[parent]>arr[lchild])parent=lchild;
//        if(rchild<n && arr[parent]>arr[rchild])parent=rchild;
//        if(parent!=idx){
//            swap(arr,idx,parent);
//            heapifyForMin(arr,n,parent);
//        }
//    }
//    public static void heapifyForMax(int[]arr,int n,int idx){
//
//        int parent=idx;
//        int lchild=2*idx+1;
//        int rchild=2*idx+2;
//        if(lchild<n && arr[lchild]>arr[parent]) parent=lchild;
//        if(rchild<n && arr[rchild]>arr[parent]) parent=rchild;
//        if(parent!=idx){
//            swap(arr,idx,parent);
//            heapifyForMax(arr,n,parent);
//        }
//
//    }
//    public static void main(String[] args) {
//        int []maxheap=new int[10];
//        maxheap[0]=20;
//        maxheap[1]=8;
//        maxheap[2]=5;
//        maxheap[3]=10;
//        maxheap[4]=4;
//        maxheap[5]=3;
//      print(maxheap,6);

//        heapifyForMax(maxheap,6,1);
//        print(maxheap,6);
//
//        print(maxheap,8);
//        int n=insertInMaxHeap(maxheap,8,52);
//        System.out.println();
//        print(maxheap,n);
//
//        int dn=deleteInMaxHeap(maxheap,n);
//        System.out.println();
//        print(maxheap,dn);

//        int minheap[]=new int[10];
//        minheap[0]=2;
//        minheap[1]=4;
//        minheap[2]=30;
//        minheap[3]=8;
//        minheap[4]=9;
//        minheap[5]=16;
//        minheap[6]=25;
//        int n=7;
//       print(minheap,n);
//
//       heapifyForMin(minheap,n,2);
//       print(minheap,n);

//        n=insertInMinHeap(minheap,5,n);
//        System.out.println();
//        print(minheap,n);
//
//        n=deleteInMinHeap(minheap,n);
//        System.out.println();
//        print(minheap,n);
//
//        heapifyForMin(minheap,n,0);
//        print(minheap,n);
//    }
//}


//public class Heap {
//    public static void swap(int []arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void print(int []arr,int n){
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void del_Max_Heapify(int[]arr,int idx,int n){
//        int parent=idx;
//        int lchild=2*idx+1;
//        int rchild=2*idx+2;
//        if(lchild<n && arr[parent]<arr[lchild])parent=lchild;
//        if(rchild<n && arr[parent]<arr[rchild])parent=rchild;
//        if(parent!=idx){
//            swap(arr,idx,parent);
//            del_Max_Heapify(arr,parent,n);
//        }
//    }
//    public static int extractMax(int[]arr,int n){
//        if(n==0) System.out.println(Integer.MAX_VALUE);
//        if (n==1){
//            System.out.println(arr[0]);
//            n--;
//        }
//        else {
//            System.out.println(arr[0]);
//            arr[0]=arr[n-1];
//            n--;
//            del_Max_Heapify(arr,0,n);
//        }
//        return n;
//    }
//    public static void del_Min_Heapify(int[]arr,int n,int idx){
//        int parent=idx;
//        int lchild=2*idx+1;
//        int rchild=2*idx+2;
//        if(lchild<n && arr[parent]>arr[lchild])parent=lchild;
//        if(rchild<n && arr[parent]>arr[rchild])parent=rchild;
//        if(parent!=idx){
//            swap(arr,idx,parent);
//            del_Min_Heapify(arr,n,parent);
//        }
//    }
//    public static int extractMin(int[]arr,int n){
//      if(n==0) System.out.println(Integer.MIN_VALUE);
//      if (n==1) {
//          System.out.println(arr[0]);
//          n--;
//      }
//      else {
//          System.out.println(arr[0]);
//          arr[0]=arr[n-1];
//          n--;
//          del_Min_Heapify(arr,n,0);
//      }
//      return n;
//    }
//    public static void main(String[] args) {
//        int []maxheap=new int[10];
//        maxheap[0]=20;
//        maxheap[1]=8;
//        maxheap[2]=5;
//        maxheap[3]=1;
//        maxheap[4]=4;
//        maxheap[5]=3;
//        print(maxheap,6);
//        int n=extractMax(maxheap,6);
//        print(maxheap,n);
//
//        int minheap[]=new int[10];
//        minheap[0]=2;
//        minheap[1]=4;
//        minheap[2]=6;
//        minheap[3]=8;
//        minheap[4]=9;
//        minheap[5]=16;
//        minheap[6]=25;
//
//        print(minheap,7);
//        int nn=extractMin(minheap,7);
//        print(minheap,nn);
//    }
//}


//  ****  delete element in min heap *****

//public class Heap {
//    public static void swap(int[]arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void print(int []arr,int n){
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void del_Min_Heapify(int[]arr,int n,int idx){
//        int parent=idx;
//        int lchild=2*idx+1;
//        int rchild=2*idx+2;
//        if(lchild<n && arr[parent]>arr[lchild])parent=lchild;
//        if(rchild<n && arr[parent]>arr[rchild])parent=rchild;
//        if(parent!=idx){
//            swap(arr,idx,parent);
//            del_Min_Heapify(arr,n,parent);
//        }
//    }
//    public static void upHeapify(int []arr,int idx){
//        int parent=Math.abs((idx-1)/2);
//        if(idx>0 && arr[parent]>arr[idx]){
//            swap(arr,idx,parent);
//            upHeapify(arr,parent);
//        }
//    }
//    public static int getMin(int []arr,int n){
//        arr[0]=arr[n-1];
//        n--;
//        del_Min_Heapify(arr,n,0);
//        return n;
//    }
//    public static int deleteInMin(int[]arr,int idx){
//        System.out.println(arr[idx]);
//        arr[idx]=Integer.MIN_VALUE;
//        upHeapify(arr,idx);
//       return getMin(arr,arr.length);
//    }
//
//    public static void main(String[] args) {
//        int[]min={1,4,5,8,9,10,14,22,34};
//        int n=deleteInMin(min,5);
//        print(min,n);
//    }
//}


//  **** delete elements in max heap  ****
//public class Heap {
//    public static void swap(int[]arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void print(int []arr,int n){
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void del_Max_Heapify(int[]arr,int n,int idx){
//        int parent=idx;
//        int lchild=2*idx+1;
//        int rchild=2*idx+2;
//        if(lchild<n && arr[parent]<arr[lchild])parent=lchild;
//        if(rchild<n && arr[parent]<arr[rchild])parent=rchild;
//        if(parent!=idx){
//            swap(arr,idx,parent);
//            del_Max_Heapify(arr,n,parent);
//        }
//    }
//    public static void upHeapify(int []arr,int idx){
//        int parent=Math.abs((idx-1)/2);
//        if(idx>0 && arr[parent]<arr[idx]){
//            swap(arr,idx,parent);
//            upHeapify(arr,parent);
//        }
//    }
//    public static int getMax(int []arr,int n){
//        arr[0]=arr[n-1];
//        n--;
//        del_Max_Heapify(arr,n,0);
//        return n;
//    }
//    public static int deleteInMax(int[]arr,int idx){
//        System.out.println(arr[idx]);
//        arr[idx]=Integer.MAX_VALUE;
//        upHeapify(arr,idx);
//        return getMax(arr,arr.length);
//    }
//
//    public static void main(String[] args) {
//        int[]max={20,13,16,10,11,14,12,8,9};
//        int n=deleteInMax(max,5);
//        print(max,n);
//    }
//}


////   **** build heap  ****
//public class Heap {
//    public static void swap(int []arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void print(int []arr,int n){
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void minHeap(int arr[],int idx){
//        int parent=idx;
//        int l=2*idx+1;
//        int r=2*idx+2;
//        if(l<arr.length && arr[parent]>arr[l])parent=l;
//        if(r<arr.length && arr[parent]>arr[r])parent=r;
//        if(parent!=idx){
//            swap(arr,idx,parent);
//            minHeap(arr,parent);
//        }
//    }
//    public static void buildHeap(int []arr,int n){
//        int lastchild=n-1;
//        int lastparent=(lastchild-1)/2;
//      for (int i=lastparent;i>=0;i--){
//          minHeap(arr,i);
//      }
//    }
//    public static void main(String[] args) {
//    int []a={4,50,2,11,12,7,40,5};
//    int []arr={10,5,20,2,4,8};
//    buildHeap(arr,arr.length);
//    print(arr,arr.length);
//    }
//}


//   **** build heap  ****
//public class Heap {
//    public static void swap(int []arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void print(int []arr,int n){
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void maxHeap(int arr[],int idx){
//        int parent=idx;
//        int l=2*idx+1;
//        int r=2*idx+2;
//        if(l<arr.length && arr[parent]<arr[l])parent=l;
//        if(r<arr.length && arr[parent]<arr[r])parent=r;
//        if(parent!=idx){
//            swap(arr,idx,parent);
//            maxHeap(arr,parent);
//        }
//    }
//    public static void buildHeap(int []arr,int n){
//        int lastchild=n-1;
//        int lastparent=(lastchild-1)/2;
//        for (int i=lastparent;i>=0;i--){
//            maxHeap(arr,i);
//        }
//    }
//    public static void main(String[] args) {
//        int []a={4,50,2,11,12,7,40,5};
//        int []arr={10,5,20,2,4,8};
//        buildHeap(arr,arr.length);
//        print(arr,arr.length);
//    }
//}


//  ****  Heap Sort  ******
// acending sort by max heap--------
//public class Heap {
//    public static void swap(int []arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void print(int []arr,int n){
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void heapify(int[]arr,int ind,int n){
//        int patent=ind;
//        int lc=2*ind+1;
//        int rc=2*ind+2;
//        if(lc<n && arr[patent]<arr[lc])patent=lc;
//        if(rc<n && arr[patent]<arr[rc])patent=rc;
//        if (patent!=ind){
//            swap(arr,ind,patent);
//            heapify(arr,patent,n);
//        }
//    }
//    public static void buildMaxHeap(int[]arr,int n){
//        int lastchild=n-1;
//        int lastparent=(lastchild-1)/2;
//        for (int i=lastparent;i>=0;i--){
//            heapify(arr,i,n);
//        }
//    }
//    public static void heapSort(int []arr,int n){
//        if (n==0 || n==1)return;
//        buildMaxHeap(arr,n);
//        for (int i=n-1;i>0;i--){
//            swap(arr,0,i);
//            n--;
//            heapify(arr,0,n);
//        }
//    }
//    public static void main(String[] args) {
//        int []arr={4,2,5,7,8,63,1};
//        heapSort(arr,arr.length);
//        print(arr,arr.length);
//    }
//}

//   decending sort by min heap---------
//public class Heap {
//    public static void swap(int []arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void print(int []arr,int n){
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void heapify(int[]arr,int ind,int n){
//        int patent=ind;
//        int lc=2*ind+1;
//        int rc=2*ind+2;
//        if(lc<n && arr[patent]>arr[lc])patent=lc;
//        if(rc<n && arr[patent]>arr[rc])patent=rc;
//        if (patent!=ind){
//            swap(arr,ind,patent);
//            heapify(arr,patent,n);
//        }
//    }
//    public static void buildMinHeap(int[]arr,int n){
//        int lastchild=n-1;
//        int lastparent=(lastchild-1)/2;
//        for (int i=lastparent;i>=0;i--){
//            heapify(arr,i,n);
//        }
//    }
//    public static void heapSort(int []arr,int n){
//        if (n==0 || n==1)return;
//        buildMinHeap(arr,n);
//        for (int i=n-1;i>0;i--){
//            swap(arr,0,i);
//            n--;
//            heapify(arr,0,n);
//        }
//    }
//    public static void main(String[] args) {
//        int []arr={4,2,5,7,8,63,1};
//        heapSort(arr,arr.length);
//        print(arr,arr.length);
//    }
//}


//import java.util.PriorityQueue;
//
//public class Heap {
//    public static void main(String[] args) {
//        //priority Queue by default make min heap
//        PriorityQueue<Integer> numbers = new PriorityQueue<>();
//        numbers.add(10);
//        numbers.add(5);
//        numbers.add(20);
//        numbers.add(14);
//        numbers.add(9);
//        while (!numbers.isEmpty()){
//            System.out.print(numbers.poll()+" ");
//        }
//        System.out.println();
//
////        make max heap from this array by priority queue
//        int []arr={4,2,5,1,3,85,9};
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int e:arr){
//            pq.add(-e);
//        }
//        while (!pq.isEmpty()){
//            System.out.print(-pq.poll()+" ");
//        }
//    }
//}


//import java.util.PriorityQueue;
//
////   **** find kth largest elements *****
//public class Heap {
//    public static int kthLargest(int[]arr,int k){
//        PriorityQueue<Integer> pq=new PriorityQueue<>();
//        for (int e:arr){
//            pq.add(-e);
//      //that make out min heap ,the max element go to the first index
//        }
//        int ans=0;
//        int count=0;
//    while (!pq.isEmpty()){
//        count++;
//        ans=-pq.poll();
//        if (count==k){
//            break;
//        }
//    }
//    return ans;
//    }
//    public static void main(String[] args) {
//        int []arr={7,3,8,1,5,9,6};
//        System.out.println(kthLargest(arr,7));
//    }
//}

//import java.util.PriorityQueue;
//
////    another approach
////   **** find kth largest elements *****
//public class Heap {
//    public static int kthLargest(int[]arr,int kth){
//        PriorityQueue<Integer>pq=new PriorityQueue<>();
//        for (int e:arr){
//            pq.add(e);
//            if(pq.size()>kth)pq.poll();
//        }
//        return pq.poll();
//    }
//    public static void main(String[] args) {
//        int []arr={7,3,8,1,5,9,6};
//        System.out.println(kthLargest(arr,2));
//    }
//}


//import java.util.HashMap;
//import java.util.Map;
//import java.util.PriorityQueue;
//
//public class Heap {
//   static class pair{
//        int a;
//        int b;
//        public pair(int n,int m){
//            this.a=n;
//            this.b=m;
//        }
//    }
//    public static void main(String[] args) {
//        int[]arr={2,1,4,5,1,2,4,7,1};
//        int k=2;
//        HashMap<Integer,Integer>hm=new HashMap<>();
//        for (int e:arr){
//            if (hm.containsKey(e)) {
//                hm.put(e,hm.get(e)+1);
//            } else hm.put(e,1);
//        }
//        PriorityQueue<Map.Entry<Integer,Integer>> pq=
//                new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
//       for (Map.Entry e: hm.entrySet()){
//          pq.add(e);
//       }
//     for (int i=1;i<=k;i++){
////         System.out.println(pq.poll());
////         or
//         System.out.println(pq.poll().getKey());
//     }
//
//    }
//}


//import java.util.PriorityQueue;
//
////     **** minimum coast to marge ropes *****
//public class Heap {
//    public static void main(String[] args) {
//        int[]arr={4,1,2,3};
//        PriorityQueue<Integer>pq=new PriorityQueue<>();
//        for (int e:arr)pq.add(e);
//        int coast=0;
//        while (pq.size()!=1){
//            int a=pq.poll();
//            int b=pq.poll();
//            coast+=(a+b);
//            pq.add(a+b);
//        }
//        System.out.println(coast);
//        while (!pq.isEmpty()) System.out.print(pq.poll()+" ");
//    }
//}


//       ****    from geeks for geeks    ****
//class Solution
//{
//    static class Pair{
//        int val;
//        int li;// li is each 1d array index in this 2d array
//        int vi;// vi is array elements index in each 1d array
//        public Pair(int n,int i,int j){
//            this.val=n;
//            this.li=i;
//            this.vi=j;
//        }
//    }
//    //Function to merge k sorted arrays.
//    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K)
//    {
//        ArrayList<Integer> al=new ArrayList<>();
//
//        PriorityQueue<Pair>pq=
//                new PriorityQueue<>((a,b)->a.val-b.val);
//        for(int i=0;i<arr.length;i++){
//            pq.add(new Pair(arr[i][0],i,0));
//        }
//        while(!pq.isEmpty()){
//            Pair p=pq.poll();
//            al.add(p.val);
//            p.vi++;
//            if(p.vi<arr[p.li].length){
//                p.val=arr[p.li][p.vi];
//                pq.add(p);
//            }
//        }
//
//        return al;
//    }
//}

import java.util.HashSet;
import java.util.Set;

public class Heap {
    public static void main(String[] args) {
       hashset s=new hashset();
        HashSet<Integer>h=new HashSet<>();
        h.add(1);
        System.out.println(h.contains(1));
    }
}