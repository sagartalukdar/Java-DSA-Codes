package javadsasys_design;

//import java.util.Queue;
//import java.util.Stack;
//
//
////        *****  queue implementing with the help of stacks   ****
//     space complexity for this code is o(n)  which taken by stackes
//public class queue {
//   static class myqueue{
//        Stack<Integer> s1=new Stack<>();
//        Stack<Integer> s2=new Stack<>();
//        public void enque(int n){
//            s1.push(n);         // time complexity for enque is O(1)
//        }
//       public int  deque(){ // time complexity for deque is o(n)
//            int ans=-1;
//            if (s1.isEmpty() && s2.isEmpty())return ans;
//           else if (s2.isEmpty()){
//              while (!s1.isEmpty()){
//                  int ele=s1.pop();
//                  s2.push(ele);
//              }
//            }
//           ans= s2.pop();
//           return ans;
//       }
//    }
//    public static void main(String[] args) {
//       myqueue mq=new myqueue();
//       mq.enque(2);
//       mq.enque(4);
//        System.out.println(mq.deque());
//        mq.enque(5);
//        System.out.println(mq.deque());
//        System.out.println(mq.deque());
//    }
//}


//      ****    making stack using queue    ********
// space complexity for this code is o(n) which taken by queues

//import java.util.LinkedList;
//import java.util.Queue;
//
//public class queue {
//    static class mystack{
//        Queue<Integer> q1=new LinkedList<>();
//        Queue<Integer> q2=new LinkedList<>();
//        public void push(int n){
//           while (!q1.isEmpty()){//time complexity for push is o(n)
//               q2.add(q1.peek());
//               q1.poll();//similer function like remove ,which remove peek ele if
//                             //don't have any thing it's return null
//           }
//           q1.add(n);
//           while (!q2.isEmpty()){
//              q1.add(q2.peek());
//              q2.poll();
//           }
//        }
//        public int pop(){ //  time complexity for this pop is o(n)
//            if (q1.isEmpty()){
//                System.exit(0);
//            }
//         int e= q1.poll();
//         return e;
//        }
//    }
//    public static void main(String[] args) {
//   mystack ms=new mystack();
//   ms.push(1);
//   ms.push(3);
//        System.out.println(ms.pop());
//        ms.push(4);
//        System.out.println(ms.pop());
//        System.out.println(ms.pop());
//    }
//}


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//      queue by pwyoutube
//public class queue {
//    public static void main(String[] args) {
//        Queue<Integer>q=new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        System.out.println(q);
//        q.poll();
//        System.out.println(q);
//    }
//}

//    ***  queue printing using extra queue ***
//    public class queue {
//      public static void main(String[] args) {
//          Queue<Integer>q=new LinkedList<>();
//          Queue<Integer> helper =new LinkedList<>();
//           q.add(1);
//           q.add(2);
//           q.add(3);
//           while (!q.isEmpty()){
//               System.out.print(q.peek()+" ");
//               helper.add(q.poll());
//           }
//           while (!helper.isEmpty()){
//               q.add(helper.poll());
//           }
//          System.out.println(q);
//      }
//}

//     ***  queue printing using extra Array ***
//public class queue {
//    public static void main(String[] args) {
//        Queue<Integer>q=new LinkedList<>();
//        q.add(1);
//           q.add(2);
//           q.add(3);
//
//        int []arr=new int[q.size()];
//        int i=0;
//        while (!q.isEmpty()){
//            System.out.print(q.peek()+" ");
//            arr[i++]=q.poll();
//        }
//        for (int j=0;j<arr.length;j++){
//            q.add(arr[j]);
//        }
//        System.out.println(q);
//    }
//}

//    ****   queue implementation by array  *****
//public class queue {
//   static class MyQueue{
//        int front =-1;
//        int rear=-1;
//        int size=0;
//        int []arr=new int[5];
//        public void add(int n){
//            if (rear==arr.length-1) System.exit(0);
//            if (front==-1 && rear==-1){
//                front=0;
//                rear=0;
//                arr[0]=n;
//            }
//            else {
//                rear=rear+1;
//                arr[rear]=n;
//            }
//           size++;
//        }
//        public int poll(){
//            if (size==0)return -1;
//          front++;
//          size--;
//          return arr[front-1];
//        }
//        public int peek(){
//            if (size==0)return -1;
//            return arr[front];
//        }
//        public boolean isEmpty(){
//            if (size==0)return true;
//            return false;
//        }
//        public void display(){
//            if (size==0) {
//                System.out.println("empty");
//                return;
//            }
//            for (int i=front;i<=rear;i++){
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        MyQueue mq=new MyQueue();
//    mq.add(1);
//    mq.add(2);
//    mq.display();
//    mq.poll();
//    mq.display();
//        System.out.println(mq.peek());
//
//    }
//}

