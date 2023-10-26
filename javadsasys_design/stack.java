package javadsasys_design;
//
//
//import java.util.Stack;
//
////    *******       problem.  valid paranthesis    ***********
//           ****  time complexity is o(n)   ****
//public class stack {
//    public boolean isvalid_paranthesis(String s){
//        Stack<Character> stack=new Stack<>();
//        char[] carr=s.toCharArray();
//        for (char c:carr){
//            if (c=='('||c=='{'||c=='['){
//                stack.push(c);
//                continue;
//            }else if(stack.isEmpty()){
//                return false;
//            }
//            char cp=stack.pop();
//             if (cp=='(' && c!=')'){
//            return false;
//            }else if(cp=='{'&& c!='}'){
//                 return false;
//             }else if (cp=='['&& c!=']'){
//                 return false;
//             }
//        }
//        if (stack.isEmpty()==true){
//            return true;
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//       String s="({[]})";
//       stack stack=new stack();
//        System.out.println(stack.isvalid_paranthesis(s));
//    }
//}


import com.sun.jdi.IntegerValue;
import com.sun.jdi.Value;

import java.io.IOError;
import java.util.Scanner;
import java.util.Stack;
//
////     *****         preoblem .max area of histogram       *****
//// time complexity of this code is o(n)  because for every i we need to
//// check back to the last which would be maximum n length but we do this with
//// the help of stack which take contains time to check back till end in each time
//public class stack {
//    public static void main(String[] args) {
//        int[]arr={2,1,5,6,2,3};
//        int[]leftb=new int[arr.length];
//        Stack<Integer> s=new Stack<>();
//        s.push(0);
//        leftb[0]=-1;
//        for (int i=1;i<arr.length;i++){
//            while (s.size()>0 && arr[i]<=arr[s.peek()]){
//                s.pop();
//            }
//            if (s.isEmpty()){
//                leftb[i]=-1;
//            }else {
//                leftb[i]=s.peek();
//            }
//            s.push(i);
//        }
//        int []rightb=new int[arr.length];
//        s=new Stack<>();
//        s.push(arr.length-1);
//        rightb[arr.length-1]=arr.length;
//        for (int i= arr.length-2;i>=0;i--){
//            while (!s.isEmpty()  && arr[i]<=arr[s.peek()]){
//                s.pop();
//            }
//            if (s.isEmpty()){
//                rightb[i]= arr.length;
//            }else {
//                rightb[i]=s.peek();
//            }
//            s.push(i);
//        }
//        int maxarea=0;
//        for (int i=0;i<arr.length;i++){
//            int width=rightb[i]-leftb[i]-1;
//            int area=width*arr[i];
//            maxarea=Math.max(maxarea,area);
//        }
//        System.out.println(maxarea);
//    }
//}


//        *****    pw youtube stack    *****
//public class stack {
//    public static void main(String[] args) {
//        Stack<Integer> s=new Stack<>();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter how many time you want to put elements in stack");
//        int n =sc.nextInt();
//        System.out.println("enter elements :");
//        for (int i=0;i<n;i++){
//            int e= sc.nextInt();
//            s.push(e);
//        }
//
//        System.out.println(s);

        // enter reverse order elements in a stack
//        Stack<Integer> s1=new Stack<>();
//        Stack<Integer> helper=new Stack<>();
//        Stack<Integer> s2=new Stack<>();
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter how many time you want to put elements in stack");
//        int n =sc.nextInt();
//        System.out.println("enter elements :");
//        for (int i=0;i<n;i++){
//            int e= sc.nextInt();
//            s1.push(e);
//        }
//        System.out.println(s1);
//
//        while (!s1.isEmpty()){
//            helper.push(s1.pop());
//        }
//        while (!helper.isEmpty()){
//            s2.push(helper.pop());
//        }
//        while (!s2.isEmpty()){
//            s1.push(s2.pop());
//        }
//        System.out.println(s1);
//    }
//}

//             insert number at the bottom of stack
//public class stack {
//    public static void main(String[] args) {
//        Stack<Integer>s=new Stack<>();
//        Stack <Integer> helper=new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//
//        while (s.size()>0){
//            helper.push(s.pop());
//        }
//        s.push(10);
//        while (helper.size()>0){
//            s.push(helper.pop());
//        }
//        System.out.println(s);
//    }
//}

//        insert number at any position in stack
//public class stack {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        Stack<Integer>s=new Stack<>();
//        Stack <Integer> helper=new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.push(5);
//        s.push(6);
//        System.out.println("enter the position where you nedd to add:");
//        int n=sc.nextInt();
//        System.out.println("enter ele");
//        int ele=sc.nextInt();
//        while (s.size()>n-1){
//            helper.push(s.pop());
//        }
//        s.add(ele);
//        while (!helper.isEmpty()){
//            s.push(helper.pop());
//        }
//        System.out.println(s);
//    }
//}

