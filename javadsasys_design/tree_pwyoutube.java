package javadsasys_design;

//public class tree_pwyoutube {
//    static class Node{
//        int val;
//        Node left;
//        Node right;
//        public Node(int n){
//            this.val=n;
//        }
//    }
//    public static void print(Node root){//preorder traversal
//        if(root==null){
//            return;
//        }
//        System.out.print(root.val+"->");
//       if (root.left!=null)System.out.print(root.left.val+" ");
//       else System.out.print("null ");
//        if(root.right!=null)System.out.println(root.right.val);
//        else System.out.println("null");
//        print(root.left);
//        print(root.right);
//    }
//    public static void main(String[] args) {
//        Node root=new Node(10);
//        Node a=new Node(5);
//        Node b=new Node(4);
//        root.left=a;
//        root.right=b;
//        Node c=new Node(7);
//        Node d=new Node(8);
//        a.left=c;
//        a.right=d;
//        Node e=new Node(1);
//        b.right=e;
//        print(root);
//    }
//}


import java.util.*;

//public class tree_pwyoutube {
//    static int sum=0;
//    static class Node{
//        int val;
//        Node left;
//        Node right;
//        public Node(int n){
//            this.val=n;
//        }
//    }
//   static int size=0;
//  public static void preorder(Node root){
//
//        if(root==null)return ;
//      System.out.print(root.val+" ");
//      size++;
//      preorder(root.left);
//      preorder(root.right);
//  }
//  public static void inorder(Node root){
//      if(root==null)return;
//      inorder(root.left);
//      System.out.print(root.val+" ");
//      inorder(root.right);
//  }
//  public static void postorder(Node root){
//      if(root==null)return;
//      postorder(root.left);
//      postorder(root.right);
//      System.out.print(root.val+" ");
//
//
//  }
//public static void print_nth_level_elements(Node root,int level){
//  if(root==null)return;
//  if(level==1) {
//      System.out.print(root.val + " ");
//      return;
//  }
//  print_nth_level_elements(root.left,level-1);//left to right printing
//  print_nth_level_elements(root.right,level-1);
//  }
//    public static void print_nth_level_element(Node root,int level){
//        if(root==null)return;
//        if(level==1) {
//            System.out.print(root.val + " ");
//            return;
//        }
//        print_nth_level_element(root.right,level-1);//right to left printing
//        print_nth_level_element(root.left,level-1);
//    }
//  public static int getSize(Node root){
//      if(root==null)return 0;
//     return getSize(root.left)+getSize(root.right)+1;
//  }
//  public static int sumOfAllNodes(Node root){
//      if(root==null)return 0;
//      sum+= root.val;
//      sumOfAllNodes(root.left);
//      sumOfAllNodes(root.right);
//      return sum;
//  }
//  public static int max(Node root){
//      if(root==null){
//          return Integer.MIN_VALUE;
//      }
//      int max=Integer.MIN_VALUE;
//      max=Math.max(max, root.val);
//      max(root.left);
//      max(root.right);
//      return max;

//      if(root==null)return Integer.MIN_VALUE;
//     return Math.max(root.val, Math.max(max(root.left),max(root.right)));
//  }
//  public static int level_wise_height(Node root){
//      if(root==null)return 0;
//      return 1+Math.max(level_wise_height(root.left),level_wise_height(root.right));
//  }
//public static int edges_wise_height(Node root){//levelheight-1=edgeheight
//      if(root==null||(root.left==null && root.right==null))return 0;
//      return 1+Math.max(edges_wise_height(root.left),edges_wise_height(root.right));
//  }
//  public static int min(Node root){
//      if(root==null)return Integer.MAX_VALUE;
//      return Math.min(root.val,Math.min(min(root.left),min(root.right)));
//  }
//  public static int product(Node root){
//      if(root==null)return 1;
//          return root.val*product(root.left)*product(root.right);
//  }
//  public static void Breath_first_search(Node root){
//      /*
//      iterativly printing level wise elements is breath first search
//       */
//   Queue<Node>q=new LinkedList<>();
//   if(root!=null)q.add(root);
//   while (!q.isEmpty()) {
//       Node temp=q.poll();
//       if (temp.left != null) q.add(temp.left);
//       if (temp.right != null) q.add(temp.right);
//       System.out.print(temp.val+" ");
//   }
//  }
//  public static void Defth_first_search_inorder(Node root){
      /*
      iterativly printing preorder,postorder,inorder is
      defth first search
       */