//****   queue implementation by LinkedList  *****
//public class queue {
//   static class Node {
//        int val;
//        Node next;
//        public Node(int n){
//            this.val=n;
//        }
//    }
//   static class Myqueue{
//        Node head;
//        Node tail;
//        int size=0;
//        public void add(int n){
//            Node nn=new Node(n);
//            if (head==null ){
//                head=tail=nn;
//            }
//            else {
//              tail.next=nn;
//              tail=nn;
//            }
//            size++;
//        }
//        public int poll(){
//            if (size==0){
//                return -1;
//            }
//                int x=head.val;
//                head=head.next;
//            size--;
//            return x;
//        }
//        public int peek(){
//            if (size==0)return -1;
//            return head.val;
//        }
//        public boolean isEmpty(){
//            if (size==0)return true;
//            return false;
//        }
//        public void display(){
//            Node temp=head;
//            while (temp!=null){
//                System.out.println(temp.val);
//                temp=temp.next;
//            }
//        }
//
//    }
//    public static void main(String[] args) {
//        Myqueue mq=new Myqueue();
//        System.out.println(mq.size);
//        mq.display();
//        mq.add(1);
//        System.out.println(mq.size);
//        mq.display();
//        mq.poll();
//        System.out.println(mq.size);
//        mq.add(2);
//        System.out.println(mq.peek());
//        mq.add(3);
//        mq.add(4);
//        mq.display();
//    }
//}

//****   queue implementation by circuler array  *****
//public class queue {
//    static class MyQueue {
//        int front = -1;
//        int rear = -1;
//        int size = 0;
//        int[] arr = new int[5];
//
//        public void add(int n) throws Exception {
//            if (size == 0) {
//                front = rear = 0;
//                arr[front] = n;
//            } else if (size == arr.length) throw new Exception("full");
//            else if (rear == arr.length - 1) {
//                rear = 0;
//                arr[rear] = n;
//            } else if (rear < arr.length - 1) {
//                arr[++rear] = n;
//            }
//            size++;
//        }
//
//        public int poll() throws Exception {
//            if (size == 0) {
//                throw new Exception("empty!");
//            } else {
//                int x = arr[front];
//                if (front == arr.length - 1) front = 0;
//                else front++;
//                size--;
//                return x;
//            }
//        }
//
//        public int peek() throws Exception {
//            if (size == 0) throw new Exception("empty");
//            return arr[front];
//
//        }
//
//        public boolean isEmpty() {
//            if (size == 0) return true;
//            return false;
//        }
//
//        public void display() throws Exception {
//            if (size == 0) throw new Exception("empty");
//            else if (front <=rear) {
//                for (int i = front; i <= rear; i++) {
//                    System.out.print(arr[i] + " ");
//                }
//            } else if (rear < front) {
//                for (int i = front; i < arr.length; i++) {
//                    System.out.print(arr[i] + " ");
//                }
//                for (int i = 0; i <= rear; i++) {
//                    System.out.print(arr[i] + " ");
//                }
//            }
//            System.out.println();
//        }
//
//    }
//
//    public static void main(String[] args) throws Exception {
//        MyQueue mq = new MyQueue();
//        System.out.println(mq.size);
//        mq.add(1);
//        System.out.println(mq.size);
//        System.out.println(mq.poll());
//        System.out.println(mq.size);
//        mq.add(8);
//        mq.add(4);
//        mq.add(5);
//        System.out.println(mq.size);
//        System.out.println(mq.peek());
//        mq.display();
//        mq.add(7);
//        mq.add(8);
//
////        mq.add(1);
//        System.out.println(mq.poll());
//        mq.poll();
//
//        mq.add(9);
//        mq.add(1);
//        mq.display();
//        System.out.println(Arrays.toString(mq.arr));
//    }
//}

//    ***  reverse queue ***
//public class queue {
//    public static void main(String[] args) {
//        Queue<Integer>q=new LinkedList<>();
//        Stack<Integer>s=new Stack<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        System.out.println(q);
//        while (!q.isEmpty()){
//            s.push(q.poll());
//        }
//        while (!s.isEmpty()){
//            q.add(s.pop());
//        }
//        System.out.println(q);
//    }
//}


//    ***  reverse first k elements of queue ***
//public class queue {
//    public static void main(String[] args) {
//        Queue<Integer>q=new LinkedList<>();
//        Stack<Integer>s=new Stack<>();
//        int k=3;
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        System.out.println(q);
//        for (int i=1;i<=k;i++){
//            s.push(q.poll());
//        }
//       while (!s.isEmpty()){
//           q.add(s.pop());
//       }
//       for (int i=1;i<=q.size()-k;i++){
//           q.add(q.poll());
//       }
//        System.out.println(q);
//    }
//}

//     ****  reorder queue (Interleave 1st half with 2nd half)  ****
//public class queue {
//    public static void main(String[] args) {
//        Queue<Integer>q=new LinkedList<>();
//        Stack<Integer>s=new Stack<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        q.add(6);
//        q.add(7);
//        q.add(8);
//        int n=q.size();
//        System.out.println(q);
//        for (int i=1;i<=n/2;i++){
//            s.push(q.poll());
//        }
//        while (!s.isEmpty()){
//            q.add(s.pop());
//        }
//        for (int i=1;i<=n/2;i++){
//            s.push(q.poll());
//        }
//        while (!s.isEmpty()){
//            q.add(s.pop());
//            q.add(q.poll());
//        }
//        while (!q.isEmpty()){
//            s.push(q.poll());
//        }
//        while (!s.isEmpty()){
//            q.add(s.pop());
//        }
//        System.out.println(q);
//    }
//