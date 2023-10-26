package javadsasys_design;
//power of num normal approach*********
//public class recursion {
//    public static int power(int base,int power){
//        if (base==0||base==1){
//            return base;
//        }
//        if (power==1){
//            return base;
//        }
//        int ans=base*power(base,power-1);
//        //recursive fuction call here this num of times which is ==power
//        //if base 4,power 7,function will called  7 time
//        //time complexity=o(power) means o(n);
//        //if n will be a very big num then it takes lots of time bellow
//        //have a optimized aproach!
//        return ans;
//    }
//    public static void main(String[] args) {
//        System.out.println(power(19,1));
//    }
//}

//optimized aproach of power of a num***
//public class recursion {
//    public static long powerofnum(int base,int power){
//        if (base==0||base==1){
//            return base;
//        }
//        if (power==1){
//            return base;
//        }else {
//           long ans=powerofnum(base,power/2);
//   if (power%2!=0){
//               return base*ans*ans;
//           }else {
//               return ans * ans;
//           }
//    /*we divide the power by 2 and try to find the value base^power
//            and then again divide the power by 2 and so on finaly
//            when power==1 then return base ,from there to upper level
//            return value*value because we calculate only on side of
//            base^power .continueusly return as it
//            at the top level we check if the power %2==0 then return final
//            value *value if power%2!=0 then return base*value*value
//            *base* is extra here because it reduce at the first level
//            when we divide power/2
//     */
//
//
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println(powerofnum(2,55));
//    }
//}

//stair jumps ways(at a time you take 1 or 2 stairs maximum)**************
//public class recursion {
//    //0 based indexing
//    public static int stairways(int totalstairs){
//        if (totalstairs==0||totalstairs==1){
//            return totalstairs+1;
//        }
//        int ans=stairways(totalstairs-1)+stairways(totalstairs-2);
//        return ans;
//    }
//    public static void main(String[] args) {
//        System.out.println(stairways(4));
//    }
//}

//stair jumps ways(at a time you take 1 or 2 stairs maximum)**************
//public class recursion {
//    //1 based indexing
//    public static int stairsways(int totlstairs){
//        if (totlstairs==1||totlstairs==2||totlstairs==3){
//            return totlstairs;
//        }
//        int ans=stairsways(totlstairs-1)+stairsways(totlstairs-2);
//        return ans;
//    }
//    public static void main(String[] args) {
//        System.out.println(stairsways(4));
//    }
//}

//import java.util.Scanner;
//
////stair jumps ways(at a time you take 1 or 2 stairs maximum)**************
//public class recursion {
//    //as compare with fibonacci series
//    public static int stairways(int totalways){
//        if (totalways==0||totalways==1){
//            return totalways;
//        }
//        int ans=stairways(totalways-1)+stairways(totalways-2);
//        return ans;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter n:");
//        int n=sc.nextInt();
//        System.out.println(stairways(n+1));
//    }
//}

//print 1 to n numbers(n will be inserted)
//public class recursion {
//    public static void printn(int n){
//        if (n==1){
//            System.out.println(n);
//            return ;
//        }
//        printn(n-1);
//        System.out.println(n);
//    }
//    public static void main(String[] args) {
//        printn(5);
//    }
//}

//print 1 to n numbers(n will be inserted)
//public class recursion {
//    public static void print(int n){
//        if (n==1){
//            System.out.println(n);
//            return;
//        }
//        System.out.println(n);
//        print(n-1);
//    }
//    public static void main(String[] args) {
//        print(5);
//    }
//}

//digits from a num,counts,printing,sum
//public class recursion {
//    //printing sum of those digits
//    public static int digit(int n){
//        int sum;
//        if (n>=0&&n<10){
//            return n;
//        }
//        sum=digit(n/10)+n%10;
//        return sum;
//    }
//    public static void main(String[] args) {
//        System.out.println(digit(1024));
//    }
//}


////given a and b print first multiply of a from 1 to b********
//public class recursion {
//    public static void printaxb(int a,int b){
//        if (a==0){
//            System.out.println(0);
//            return;
//        }
//        if (b==1){
//            System.out.println(a);
//            return;
//        }
//        printaxb(a, b - 1);
//        System.out.println(a * b);
//    }
//    public static void main(String[] args) {
//        printaxb(4,5);
//    }
//}