//          **  print stack bottom to top **
//1. using another stack .
//public class stack {
//    public static void main(String[] args) {
//        Stack<Integer>s=new Stack<>();
//        Stack<Integer> helper =new Stack<>();
//        for (int i=1;i<5;i++){
//            s.push(i);
//        }
//
//        while (s.size()>0){
//            helper.push(s.pop());
//        }
//        while (helper.size()>0){
//            int e=helper.pop();
//            System.out.println(e);
//            s.push(e);
//        }
//        System.out.println(s);
//
//    }
//}

//2. without using another stack rather use an array which size = main stack'size
//public class stack {
//    public static void main(String[] args) {
//        Stack<Integer>s=new Stack<>();
//        for (int i=1;i<5;i++){
//            s.push(i);
//        }
//        int []arr=new int[s.size()]; //if we use another stack it will take an
//                                    //undifined length so we slove it by using array
//       for (int i=0;i<arr.length;i++){
//           int e=s.pop();
//           arr[i]=e;
//       }
//       for (int i=arr.length-1;i>=0;i--){
//           System.out.print(arr[i]+" ");
//           s.push(arr[i]);
//       }
//        System.out.println(s);
//    }
//}

//   ***     display stack using recursion   ***
//1. normar display by recursion
//public class stack {
//    public void display(Stack<Integer>s){
//        if (s.size()==0){
//            return;
//        }
//        int e=s.pop();
//        System.out.println(e);
//        display(s);
//        s.push(e);
//    }
//    public static void main(String[] args) {
//        Stack<Integer>ss=new Stack<>();
//        for (int i=0;i<5;i++){
//            ss.push(i);
//        }
//        stack s=new stack();
//        s.display(ss);
//        System.out.println(ss);
//    }
//}

//2.     using array print reverse stack
//public class stack {
//    public void reversedisplay(Stack<Integer>s){
//        if (s.size()==0){
//            return;
//        }
//        int e=s.pop();
//        reversedisplay(s);
//        System.out.print(e+" ");
//        s.push(e);
//    }
//    public static void main(String[] args) {
//        Stack<Integer>ss=new Stack<>();
//        for (int i=1;i<5;i++){
//            ss.push(i);
//        }
//       stack s=new stack();
//        s.reversedisplay(ss);
//        System.out.println(ss);
//    }
//}

//     add bottom by recursion
//public class stack {
//    public void add_Bottom(Stack<Integer>s,int n){
//        if (s.size()==0){
//            s.push(n);
//            return;
//        }
//        int e=s.pop();
//        add_Bottom(s,n);
//        s.push(e);
//    }
//    public static void main(String[] args) {
//        Stack<Integer>ss=new Stack<>();
//        for (int i=1;i<6;i++){
//            ss.push(i);
//        }
//        stack s=new stack();
//        s.add_Bottom(ss,6);
//        System.out.println(ss);
//    }
//}

//2. ***     insert at any position by recursion    ***
//public class stack {
//    public void insertAtAnyPosition(Stack<Integer>s,int n,int pos){
//        if (s.size()==pos-1){
//            s.push(n);
//            return;
//        }
//        int e=s.pop();
//        insertAtAnyPosition(s,n,pos);
//        s.push(e);
//    }
//    public static void main(String[] args) {
//        Stack<Integer>ss=new Stack<>();
//        for (int i=1;i<6;i++){
//            ss.push(i);
//        }
//        stack s=new stack();
//        s.insertAtAnyPosition(ss,10,3);
//        System.out.println(ss);
//    }
//}

//       *** remove from bottom  ***
//public class stack {
//    public void removeFromBottom(Stack<Integer>s){
//        if (s.size()==1){
//            s.pop();
//            return;
//        }
//        int e=s.pop();
//        removeFromBottom(s);
//        s.push(e);
//    }
//    public static void main(String[] args) {
//        Stack<Integer>ss=new Stack<>();
//        for (int i=1;i<6;i++){
//            ss.push(i);
//        }
//        stack c=new stack();
//        c.removeFromBottom(ss);
//        System.out.println(ss);
//    }
//}

//     ***  remove from any position  ***
//public class stack {
//    public void removeFromAnyPosition(Stack<Integer>s,int pos){
//        if (s.size()==pos){
//            s.pop();
//            return;
//        }
//        int e=s.pop();
//        removeFromAnyPosition(s,pos);
//        s.push(e);
//
//    }
//    public static void main(String[] args) {
//        Stack<Integer>ss=new Stack<>();
//        for (int i=1;i<6;i++){
//            ss.push(i);
//        }
//        stack c=new stack();
//        c.removeFromAnyPosition(ss,3);
//        System.out.println(ss);
//    }
//}

