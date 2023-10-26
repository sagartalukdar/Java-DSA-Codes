import jdk.jshell.spi.SPIResolutionException;



//  ***  doubly linkedlist's implementation   ***

public class doublycirculer_Linkedlist {
    Node head;
    Node tail;
   static class Node {
        int val;
        Node next;
        Node previous;
        public Node(int n){
            this.val=n;
        }
    }
    public void printfromhead(Node head){
       Node temp=head;
       while (temp!=null){
           System.out.print(temp.val+" ");
           temp=temp.next;
       }
        System.out.println();
    }
    public void printfromtail(Node tail){
       Node temp=tail;
       while (temp!=null){
           System.out.print(temp.val+" ");
           temp=temp.previous;
       }
        System.out.println();
    }
    public void print_from_anynode(Node n){
       Node temp=n;
       while (temp.previous!=null){
           temp=temp.previous;
       }
       while (temp!=null){
           System.out.print(temp.val+" ");
           temp=temp.next;
       }
        System.out.println();
    }
    public Node insertathead(Node head,int n){
       Node nn=new Node(n);
        if(head==null){
            head=nn;
            tail=nn;
            return head;
        }
       nn.next=head;
       head.previous=nn;
       head=nn;
       return head;
    };
   public void insertattail(Node head,int n){// if head had given instead of tail
       Node temp=head;
       Node nn=new Node(n);
       if(head==null){
           head=nn;
           tail=nn;
           return ;
       }
       while (temp.next!=null){
           temp=temp.next;
       }

       temp.next=nn;
        nn.previous=temp;
        temp=nn;
        tail=temp;
   }

public void insertattailbytail(Node tail,int n){
       Node nn=new Node(n);
       if (tail==null){
           tail=nn;
           head=nn;
           return;
       }
       tail.next=nn;
       nn.previous=tail;
       tail=nn;
}
public void insertatanyposition(Node head,int pos,int n){
       Node nn=new Node(n);
       Node temp=head;
       if (pos==0){
           insertathead(head,n);
           return;
       }
       for (int i=0;i<pos-1;i++){
           if (temp==null){
               break;
           }
           temp=temp.next;
       }

       temp.previous.next=nn;
       nn.next=temp;
       nn.previous=temp.previous;
       temp.previous=nn;
}
    public Node deletehead(Node head){
       if (head==null){
           return head;
       }
       head=head.next;
       head.previous=null;
       return head;
    }
    public void deletetail(Node head){
       if (head==null){
           return;
       }
       Node temp=head;
       while (temp.next!=null){
           temp=temp.next;
       }
       tail=temp.previous;
       tail.next=null;
    }
    public void deleteanynode(Node head,int pos){
       Node temp=head;
       for (int i=0;i<pos-1;i++) {
           if (temp == null) {
               break;
           }
           temp = temp.next;
       }
           temp.previous.next=temp.previous.next.next;
           temp.next.previous=temp.previous;

    }

    //   is the doubly linked list palindrome or not
    public boolean ispalindrome(Node head){
       Node temp=head;
       while (temp.next!=null){
           temp=temp.next;
       }
       Node t=temp;
       temp=head;
       while (temp!=t){
           if (temp.val!=t.val)return false;
           temp=temp.next;
           t=t.previous;
       }
       return true;
    }
    public boolean two_sum(Node head,int target){
       Node temp=head;
       while (temp.next!=null){
           temp=temp.next;
       }
       Node t=temp;
       temp=head;
       while (temp!=t){
           if(temp.val+t.val==target)return true;
           else if (temp.val+t.val>target) { // linked list should to be shorted
               t=t.previous;                 // 1,2,3,4  target=6;
           }else {
               temp=temp.next;
           }
       }
       return false;
    }