//alternative sum***********
//public class recursion {
//    public static int altersum(int n){
//        int sum;
//        if (n==1){
//            return n;
//        }
//        if (n%2==0){
//           sum=altersum(n-1)-n;
//        }else {
//          sum= altersum(n - 1) + n;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        System.out.println(altersum(5));
//    }
//}

//lcm and gcd
//public class recursion {
//    public static void gcd(int a,int b) {
//     while (a%b!=0){
//         a=b;
//         b=a%b;
//     }
//     if (a%b==0){
//         System.out.println(b);
//     }
//
//    }
//    public static void main(String[] args) {
//        gcd(65,6);
//    }
//}

//public class recursion {
//    public static int gcd(int a,int b){
//        if (b%a==0){
//            return a;
//        }
//       return gcd(b%a,a);
//    }
//    public static void main(String[] args) {
//        System.out.println(gcd(14,2));
//    }
//}

//public class recursion {//when b divided by a *********
//    public static int  gcd(int a,int b){
//        if (b%a==0){
//            return a;
//        }
//       return gcd(b%a,a);
//    }
//    public static void main(String[] args) {
//        System.out.println(gcd(4,15));
//    }
//}

//public class recursion {
//    public static int gcd(int a,int b){//when a divided by b ***
//        if (b==0){
//            return a;
//        }
//         return gcd(b,a%b);
//    }
//    public static void main(String[] args) {
//        System.out.println(gcd(3,8));
//    }
//}


//array printing ***************

//public class recursion {
//    public static void arrayprinting(int []arr,int i){
////        if (i==arr.length-1){
////            System.out.println(arr[i]);
////            return;
////        }
//        if (i==arr.length){
//            return ;
//        }
//        System.out.println(arr[i]);
//        arrayprinting(arr,i+1) ;
//
//    }
//    public static void main(String[] args) {
//        int []arr={4,8,2,4,5,1};
//        arrayprinting(arr,0);
//    }
//}

//array elements sum ******

//public class recursion {
//    public static int arraysum(int[]arr,int i){
//        if (i==arr.length){
//            return 0;
//        }
//        return arr[i]+arraysum(arr,i+1);
//    }
//    public static void main(String[] args) {
//        int []arr={};
//        System.out.println(arraysum(arr,0));
//
//    }
//}

//array max ***********

//public class recursion {
//    public static int arraymax(int []arr,int i){
//        int max;
//        if (i==arr.length-1){
//            return arr[i];
//        }
//     max= arraymax(arr,i+1);
//        if (arr[i]>max){
//            max=arr[i];
//        }
//      return max;
//    }
//    public static void main(String[] args) {
//       int []arr={4,8,5,1,2};
//        System.out.println(arraymax(arr,0));
//    }
//}

//finding target elements in an array by recursion
//public class recursion {
//    public static boolean targetele(int []arr,int target,int i){
//        if (i==arr.length){
//            return false;
//        }
//        if (arr[i]==target){
//            return true;
//        }
//        return targetele(arr,target,i+1);
//    }
//    public static void main(String[] args) {
//        int[]arr={4,2,84,01,2};
//        System.out.println(targetele(arr,20,0));
//    }
//}

//finding target element's all indexs in an array by recursion
//
//public class recursion {
//    public static void targetele(int []arr,int target,int i){
//        if (i==arr.length){
//            return ;
//        }
//        if (arr[i]==target){
//            System.out.println(i);
//        }
//       targetele(arr,target,i+1);
//    }
//    public static void main(String[] args) {
//        int[]arr={4,52,1,7,32,1,0};
////        System.out.println(targetele(arr,1,0));
//        targetele(arr,1,0);
//    }
//}


//finding target element's first indexs in an array by recursion
//
//public class recursion {
//    public static int  targetele(int []arr,int target,int i){
//        if (i==arr.length){
//            return -1;
//        }
//        if (arr[i]==target){
//            return i;
//        }
//       return targetele(arr,target,i+1);
//    }
//    public static void main(String[] args) {
//        int[]arr={4,52,1,7,32,1,0};
//    System.out.println(targetele(arr,1,0));
//    }
//}