//       ****   reverse stack by recursion ****
//public class stack {
//    public void insertBottom(Stack<Integer>s,int n){
//        if (s.size()==0){
//            s.push(n);
//            return;
//        }
//        int e=s.pop();
//        insertBottom(s,n);
//        s.push(e);
//    }
//    public void reverseStack(Stack<Integer>s){
//        if (s.size()==1){
//            return;
//        }
//        int e=s.pop();
//        reverseStack(s);
//        insertBottom(s,e);
//    }
//    public static void main(String[] args) {
//                Stack<Integer>ss=new Stack<>();
//        for (int i=1;i<6;i++){
//            ss.push(i);
//        }
//        stack c=new stack();
//        c.reverseStack(ss);
//        System.out.println(ss);
//    }
//}

//        ***  stack implementation by array  ***
//public class stack {
//    static class myStack{
//       private int []arr=new int[5];
//       private int idx=-1;
//       void push(int n){
//           if (is_Full()){
//               System.out.println("stack is full");
//               return;
//           }
//         idx=idx+1;
//         arr[idx]=n;
//       }
//       int pop(){
//       if (idx==-1){
//           System.out.println("stack is empty");
//           return -1;
//       }
//       int ans=arr[idx];
//       arr[idx]= 0;
//       idx=idx-1;
//       return ans;
//       }
//       int peek(){
//           if (idx==-1){
//               System.out.println("stack is empty!");
//               return -1;
//           }
//      return arr[idx];
//       }
//       int size(){
//     return idx+1;
//       }
//       boolean is_Empty(){
//        if (idx==-1)return true;
//        return false;
//       }
//       boolean is_Full(){
//    if (idx==arr.length-1)return true;
//    return false;
//       }
//       void display(){
//           for (int i=idx;i>=0;i--){
//               System.out.print(arr[i]+" ");
//           }
//           System.out.println();
//       }
//
//    }
//    public static void main(String[] args) {
//   myStack ms=new myStack();
//   ms.push(1);
//        System.out.println(ms.size());
//
//   ms.pop();
//        System.out.println(ms.size());
//        ms.push(4);
//        ms.push(5);
//        ms.push(6);
//       ms.display();
//        ms.pop();
//       ms.display();
//    }
//}

//         *****      stack implementation by LinkedList   ****
//public class stack {
//    static class Node {
//        int val;
//        Node next;
//
//        public Node(int n) {
//            this.val = n;
//        }
//    }
//        static class MyStack{
//           Node head=null;
//           int size=0;
//           void push(int n){
//               Node nn=new Node(n);
//               nn.next=head;
//               head=nn;
//               size++;
//           }
//           int pop(){
//               if (head==null){
//                   System.out.println("no element");
//                   return -1;
//               }
//               int ele=head.val;
//               head=head.next;
//               size--;
//               return ele;
//           }
//           int peek(){
//               if (head==null){
//                   System.out.println("no element");
//                   return -1;
//               }
//               return head.val;
//           }
//           int size(){
//               return size;
//           }
//           boolean isEmpty(){
//               if (head==null){
//                   return true;
//               }
//               return false;
//           }
//           void helper(Node head){
//               if (head==null)return;
//              helper(head.next);
//               System.out.println(head.val);
//           }
//           void display(){
//               helper(head);
//           }
//        }
//
//    public static void main(String[] args) {
////           Stack<Integer>ss=new Stack<>();
////           ss.push(1);
////           ss.push(2);
////           ss.push(3);
////        System.out.println(ss);
//       MyStack ms=new MyStack();
//       ms.push(1);
//        System.out.println(ms.size);
//        ms.pop();
//        System.out.println(ms.isEmpty());
//        ms.push(4);
//        ms.push(8);
//        ms.push(9);
//        ms.push(3);
//        System.out.println(ms.peek()+"*");
//        ms.display();
//    }
//}

//      stack   problems
//1.       balance  brackets
//public class stack {
//    public boolean is_Balance(String s){
//        Stack<Character> st=new Stack<>();
//        for (int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            if (c=='('){
//               st.push(c);
//            }
//            else {
//                if (st.isEmpty())return false;
//                if (st.peek()=='(') st.pop();
//            }
//        }
//        if (st.isEmpty()) return true;
//        return false;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter brackets :");
//        String brackets=sc.nextLine();
//        stack s=new stack();
//
//        System.out.println(s.is_Balance(brackets));
//    }
//}

