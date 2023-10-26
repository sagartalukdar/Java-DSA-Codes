package javadsasys_design;

//tiles question(size of tiles 2*n)
//public class backtracking {
//    public static int putways(int n){
////       if (n==1||n==2||n==3){
////          return n;
////        }
//        if (n<=3){
//            return n;
//        }
//        return putways(n-1)+putways(n-2);
//    }
//    public static void main(String[] args) {
//        System.out.println(putways(2));
//    }
//}

//import java.util.ArrayList;
//
////subset
//public class backtracking {
//    public static void subset(int[]array,int i,ArrayList<Integer> arr){
//        if (i==array.length){
//            System.out.println(arr);
//            return;
//        }
//        subset(array,i+1,arr);
//        arr.add(array[i]);
//        subset(array,i+1,arr);
//        arr.remove(arr.size()-1);
//    }
//    public static void main(String[] args) {
//        int[]arr={1,2,3};
//        subset(arr,0,new ArrayList<>());
//    }
//}

//import java.util.Arrays;
//
////permutation
//public class backtracking {
//    public static void swap(int []arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void permutation(int[]arr,int i){
//        if (i==arr.length-1){
//            System.out.println(Arrays.toString(arr));
//            return;
//        }
//       for (int idx=i;idx<arr.length;idx++){
//           swap(arr,idx,i);
//           permutation(arr,i+1);
//           swap(arr,idx,i);
//       }
//    }
//    public static void main(String[] args) {
//       int[]arr={1,2,3};
//       permutation(arr,0);
//    }
//}

//rat in maze