//      Stack<Node >s=new Stack<>();
//     if(root!=null) s.push(root);//in case if no tree present
//      while (!s.isEmpty()) {
//          Node temp = s.peek();
//          if (temp.left != null) {
//              s.push(temp.left);
//              temp.left = null;
//          } else {
//              s.pop();
//              System.out.print(temp.val+" ");
//              if (temp.right != null) {
//                  s.push(temp.right);
//                  temp.right = null;
//              }
//          }
//      }
//  }
//  public static void dfs_preorder(Node root){
//      Stack<Node>s=new Stack<>();
//      s.push(root);
//      while (!s.isEmpty()){
//          Node temp=s.pop();
//          System.out.print(temp.val+" ");
//              if(temp.right!=null){
//                  s.push(temp.right);
//          }
//          if (temp.left!=null){
//              s.push(temp.left);
//
//          }
//      }
//  }
//  public static void dfs_postorder(Node root){
//      Stack<Node>s=new Stack<>();
//      s.push(root);
//      while (!s.isEmpty()){
//          Node temp=s.peek();
//          if(temp.right!=null) {
//              s.push(temp.right);
//              temp.right=null;
//          }
//           if(temp.left!=null) {
//              s.push(temp.left);
//              temp.left=null;
//          }
//          else {
//              Node n = s.pop();
//              System.out.print(n.val + " ");
//          }
//      }
//  }
//    public static void main(String[] args) {
//        Node root=new Node(10);
//        Node a=new Node(5);
//        Node b=new Node(4);
//        root.left=a;
//        root.right=b;
//        Node c=new Node(7);
//        Node d=new Node(8);
//        a.left=c;
//        a.right=d;
//        Node e=new Node(1);
//        b.right=e;
//        preorder(root);
//        System.out.println("size:"+size);
//        System.out.println(getSize(root));
//        System.out.println(sumOfAllNodes(root));
//        System.out.println("max:" + max(root));
//        System.out.println(level_wise_height(root));
//        System.out.println(edges_wise_height(root));
//        System.out.println(min(root));
//        System.out.println(product(root)+" product");
//        inorder(root);
//        System.out.println();
//        postorder(root);
//        System.out.println();
//        print_nth_level_elements(root,3);
//        System.out.println();
//        int level=level_wise_height(root);
//        for (int i=1;i<=level;i++){
//            print_nth_level_elements(root,i);
//            print_nth_level_element(root,i);
//            System.out.println();
//        }
//        Breath_first_search(root);
//        System.out.println();
//        Defth_first_search_inorder(root);
//        dfs_preorder(root);
//        System.out.println();
//        dfs_postorder(root);
//    }
//}


              //   *** implement total binary tree ***
//   public class tree_pwyoutube {
//      static class Node {
//           int val;
//           Node left;
//           Node right;
//           public Node(int n){
//               this.val=n;
//           }
//       }
//      public static int level_wise_height(Node root){
//      if(root==null)return 0;
//      return 1+Math.max(level_wise_height(root.left),level_wise_height(root.right));
//  }
//    public static void print_nth_level_elements(Node root,int level){
//  if(root==null)return;
//  if(level==1) {
//      System.out.print(root.val + " ");
//      return;
//  }
//  print_nth_level_elements(root.left,level-1);//left to right printing
//  print_nth_level_elements(root.right,level-1);
//  }
//
//  public static Node constractTree(String []s){
//      Queue<Node >q=new LinkedList<>();
//      int r=Integer.parseInt(s[0]);
//      Node root=new Node(r);
//      q.add(root);
//      int i=1;
//      while (i<s.length-1){
//          Node temp=q.poll();
//          Node left=new Node(0);
//          Node right=new Node(0);
//          if(s[i]==null){
//              left=null;
//          }else {
//              int l=Integer.parseInt(s[i]);
//              left.val=l;
//              q.add(left);
//          }
//          if(s[i+1]==null){
//              right=null;
//          }else {
//              int l=Integer.parseInt(s[i+1]);
//              right.val=l;
//              q.add(right);
//          }
//          temp.left=left;
//          temp.right=right;
//          i+=2;
//
//      }
//      return root;
//  }
//       public static void main(String[] args) {
//          // implementation part *******
//String s[]={"1","2","3","4","5",null,"6",null,"7",null,null,"8",null,null,null,"9",null};
//     Node root=constractTree(s);
//           int level=level_wise_height(root);
//        for (int x=1;x<=level;x++){
//            print_nth_level_elements(root,x);
//            System.out.println();
//        }
//       }
//}