// follow up for 1. , what is the minimum number of bracket we need to
//   remove to make it balanced
//public class stack {
//    public int is_Balance(String s){
//        int removeCount=0;
//        Stack<Character> st=new Stack<>();
//        for (int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            if (c=='('){
//               st.push(c);
//            }
//            else {
//                if (st.isEmpty()) removeCount++;
//                if (st.peek()=='(') st.pop();
//            }
//        }
//        if (st.isEmpty()) return removeCount;
//        return st.size();
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter brackets :");
//        String brackets=sc.nextLine();
//        stack s=new stack();
//
//        System.out.println(s.is_Balance(brackets));
//    }
//}

//*** given a sequence of numbers .remove all the consecutive subsequences
//of length grater than or equal to 2 that contains the same element.
//public class stack {
//    public static int[] remove(int[]arr){
//        Stack<Integer>st=new Stack<>();
//        for (int i=0;i<arr.length;i++){
//            if (st.isEmpty() || st.peek()!=arr[i]){
//                st.push(arr[i]);
//            }
//            else if(st.peek()==arr[i]){
//                if (i== arr.length-1){
//                    st.pop();
//                    break;
//                }
//                if (arr[i]!=arr[i+1]){
//                    st.pop();
//                }
//            }
//        }
//        int []ans=new int[st.size()];
//        for (int i=ans.length-1;i>=0;i--){
//            ans[i]=st.pop();
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//      stack ss=new stack();
//        int []arr={1,2,2,3,10,10,10,4,4,4,5,7,7};
//       int []a= remove(arr);
//       for (int e:a){
//           System.out.print(e+" ");
//       }
//
//    }
//}


//          ****    next greater elements  *****
//  Brute force approach.
//    public class stack {
//    public static void main(String[] args) {
//        int[]arr={1,3,2,1,8,6,3,4};
//        int []ans=new int[arr.length];
//        for (int i=0;i< ans.length;i++){
//            ans[i]=-1;
//        }
//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//               if (arr[i]<arr[j]){
//                   ans[i]=arr[j];
//                   break;
//               }
//            }
//        }
//        for (int e:arr){
//            System.out.print(e+" ");
//        }
//        System.out.println();
//        for (int e:ans){
//            System.out.print(e+" ");
//        }
//    }
//}

//optimized approach .
//public class stack {
//    public int[] nextGreater(int[]arr){
//        Stack<Integer>s=new Stack<>();
//        int []ans=new int[arr.length];
//        ans[arr.length-1]=-1;
//        s.push(arr[arr.length-1]);
//        for (int i=arr.length-2;i>=0;i--){
//          while (!s.isEmpty() && s.peek()<arr[i]){
//              s.pop();
//          }
//          if (s.isEmpty()){
//              ans[i]=-1;
//          }else {
//              ans[i]=s.peek();
//          }
//          s.push(arr[i]);
//
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        stack s=new stack();
//        int[]arr={1,3,2,1,8,6,3,4};
//       int []a= s.nextGreater(arr);
//       for (int e:a){
//           System.out.print(e+" ");
//       }
//        System.out.println();
//        for (int e:arr){
//            System.out.print(e+" ");
//        }
//    }
//}

//             ****    previous Greater  elements  *****
//public class stack {
//    public static int[] previousGreater(int[]arr){
//        Stack<Integer> s=new Stack<>();
//        int []ans=new int[arr.length];
//        ans[0]=-1;
//        s.push(arr[0]);
//        for (int i=1;i<arr.length;i++){
//            while (!s.isEmpty() && s.peek()<arr[i]){
//                s.pop();
//            }
//            if (s.isEmpty()){
//                ans[i]=-1;
//            }else {
//                ans[i]=s.peek();
//            }
//            s.push(arr[i]);
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int []arr={4,2,51,2,74,2,8,3,1};
//        stack s=new stack();
//       int a[]=s.previousGreater(arr);
//       for (int e:a){
//           System.out.print(e+" ");
//       }
//    }
//}

/*given a series of N daily price quotes for a stock ,we
need to calculate the span of the stock's price for all N
days. The span of the stock's price in one day is the
maximum number of consecutive days (starting from that day
and going backward )for which the stock price was less
than or equal to the price of that day.
 */
//public class stack {
//    public int[] maxstock_span(int []arr){
//        Stack<Integer>ss=new Stack<>();
//        int []ans=new int[arr.length];
//        ans[0]=1;
//        ss.push(0);
//        for (int i=1;i<arr.length;i++){
//            while (!ss.isEmpty() && arr[ss.peek()]<arr[i]){
//                ss.pop();
//            }
//            if (ss.isEmpty()){
//                ans[i]=i-(-1);
//            }
//            else {
//                ans[i]=i- ss.peek();
//            }
//            ss.push(i);
//        }
//      return ans;
//    }
//    public static void main(String[] args) {
//        int[]arr={100,80,60,70,60,75,85};
//        stack s=new stack();
//       int [] a=s.maxstock_span(arr);
//       for (int e:a){
//           System.out.print(e+" ");
//       }
//    }