    public static void main(String[] args) {
//        Node a=new Node(1);
//        Node b=new Node(10);
//        Node c=new Node(100);
//        Node d=new Node(1000);
//        Node e=new Node(10000);
//        Node f=new Node(100000);
//        a.next=b;
//        b.previous=a;
//        b.next=c;
//        c.previous=b;
//        c.next=d;
//        d.previous=c;
//        d.next=e;
//        e.previous=d;
//        e.next=f;
//        f.previous=e;

        doublycirculer_Linkedlist dcl=new doublycirculer_Linkedlist();

        //        dcl.head=a;
//        dcl.tail=f;
//        dcl.printfromhead(dcl.head);
//        dcl.printfromtail(dcl.tail);
//        dcl.print_from_anynode(d);
    Node a=dcl.insertathead(dcl.head,2);
    Node b=dcl.insertathead(a,1);
    dcl.insertattail(b,3);
    dcl.insertattailbytail(dcl.tail,4);
//    dcl.insertatanyposition(b,3,0);
//   Node d= dcl.deletehead(b);
    dcl.printfromhead(b);
//    dcl.printfromhead(d);
//    dcl.deletetail(d);
//        dcl.printfromhead(d);
//    dcl.deleteanynode(d,2);
//    dcl.printfromhead(d);

//        System.out.println(dcl.ispalindrome(b));
//        System.out.println(dcl.two_sum(b,9));
    }
}


//  **   circuler linked list implementation  **

//1.   singly circuler list ***
//public class doublycirculer_Linkedlist {
//    Node head;
//   static class Node {
//      int val;
//      Node next;
//      public Node(int n){
//          this.val=n;
//      }
//    }
//    public void print (Node head){
//       Node temp=head;
//       while (temp.next!=head){
//           System.out.print(temp.val+" ");
//           temp=temp.next;
//       }
//        System.out.println(temp.val);
//    }
//    public void printbyanynode(Node n){
//       Node temp=n;
//       while (temp.next!=n){
//           System.out.print(temp.val+" ");
//           temp=temp.next;
//       }
//        System.out.println(temp.val);
//    }
//    public Node deletehead(Node head){
//       Node temp=head;
//       while (temp.next!=head){
//           temp=temp.next;
//       }
//       temp.next=head.next;
//       head=temp.next;
//       return head;
//    }
//    public static void main(String[] args) {
//     Node a=new Node(1);
//     Node b=new Node(2);
//     Node c=new Node(3);
//     Node d=new Node(4);
//     Node e=new Node(5);
//
//     doublycirculer_Linkedlist dc=new doublycirculer_Linkedlist();
//     dc.head=a;
//     a.next=b;
//     b.next=c;
//     c.next=d;
//     d.next=e;
//     e.next=a;
//
//     dc.print(dc.head);
//     dc.printbyanynode(c);
//      Node n=dc.deletehead(dc.head);
//      dc.print(n);
//    }
//}

//2.    ** doubly circuler linked list **
//public class doublycirculer_Linkedlist {
//        Node head;
//    Node tail;
//   static class Node {
//        int val;
//        Node next;
//        Node previous;
//        public Node(int n){
//            this.val=n;
//        }
//    }
//    public void printusingnext(Node head){
//       Node temp=head;
//       while (temp.next!=head){
//           System.out.print(temp.val+" ");
//           temp=temp.next;
//       }
//        System.out.println(temp.val);
//    }
//    public void printusingprevious(Node tail){
//        Node temp=tail;
//        while (temp.previous!=tail){
//            System.out.print(temp.val+" ");
//            temp=temp.previous;
//        }
//        System.out.println(temp.val);
//    }
//    public void printbyanynode(Node n){
//       Node temp=n;
//       while (temp.next!=n){
//           System.out.print(temp.val+" ");
//           temp=temp.next;
//       }
//        System.out.println(temp.val);
//    }
//    public static void main(String[] args) {
//                Node a=new Node(1);
//        Node b=new Node(10);
//        Node c=new Node(100);
//        Node d=new Node(1000);
//        Node e=new Node(10000);
//        Node f=new Node(1000000);
//        a.next=b;
//        b.previous=a;
//        b.next=c;
//        c.previous=b;
//        c.next=d;
//        d.previous=c;
//        d.next=e;
//        e.previous=d;
//        e.next=f;
//        f.previous=e;
//        f.next=a;
//        a.previous=f;
//
//        doublycirculer_Linkedlist dc=new doublycirculer_Linkedlist();
//        dc.head=a;
//        dc.tail=f;
//
//        dc.printusingnext(dc.head);
//        dc.printusingprevious(dc.tail);
//        dc.printbyanynode(d);
//    }
//}