//          *****  boundry elements printing  *****
//public class tree_pwyoutube {
//    static class Node {
//                   int val;
//           Node left;
//           Node right;
//           public Node(int n){
//               this.val=n;
//           }
//       }
//
//     public static Node constractTree(String []s){
//      Queue<Node >q=new LinkedList<>();
//      int r=Integer.parseInt(s[0]);
//      Node root=new Node(r);
//      q.add(root);
//      int i=1;
//      while (i<s.length-1){
//          Node temp=q.poll();
//          Node left=new Node(0);
//          Node right=new Node(0);
//          if(s[i]==null){
//              left=null;
//          }else {
//              int l=Integer.parseInt(s[i]);
//              left.val=l;
//              q.add(left);
//          }
//          if(s[i+1]==null){
//              right=null;
//          }else {
//              int l=Integer.parseInt(s[i+1]);
//              right.val=l;
//              q.add(right);
//          }
//          temp.left=left;
//          temp.right=right;
//          i+=2;
//
//      }
//      return root;
//  }
//  public static void printBoundry(Node root){
//        printLeftBoundry(root);
//        printBottomBoundry(root);
//        printRightBoundry( root.right);
//  }
//  public static void printLeftBoundry(Node root){
//        if(root.left==null && root.right==null)return;
//      System.out.print(root.val+" ");
//        if(root.left!=null)printLeftBoundry(root.left);
//        else printLeftBoundry(root.right);
//  }
//  public static void printBottomBoundry(Node root){
//        if(root==null)return;
//        if(root.left==null&& root.right==null){
//            System.out.print(root.val+" ");
//            return;
//        }
//        printBottomBoundry(root.left);
//        printBottomBoundry(root.right);
//  }
//  public static void printRightBoundry(Node root){
//        if(root.left==null&& root.right==null)return;
//
//      if(root.right!=null)printRightBoundry(root.right);
//      else printRightBoundry(root.left);
//      System.out.print(root.val+" ");
//  }
//    public static void main(String[] args) {
// String sarr[]={"1","2","3","4","5",null,"6","7",null,"8",null,"9","10",
//        null,"11",null,"12",null,"13",null,"14","15","16",null,"17",null,null,
// "18",null,"19",null,null,null,"20","21","22","23",null,"24","25","26",null,"27",
// null,"28"};
//        Node root=constractTree(sarr);
//     printBoundry(root);
//       }
//}



      //     ******    better approach    ******

//     right side view of a binary tree   leetcode ques.

//import java.util.*;
//public class tree_pwyoutube {
//    static class Node {
//           int val;
//           Node left;
//           Node right;
//           public Node(int n){
//               this.val=n;
//           }
//       }
//    public int height(Node root){
//        if(root==null)return 0;
//        return Math.max(height(root.left),height(root.right))+1;
//    }
//    public void helper(Node root,List<Integer>l,int level){
//        if(root==null)return;
//        l.set(level-1,root.val);
//        helper(root.left,l,level+1);
//        helper(root.right,l,level+1);
//    }
//    public List<Integer> rightSideView(Node root) {
//        List<Integer> ans=new ArrayList<>();
//        int h=height(root);
//        for(int i=0;i<h;i++){
//            ans.add(0);
//        }
//        helper(root,ans,1);
//        return ans;
//    }
//    public static void main(String[] args) {
//
//    }
//}