//min stack leetcode problem;
//class MinStack {
//    Stack<Integer> mainstack=new Stack<>();
//    Stack<Integer> helper=new Stack<>();
//
//    public MinStack() {
//
//    }
//
//    public void push(int val) {
//        if(mainstack.isEmpty()){
//            mainstack.push(val);
//            helper.push(val);
//        }else{
//            mainstack.push(val);
//            if(helper.peek()<val){
//                helper.push(helper.peek());
//            }else{
//                helper.push(val);
//            }
//        }
//    }
//
//    public void pop() {
//        mainstack.pop();
//        helper.pop();
//    }
//
//    public int top() {
//        return mainstack.peek();
//    }
//
//    public int getMin() {
//        return  helper.peek();
//    }
//}

//      *** infix evaluation  **
//public class stack {
//    public static int infix(String s){
//        Stack<Integer> st=new Stack<>();
//        Stack<Character> sc=new Stack<>();
//        for (int i=0;i<s.length();i++) {
//            char c = s.charAt(i);
//            int asscai = (int) c;
//            if (asscai >= 48 && asscai <= 57) {
//                st.push(asscai - 48);
//            } else if (sc.isEmpty()) {
//                sc.push(c);
//            } else {
//                if (c == '+' || c == '-') {
//                    int val2 = st.pop();
//                    int val1 = st.pop();
//                    if (sc.peek() == '+') st.push(val1 + val2);
//                    if (sc.peek() == '-') st.push(val1 - val2);
//                    if (sc.peek() == '*') st.push(val1 * val2);
//                    if (sc.peek() == '/') st.push(val1 / val2);
//                    sc.pop();
//                    sc.push(c);
//                } else if (c == '*' || c == '/') {
//                    if (sc.peek() == '*' || sc.peek() == '/') {
//                        int val2 = st.pop();
//                        int val1 = st.pop();
//                        if (sc.peek() == '*') st.push(val1 * val2);
//                        if (sc.peek() == '/') st.push(val1 / val2);
//                        sc.pop();
//                        sc.push(c);
//                    } else {
//                        sc.push(c);
//                    }
//                }
//            }
//        }
//            while (st.size() > 1) {
//                int val2 = st.pop();
//                int val1 = st.pop();
//                if (sc.peek() == '+') st.push(val1 + val2);
//                if (sc.peek() == '-') st.push(val1 - val2);
//                if (sc.peek() == '*') st.push(val1 * val2);
//                if (sc.peek() == '/') st.push(val1 / val2);
//                sc.pop();
//            }
//            return st.peek();
//
//    }
//    public static void main(String[] args) {
//        stack s=new stack();
//   String ss="9-5+3*4/6";
//        System.out.println(infix(ss));
//    }
//}



// ****     infix modify with brackets   ****
//public class stack {
//    public static int infix(String s){
//        Stack<Integer> st=new Stack<>();
//        Stack<Character> sc=new Stack<>();
//        for (int i=0;i<s.length();i++) {
//            char c = s.charAt(i);
//            int asscai = (int) c;
//            if (asscai >= 48 && asscai <= 57) {
//                st.push(asscai - 48);
//            } else if (sc.isEmpty() || c=='(' || sc.peek()=='(') {
//                sc.push(c);
//            }
//            else if(c==')'){
//                while (sc.peek()!='('){
//                    int val2 = st.pop();
//                    int val1 = st.pop();
//                    if (sc.peek() == '+') st.push(val1 + val2);
//                    if (sc.peek() == '-') st.push(val1 - val2);
//                    if (sc.peek() == '*') st.push(val1 * val2);
//                    if (sc.peek() == '/') st.push(val1 / val2);
//                    sc.pop();
//                }
//                sc.pop();
//            }
//                else {
//                if (c == '+' || c == '-') {
//                    int val2 = st.pop();
//                    int val1 = st.pop();
//                    if (sc.peek() == '+') st.push(val1 + val2);
//                    if (sc.peek() == '-') st.push(val1 - val2);
//                    if (sc.peek() == '*') st.push(val1 * val2);
//                    if (sc.peek() == '/') st.push(val1 / val2);
//                    sc.pop();
//                    sc.push(c);
//                } else if (c == '*' || c == '/') {
//                    if (sc.peek() == '*' || sc.peek() == '/') {
//                        int val2 = st.pop();
//                        int val1 = st.pop();
//                        if (sc.peek() == '*') st.push(val1 * val2);
//                        if (sc.peek() == '/') st.push(val1 / val2);
//                        sc.pop();
//                        sc.push(c);
//                    } else {
//                        sc.push(c);
//                    }
//                }
//            }
//        }
//        while (st.size() > 1) {
//            int val2 = st.pop();
//            int val1 = st.pop();
//            if (sc.peek() == '+') st.push(val1 + val2);
//            if (sc.peek() == '-') st.push(val1 - val2);
//            if (sc.peek() == '*') st.push(val1 * val2);
//            if (sc.peek() == '/') st.push(val1 / val2);
//            sc.pop();
//        }
//        return st.peek();
//
//    }
//    public static void main(String[] args) {
//        stack s=new stack();
//        String ss="9-(5+3)*4/6";
//        System.out.println(infix(ss));
//    }
//}