//printing arraylist of those indexes which are equals to target elements

//import java.util.ArrayList;
//
//public class recursion {
//    public static ArrayList targetele(int []arr,int target,int i){
//        ArrayList<Integer>al=new ArrayList<>();
//        if (i==arr.length){
//            return al;
//        } if (arr[i]==target){
//            al.add(i);
//        }
//       ArrayList<Integer> al1=targetele(arr,target,i+1);
//         al.addAll(al1);
//         return al1;
//    }
//    public static void main(String[] args) {
//        int []arr={4,2,51,32,7,2,963,2};
//        System.out.println(targetele(arr,2,0));
//    }
//}

//check the array sorted or not using recursion
//public class recursion {
//    public static boolean issorted(int[]arr,int i){
//        boolean flag=true;
//        if (i==arr.length-1){
//            return true;
//        }
//       if (arr[i]<arr[i+1]){
//           flag=false;
//       }
//       if (flag==true){
//           return false;
//       }
//        return issorted(arr,i+1);
//    }
//    public static void main(String[] args) {
//        int[]arr={4,50,6};
//        if (issorted(arr,0)){
//            System.out.println(" sorted");
//        }else {
//            System.out.println(" not sorted");
//        }
//
//    }
//}

//last index of target

//public class recursion {
//    public static int lastidx(int arr[],int target,int i){
//        if (i==0){
//            return -1;
//        }
//        if (arr[i]==target){
//            return i;
//        }
//       return lastidx(arr,target,i-1);
//    }
//    public static void main(String[] args) {
//        int []arr={4,2,2,8,1,3,7};
//        System.out.println(lastidx(arr,2,arr.length-1));
//    }
//}

//remove the element from string

//import java.util.Scanner;
//
//public class recursion {
//    public static String remove_ele(String s,char a,int i){
//        if (i==s.length()){
//            return "";
//        }
//        char c=s.charAt(i);
//        if (c!=a){
//           return c+remove_ele(s,a,i+1);
//        }else {
//            return remove_ele(s,a,i+1);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        System.out.println(remove_ele(s,'a',0));
//    }
//}


/*
time complexity of both remove-ele function is o(n^2) because for each charecter
 itretion runs n time and if in each  itretion will have cancatination
 which run n time so total t(n)=o(n^2)
 */

//remove element from the string
//import java.util.Scanner;
//public class recursion {
//    public static String remove_ele(String s){
//        if (s.length()==0){
//            return "";
//        }
//        char c=s.charAt(0);
//        String ss=remove_ele(s.substring(1));
//        if (c!='a'){
//            return c+ss;
//        }else {
//            return ss;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        System.out.println(remove_ele(s));
//    }
//}

//reverse function
//1.
//public class recursion {
//    public static String reverse(String s,int i){
//     if (i==s.length()){
//         return "";
//     }
//     char c=s.charAt(i);
//      String ss= reverse(s,i+1);
//      return ss+c;
//    }
//    public static void main(String[] args) {
//        String s="sagar";
//        System.out.println(reverse(s,0));
//    }
//}
//2.
//public class recursion {
//    public static String reverse(String s){
//        if (s.length()==0){
//            return "";
//        }
//        char c=s.charAt(0);
//        return reverse(s.substring(1))+c;
//    }
//    public static void main(String[] args) {
//        String s="sagar";
//        System.out.println(reverse(s));
//    }
//}

//palindrome
//1.
//public class recursion {
//    public static String palindrome(String s){
//        if (s.length()==0){
//            return "";
//        }
//        char c=s.charAt(0);
//        return palindrome(s.substring(1))+c;
//    }
//    public static void main(String[] args) {
//        String s="leveel";
//        String rs=palindrome(s);
//        if (rs.equals(s)){
//            System.out.println("palindrome");
//        }else {
//            System.out.println("not palindrome");
//        }
//    }
//}
//2.
//public class recursion {
//    public static boolean palindrome(String s,int start,int end){
//        if (start==end){
//            return true;
//        }
//       if (s.charAt(start)==s.charAt(end)){
//          return palindrome(s,start+1,end-1);
//       }
//       return false;
//    }
//    public static void main(String[] args) {
//        String s="leveel";
//        System.out.println(palindrome(s,0,s.length()-1));
//    }
//}