//         ******    left view of a binary tree   *****
//import java.util.*;
//public class tree_pwyoutube {
//    static class Node {
//           int val;
//           Node left;
//           Node right;
//           public Node(int n){
//               this.val=n;
//           }
//       }
//    public static int height(Node root){
//        if(root==null)return 0;
//        return Math.max(height(root.left),height(root.right))+1;
//    }
//    public static void helper(Node root,List<Integer>l,int level){
//        if(root==null)return;
//        l.set(level-1,root.val);
//        helper(root.right,l,level+1);
//        helper(root.left,l,level+1);
//    }
//    public static List<Integer> leftSideView(Node root) {
//        List<Integer> ans=new ArrayList<>();
//        int h=height(root);
//        for(int i=0;i<h;i++){
//            ans.add(0);
//        }
//        helper(root,ans,1);
//        return ans;
//    }
//    public static Node constractTree(String []s){
//      Queue<Node >q=new LinkedList<>();
//      int r=Integer.parseInt(s[0]);
//      Node root=new Node(r);
//      q.add(root);
//      int i=1;
//      while (i<s.length-1){
//          Node temp=q.poll();
//          Node left=new Node(0);
//          Node right=new Node(0);
//          if(s[i]==null){
//              left=null;
//          }else {
//              int l=Integer.parseInt(s[i]);
//              left.val=l;
//              q.add(left);
//          }
//          if(s[i+1]==null){
//              right=null;
//          }else {
//              int l=Integer.parseInt(s[i+1]);
//              right.val=l;
//              q.add(right);
//          }
//          temp.left=left;
//          temp.right=right;
//          i+=2;
//
//      }
//      return root;
//  }
//    public static void main(String[] args) {
//
//        String[]s={"1","2","3",null,"4","5","6",null,"7"};
//        Node root=constractTree(s);
//        List <Integer>l=leftSideView(root);
//        System.out.println(l);
//    }
//}


//   ******    top view of a binary tree  and vertical level elements printing *******
//public class tree_pwyoutube {
//        static class Node {
//           int val;
//           Node left;
//           Node right;
//           public Node(int n){
//               this.val=n;
//           }
//       }
//        public static Node constractTree(String []s){
//      Queue<Node >q=new LinkedList<>();
//      int r=Integer.parseInt(s[0]);
//      Node root=new Node(r);
//      q.add(root);
//      int i=1;
//      while (i<s.length-1){
//          Node temp=q.poll();
//          Node left=new Node(0);
//          Node right=new Node(0);
//          if(s[i]==null){
//              left=null;
//          }else {
//              int l=Integer.parseInt(s[i]);
//              left.val=l;
//              q.add(left);
//          }
//          if(s[i+1]==null){
//              right=null;
//          }else {
//              int l=Integer.parseInt(s[i+1]);
//              right.val=l;
//              q.add(right);
//          }
//          temp.left=left;
//          temp.right=right;
//          i+=2;
//
//      }
//      return root;
//  }
//  public static void topView(Node root){
//      int left=leftCount(root);
//      int right=rightCount(root);
//      for (int i=1-left;i<right;i++){
//          printTop(root,i,0);
//      }
//  }
//  public static void printVerticalLevel(Node root,int level,int point){
//            //this is  printing of vertical level elements
//            if(root==null)return;
//            if(level==point){
//                System.out.print(root.val+" ");
//            }
//      printVerticalLevel(root.left,level,point-1);
//      printVerticalLevel(root.right,level,point+1);
//  }
//  public static int leftCount(Node root){
//            if(root==null)return 0;
//            return leftCount(root.left)+1;
//  }
//  public static int rightCount(Node root){
//            if(root==null)return 0;
//            return 1+rightCount(root.right);
//  }
//    public static void printTop(Node root,int level,int point){
//        //this is verticaly printing of level elements but for the return
//        // statement that will print only top elements of a binary tree
//        if(root==null)return;
//        if(level==point){
//            System.out.print(root.val+" ");
//           return;
//        }
//        printTop(root.left,level,point-1);
//        printTop(root.right,level,point+1);
//    }
//
//    public static void main(String[] args) {
//        String []s={"1","2","3","4","5",null,"6",null,"7"};
//        Node root=constractTree(s);
//        topView(root);
//        System.out.println();
//        printVerticalLevel(root,-1,0);
//    }
//}