//public class backtracking {
//    public static void ratinmaze(int[][]arr, int [][]ref_arr, int i, int j, String ans){
//        if (arr[arr.length-1][arr[0].length-1]==0||arr[0][0]==0){
//            return ;
//        }
//        if (i==arr.length-1&&j==arr[0].length-1){
//            System.out.println(ans);
//            return ;
//        }
//        if (i+1<arr.length && arr[i+1][j]==1 && ref_arr[i+1][j]==0){
//            ref_arr[i][j]=1;
//            ratinmaze(arr,ref_arr,i+1,j,ans+"D");
//            ref_arr[i][j]=0;
//        }
//        if (j-1>=0&&arr[i][j-1]==1&&ref_arr[i][j-1]==0){
//            ref_arr[i][j]=1;
//            ratinmaze(arr,ref_arr,i,j-1,ans+"L");
//            ref_arr[i][j]=0;
//        }
//        if (j+1<arr[0].length&& arr[i][j+1]==1&&ref_arr[i][j+1]==0){
//            ref_arr[i][j]=1;
//            ratinmaze(arr,ref_arr,i,j+1,ans+"R");
//            ref_arr[i][j]=0;
//        }
//
//        if (i-1>=0&&arr[i-1][j]==1&&ref_arr[i-1][j]==0){
//            ref_arr[i][j]=1;
//            ratinmaze(arr,ref_arr,i-1,j,ans+"u");
//           ref_arr[i][j]=0;
//        }
//    }
//    public static void main(String[] args) {
//  int arr[][]={{1,0,0,0},
//          {1,1,0,1},
//          {1,1,0,0},
//          {0,1,1,1}};
//  int ref_arr[][]={{0,0,0,0},
//          {0,0,0,0},
//          {0,0,0,0},
//          {0,0,0,0}};
//        ratinmaze(arr,ref_arr,0,0,"");
//    }
//}
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
////n queens
//public class backtracking {
//    public static boolean safe(char[][] a,int row ,int col){
//        int r=row,c=col;
//        while (row>=0&&col>=0){
//            if (a[row][col]=='q'){
//                return false;
//            }row--;
//            col--;
//        }
//        row=r;
//        col=c;
//        while (col>=0){
//            if (a[row][col]=='q'){
//                return false;
//            }
//            col--;
//        }
//        row=r;
//        col=c;
//        while (row<=a.length-1&&col>=0){
//            if (a[row][col]=='q'){
//                return false;
//            }
//            row++;
//            col--;
//        }return true;
//    }
//    public static void nqueens(char[][]arr,List<List<String>> lls,int col){
//        if (col==arr.length){
//            lls.add(lilist(arr));
//            return;
//        }
//        for (int row=0;row<arr[0].length;row++){
//            if (safe(arr,row,col)) {
//                arr[row][col]='q';
//                nqueens(arr,lls,col+1);
//                arr[row][col]='-';
//            }
//        }
//    }
//    public static List<String > lilist(char[][]arr){
//        List<String>l=new LinkedList<>();
//        for (int i=0;i<arr.length;i++){
//            String s= String.valueOf(arr[i]);
//            l.add(s);
//        }
//        return l;
//    }
//
//    public static List<List<String>> print(int n){
//        char[][]arr=new char[n][n];
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[0].length;j++){
//                arr[i][j]='-';
//            }
//        }
//
//        List<List<String >> l=new ArrayList<List<String>>();
//        nqueens(arr,l,0);
//        return l;
//    }
//    public static void main(String[] args) {
//        int n=4;
//        List<List<String >> l=print(n);
//        for (List<String >a:l){
//            for (String e:a){
//                System.out.println(e+" ");
//            }
//            System.out.println();
//        }
//    }
//}


//                    practice nqueens


//                    practice nqueens

//public class backtracking {
//    public static void printSolution(int[][] board, int n)
//    {
//        for(int i=0; i<n; i++)
//        {
//            for(int j=0; j<n; j++)
//            {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static boolean isSafe(int[][] board, int row, int column, int n)
//    {
//        int i, j;
//
//        // Check this row on left side
//        for (i = 0; i < column; i++)
//            if (board[row][i] == 1)
//                return false;
//
//        // Check upper diagonal on left side
//        for (i = row, j = column; i >= 0 && j >= 0; i--, j--)
//            if (board[i][j] == 1)
//                return false;
//
//        // Check lower diagonal on left side
//        for (i = row, j = column; j >= 0 && i < n; i++, j--)
//            if (board[i][j] == 1)
//                return false;
//
//        return true;
//    }
//
//    //function to solve n Queen problem
//    static boolean solvenQueen(int board[][], int column, int n)
//    {
//        /*
//         * Base case - if all the queens have got placed then return true
//         * */
//        if (column >= n)
//        {
//            return true;
//        }
//
//        //consider this column and try placing all the queens one by one in all the rows
//        for (int i = 0; i < n; i++) {
//            //check if it is safe to place the queen or not
//            if (isSafe(board, i, column, n)) {
//                //place the queen in the board
//                board[i][column] = 1;
//
//                //recursive call for remaining queens
//                if (solvenQueen(board, column + 1, n) == true) {
//                    return true;
//                }
//
//                //if placing the queen does not lead to solution then backtrack
//                board[i][column] = 0;
//            }
//        }
//
//        //if it is not possible to place the queen in any row of the given column then return false
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int[][]  board = {{0, 0, 0, 0},
//                {0, 0, 0, 0},
//                {0, 0, 0, 0},
//                {0, 0, 0, 0}};
//
//        if (solvenQueen(board, 0, board.length) == true) {
//            printSolution(board, board.length);
//        }
//        else {
//            System.out.print("Solution does not exist");
//        }
//    }
//}
//

//nqueen pw approach
//
//public class backtracking {
//    public static void print(char[][]arr){
//        for (char[]c:arr){
//            for (char e:c){
//                System.out.print(e+" ");
//            }
//            System.out.println();
//        }
//    }
//    public static boolean issafe(char[][]arr,int row,int col){
//        for (int i=row,j=col;i>=0&&j>=0;i--,j--){
//            if (arr[i][j]=='q'){
//                return false;
//            }
//        }
//        for (int i=col;i>=0;i--){
//            if (arr[row][i]=='q'){
//                return false;
//            }
//        }
//        for (int i=row,j=col;i<arr.length&&j>=0;i++,j--){
//            if (arr[i][j]=='q'){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean nqueens(char[][]arr,int col){
//        if (col== arr.length){
//            return true;
//        }
//        for (int row=0;row<arr.length;row++) {
//            if (issafe(arr, row, col) == true) {
//                arr[row][col] = 'q';
//
//                if (nqueens(arr, col + 1) == true) {
//                    return true;
//                }
//
//                arr[row][col] = '-';
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        char[][]arr={{'-','-','-','-'},
//                {'-','-','-','-'},
//                {'-','-','-','-'},
//                {'-','-','-','-'}};
//        if (nqueens(arr,0)){
//            print(arr);
//        }else {
//            System.out.println("  ");
//        }
//    }
//}

//suduko solve
//
//public class backtracking {
//    public static boolean valid(int [][]arr,int row,int col,int num){
//        for (int i=0;i<arr[0].length;i++){
//            if (arr[row][i]==num){
//             return false;
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            if (arr[i][col]==num){
//                return false;
//            }
//        }
//        int submi=row/3*3;
//        int submj=col/3*3;
//        for (int i =submi;i<submi+3;i++){
//            for (int j=submj;j<submj+3;j++){
//                if (arr[i][j]==num){
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }
//    public static void print(int[][]arr){
//        for (int[]a:arr){
//            for (int e:a){
//                System.out.print(e+" ");
//            }
//            System.out.println();
//        }
//    }
//    public static void sudukosolve(int[][]arr,int row,int col){
//        if (row== arr.length){
//            print(arr);
//            return;
//        }
//        int ni=0,nj=0;
//        if (col== arr[0].length-1){
//            ni=row+1;
//            nj=0;
//        }else {
//            ni=row;
//            nj=col+1;
//        }
//        if (arr[row][col]!=0){
//             sudukosolve(arr,ni,nj);
//         }else {
//             for (int i=1;i<=9;i++){
//                 if(valid(arr,row,col,i)){
//                     arr[row][col]=i;
//                     sudukosolve(arr,ni,nj);
//                     arr[row][col]=0;
//                 }
//             }
//         }
//    }
//    public static void main(String[] args) {
//        int [][]arr={{3,0,6,5,0,8,4,0,0},
//                {5,2,0,0,0,0,0,0,0},
//                {0,8,7,0,0,0,0,3,1},
//                {0,0,3,0,1,0,0,8,0},
//                {9,0,0,8,6,3,0,0,5},
//                {0,5,0,0,9,0,6,0,0},
//                {1,3,0,0,0,0,2,5,0},
//                {0,0,0,0,0,0,0,7,4},
//                {0,0,5,2,0,6,3,0,0}};
//        sudukosolve(arr,0,0);
//    }
//}

//backtracking assignments

//1.
//public class backtracking {
//    public static boolean subSetEqualSum(int []arr,int[]vis,int start,int sum,int target,int k){
//        if (k==1){
//            return true;
//        }if (sum>target){
//            return false;
//        }if (sum==target){
//           return subSetEqualSum(arr,vis,0,0,target,k-1);
//        }
//        for (int i=0;i<arr.length;i++){
//            if (vis[i]==-1){
//                vis[i]=1;
//               if ( subSetEqualSum(arr,vis,i+1,sum+vis[i],target,k)==true) return true;
//                vis[i]=-1;
//            }
//        }
//        return false;
//    }
//    public static boolean partition(int[]arr,int k){
//        int []vis=new int[arr.length];
//        int sum=0;
//        for (int i=0;i<arr.length;i++){
//            sum+=arr[i];
//            vis[i]=-1;
//        }
//        if (sum%k!=0){
//            return false;
//        }else {
//            return subSetEqualSum(arr,vis,0,0,sum/k,k);
//        }
//    }
//    public static void main(String[] args) {
//        int[]arr={1,3,1,1};
//        int k=2;
//        System.out.println(partition(arr,2));
//    }
//}
//2.
//public class backtracking {
//    public static void swap(char[]a,int i,int j){
//   char temp=a[i];
//   a[i]=a[j];
//   a[j]=temp;
//    }
//    public static void permutation(char[]a,int fixedidx){
//        if (fixedidx==a.length-1){
//            System.out.println(a);
//            return;
//        }
//        for (int i=fixedidx;i<a.length;i++){
//           swap(a,fixedidx,i);
//           permutation(a,fixedidx+1);
//           swap(a,fixedidx,i);
//        }
//    }
//    public static void main(String[] args) {
//        char[]c={'1','2','3'};
//      permutation(c,0);
//    }
//}

import java.util.*;
//pw approach to print permutation of an array
//permutation from an array which cotains distinct elements (distinct==unique)
//public class backtracking {
//    public static void pwpermutation(List<List<Integer>>li,List<Integer>l,int[]arr){
//     if (l.size()==arr.length){
//         li.add(new ArrayList<>());
//         return;
//     }
//        for (int i=0;i<arr.length;i++){
//            if (l.contains(arr[i])){
//                continue;
//            }
//            l.add(arr[i]);
//           pwpermutation(li,l,arr);
//            l.remove(l.size()-1);
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3};
//        List<List<Integer>> li = new ArrayList<>();
//        List<Integer> l = new ArrayList<>();
//        pwpermutation(li, l, arr);
//        System.out.println(li);
//        for (List<Integer> le : li) {
//            System.out.print(le + " ");
//        }
//        System.out.println();
//    }
//
//    }


//pw question sebset sum=target,where in each subset can contain one int many time
//public class backtracking {
//    public static void subsetsum(int[]arr,int start,List<Integer>l,List<List<Integer>>ll,int target){
//        if (target<0){
//          return;
//        }
//        if (target==0) {
//            ll.add(new ArrayList<>(l));
//            return;
//        }
//    for (int i=start;i<arr.length;i++){
//        l.add(arr[i]);
//        subsetsum(arr,i,l,ll,target-arr[i]);
//        l.remove(l.size()-1);
//    }
//    }
//    public static void main(String[] args) {
//        int []arr={2,3,6,7};
//        List<List<Integer>>ll=new ArrayList<>();
//        List<Integer>l=new ArrayList<>();
//        subsetsum(arr,0,l,ll,7);
//        System.out.println(ll);
//    }
//}

//ood occurence founding with the help of bitwise opererator
//public class backtracking {
//    public static void main(String[] args) {
//    int xor=0;
//    int[]arr={1,2,4,2,5,1,4};
//    for (int e:arr){
//        xor=xor^e;
//    }
//        System.out.println(xor);
//    }
//    }


//unique permutation

//public class backtracking {
//    public static void swap(int[]arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void uniquepermutation(int[]arr,boolean[]used,int start){
//        if (start==arr.length-1){
//            System.out.println(Arrays.toString(arr));
//            return;
//        }
//        for (int i=start;i<arr.length;i++){
//      if (used[i]==true)continue;
//      if (i>0&&arr[i-1]==arr[i]&& !used[i-1])continue;
//        used[i]=true;
//        swap(arr,start,i);
//        uniquepermutation(arr,used,start+1);
//        used[i]=false;
//        swap(arr,start,i);
//        }
//    }
//    public static void main(String[] args) {
//        int[]arr={1,1,2};
//        boolean[]used=new boolean[arr.length];
//        uniquepermutation(arr,used,0);
//    }
//}

//check if the product of some subset of an array is equal to the target values

//          *******  wrong  **********
//          ***     wrong    ***
//public class backtracking {
//    public static void checksubset(int[]arr,int i,int mul,int target,List<List<Integer>>ll,List<Integer>l){
//        if (mul>target){
//            return;
//        }
//        if (mul==target) {
//            ll.add(new ArrayList<>(l));
//            return;
//        }
//        for (int e=i;e<arr.length;e++) {
//            mul *= arr[i];
//            l.add(arr[i]);
//            checksubset(arr, i + 1, mul, target, ll, l);
//            mul /= arr[i];
//            l.remove(l.size() - 1);
//        }
//    }
//    public static void main(String[] args) {
//        int[]arr={2,3,5,4};
//        List<List<Integer>>ll=new ArrayList<>();
//        List<Integer>l=new ArrayList<>();
//        checksubset(arr,0,1,40,ll,l);
//        System.out.println(ll);
//    }
//}

//public class backtracking {
//    public static boolean check(int arr[],int start,int target,int mul){
//        if (mul>target){
//            return false;
//        }
//        if (mul==target){
//            return true;
//        }
//        if (start==arr.length){
//            return false;
//        }
//       for (int i=start;i<arr.length;i++){
//          if (check(arr,i+1,target,mul*arr[i]))return true;
//       }
//       return false;
//    }
//    public static void main(String[] args) {
//        int []arr={2,2,3,4,5};
//        System.out.println(check(arr,0,16,1));
//    }
//}

//nqueens