//subsequences of a string
//1. print in arraylist
//import java.util.ArrayList;
//public class recursion {
//    public static ArrayList<String> subsequences(String s){
//        ArrayList<String >al=new ArrayList<>();
//        if (s.length()==0){
//            al.add("");
//            return al;
//        }
//        char c=s.charAt(0);
//        ArrayList<String> na=subsequences(s.substring(1));
//        for (String e:na){
//           al.add(e);
//           al.add(c+e);
//        }
//        return al;
//    }
//    public static void main(String[] args) {
//        System.out.println(subsequences("abc"));
//    }
//}
//2.print without arraylist
//public class recursion {
//    public static void subsequences(String s,String current) {
//        if (s.length()==0){
//            System.out.println(current);
//            return;
//        }
//        char c=s.charAt(0);
//        String ns=s.substring(1);
//        subsequences(ns,current+c);
//        subsequences(ns,current);
//
//    }
//    public static void main(String[] args) {
//        subsequences("abc"," ");
//    }
//}

//subset sum of an array
//public class recursion {
//    public static void subsetsum(int []arr,int i,int currentsum){
//        if (i==arr.length){
//            System.out.println(currentsum);
//            return;
//        }
//        subsetsum(arr,i+1,currentsum+arr[i]);
//        subsetsum(arr,i+1,currentsum);
//    }
//    public static void main(String[] args) {
//        int []arr={1,2,3};
//        subsetsum(arr,0,0);
//    }
//}

//frog jump
//public class recursion {
//    public static int frogjump(int []arr,int i){
//        if (i==arr.length-1){
//            return 0;
//        }
//        int one=frogjump(arr,i+1)+Math.abs(arr[i+1]-arr[i]);
//        if (i==arr.length-2){
//            return one;
//        }
//        int second=frogjump(arr,i+2)+Math.abs(arr[i+2]-arr[i]);
//       return Math.min(one,second);
//    }
//    public static void main(String[] args) {
//        int []arr={10,30,40,20};
//        System.out.println(frogjump(arr,0));
//    }
//}

//ascii code
//public class recursion {
//    public static void ascii(String s,String []kp,String ans){
//        if (s.length()==0){
//            System.out.println(ans);
//            return ;
//        }
//         int c=s.charAt(0)-'0';
//         String cs=kp[c];
//         for (int i=0;i<cs.length();i++){
//             ascii(s.substring(1), kp, ans+cs.charAt(i));
//         }
//
//    }
//    public static void main(String[] args) {
//     String s="23";
//     String  []kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//     ascii(s,kp,"");
//    }
//}


//recursion assignments problem
//1.
//public class recursion {
//    public static int digitsum(int digit){
//        if (digit==0){
//            return 0;
//        }
//        int sum=digit%10;
//        return digitsum(digit/10)+sum;
//    }
//    public static void main(String[] args) {
//      int digit=12345;
//        System.out.println(digitsum(digit));
//    }
//}
//2.
//public class recursion {
//    public static int altersum(int n){
//        if (n==1){
//            return 1;
//        }
//        if (n%2==0){
//            return altersum(n-1)-n;
//        }else {
//           return altersum(n-1)+n;
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println(altersum(5));
//    }
//}
//3.
//public class recursion {
//    public static int max(int[]arr, int i){
//        int max=Integer.MIN_VALUE;
//        if (i==arr.length){
//            return max;
//        }
//        if (arr[i]>max){
//            max=arr[i];
//        }
//        int ans=max(arr,i+1);
//        if (max<ans){
//            return ans;
//        }else {
//            return max;
//        }
//    }
//    public static void main(String[] args) {
//        int[]arr={11,1,-3,2,5};
//        System.out.println(max(arr,0));
//    }
//}
//4.
//public class recursion {
//    public static int sum(int []arr,int i){
//        if (i==arr.length){
//            return 0;
//        }
//       return sum(arr,i+1)+arr[i];
//    }
//    public static void main(String[] args) {
//int []arr={1,2,3};
//        System.out.println(sum(arr,0));
//    }
//}
//5.armstrong
//public class recursion {
//    public static int amstrong(int digit){
//        if (digit==0){
//            return 0;
//        }
//        int store=digit%10;
//     int mul=store*store*store;
//        return amstrong(digit/10)+mul;
//    }
//    public static void main(String[] args) {
//        int temp=amstrong(153);
//        if (temp==153){
//            System.out.println("amstrong");
//        }else {
//            System.out.println("non amstrong");
//        }
//    }
//}
//6.armstrong for any length of digit
//public class recursion {
//    public static int count(int n){
//        if (n==0){
//            return 0;
//        }
//        return count(n/10)+1;
//    }
//    public static int armstrong(int n){
//        if (n==0){
//            return 0;
//        }  int count=count(153);
//        int digit=n%10;
//        int mul=1;
//        for (int i=0;i<count;i++){
//            mul*=digit;
//        }
//        return armstrong(n/10)+mul;
//    }    public static void main(String[] args) {
//        int n=154;
//        int box=armstrong(n);
//        if (box==n){
//            System.out.println("armstrong");
//        }else {
//            System.out.println("non armstrong");
//        }
//    }
//}


