package javadsasys_design;

//import org.w3c.dom.Node;
//
//public class pwcourselinkedlist {
//    Node head;
//    class Node{
//        int data;
//        Node next;
//        public Node(int n){
//            this.data=n;
//            this.next=null;
//        }
//    }
//    public void insertionattheend(int n){
//        Node createnode=new Node(n);
//        if (head==null){
//            head=createnode;
//            return;
//        }
//        Node temp=head;
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=createnode;
//    }
//    public void insertbegin(int n){
//        Node newn=new Node(n);
//        newn.next=head;
//        head=newn;
//    }
//    public void insertafteranynode(Node previousnode,int n){
//     if(head==null){
//System.out.println("head is allready null and add any node after it that is not apllicable");
//      return;
//          }
//        Node newnode=new Node(n);
//        newnode.next=previousnode.next;
//        previousnode.next=newnode;
//    }
//    public void deletion(int position){
//        Node temp=head;
//        if (head==null){
//            return;
//        }
//        if (position==0){
//            head=temp.next;
//            return;
//        }
//        for (int i=0;i<position-1&&temp!=null;i++){
//            temp=temp.next;
//        }
//        if (temp==null||temp.next==null){
//            return;
//        }
//        temp.next=temp.next.next;
//
//    }
//    public void reverseiteratively(){
//       Node current =head;
//       Node previous=null;
//       Node next=null;
//       while (current!=null){
//           next=current.next;
//           current.next=previous;
//           previous=current;
//           current=next;
//       }
//       head=previous;
//    }
//    public void reverserecursivliy(Node current,Node previous) {
//        if (current==null){
//            head=previous;
//            return;
//        }
//        Node next = current.next;
//        current.next = previous;
//        reverserecursivliy(next,current);
//    }
//    public void foundmiddle(){
//        Node slow=head;
//        Node fast=head;
//        while (fast!=null&&fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        System.out.println(slow.data);
//    }

 // in even number of node linkedlist ,there are two middle node find the left one
//public void left_middle(){
//     Node slow=head;
//     Node fast=head;
//     while (fast.next.next!=null){
//         slow=slow.next;
//         fast=fast.next.next;
//     }
//    System.out.println(slow.data);
//}
//
//    public void cycledetection(){
//        Node slow=head;
//        Node fast=head;
//        while (fast!=null&&fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//            if (slow==fast){
//                System.out.println("cycle detected");
//                break;
//            }
//        }
//        if (fast==null||fast.next==null){
//            System.out.println("no cycle");
//        }
//    }
//    public void display(){
//        Node temp=head;
//        while (temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//    }
//    public static void main(String[] args) {
//        pwcourselinkedlist ll=new pwcourselinkedlist();
//        ll.insertionattheend(2);
//        ll.insertionattheend(21);
//        ll.insertionattheend(24);
//        ll.insertbegin(67);
//        ll.insertafteranynode(ll.head.next.next.next, 0);
//        ll.deletion(6);
//        ll.reverseiteratively();
//        ll.reverserecursivliy(ll.head, null);
//        ll.foundmiddle();
//        ll.display();

//        Node temp= ll.head;
//        while (temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next= ll.head;
//        ll.cycledetection();
//        System.out.println("left middile:");
//        ll.left_middle();
//
//    }
//}


//Linked list practice

//public class pwcourselinkedlist {
//    Node head=null;
//    int size=0;
//    class Node {
//        int data;
//        Node next;
//
//        public Node(int n) {
//            this.data = n;
//            this.next = null;
//        }
//    }
//        public  void insertatfirst(int n) {
//        Node nod=new Node(n);
//        nod.next=head;
//        head=nod;
//        size++;
//        }
//        public void insertatend(int n){
//          Node nod=new Node(n);
//          Node temp=head;
//          if (head==null){
//              head=nod;
//              size++;
//              return;
//          }
//          while (temp.next!=null){
//              temp=temp.next;
//          }
//          temp.next=nod;
//          size++;
//        }
//     public void insertatanynode(int n,int position){
//        Node nod=new Node(n);
//        Node temp=head;
//   if (position==0){
//       insertatfirst(n);
//       size++;
//       return;
//   }
//   if (position>size||position<0){
//       return;
//   }
//      for (int i=0;i<position-1&&temp.next!=null;i++){
//              temp=temp.next;
//      }
//
//      nod.next=temp.next;
//      temp.next=nod;
//      size++;
//     }
//    public void insertatanynode(int n,Node previous){
//        if (head==null){
//            System.out.println("not applicable");
//            return;
//        }
//       Node nod=new Node(n);
//       nod.next=previous.next;
//       previous.next=nod;
//       size++;
//    }
//     public void display(){
//        Node temp=head;
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//         System.out.println();
//     }
//
//     public void diplayrecursively(Node temp){
//        if (temp==null){
//            return;
//        }
//         System.out.print(temp.data+" ");
//         diplayrecursively(temp.next);
//     }
//    public void diplayrecursivelyreverse(Node temp){
//        if (temp==null){
//            return;
//        }
//        diplayrecursivelyreverse(temp.next);
//        System.out.print(temp.data+" ");
//
//    }
//    public void deletion(int position){
//        Node temp=head;
//        if (position==0){
//            head=temp.next;
//            return;
//        }
//        if (head==null){
//            System.out.println("nothing have to delete!");
//            return;
//        }
//        for (int i=0;i<position-1&&temp.next!=null;i++){
//            temp=temp.next;
//        }
//        if (temp.next==null||temp==null){
//            return;
//        }
//        temp.next=temp.next.next;
//        size--;
//    }
//    public void get(int position){
//       Node temp=head;
//       if (position==0){
//            System.out.println(temp.data);
//            return;
//        }
//       if (head==null){
//           return;
//       }
//       for (int i=1;i<=position-1&&temp.next!=null;i++){
//           temp=temp.next;
//       }
//       if (temp.next==null||temp==null){
//           return;
//       }
//        System.out.println(temp.next.data);
//    }
//    public static void main(String[] args) {
//
//    pwcourselinkedlist pll=new pwcourselinkedlist();
//    pll.insertatfirst(5);
//    pll.insertatfirst(4);
//    pll.insertatend(6);
//    pll.insertatanynode(2,1);
//    pll.deletion(2);
//    pll.get(0);
//    pll.display();
//        pll.diplayrecursively(pll.head);
//        pll.diplayrecursivelyreverse(pll.head);
//    }
//
//}