//       ***  infix to prefix  ***
//public class stack {
//    public static void main(String[] args) {
//        String ss="9-(5+3)*4/6";
//        Stack<String>st=new Stack<>();
//        Stack<Character> op=new Stack<>();
//        for (int i=0;i<ss.length();i++){
//            char c= ss.charAt(i);
//            int asscai=(int)c;
//            if (asscai>=48 && asscai<=57){
//                String s=""+c;
//                st.push(s);
//            }
//            else if (op.isEmpty()||c=='('||op.peek()=='('){
//                op.push(c);
//            }
//            else if(c==')'){
//                while (op.peek()!='('){
//                    String v2=st.pop();
//                    String v1=st.pop();
//                    char x=op.pop();
//                    st.push(x+v1+v2);
//                }
//                op.pop();
//            }
//            else if(c=='+'||c=='-'){
//                String v2=st.pop();
//                String v1=st.pop();
//                char x=op.pop();
//                st.push(x+v1+v2);
//                op.push(c);
//            }
//            else if (c=='*'||c=='/'){
//                if (op.peek()=='*'||op.peek()=='/'){
//                    String v2=st.pop();
//                    String v1=st.pop();
//                    char x=op.pop();
//                    st.push(x+v1+v2);
//                    op.push(c);
//                }
//                else {
//                    op.push(c);
//                }
//            }
//        }
//        while (st.size()>1){
//            String v2=st.pop();
//            String v1=st.pop();
//            char x=op.pop();
//            st.push(x+v1+v2);
//        }
//        System.out.println(st.peek());
//    }
//}


//       ****    infix to postfix  *****
//public class stack {
//    public static void main(String[] args) {
//        String ss="9-(5+3)*4/6";
//        Stack<String>st=new Stack<>();;
//        Stack<Character> op=new Stack<>();
//        for (int i=0;i<ss.length();i++){
//            char c= ss.charAt(i);
//            int asscai=(int)c;
//            if (asscai>=48 && asscai<=57){
//                String s=""+c;
//                st.push(s);
//            }
//            else if (op.isEmpty()||c=='('||op.peek()=='('){
//                op.push(c);
//            }
//            else if(c==')'){
//                while (op.peek()!='('){
//                    String v2=st.pop();
//                    String v1=st.pop();
//                    char x=op.pop();
//                    st.push(v1+v2+x);
//                }
//                op.pop();
//            }
//            else if(c=='+'||c=='-'){
//                String v2=st.pop();
//                String v1=st.pop();
//                char x=op.pop();
//                st.push(v1+v2+x);
//                op.push(c);
//            }
//            else if (c=='*'||c=='/'){
//                if (op.peek()=='*'||op.peek()=='/'){
//                    String v2=st.pop();
//                    String v1=st.pop();
//                    char x=op.pop();
//                    st.push(v1+v2+x);
//                    op.push(c);
//                }
//                else {
//                    op.push(c);
//                }
//            }
//        }
//        while (st.size()>1){
//            String v2=st.pop();
//            String v1=st.pop();
//            char x=op.pop();
//            st.push(v1+v2+x);
//        }
//        System.out.println(st.peek());
//    }
//}


//    *** postfix evelution  ***
//public class stack {
//    public static void main(String[] args) {
//        Stack<Integer>st=new Stack<>();
//       String postfix="953+4*6/-";
//       for (int i=0;i<postfix.length();i++){
//           char c=postfix.charAt(i);
//           int x=(int)c;
//           if (x>=48 && x<=57){
//               st.push(x-48);
//           }
//           else {
//               int v2=st.pop();
//               int v1=st.pop();
//               if (c=='+')  st.push(v1+v2);
//               if (c=='-')  st.push(v1-v2);
//               if (c=='*')  st.push(v1*v2);
//               if (c=='/')  st.push(v1/v2);
//
//           }
//       }
//        System.out.println(st.peek());
//    }
//}

