package com.company;

import java.util.ArrayList;

public class linkedlistwithstach {

    public static void main(String[] args) {
        /*
        //1//*******   Linked list without framework,with strach   *****
package com.company;
class Node{
    int data;
    Node next;
    public Node(){
        data=0;
        next=null;
    }
    public Node(int d,Node n){
        data=d;
        next=n;
    }
   public void setData(int d){
        data=d;
   }
   public void setNext(Node n){
        next=n;
   }
    public int getData(){
        return (data);
    }
    public Node getnext(){
        return (next);
    }
}
class Linklist{
    int size;
    Node start;
    public Linklist(){
        size=0;
        start=null;
    }
    public boolean isEmpty(){
        if (start==null){
            return true;
        }else {
            return false;
        }
    }
    public int getSize(){
        return size;
    }
    public void addfirst(int val){
        Node n=new Node();
        n.setData(val);
        n.setNext(start);
        start=n;
        size++;
    }
    public void addlast(int val){
        Node n,t;
        n=new Node();
        n.setData(val);
        n.setNext(null);
        t=start;
        if (t==null){
            start=n;
        }else {
            while (t.getnext()!=null){
                t=t.getnext();
            }
            t.setNext(n);
            size++;
        }
    }
    public void addpossition(int val,int poss){
        if (poss==0){
            addfirst(val);
        } else if (poss==size){
            addlast(val);
        }else if (poss>0&&poss<size){
            Node n,t;
            n=new Node(val,null);
            t=start;
            for (int i=0;i<poss-1;i++){
                t=t.getnext();
            }
            n.setNext(t.getnext());
            t.setNext(n);
            size++;

        }else {
            System.out.println("addition is not possible at the possition"+poss);
        }

    }
    public void deletefirst(){
        if (start==null){
            System.out.println("list is empty");
        }
        else {
            start=start.getnext();
            size--;
        }
    }
    public void deletelast(){
        if (start==null){
            System.out.println("list is empty");
        }
        else if (size==1){
            start=null;
            size--;
        }
        else {
            Node t;
            t=start;
            for (int i=0;i<size-1;i++){
                t=t.getnext();
            }
            t.setNext(null);
            size--;
        }
    }
    public void deleteposs(int poss){
        if (start==null){
            System.out.println("list is empty");
        }
        else if (poss<0||poss>size-1){
            System.out.println("deletion not possible");
        }
        else if (poss==0){
            deletefirst();
        }
        else if (poss==size-1){
            deletelast();
        }
        else {
            Node t,t1;
            t=start;
            for (int i=0;i<poss-1;i++){
                t=t.getnext();
            }
            t1=t.getnext();
            t.setNext(t1.getnext());
            size--;
        }
    }
    public void view(){
        Node t;
        if (isEmpty()){
            System.out.println("empty");
        }else {
            t=start;
            for (int i=0;i<size;i++){
                System.out.print(" "+t.getData());
                t=t.getnext();
            }
        }
    }

}

public class mth {

    public static void main(String[] args) {
        Linklist ll=new Linklist();
       // ll.addlast(2);
        ll.addfirst(1);
        ll.addfirst(3);
        ll.addlast(4);
        ll.addpossition(0,3);
        ll.deletelast();
        ll.deletefirst();
        ll.deleteposs(0);
ll.getSize();
        ll.view();
       // ll.getSize();

    }

}


         */

     //2 //  ******   stack with strach **********
        /*
        class Node {
     int data;
     Node next;
     public Node(int d,Node n){
         this.data=d;
         this.next=n;
     }


 }
  class stack{
     int size;
      Node  head;
      public  boolean isEmpty(){
          if (head==null){
              return true;
          }else {
              return false;
          }
      }
      public  void push(int val){
          Node n=new Node(val,null);
          if (isEmpty()){
              head=n;
              size++;
              return;
          }
          n.next=head;
          head=n;
          size++;
      }
      public int  pop(){
          if (isEmpty()){
              return -1;
          }
          int current= head.data;
          head=head.next;
          size--;
          return current;
      }
      public int peek(){
          if (isEmpty()){
              return -1;
          }
          int top=head.data;
          return top;
      }
  }



         public class mth {

        public static void main(String[] args) {
          stack ss=new stack();
          ss.push(4);
          ss.push(5);
          ss.push(7);
          while (!ss.isEmpty()){
              System.out.println(ss.peek()+"*");
              System.out.println(ss.pop());
          }


        }

         */
   //       ******************* stack strach with arraylist**************************
        /*
        import java.util.ArrayList;

        class stack {
            ArrayList<Integer> al=new ArrayList<>();
            public void push(int val){
                al.add(val);
            }
            public boolean isempty(){
                if (al.size()==0){
                    return true;
                }else {
                    return false;
                }
            }
            public int  pop(){
                if (isempty()){
                    return -1;
                }
                int top=al.get(al.size()-1);
                al.remove(al.size()-1);
                return top;
            }
            public int peek(){
                if (isempty()){
                    return -1;
                }
                return al.get(al.size()-1);

            }


        }

        public class mth {

            public static void main(String[] args) {
                com.company.stack ss=new com.company.stack();
                ss.push(4);
                ss.push(5);
                ss.push(7);
                while (!ss.isempty()){
                    System.out.println(ss.peek()+"*");
                    System.out.println(ss.pop());
                }


            }

         */

        }
}