//   ******     Bottom view of a binary tree    *******
//public class tree_pwyoutube {
//        static class Node {
//           int val;
//           Node left;
//           Node right;
//           public Node(int n){
//               this.val=n;
//           }
//       }
//        public static Node constractTree(String []s){
//      Queue<Node >q=new LinkedList<>();
//      int r=Integer.parseInt(s[0]);
//      Node root=new Node(r);
//      q.add(root);
//      int i=1;
//      while (i<s.length-1){
//          Node temp=q.poll();
//          Node left=new Node(0);
//          Node right=new Node(0);
//          if(s[i]==null){
//              left=null;
//          }else {
//              int l=Integer.parseInt(s[i]);
//              left.val=l;
//              q.add(left);
//          }
//          if(s[i+1]==null){
//              right=null;
//          }else {
//              int l=Integer.parseInt(s[i+1]);
//              right.val=l;
//              q.add(right);
//          }
//          temp.left=left;
//          temp.right=right;
//          i+=2;
//
//      }
//      return root;
//  }
//    public static void bottomView(Node root, int point, HashMap<Integer,Integer>hm){
//            if(root==null)return;
//
////            if(hm.containsKey(point))hm.put(point,root.val);
////            else hm.put(point,root.val);
//
////        we don't need to check wheather it present or not because it
////        both the time hm put the root.val if it allready present then
////        hashmap update that by the new root.val in the same point(Level)
//
//              hm.put(point,root.val);
//            /*
//            first go right and then left because if any two nodes overlaped
//            then we consider the left node in our bottom view elements;
//             */
//      bottomView(root.right,point+1,hm);
//      bottomView(root.left,point-1,hm);
//    }
//      public static int leftCount(Node root){
//            if(root==null)return 0;
//            return leftCount(root.left)+1;
//  }
//  public static int rightCount(Node root) {
//      if (root == null) return 0;
//      return 1 + rightCount(root.right);
//  }
//    public static void main(String[] args) {
//        String []s={"1","2","3","4","5",null,"6",null,"7"};
//        HashMap<Integer,Integer>hm=new HashMap<>();
//        Node root=constractTree(s);
//        bottomView(root,0,hm);
//        for (int e:hm.values()){
//            System.out.print(e+" ");
//        }
//
////int left=leftCount(root);//  this code is for printing vals sequencely from hashmap
////      int right=rightCount(root);
////      for (int i=1-left;i<right;i++){
////          System.out.print(hm.get(i)+" ");
////      }
//
//   }
//}


//  ******     Bottom view of a binary tree using arraylist  *******
//public class tree_pwyoutube {
//    static class Node {
//        int val;
//        Node left;
//        Node right;
//        public Node(int n){
//            this.val=n;
//        }
//    }
//    public static Node constractTree(String []s){
//        Queue<Node >q=new LinkedList<>();
//        int r=Integer.parseInt(s[0]);
//        Node root=new Node(r);
//        q.add(root);
//        int i=1;
//        while (i<s.length-1){
//            Node temp=q.poll();
//            Node left=new Node(0);
//            Node right=new Node(0);
//            if(s[i]==null){
//                left=null;
//            }else {
//                int l=Integer.parseInt(s[i]);
//                left.val=l;
//                q.add(left);
//            }
//            if(s[i+1]==null){
//                right=null;
//            }else {
//                int l=Integer.parseInt(s[i+1]);
//                right.val=l;
//                q.add(right);
//            }
//            temp.left=left;
//            temp.right=right;
//            i+=2;
//
//        }
//        return root;
//    }
//
//    public static int leftCount(Node root){
//        if(root==null)return 0;
//        return leftCount(root.left)+1;
//    }
//    public static int rightCount(Node root) {
//        if (root == null) return 0;
//        return 1 + rightCount(root.right);
//    }
//    public static void bottomView(Node root,ArrayList<Integer>a){
//        int left=leftCount(root);
//        int right=rightCount(root);
//        int level=left+right-1;
//        for (int i=0;i<level;i++){
//            a.add(0);
//        }
//        meth(root,a,0,left) ;
//    }
//    public static void meth(Node root,ArrayList<Integer>a,int i,int left){
//        if (root==null)return;
//        a.set(i+Math.abs(1-left), root.val);
//        meth(root.right, a, i + 1,left);
//        meth(root.left, a, i - 1,left);
//    }
//    public static void main(String[] args) {
//        String []s={"1","2","3","4","5",null,"6",null,"7"};
//        ArrayList<Integer>al=new ArrayList<>();
//        Node root=constractTree(s);
//
//        bottomView(root,al);
//        System.out.println(al);
//    }
//}


   // ****   tree problem from course binary tree  *****
//    problem -> complete binary tree ,complete binary tree is
//  which every level except possibly the last ,is filled ,and all
// nodes are as far left as possible .
//public class tree_pwyoutube {
//    public static void main(String[] args) {
////    leetcode
//    }
//}