//       *****   prefix evelution  *****
//public class stack {
//    public static void main(String[] args) {
//       String prefix="-9/*+5346";//+-95/*346";
//       Stack<Integer>st=new Stack<>();
//       for (int i=prefix.length()-1;i>=0;i--){
//           char c=prefix.charAt(i);
//           int x=(int)c;
//           if (x>=48 && x<=57){
//               st.push(x-48);
//           }
//           else {
//               int v1=st.pop();
//               int v2=st.pop();
//               if (c=='+')  st.push(v1+v2);
//               if (c=='-')  st.push(v1-v2);
//               if (c=='*')  st.push(v1*v2);
//               if (c=='/')  st.push(v1/v2);
//           }
//       }
//        System.out.println(st.peek());
//    }
//}

//     ****  postfix to prefix  ****
//public class stack {
//    public static void main(String[] args) {
//        Stack<String>st=new Stack<>();
//       String postfix="953+4*6/-";
//       for (int i=0;i<postfix.length();i++){
//           char c=postfix.charAt(i);
//           int x=(int)c;
//           if (x>=48 && x<=57){
//               String s=""+c;
//               st.push(s);
//           }
//           else {
//               String v2=st.pop();
//               String v1=st.pop();
//              st.push(c+v1+v2);
//           }
//       }
//        System.out.println(st.peek());
//    }
//}

//    *** prefix to postfix  ***
//public class stack {
//    public static void main(String[] args) {
//        String prefix ="-9/*+5346";
//        Stack<String>st=new Stack<>();
//        for (int i=prefix.length()-1;i>=0;i--){
//            char c=prefix.charAt(i);
//            int x=(int) c;
//            if (x>=48 && x<=57){
//                String  s=""+c;
//                st.push(s);
//            }
//            else {
//                String v1=st.pop();
//                String v2=st.pop();
//                st.push(v1+v2+c);
//            }
//        }
//        System.out.println(st.peek());
//    }
//}

//        ***  prefix to  infix  ****
//public class stack {
//    public static void main(String[] args) {
//        String prefix ="-9/*+5346";
//        Stack<String>st=new Stack<>();
//        for (int i=prefix.length()-1;i>=0;i--){
//            char c=prefix.charAt(i);
//            int x=(int) c;
//            if (x>=48 && x<=57){
//                String s=""+c;
//                st.push(s);
//            }
//            else {
//                String v1=st.pop();
//                String v2=st.pop();
//                st.push('('+v1+c+v2+')');
//            }
//        }
//        System.out.println(st.peek());
//    }
//}

//   *** postfix to infix  ***
//public class stack {
//    public static void main(String[] args) {
//        String postfix="953+4*6/-";
//        Stack<String> st=new Stack<>();
//        for (int i=0;i<postfix.length();i++){
//            char c=postfix.charAt(i);
//            int x=(int) c;
//            if (x>=48 && x<=57){
//                st.push(c+"");
//            }else {
//                String v2=st.pop();
//                String v1=st.pop();
//                st.push('('+v1+c+v2+')');
//            }
//        }
//        System.out.println(st.peek());
//    }
//}

//    ****  celebrety problem ****
//public class stack {
//    public static void main(String[] args) {
//        int[][] arr=new int[3][3];
//        arr[0][0]=0;
//        arr[0][1]=1;
//        arr[0][2]=0;
//        arr[1][0]=0;
//        arr[1][1]=0;
//        arr[1][2]=0;
//        arr[2][0]=0;
//        arr[2][1]=1;
//        arr[2][2]=0;
//        Stack<Integer>st=new Stack<>();
//        for (int i=0;i< arr.length;i++){
//            st.push(i);
//        }
//        while (st.size()>1){
//            int val1=st.pop();
//            int val2=st.pop();
//            if (arr[val1][val2]==0)st.push(val1);
//            else if (arr[val2][val1]==0)st.push(val2);
//        }
//         if (st.isEmpty())return;
//         int pos=st.pop();
//         for (int i=0;i<arr.length;i++){
//             if (i==pos)continue;
//             if (arr[i][pos]==0)return;
//         }
//         for (int j=0;j<arr.length;j++){
//             if (arr[pos][j]==1)return;
//         }
//        System.out.println(pos);
//    }
//}

 //     given a row x column binary filled with 0's and 1's find the