//problem which has a best approach to pass all test cases int->long/biginteger

//import java.math.BigInteger;
//
//public class recursion {
//    public static BigInteger powerofN(BigInteger n,int p){//we take biginteger instead of int
//        if (p==1){
//            return n;
//        }
//       BigInteger ans= powerofN(n,p/2);
//                                        /*to multiply in Biginteger we have to
//                                        write= .multiply(n) ,n is the number
//                                         that we want to multiply */
//       if (p%2==0){
//       return ans.multiply(ans);
//        }else {
//            return ans.multiply(ans).multiply(n);
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println(powerofN(BigInteger.valueOf(4),3));
//    }
//}

//binary search with recursion

//public class recursion {
//    public static int findtarget(int[]arr,int target,int start,int end){
//        if (start>end){
//           return -1;
//        }
//    int mid=start+(end-start)/2;
//    if (arr[mid]==target){
//        return mid;
//    } else if (arr[mid]>target) {
//        return findtarget(arr,target,start,mid-1);
//    }else {
//      return findtarget(arr,target,mid+1,end);
//    }
//    }
//    public static void main(String[] args) {
//       int []arr={2,4,6,7,8};
//        System.out.println(findtarget(arr,69,0,arr.length-1));
//    }
//}

//leetcode problem

//public class recursion {
//    public static boolean target(int[][]arr,int target){
//        int row=arr.length;
//        int col=arr[0].length;
//        int low=0,high=row*col-1;
//        while (low<=high){
//            int mid=low+(high-low)/2;
//            if (arr[mid/row][mid%row]==target){
//                 return true;
//            } else if (arr[mid/row][mid%row]>target) {
//                high=mid-1;
//            }else {
//                low=mid+1;
//            }
//        }
//        return false;
//
//    }
//    public static void main(String[] args) {
//        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(target(arr,52));
//    }
//}

//balanced paranthesis
//public class recursion {
//    public static void balancedparanthesis(int paranthesis_pair,
//                                           int open_paranthesis,
//                                           int close_paranthesis,String ans){
//        if (open_paranthesis==paranthesis_pair&&close_paranthesis==paranthesis_pair){
//            System.out.println(ans);
//            return;
//        }
//        if (open_paranthesis<paranthesis_pair){
//            balancedparanthesis(paranthesis_pair,open_paranthesis+1,close_paranthesis,ans+"(");
//        }
//        if (open_paranthesis>close_paranthesis){
//            balancedparanthesis(paranthesis_pair,open_paranthesis,close_paranthesis+1,ans+")");
//        }
//
//    }
//    public static void main(String[] args) {
//    balancedparanthesis(3,0,0,"");
//    }
//}

//dice path
//public class recursion {
//    public static void dicepath(int start,int destination,String path){
//        if (start>destination){
//            return;
//        }
//        if (start==destination){
//            System.out.println(path);
//            return;
//        }
//        dicepath(start+1,destination,path+1);
//        dicepath(start+2,destination,path+2);
//        dicepath(start+3,destination,path+3);
//        dicepath(start+4,destination,path+4);
//        dicepath(start+5,destination,path+5);
//        dicepath(start+6,destination,path+6);
//    }
//    public static void main(String[] args) {
// dicepath(0,9,"");
//    }
//}


