package javadsasys_design;
//check pallindrome or not-----------
//public class practicedsa {
//    public static void main(String[] args) {
//        int arr[]={1,2,3,2,1};
//        boolean flag=true;
//        for(int i=0;i< arr.length/2;i++){
//            if(arr[i]!=arr[arr.length-1-i]){
//                System.out.println("not pallindrome");
//                flag=false;
//                break;
//            }
//        }
//        if(flag) System.out.println("pallindrome");
//    }
//}

//reverse an array-------
//public class practicedsa {
//    public static void main(String[] args) {
//        int arr[]={1,2,3,2,5};
//        int n=arr.length;
//        for(int i=0;i<n/2;i++){
//            int temp=arr[i];
//            arr[i]=arr[n-1-i];
//            arr[n-1-i]=temp;
//        }
//        for (int e:arr){
//            System.out.print(e+" ");
//        }
//    }
//}

//public class practicedsa {
//    public static void main(String[] args) {
//        int arr[]={0,1,2,3,4,5,7,8,9};
//        int n=arr.length;
//        int unmissum=n*(n+1)/2;
//        int sum=0;
//        for(int i=0;i<n;i++){
//            sum+=arr[i];
//        }
//        System.out.println(unmissum-sum);
//    }
//}

//public class practicedsa {
//    public static void main(String[] args) {
//        int arr[]={0,1,2,3,4,5,8,9};
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]==arr[j]){
//                    System.out.println("duplicate");
//                    break;
//                }
//            }
//        }
//    }
//}


//public class practicedsa {
//    public static int firstOccurence(int []arr,int i,int j,int target){
//        int ans=-1;
//        while(i<=j){
//            int mid=i+(j-i)/2;
//            if(arr[mid]==target){
//                ans=mid;
//                j=mid-1;
//            }
//            else if(arr[mid]>target){
//                j=mid-1;
//            }
//            else i=mid+1;
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int[]arr={1,2,4,3,54,1,6};
//        System.out.println(firstOccurence(arr,0,arr.length-1,4));
//    }
//}


//import java.util.Scanner;
//
//public class practicedsa {
//    public static int squareRoot(int target,int i,int j){
//        int ans=-1;
//        while (i<=j){
//            int mid=i+(j-i)/2;
//            int n=mid*mid;
//            if(n==target)return mid;
//            else if(n<target){
//                ans=mid;
//                i=mid+1;
//            }else{
//                j=mid-1;
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int target=sc.nextInt();
//        System.out.println(squareRoot(target,1,target));
//    }
//}

//public class practicedsa {
//    public static void bubleSort(int []arr){
//        boolean flag;
//        for(int i=0;i< arr.length-1;i++){
//            flag=true;
//            for(int j=0;j< arr.length-1-i;j++){
//               if(arr[j]>arr[j+1]){
//                   int temp=arr[j];
//                   arr[j]=arr[j+1];
//                   arr[j+1]=temp;
//                   flag=false;
//               }
//            }
//            if(flag)break;
//        }
//    }
//    public static void main(String[] args) {
//         int arr[]={5,2,8,2,6,1,1,7};
//         bubleSort(arr);
//         for (int e:arr){
//             System.out.print(e+" ");
//         }
//    }
//}
//
//import java.util.Arrays;
//
//public class practicedsa {
//    public static void main(String[] args) {
//        int arr[]={5,2,8,2,6,1,1,7};
//        for (int i=1;i<arr.length;i++){
//            int j=i;
//            while (j>0 && arr[j-1]>arr[j]){
//                int temp=arr[j];
//                arr[j]=arr[j-1];
//                arr[j-1]=temp;
//                j--;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}

//import java.util.Arrays;
//
//public class practicedsa {
//    public static void main(String[] args) {
//        int arr[]={5,2,8,2,6,1,1,7};
//        for(int i=0;i<arr.length-1;i++){
//            int minidx=i;
//            for(int j=i+1;j< arr.length;j++){
//                if(arr[minidx]>arr[j]){
//                    minidx=j;
//                }
//            }
//            int temp=arr[i];
//            arr[i]=arr[minidx];
//            arr[minidx]=temp;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}


//public class practicedsa {
//    public static int powerOfAnElement(int ele,int power){
//        if(power==1)return ele;
//            int ans=powerOfAnElement(ele,power/2);
//            if(power%2!=0)return ele*ans*ans;
//            else return ans*ans;
//
//    }
//    public static void main(String[] args) {
//        System.out.println(powerOfAnElement(2,5));
//    }
//}


//public class practicedsa {
//    public  int powerOfAnElement(int ele,int power){
//        if(power==1)return ele;
//        return ele*powerOfAnElement(ele,power-1);
//    }
//    public static void main(String[] args) {
//        practicedsa pd=new practicedsa();
//        System.out.println(pd.powerOfAnElement(2,5));
//    }
//}


//public class practicedsa {
//    public static int setTiles(int boardcol){
//        if(boardcol<=3)return boardcol;
//        return setTiles(boardcol-1)+setTiles(boardcol-2);
//    }
//    public static void main(String[] args) {
//        System.out.println(setTiles(6));
//    }
//}


//import java.util.ArrayList;
//
//public class practicedsa {
//    public static void subString(String s,int i, ArrayList<Character>al){
//        int n=s.length();
//        if(i==n){
//            System.out.println(al);
//            return;
//        }
//        subString(s,i+1,al);
//        al.add(s.charAt(i));
//        subString(s,i+1,al);
//        al.remove(al.size()-1);
//    }
//    public static void main(String[] args) {
//        ArrayList<Character>al=new ArrayList<>();
//        subString("ab",0,al);
//    }
//}

//import java.util.ArrayList;
//
//public class practicedsa {
//    public static void combination(String s, ArrayList<Character>al,int i){
//        if(i==s.length()){
//            System.out.println(al);
//            return;
//        }
//        al.add(s.charAt(i))    ;
//        combination(s,al,i+1);
//        al.remove(al.size()-1);
//        combination(s,al,i+1);
//    }
//    public static void main(String[] args) {
//        combination("abc",new ArrayList<Character>(),0);
//
//    }
//}


//import java.util.Arrays;
//
//public class practicedsa {
//    public static void permutation(char[]arr,int fixedIdx){
//        if(fixedIdx==arr.length-1){
//            System.out.println(Arrays.toString(arr));
//            return;
//        }
//        for (int i=fixedIdx;i<arr.length;i++){
//            swap(arr,fixedIdx,i);
//            permutation(arr,fixedIdx+1);
//            swap(arr,fixedIdx,i);
//        }
//    }
//    public static void swap(char[]arr,int i,int j){
//        char temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void main(String[] args) {
//        String s="abc";
//        permutation(s.toCharArray(),0);
//    }
//}


//import java.util.ArrayList;
//
//public class practicedsa {
//    public static void ratInMaze(int i,int j,int [][]visited,int [][]arr,
//                                 ArrayList<String>al,String s){
//        int n=arr.length;
//        int m=arr[0].length;
//        if(i==n-1 && j==m-1){
//            al.add(s);
//            return;
//        }
//        //down
//        if(i+1<n && visited[i+1][j]==0 && arr[i+1][j]==1){
//            visited[i+1][j]=1;
//            ratInMaze(i+1,j,visited,arr,al,s+'d');
//            visited[i+1][j]=0;
//        }
//        // left
//        if(j-1>=0 && visited[i][j-1]==0 && arr[i][j-1]==1){
//            visited[i][j-1]=1;
//            ratInMaze(i,j-1,visited,arr,al,s+'l');
//            visited[i][j-1]=0;
//        }
//        if(j+1<m && visited[i][j+1]==0 && arr[i][j+1]==1){
//            visited[i][j+1]=1;
//            ratInMaze(i,j+1,visited,arr,al,s+'r');
//            visited[i][j+1]=0;
//        }
//        if(i-1>=0 && visited[i-1][j]==0 && arr[i-1][j]==1 ){
//            visited[i-1][j]=1;
//            ratInMaze(i-1,j,visited,arr,al,s+'u');
//            visited[i-1][j]=0;
//        }
//    }
//    public static void main(String[] args) {
//       int [][]arr={{1,0,0,0},
//                    {1,1,0,0},
//                    {1,1,0,0},
//                    {0,1,1,1}};
//       int [][]vis=new int[4][4];
//       for(int i=0;i<4;i++){
//           for (int j=0;j<4;j++){
//               vis[i][j]=0;
//           }
//       }
//       vis[0][0]=1;
//        ArrayList<String>al=new ArrayList<>();
//       ratInMaze(0,0,vis,arr,al,"");
//        System.out.println(al);
//    }
//}


//import java.util.ArrayList;
//import java.util.List;
//
//public class practicedsa {
//    public static boolean isSafe(char[][]arr,int row,int col){
//        int i=row;
//        int j=col;
//        while (row>=0 && col>=0){
//            if(arr[row][col]=='q')return false;
//            row--;
//            col--;
//        }
//        row=i;
//        col=j;
//        while (row<arr.length && col>=0){
//            if(arr[row][col]=='q')return false;
//            row++;
//            col--;
//        }
//        row=i;
//        col=j;
//        while (col>=0){
//            if(arr[row][col]=='q')return false;
//            col--;
//        }
//        return true;
//    }
//    public static List<String> path(char[][]arr){
//        List<String>l=new ArrayList<>();
//        for (int i=0;i<arr.length;i++){
//            String s=String.valueOf(arr[i]);
//            l.add(s);
//        }
//        return l;
//    }
//    public static void nQueens(char[][]arr, int col, List<List<String>>lls){
//        if(col==arr[0].length){
//            lls.add(path(arr));
//            return;
//        }
//        for(int i=0;i<arr.length;i++){
//            if(isSafe(arr,i,col)){
//                arr[i][col]='q';
//                nQueens(arr,col+1,lls);
//                arr[i][col]='.';
//            }
//        }
//    }
//    public static void main(String[] args) {
//        char [][]arr= {{'.','.','.','.'},
//                       {'.','.','.','.'},
//                       {'.','.','.','.'},
//                       {'.','.','.','.'}};
//        List<List<String>>lls=new ArrayList<>();
//        nQueens(arr,0,lls);
//        for (List<String> l:lls){
//            for (String s:l){
//                System.out.println(s+" ");
//            }
//
//        }
//    }
//}

//public class practicedsa {
//    public static void print(int[][]arr){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//    public static boolean isSafe(int[][]arr,int i,int j,int x){
//        for (int a=0;a<arr[0].length;a++){
//            if(arr[i][a]==x)return false;
//        }
//        for (int a=0;a<arr.length;a++){
//            if(arr[a][j]==x)return false;
//        }
//        int ci=i/3*3;
//        int cj=j/3*3;
//        for(int a=ci;a<ci+3;a++){
//            for(int b=cj;b<cj+3;b++){
//                if(arr[a][b]==x)return false;
//            }
//        }
//        return true;
//    }
//    public static void sudokuSolve(int [][]arr,int i,int j){
//        if(i==arr.length){
//            print(arr);
//            return;
//        }
//        int ni,nj;
//        if(j==arr[0].length-1){
//            ni=i+1;
//            nj=0;
//        }else{
//            ni=i;
//            nj=j+1;
//        }
//        if(arr[i][j]!=0)sudokuSolve(arr,ni,nj);
//        else {
//            for(int x=1;x<=9;x++){
//                if(isSafe(arr,i,j,x)) {
//                    arr[i][j] = x;
//                    sudokuSolve(arr, ni, nj);
//                    arr[i][j] = 0;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[][]arr={{3,0,6,5,0,8,4,0,0},
//                {5,2,0,0,0,0,0,0,0},
//                {0,8,7,0,0,0,0,3,1},
//                {0,0,3,0,1,0,0,8,0},
//                {9,0,0,8,6,3,0,0,5},
//                {0,5,0,0,9,0,6,0,0},
//                {1,3,0,0,0,0,2,5,0},
//                {0,0,0,0,0,0,0,7,4},
//                {0,0,5,2,0,6,3,0,0}};
//        sudokuSolve(arr,0,0);
//
//    }
//}


//import javax.swing.*;
//
//public class practicedsa {
//     class Node {
//        int data;
//        Node next;
//        public Node(int d){
//            this.data=d;
//            this.next=null;
//        }
//    }
//    Node head=null;
//    public void insertAtFirst(int n){
//        Node newn=new Node(n);
//        if(head==null)head=newn;
//        else {
//            newn.next = head;
//            head = newn;
//        }
//        System.out.println(head.data);
//    }
//    public void insertAtEnd(int n){
//        Node newn=new Node(n);
//        if(head==null){
//            head=newn;
//            System.out.println(head.data);
//        }
//        else {
//            Node temp=head;
//            while (temp.next!=null){
//                System.out.println(temp.data);
//                temp=temp.next;
//            }
//            System.out.println(temp.data);
//            temp.next=newn;
//            System.out.println(temp.next.data);
//        }
//    }
//    public void insertAtAnyPos(int n,int pos){
//        Node newn=new Node(n);
//        Node temp=head;
//        for(int i=1;i<pos-1;i++){
//            temp=temp.next;
//        }
//        newn.next=temp.next;
//        temp.next=newn;
//    }
//    public void print(){
//        Node temp=head;
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//    }
//    public void delete(int pos){
//        if(head==null)return;
//        Node temp=head;
//        if(pos==1){
//            head=temp.next;
//        }
//        else {
//            for (int i=1;temp!=null&&i<pos-1;i++){
//                temp=temp.next;
//            }
//            if(temp==null || temp.next==null){
//                return;
//            }
//            temp.next=temp.next.next;
//        }
//    }
//    public void reverseIterativly(){
//        Node prev=null;
//        Node curr=head;
//        Node next=null;
//        while (curr!=null){
//            next=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//        }
//        head=prev;
//    }
//    public void reverseRecursivly(Node curr,Node prev,Node next){
//        if(curr==null){
//            head=prev;
//            return;
//        }
//        next=curr.next;
//        curr.next=prev;
//        prev=curr;
//        curr=next;
//        reverseRecursivly(curr,prev,next);
//    }
//    public void middleOfLL(Node slow,Node fast){
//        while (fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        System.out.println(slow.data);
//    }
//    public void hasCycle(Node slow,Node fast){
//        while (fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//            if(slow==fast){
//                System.out.println("cycle detected");
//                return;
//            }
//        }
//        System.out.println("No cycle");
//    }
//    public void cycle(){
//        Node temp= head;
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next= head;
//    }
//    public static void main(String[] args) {
//        practicedsa pd=new practicedsa();
//        pd.insertAtFirst(2);
//        pd.insertAtFirst(5);
//          pd.insertAtEnd(3);
//          pd.insertAtEnd(6);
//          pd.insertAtEnd(7);
//          pd.insertAtAnyPos(4,3);
//        System.out.println(" k ");
//          pd.print();
//          pd.delete(1);
//          pd.delete(5);
//          pd.reverseRecursivly(pd.head, null,null);
////        pd.reverseIterativly();
//        pd.print();
//
//        pd.middleOfLL(pd.head, pd.head);
//        pd.cycle();
//        pd.hasCycle(pd.head, pd.head);
//
//    }
//}


//import java.util.Arrays;
//import java.util.HashMap;
//
//public class practicedsa {
//    public static int[] twoSum(int[]arr, int target, HashMap<Integer,Integer>hm){
//        int []ans={-1,-1};
//        for (int i=0;i<arr.length-1;i++){
//            if(arr[i]==target && hm.containsKey(0)){
//                   ans[0]=i;
//                   ans[1]=hm.get(0);
//                   return ans;
//            }
//            else if(hm.containsKey(target-arr[i]) && hm.get(target-arr[i])>i){
//                ans[0]=i;
//                ans[1]=hm.get(target-arr[i]);
//                return ans;
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        HashMap<Integer,Integer>hm=new HashMap<>();
//        int []arr={12,8,1,-15,5,0};
//        for (int i=0;i<arr.length;i++){
//            hm.put(arr[i],i);
//        }
//        int ans[]=twoSum(arr,0,hm);
//        System.out.println(Arrays.toString(ans));
//    }
//}


//public class practicedsa {
//    public static void main(String[] args) {
//        String s="gaguar";
//        HashMap<Character,Integer>hm=new HashMap<>();
//        for (int i=0;i<s.length();i++){
//            if(hm.containsKey(s.charAt(i))){
//                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
//            }else{
//                hm.put(s.charAt(i),1);
//            }
//        }
//        for (int i=0;i<s.length();i++){
//            if(hm.get(s.charAt(i))==1){
//                System.out.println("first NON-REPEATATIVE element is "+
//                        s.charAt(i));
//                break;
//            }
//        }
//    }
//}


//public class practicedsa {
//    public static boolean isValid(String s,Stack<Character>st){
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
//                st.push(s.charAt(i));
//            }
//            else if(st.isEmpty()){
//                return false;
//            }
//            else if ((s.charAt(i)==')' && st.peek()!='(')
//                    ||(s.charAt(i)=='}' && st.peek()!='{')
//                    ||(s.charAt(i)==']' && st.peek()!='[')) {
//                return false;
//            }
//            else if ((s.charAt(i)==')' && st.peek()=='(')
//                    ||(s.charAt(i)=='}' && st.peek()=='{')
//                    ||(s.charAt(i)==']' && st.peek()=='[')) {
//                st.pop();
//            }
//        }
//        if(st.isEmpty())return true;
//        return false;
//    }
//    public static void main(String[] args) {
//        String s="((}{})";
//        Stack<Character>st=new Stack<>();
//        System.out.println(isValid(s,st));
//    }
//}


//public class practicedsa {
//    public static int lergestAreaInHistogram(int[]arr){
//        int n= arr.length;
//        int[]lb=new int[n];
//        int[]rb=new int[n];
//
//        Stack<Integer>lbs=new Stack<>();
//        lbs.push(0);
//        lb[0]=-1;
//        for (int i=1;i<n;i++){
//            while (!lbs.isEmpty() && arr[i]<arr[lbs.peek()]) {
//                   lbs.pop();
//            }
//            if(lbs.isEmpty()){
//               lb[i]=-1;
//            }else{
//                lb[i]=lbs.peek();
//            }
//            lbs.push(i);
//        }
//        lbs=new Stack<>();
//        rb[n-1]=n;
//        lbs.push(n-1);
//        for (int i=n-2;i>=0;i--){
//            while (!lbs.isEmpty() && arr[i]<lbs.peek()){
//                lbs.pop();
//            }
//            if(lbs.isEmpty()){
//                rb[i]=n;
//            }else {
//                rb[i]=lbs.peek();
//            }
//            lbs.push(i);
//        }
//        int maxarea=0;
//        for (int i=0;i<n;i++){
//            int width=rb[i]-lb[i]-1;
//            int area=arr[i]*width;
//            maxarea=Math.max(maxarea,area);
//        }
//    return maxarea;
//    }
//    public static void main(String[] args) {
//        int[]arr={2,1,1,8,1,3,7};
//        System.out.println(lergestAreaInHistogram(arr));
//    }
//}


//  stack using queue ----
//public class practicedsa {
//    Queue<Integer>q1=new LinkedList<>();
//    Queue<Integer>q2=new LinkedList<>();
//    public  void push(int n){
//        if(q1.isEmpty()){
//            q1.add(n);
//        }else {
//            while (!q1.isEmpty()){
//                q2.add(q1.poll());
//            }
//            q1.add(n);
//            while (!q2.isEmpty()){
//                q1.add(q2.poll());
//            }
//        }
//    }
//    public void pop(){
//        if(q1.isEmpty())System.exit(0);
//        else System.out.println(q1.poll());
//    }
//    public static void main(String[] args) {
//       practicedsa pd=new practicedsa();
////       pd.pop();
//       pd.push(2);
//       pd.push(54);
//       pd.pop();
//       pd.pop();
//       pd.pop();
//    }
//}

// queue with stack------
//public class practicedsa {
//    Stack<Integer>s1=new Stack<>();
//    Stack<Integer>s2=new Stack<>();
//    public void push(int n){
//        s1.push(n);
//    }
//    public void poll(){
//        if(s1.isEmpty() && s2.isEmpty()){
//            System.out.println("Nothing to be delete!");
//            System.exit(0);
//        }else {
//            if(s2.isEmpty()){
//                while (!s1.isEmpty()){
//                    s2.push(s1.pop());
//                }
//                System.out.println(s2.pop());
//            }
//            else {
//                System.out.println(s2.pop());
//            }
//        }
//    }
//    public static void main(String[] args) {
//        practicedsa pd=new practicedsa();
//        pd.push(1);
//        pd.push(3);
//        pd.push(4);
//        pd.poll();
//        pd.poll();
//        pd.push(5);
//        pd.poll();
//        pd.poll();
//
//    }
//}

//Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
//        Output: [3,3,5,5,6,7]

//public class practicedsa {
// public int[] slidingWindow(int[]arr, int k){
//  int n=arr.length;
//  int[]ans=new int[n-k+1];
//  Deque<Integer>dq=new ArrayDeque<>();
//  int idx=0;
//  for(int i=0;i<n;i++){
//   if(!dq.isEmpty() && dq.peek()==i-k){
//    dq.pollFirst();
//   }
//   while (!dq.isEmpty() && arr[i]>arr[dq.peekLast()]){
//    dq.pollLast();
//   }
//   dq.offerLast(i);
//   if(i>=k-1){
//    ans[idx++]=arr[dq.peekFirst()];
//   }
//  }
//  return ans;
// }
// public static void main(String[] args) {
//  practicedsa p=new practicedsa();
//  int []arr= {1,3,-1,-3,5,3,6,7};
//  int k=3;
//  int []ans=p.slidingWindow(arr,3);
//  for (int e:ans){
//   System.out.print(e+" ");
//  }
// }
//}


//merge sort
//
//public class practicedsa {
// public void merge(int []arr,int i,int mid,int j){
//  int n1=mid-i+1;
//  int n2=j-mid;
//  int la[]=new int[n1];
//  int ra[]=new int[n2];
//  for (int x=0;x<n1;x++){
//   la[x]=arr[i+x];
//  }
//  for (int y=0;y<n2;y++){
//   ra[y]=arr[mid+1+y];
//  }
//  int l=0,h=0,k=i;
//  while (l!=n1 && h!=n2){
//   if(la[l]<ra[h]){
//    arr[k++]=la[l++];
//   }else arr[k++]=ra[h++];
//  }
//  while (l!=n1){
//   arr[k++]=la[l++];
//  }
//  while (h!=n2){
//   arr[k++]=ra[h++];
//  }
// }
// public void mergeSort(int[]arr,int i,int j){
//  if(i>=j)return;
//  int mid=i+(j-i)/2;
//  mergeSort(arr,i,mid);
//  mergeSort(arr,mid+1,j);
//  merge(arr,i,mid,j);
// }
// public static void main(String[] args) {
//  practicedsa p=new practicedsa();
//  int[]arr={4,2,5,1,8,2,6,3};
//  p.mergeSort(arr,0, arr.length-1);
//  for (int e:arr){
//   System.out.print(e+" ");
//  }
// }
//}


//public class practicedsa {
// public static void swap(int[]arr,int i,int j){
//  int temp=arr[i];
//  arr[i]=arr[j];
//  arr[j]=temp;
// }
// public static int partition(int []arr,int i,int j){
//  int pivot=arr[i];
//  int count=0;
//  for (int x=i+1;x<=j;x++){
//   if(arr[x]<=pivot){
//    count++;
//   }
//  }
//  int pidx=i+count;
//  swap(arr,pidx,i);
//  int a=i,b=j;
//  while (a<pidx && b>pidx){
//   while (arr[a]<=arr[pidx]){
//    a++;
//   }
//   while (arr[b]>arr[pidx]){
//    b--;
//   }
//   if(a<pidx && b>pidx){
//    swap(arr,a,b);
//    a++;
//    b--;
//   }
//  }
//  return pidx;
// }
// public static void quickSort(int []arr,int i,int j){
//  if(i>=j)return;
//  int pidx=partition(arr,i,j);
//  quickSort(arr,i,pidx-1);
//  quickSort(arr,pidx+1,j);
// }
// public static void main(String[] args) {
//  practicedsa p=new practicedsa();
//  int[]arr={5,1,14,6,4,2,8};
//  quickSort(arr,0,arr.length-1);
//  for (int e:arr){
//   System.out.print(e+" ");
//  }
// }
//}


//public class practicedsa {
// public static int marge(int[]arr,int i,int mid,int j){
//  int count=0;
//  int []la;
//  int []ra;
//  la=Arrays.copyOfRange(arr,i,mid+1);
//  ra=Arrays.copyOfRange(arr,mid+1,j+1);
//  int n1=la.length;
//  int n2=ra.length;
//  int a=0,b=0,k=i;
//  while (a<n1 && b<n2){
//   if(la[a]<=ra[b]){
//    arr[k++]=la[a++];
//   }else{
//    arr[k++]=ra[b++];
//    count+=(mid+1)-(i+a);
//   }
//  }
//  while (a!=n1){
//   arr[k++]=la[a++];
//  }
//  while (b!=n2){
//   arr[k++]=ra[b++];
//  }
//  return count;
// }
// public static int countNumOfIntervals(int[]arr,int i,int j){
//  int count=0;
//   if (i<j){
//   int mid=i+(j-i)/2;
//   count+=countNumOfIntervals(arr,i,mid);
//   count+=countNumOfIntervals(arr,mid+1,j);
//   count+=marge(arr,i,mid,j);
//  }
//  return count;
// }
// public static void main(String[] args) {
//  practicedsa pd=new practicedsa();
//  int[]arr={4,2,5,1,65,2};
//  System.out.println(pd.countNumOfIntervals(arr,0,arr.length-1));
//
// }
//}


//public class practicedsa {
// public static void swap(int[]arr,int i,int j){
//  int temp=arr[i];
//  arr[i]=arr[j];
//  arr[j]=temp;
// }
// public static int partition(int arr[],int i,int j){
//  int pivot=arr[i];
//  int count=0;
//  for (int x=i+1;x<=j;x++){
//   if(arr[x]<=pivot){
//    count++;
//   }
//  }
//  int pi=i+count;
//  swap(arr,i,pi);
//  int a=i,b=j;
//  while (a<pi && b>pi){
//   while (arr[a]<arr[pi]){
//    a++;
//   }
//   while (arr[b]>arr[pi]){
//    b--;
//   }
//   if(a<pi && b>pi){
//    swap(arr,a,b);
//    a++;
//    b--;
//   }
//  }
//  return pi;
// }
// public static int selection(int []arr,int i,int j,int k){
//
//    int idx = partition(arr, i, j);
//    if (idx == k - 1) return arr[idx];
//    else if (idx > k - 1) {
//     return selection(arr, i, idx - 1, k);
//    } else return selection(arr, idx + 1, j, k);
// }
// public static void main(String[] args) {
//  practicedsa pd=new practicedsa();
//  int[]arr={4,2,5,1,65,20};
//  System.out.println(pd.selection(arr,0,arr.length-1,40));
// }
//}

//import java.util.Arrays;
//
//public class practicedsa {
// static class pair{
//  int weight;
//  int value;
//  public pair(int v,int w){
//   this.weight=w;
//   this.value=v;
//  }
// }
// public static double maxValue(pair[]p,int maxweight){
//  double profit=0;
//  Arrays.sort(p,(a,b)->(b.value/b.weight)-(a.value/a.weight));
//  for (int i=0;i<p.length;i++){
//   if(maxweight-p[i].weight>=0){
//    maxweight=maxweight-p[i].weight;
//    System.out.println(p[i].weight);
//    profit+=p[i].value;
//   }else {
//    double fraction= maxweight/ p[i].weight;
//    profit+=(double) p[i].value*fraction;
//    break;
//   }
//  }
//   return profit;
// }
// public static void main(String[] args) {
//  pair p1=new pair(25,5);
//  pair p2=new pair(75,10);
//  pair p3=new pair(100,12);
//  pair p4=new pair(50,4);
//  pair p5=new pair(45,7);
//  pair p6=new pair(90,9);
//  pair p7=new pair(30,3);
//  pair[]arr={p1,p2,p3,p4,p5,p6,p7};
//  System.out.println(maxValue(arr,37));
// }
//}


//import java.util.Arrays;
//
//public class practicedsa {
// static class values{
//  int id;
//  int deadline;
//  int profit;
//  public values(int i,int d,int p){
//   this.id=i;
//   this.deadline=d;
//   this.profit=p;
//  }
// }
// public static int[] jobScheduling(values[]arr,int maxdeadline){
//  Arrays.sort(arr,(a,b)->b.profit-a.profit);
//  boolean check[]=new boolean[maxdeadline];
//  int[]ans =new int[maxdeadline];
//  for (int i=0;i<maxdeadline;i++){
//   for (int j=Math.min(maxdeadline-1,arr[i].deadline-1);j>=0;j--){
//    if(check[j]==false){
//     ans[j]=arr[i].id;
//     check[j]=true;
//     break;
//    }
//   }
//  }
//  return ans;
// }
// public static void main(String[] args) {
//  values[]arr={new values(1,5,55),
//               new values(2,2,65 ),
//               new values(3,7,75 ),
//               new values(4,3,60 ),
//               new values(5,2,70 ),
//               new values(6,1,50),
//               new values(7,4,85 ),
//               new values(8,5,68 ),
//               new values(9,3,45)};
//  int[]ans=jobScheduling(arr,7);
//  for (int e:ans){
//   System.out.print(e+" ");
//  }
// }
//}

//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;
//
//public class practicedsa {
//   static class Node{
//        int val;
//        Node left;
//        Node right;
//        public Node(int v){
//            this.val=v;
//        }
//    }
//    public static void nthLevelPrint(Node root,int level){
//       if(root==null)return;
//       if(level==1) {
//           System.out.print(root.val+" ");
//           return;
//       }
//       nthLevelPrint(root.left,level-1);
//       nthLevelPrint(root.right,level-1);
//    }
//    public static void nthLevelrtol(Node root,int l){
//       if(root==null)return;
//       if(l==1){
//           System.out.print(root.val+" ");
//           return;
//       }
//       nthLevelrtol(root.right,l-1);
//       nthLevelrtol(root.left,l-1);
//    }
//    public static void printAll(Node root){
//       for (int i=1;i<=3;i++){
//           nthLevelPrint(root,i);
//           System.out.println();
//       }
//    }
//    public static void zigzagPrint(Node root){
//       for (int i=1;i<=3;i++){
//           if(i%2!=0){
//               nthLevelPrint(root,i);
//               System.out.println();
//           }else{
//               nthLevelrtol(root,i);
//               System.out.println();
//           }
//
//       }
//    }
//    public static void bfs(Node root){
//        Queue<Node>q=new LinkedList<>();
//        if(root==null)return;
//        q.add(root);
//        while (!q.isEmpty()){
//            if(q.peek().left!=null)q.add(q.peek().left);
//            if(q.peek().right!=null)q.add(q.peek().right);
//            System.out.print(q.poll().val+" ");
//        }
//    }
//    public static void dfs(Node root){
//        Stack<Node>s=new Stack<>();
//        if(root==null)return;
//        s.push(root);
//        while (!s.isEmpty()){
//            Node temp=s.pop();
//            if(temp.right!=null)s.push(temp.right);
//
//            if(temp.left!=null)s.push(temp.left);
//            System.out.print(temp.val+" ");
//        }
//    }
//    public static void dfsInorder(Node root){
//       Stack<Node>st=new Stack<>();
//       if(root==null)return;
//       st.push(root);
//       while (!st.isEmpty()){
//           Node temp=st.peek();
//           if(temp.left!=null){
//               st.push(temp.left);
//               temp.left=null;
//           }else {
//               st.pop();
//               System.out.print(temp.val+" ");
//               if(temp.right!=null){
//                   st.push(temp.right);
//                   temp.right=null;
//               }
//           }
//       }
//    }
//    public static void dfsPostorder(Node root){
//       Stack<Node>s=new Stack<>();
//       s.push(root);
//       while (!s.isEmpty()){
//           Node temp=s.peek();
//               if (temp.right != null) {
//                   s.push(temp.right);
//                   temp.right = null;
//               }
//               if (temp.left != null) {
//                   s.push(temp.left);
//                   temp.left = null;
//               }
//               else {
//                   System.out.print(s.pop().val+ " ");
//               }
//       }
//    }
//    public static void searchInBST(Node root){
//       if(root==null)return ;
//       Node node = root;
//       while (node.left!=null){
//           node=node.left;
//       }
//        System.out.println(node.val);
//    }
//    public static void max(Node root){
//       if(root==null)return;
//       Node node=root;
//       while (node.right!=null){
//           node=node.right;
//       }
//        System.out.println(node.val);
//    }
//    public static void main(String[] args) {
//        Node main=new Node(10);
//        Node c1=new Node(8);
//        Node c2=new Node(15);
//        Node c3=new Node(4);
//        Node c4=new Node(9);
//        Node c5=new Node(23);
//        main.left=c1;
//        main.right=c2;
//        c1.left=c3;
//        c1.right=c4;
//        c2.right=c5;
//        printAll(main);
////        zigzagPrint(main);
////        bfs(main);
////        dfs(main);
////        System.out.println();
////        dfsInorder(main);
////        System.out.println();
////        dfsPostorder(main);
//       searchInBST(main);
//       max(main);
//    }
//}



//public class practicedsa {
//   static class minheap{
//       int []arr;
//       int size;
//       int capacity;
//        public minheap(int c){
//            this.capacity=c;
//            size=0;
//            arr=new int[capacity];
//        }
//    }
//    public static void swap(int[]arr,int i,int j){
//       int temp=arr[i];
//       arr[i]=arr[j];
//       arr[j]=temp;
//    }
//    public static void minHeapify(int []arr,int idx){
//       if(idx==0)return;
//       int parent=(idx-1)/2;
//       if(arr[idx]<arr[parent]){
//           swap(arr,idx,parent);
//           minHeapify(arr,parent);
//       }
//    }
//    public static int insertInMinHeap(int val,int size,int capacity,int[]arr){
//        if(size==capacity)return capacity;
//        size++;
//        arr[size-1]=val;
//        minHeapify(arr,size-1);
//        return size;
//    }
//    public static void MinHeapify(int[]a,int idx,int size){
//       int lc=2*idx+1;
//       int rc=2*idx+2;
//       int i=idx;
//       if(lc<size && a[lc]<a[i])i=lc;
//       if(rc<size && a[rc]<a[i])i=rc;
//       if(i!=idx){
//           swap(a,i,idx);
//           MinHeapify(a,i,size);
//       }
//    }
//    public static int extractMin(int []arr,int size){
//       if(size==0){
//           System.out.println(Integer.MIN_VALUE);
//           return 0;
//       }
//       if(size==1){
//           System.out.println(arr[0]);
//           size--;
//           return size;
//       }
//       System.out.println(arr[0]);
//       swap(arr,0,size-1);
//       size--;
//       MinHeapify(arr,0,size);
//       return size;
//    }
//    public static void decreaseKey(int[]arr,int i){
//       arr[i]=Integer.MIN_VALUE;
//       minHeapify(arr,i);
//    }
//    public static int deleteKey(int []arr,int i,int size){
//        System.out.println(arr[i]);
//        decreaseKey(arr,i);
//        return extractMin(arr,size);
//    }
//    public static void buildHeap(int []arr,int size){
//       for (int i=(size-2)/2;i>=0;i--){
//           MinHeapify(arr,i,size);
//       }
//    }
//
//    public static void maxHeapify(int[]arr,int i,int size){
//       int lc=2*i+1;
//       int rc=2*i+2;
//       int parent=i;
//       if(lc<size && arr[lc]>arr[parent])parent=lc;
//       if(rc<size && arr[rc]>arr[parent])parent=rc;
//       if(parent!=i){
//           swap(arr,i,parent);
//           maxHeapify(arr,parent,size);
//       }
//    }
//    public static void buildMaxHeap(int[]arr,int size){
//       for (int i=(size-2)/2;i>=0;i--){
//           maxHeapify(arr,i,size);
//       }
//    }
//    public static void heapSort(int []arr,int size){
//       buildMaxHeap(arr,size);
//       for (int i=size-1;i>0;i--){
//           swap(arr,i,0);
//           size--;
//           maxHeapify(arr,0,size);
//       }
//    }
//    public static void main(String[] args) {
//       practicedsa p=new practicedsa();
//        minheap mh=new minheap(7);
//        int s=p.insertInMinHeap(2, mh.size, mh.capacity, mh.arr);
//            s=p.insertInMinHeap(12, s, mh.capacity, mh.arr);
//            s=p.insertInMinHeap(8,  s, mh.capacity, mh.arr);
//            s=p.insertInMinHeap(3,  s, mh.capacity, mh.arr);
//            s=p.insertInMinHeap(6,  s, mh.capacity, mh.arr);
//            s=p.insertInMinHeap(9,  s, mh.capacity, mh.arr);
//            s=p.insertInMinHeap(52, s, mh.capacity, mh.arr);
//        for (int e: mh.arr){
//            System.out.print(e+" ");
//        }
//        System.out.println();
//        int []a={40,20,30,35,25,80,32,100,70,60};
//        s=deleteKey(mh.arr,3,s);
//        for (int e: mh.arr){
//            System.out.print(e+" ");
//        }
//        System.out.println();
//        int[]arr={4,3,5,0,3,8};
//        buildHeap(arr,s);
//        for (int e:arr){
//            System.out.print(e+" ");
//        }
//
//        int []heapsort={4,32,8,1,6,3};
//        heapSort(heapsort,6);
//        System.out.println();
//        for (int e:heapsort){
//            System.out.print(e+" ");
//        }
//    }
//}


import java.util.PriorityQueue;

public class practicedsa {
    public static void main(String[] args) {
        int klargest=6;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int[]arr={8,5,2,6,4,98,3,1};
        for (int i=0;i<arr.length;i++){
            if(pq.size()<klargest) pq.add(arr[i]);
            else if(pq.size()==klargest && arr[i]>=pq.peek()){
                pq.add(arr[i]);
                pq.poll();
            }
        }
        System.out.println(pq.poll());
    }
}