import org.w3c.dom.Node;

//pwyoutubeproblem.1
public class pwcourselinkedlist {
   Node head;
   int size=0;
   class Node{
       int val;
       Node next;
       public Node(int n){
           this.val=n;
       }
   }
    public  void insertatfirst(int n) {
        Node nod=new Node(n);
        nod.next=head;
        head=nod;
        size++;
        }
        public void insertatend(int n){
          Node nod=new Node(n);
          Node temp=head;
          if (head==null){
              head=nod;
              size++;
              return;
          }
          while (temp.next!=null){
              temp=temp.next;
          }
          temp.next=nod;
          size++;
        }
     public void insertatanynode(int n,int position){
        Node nod=new Node(n);
        Node temp=head;
   if (position==0){
       insertatfirst(n);
       size++;
       return;
   }
   if (position>size||position<0){
       return;
   }
      for (int i=0;i<position-1&&temp.next!=null;i++){
              temp=temp.next;
      }

      nod.next=temp.next;
      temp.next=nod;
      size++;
     }
    public void insertatanynode(int n,Node previous){
        if (head==null){
            System.out.println("not applicable");
            return;
        }
       Node nod=new Node(n);
       nod.next=previous.next;
       previous.next=nod;
       size++;
    }
     public void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
         System.out.println();
     }
     public void deletenode(Node n){
       n.val=n.next.val;
       n.next=n.next.next;
     }
     public void get_nth_node_fromlast(Node head,int nth){
       int nthfromlast=size-nth+1;
       Node temp=head;
       for (int i=0;i<nthfromlast-1;i++){
           temp=temp.next;
       }
         System.out.println(temp.val);
     }

 //better approach to find nth node from last because it's run in one traversal
     public void best_approach_get_nth_node_fromlast(Node head,int nth){
       Node slow=head;
       Node fast=head;
     for (int i=0;i<nth;i++){ //you can traverse from 1 to <=nth;
         fast=fast.next;
     }
     while (fast!=null){
         slow=slow.next;
         fast=fast.next;
     }
         System.out.println(slow.val);
     }
     public Node delete_nth_node_fromlast(Node head,int n){
       Node slow=head;
       Node fast=head;
       for (int i=0;i<n;i++){
           fast=fast.next;
       }
       if (fast==null){
           head=head.next;
           return head;
       }
       while (fast.next!=null){
           slow=slow.next;
           fast=fast.next;
       }
        slow.next=slow.next.next;
       return head;
     }

     //         *****     odd_even Linked List   *******
    //  using extra space by creating new node in after every check
     public Node odd_even_list(){
       Node odd=new Node(0);
       Node even=new Node(0);
       Node temp1=even;
       Node temp2=odd;
       Node temp=head;
       while (temp!=null){
           if (temp.val%2==0){
               Node en=new Node(temp.val);
               temp1.next=en;
               temp1=temp1.next;
               temp=temp.next;
           }
           else {
               Node on=new Node(temp.val);
               temp2.next=on;
               temp2=temp2.next;
               temp=temp.next;
           }
       }
       odd=odd.next;
       even=even.next;
       temp2.next=even;
       return odd;
     }

    //         *****     odd_even Linked List   *******
    // without using extra space by creating new node after every check
    public Node odd_evenlist(){

        Node odd=new Node(0);
        Node even=new Node(0);
        Node temp1=even;
        Node temp2=odd;
        Node temp=head;
        while (temp!=null){
            if (temp.val%2==0){
                temp1.next=temp;
                temp1=temp1.next;
                if (temp.next==null){
                   temp2.next=null;
                }
                temp=temp.next;
            }
            else {
                temp2.next=temp;
                temp2=temp2.next;
                if (temp.next==null){
                     temp1.next=null;
                }
                temp=temp.next;
            }
        }
        odd=odd.next;
        even=even.next;
        temp2.next=even;
        return odd;
    }
    public static void main(String[] args) {
       pwcourselinkedlist l=new pwcourselinkedlist();
       l.insertatfirst(3);
       l.insertatfirst(5);
       l.insertatfirst(4);
       l.insertatfirst(1);
       l.insertatfirst(2);
       l.insertatfirst(8);
       l.insertatfirst(10);
       l.insertatfirst(13);
       l.display(l.head);
//       l.deletenode(l.head.next);
//        l.get_nth_node_fromlast(l.head,3 );
//        l.best_approach_get_nth_node_fromlast(l.head,3);
//        Node modifyhead=l.delete_nth_node_fromlast(l.head,6);
//       l.display(modifyhead);
     Node odd=l.odd_evenlist();
//        Node odd=l.odd_even_list();
     l.display(odd);
    }
}