//     lergest rectengle containing only 1's and return it's area
//public class stack {
//    public static int maxarea(int[][]arr){
//        int []ar=new int[arr[0].length];
//        for (int i=0;i<arr[0].length;i++){
//            ar[i]=arr[0][i];
//        }
//        int area=0;
//        area=Math.max(area,histogram(ar));
//        for (int i=1;i<arr.length;i++){
//            for (int j=0;j<arr[0].length;j++){
//                if (arr[i][j]==1){
//                    ar[j]++;
//                }else if (arr[i][j]==0){
//                    ar[j]=0;
//                }
//            }
//            area=Math.max(area,histogram(ar));
//        }
//         return area;
//
//    }
//    public static int histogram(int[]height){
//        int[]lb=new int[height.length];
//        int[]rb=new int[height.length];
//        Stack<Integer>st=new Stack<>();
//        st.push(0);
//        lb[0]=-1;
//        for (int i=1;i< lb.length;i++){
//            while (!st.isEmpty() && height[st.peek()]>=height[i]){
//                st.pop();
//            }
//            if (st.isEmpty())lb[i]=-1;
//            else lb[i]=st.peek();
//            st.push(i);
//        }
//        st=new Stack<>();
//        st.push(height.length-1);
//        rb[height.length-1]=height.length;
//        for (int i=height.length-2;i>=0;i--){
//            while (!st.isEmpty() && height[st.peek()]>=height[i]){
//                st.pop();
//            }
//            if (st.isEmpty())rb[i]=height.length;
//            else rb[i]=st.peek();
//            st.push(i);
//        }
//        int max=0;
//        for (int i=0;i<height.length;i++){
//            int width=rb[i]-lb[i]-1;
//            int area=width*height[i];
//            max=Math.max(max,area);
//        }
//        return max;
//    }
//     public static void main(String[] args) {
//
//        int []a={2,1,5,6,2,3};
//         System.out.println(histogram(a));
//         int[][]bm={{1,0,1,0,0},
//                 {1,0,1,1,1},
//                 {1,1,1,1,1},
//                 {1,0,0,1,0}};
//         System.out.println(maxarea(bm));
//     }
//}


//     encoding to decoding string    **** not completed ****
//public class stack {
//    public static void main(String[] args) {
//      String st="2[ac[c]3[de]]";
//      Stack<Integer>ints=new Stack<>();
//      Stack<String>chs=new Stack<>();
//      for (int i=0;i<st.length();i++){
//          int c= (int)st.charAt(i);
//          if (c>=48 && c<=57)ints.push(c);
//          else {
//              if (st.charAt(i)==']'){
//                  String ns="";
//                  while (chs.peek()!="["){
//                      ns=chs.pop()+ns;
//                  }
//                  chs.pop();
//                  int num=ints.pop();
//                  String mus=num+ns;
//                  chs.push(mus);
//
//              }
//             else chs.push(String.valueOf(st.charAt(i)));
//
//          }
//      }
////        System.out.println(chs.peek());
//
//    }
//}

//               ****   basket ball  ***
//public class stack {
//    public static void main(String[] args) {
//        String []sr={"5","2","C","D","+"};
//        Stack<Integer>is=new Stack<>();
//        for (String s:sr){
//            switch (s){
//                case "C":is.pop();
//                break;
//                case "D":
//                    int n=is.pop();
//                    is.push(n);
//                    is.push(2*n);
//                    break;
//                case "+":
//                    int fe=is.pop();
//                    int se =is.peek();
//                    is.push(fe);
//                    is.push(fe+se);
//                    break;
//                default:is.push(Integer.parseInt(s));
//                break;
//            }
//        }
//        int ans=0;
//        while (!is.isEmpty()){
//            ans+=is.pop();
//        }
//        System.out.println(ans);
//
//    }
//}


//          ****  asteroids collision *****
//class Solution {
//    public int[] asteroidCollision(int[] asteroids) {
//        Stack<Integer> st=new Stack<>();
//        for(int e:asteroids){
//            if(e>0)st.push(e);
//            else{
//                int v=-e;
//                while(!st.isEmpty() && st.peek()>0 && st.peek()<v){
//                    st.pop();
//                }
//                if(!st.isEmpty() && st.peek()==v)st.pop();
//                else if(!st.isEmpty() && st.peek()>v){
//
//                }
//                else{
//                    st.push(e);
//                }
//            }
//        }
//        int ans[]=new int[st.size()];
//        for (int i=ans.length-1;i>=0;i--){
//            ans[i]=st.pop();
//        }
//        return ans;
//    }
//}



//     after how many day to find highest temperature
//class Solution {
//    public int[] dailyTemperatures(int[] temperatures) {
//        // solve by the concept of next greater elements
//        Stack<Integer> st=new Stack<>();
//        int[]ans=new int[temperatures.length];
//        st.push(temperatures.length-1);
//        ans[temperatures.length-1]=0;
//        for(int i=temperatures.length-2;i>=0;i--){
//            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
//                st.pop();
//            }
//            if(st.isEmpty())ans[i]=0;
//            else ans[i]=st.peek()-i;
//            st.push(i);
//        }
//        return ans;
//    }
//}

//

//public class stack {
//    public static void main(String[] args) {
//
//    }
//}