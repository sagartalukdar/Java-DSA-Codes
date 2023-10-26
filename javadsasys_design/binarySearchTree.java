package javadsasys_design;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//public class binarySearchTree {
//    static class Node {
//        int val;
//        Node left;
//        Node right;
//
//        public Node(int n) {
//            this.val = n;
//        }
//    }

//    public static Node constractTree(String[] s) {
//        Queue<Node> q = new LinkedList<>();
//        int r = Integer.parseInt(s[0]);
//        Node root = new Node(r);
//        q.add(root);
//        int i = 1;
//        while (i < s.length - 1) {
//            Node temp = q.poll();
//            Node left = new Node(0);
//            Node right = new Node(0);
//            if (s[i] == null) {
//                left = null;
//            } else {
//                int l = Integer.parseInt(s[i]);
//                left.val = l;
//                q.add(left);
//            }
//            if (s[i + 1] == null) {
//                right = null;
//            } else {
//                int l = Integer.parseInt(s[i + 1]);
//                right.val = l;
//                q.add(right);
//            }
//            temp.left = left;
//            temp.right = right;
//            i += 2;
//
//        }
//        return root;
//    }

//    public static void preOrder(Node root) {
//        if (root == null) return;
//        System.out.print(root.val + " ");
//        preOrder(root.left);
//        preOrder(root.right);
//    }

//    public static void postOrder(Node root) {
//        if (root == null) return;
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.print(root.val + " ");
//    }

//    public static void inOrder(Node root) {
//        //inOrder traversal allways give the sorted order(ascending)
//        // of the binary tree
//        if (root == null) return;
//        inOrder(root.left);
//        System.out.print(root.val + " ");
//        inOrder(root.right);
//    }

    // *****  convert a binary search tree to sorted array   ****
//    public static ArrayList<Integer> bstToSortArrau(Node root, ArrayList<Integer> al) {
//        if (root == null) return al;
//        bstToSortArrau(root.left, al);
//        al.add(root.val);
//        bstToSortArrau(root.right, al);
//        return al;
//    }

    //   deletion of node
    //1.  delete leaf node
//    public static void deleteLeafNode(Node root, int Nodeval) {
//        if (root == null) return;
//        if (root.val > Nodeval) {
//            if (root.left.val == Nodeval) root.left = null;
//            else deleteLeafNode(root.left, Nodeval);
//        }
//        if (root.val < Nodeval) {
//            if (root.right.val == Nodeval) root.right = null;
//            else deleteLeafNode(root.right, Nodeval);
//        }
//    }

    //  **** delete that node that has 1 child  ****
//    public static void delete1ChildNode(Node root, int target) {
//        if (root == null) return;
//        if (root.val > target) {
//            if (root.left == null) return;
//            if (root.left.val == target) {
//                Node temp = root.left;
//                if (temp.left == null && temp.right == null) root.left = null;
//                else if (temp.left == null || temp.right == null) {
//                    if (temp.left == null) root.left = temp.right;
//                    else if (temp.right == null) root.left = temp.left;
//                }
//            } else delete1ChildNode(root.left, target);
//        }
//        if (root.val < target) {
//            if (root.right == null) return;
//            if (root.right.val == target) {
//                Node temp = root.right;
//                if (temp.left == null && temp.right == null) root.right = null;
//                if (temp.left == null || temp.right == null) {
//                    if (temp.left == null) root.right = temp.right;
//                    if (temp.right == null) root.right = temp.left;
//                }
//            } else delete1ChildNode(root.right, target);
//        }
//    }


// find the inorder predicessor and successor of a binary tree

//    static int temp=0;
//    static int predicessor=0;
//    static int successor=0;
//    static boolean check=true;
//    public static void inorder_Predicessor_Successor(Node root,int val){
//        if(root==null)return;
//        inorder_Predicessor_Successor(root.left,val);
//        if(root.val==val){
//            predicessor=temp;
////            temp=root.val;
//            check=false;
//        }else {
//           if(check==false) {
//               successor = root.val;
//               check=true;
//           }
//            else temp=root.val;
//        }
//       inorder_Predicessor_Successor(root.right,val);
//    }
//    public static void main(String[] args) {
//        String s[]={"10","5","15",null,"7","12","18"};
//        Node root=constractTree(s);
//        preOrder(root);
//        System.out.println();
//        postOrder(root);
//        System.out.println();
//        inOrder(root);
//        System.out.println();

//        ArrayList<Integer>al=new ArrayList<>();
//        bstToSortArrau(root,al);
//        for (int e:al){
//            System.out.print(e+" ");
//        }

//        deleteLeafNode(root,12);
//        System.out.println();
//        inOrder(root);

//        delete1ChildNode(root,5);
//        System.out.println();
//        inOrder(root);
//    }
//}

//    String []s={"50","25","65","10","42","57","78"};
//    Node root=constractTree(s);
//    inOrder(root);
//        System.out.println();
//    inorder_Predicessor_Successor(root,42);
//        System.out.println(predicessor);
//        System.out.println(successor);
//    }
//}



//    problem .- search an elements in bst in iterative way
//public class binarySearchTree {
//        static class Node {
//            int val;
//            Node left;
//            Node right;
//
//            public Node(int n) {
//                this.val = n;
//            }
//        }
//        public static Node constractTree (String[]s){
//            Queue<Node> q = new LinkedList<>();
//            int r = Integer.parseInt(s[0]);
//            Node root = new Node(r);
//            q.add(root);
//            int i = 1;
//            while (i < s.length - 1) {
//                Node temp = q.poll();
//                Node left = new Node(0);
//                Node right = new Node(0);
//                if (s[i] == null) {
//                    left = null;
//                } else {
//                    int l = Integer.parseInt(s[i]);
//                    left.val = l;
//                    q.add(left);
//                }
//                if (s[i + 1] == null) {
//                    right = null;
//                } else {
//                    int l = Integer.parseInt(s[i + 1]);
//                    right.val = l;
//                    q.add(right);
//                }
//                temp.left = left;
//                temp.right = right;
//                i += 2;
//
//            }
//            return root;
//        }
//    public static boolean search(Node root,int key){
//            if(root==null)return false;
//            while (root!=null) {
//                if (root.val == key) return true;
//                else if (root.val < key) root = root.right;
//                else root = root.left;
//            }
//            return false;
//    }
//    public static void main(String[] args) {
//            String[]s={"15","10","20","8","12","16","25"};
//        Node root=constractTree(s);
//        System.out.println(search(root,16));
//
//    }
//    }


//  problem . kth largest in bst
//public class binarySearchTree {
//        static class Node {
//            int val;
//            Node left;
//            Node right;
//
//            public Node(int n) {
//                this.val = n;
//            }
//        }
//        public static Node constractTree (String[]s){
//            Queue<Node> q = new LinkedList<>();
//            int r = Integer.parseInt(s[0]);
//            Node root = new Node(r);
//            q.add(root);
//            int i = 1;
//            while (i < s.length - 1) {
//                Node temp = q.poll();
//                Node left = new Node(0);
//                Node right = new Node(0);
//                if (s[i] == null) {
//                    left = null;
//                } else {
//                    int l = Integer.parseInt(s[i]);
//                    left.val = l;
//                    q.add(left);
//                }
//                if (s[i + 1] == null) {
//                    right = null;
//                } else {
//                    int l = Integer.parseInt(s[i + 1]);
//                    right.val = l;
//                    q.add(right);
//                }
//                temp.left = left;
//                temp.right = right;
//                i += 2;
//
//            }
//            return root;
//        }

//        public static void kthLargestInBST(Node root,int kth,int[] count,int[] ans){
//            if(root==null)return ;
//            kthLargestInBST(root.right,kth,count,ans);
//            count[0]++;
//            if(count[0]==kth){
//                ans[0]=root.val;
//                return;
//            };
//            kthLargestInBST(root.left,kth,count,ans);
//        }
//    public static void main(String[] args) {
//        String[]s={"15","10","20","8","12","16","25"};
//        Node root=constractTree(s);
//        int []ans={-1};
//        int[]count={0};
//        kthLargestInBST(root,5,count,ans);
//        System.out.println(ans[0]);
//    }
//    }

//   find predicessor of every node
//public class binarySearchTree {
//    static class Node {
//        int val;
//        Node left;
//        Node right;
//
//        public Node(int n) {
//            this.val = n;
//        }
//    }
//
//    public static Node constractTree(String[] s) {
//        Queue<Node> q = new LinkedList<>();
//        int r = Integer.parseInt(s[0]);
//        Node root = new Node(r);
//        q.add(root);
//        int i = 1;
//        while (i < s.length - 1) {
//            Node temp = q.poll();
//            Node left = new Node(0);
//            Node right = new Node(0);
//            if (s[i] == null) {
//                left = null;
//            } else {
//                int l = Integer.parseInt(s[i]);
//                left.val = l;
//                q.add(left);
//            }
//            if (s[i + 1] == null) {
//                right = null;
//            } else {
//                int l = Integer.parseInt(s[i + 1]);
//                right.val = l;
//                q.add(right);
//            }
//            temp.left = left;
//            temp.right = right;
//            i += 2;
//
//        }
//        return root;
//    }
//   static Node temp=null;
//    public static void predicessor(Node root){
//        if(root==null)return;
//        predicessor(root.left);
//        if(temp==null)System.out.print(0+" ");
//        else System.out.print(temp.val+" ");
//        temp =root;
//        predicessor(root.right);
//    }
//    public static void main(String[] args) {
//        String[] s = {"15", "10", "20", "8", "12", "16", "25"};
//        Node root = constractTree(s);
//        predicessor(root);
//    }
//}


//   find pair sum in bst
//public class binarySearchTree {
//    static class Node {
//        int val;
//        Node left;
//        Node right;
//
//        public Node(int n) {
//            this.val = n;
//        }
//    }
//
//    public static Node constractTree(String[] s) {
//        Queue<Node> q = new LinkedList<>();
//        int r = Integer.parseInt(s[0]);
//        Node root = new Node(r);
//        q.add(root);
//        int i = 1;
//        while (i < s.length - 1) {
//            Node temp = q.poll();
//            Node left = new Node(0);
//            Node right = new Node(0);
//            if (s[i] == null) {
//                left = null;
//            } else {
//                int l = Integer.parseInt(s[i]);
//                left.val = l;
//                q.add(left);
//            }
//            if (s[i + 1] == null) {
//                right = null;
//            } else {
//                int l = Integer.parseInt(s[i + 1]);
//                right.val = l;
//                q.add(right);
//            }
//            temp.left = left;
//            temp.right = right;
//            i += 2;
//
//        }
//        return root;
//    }
//    public static boolean find(Node root,Node n){
//        if(root==null)return false;
//        if(root.val<n.val)return find(root.right,n);
//        else if(root.val>n.val)return find(root.left,n);
//        else return true;// if root.val==n;
//        }
//    public static void pairSum(Node root,Node node,int target){
//        if (node==null)return;
//        pairSum(root,node.left,target);
//        if(target>node.val) {
//            Node part = new Node(target - node.val);
//            if (find(root,part)){
//                System.out.println(node.val+","+part.val);
//            }
//        }
//        pairSum(root,node.right,target);
//    }
//        public static void main (String[]args){
//            String[] s = {"15", "10", "20", "8", "12", "16", "25"};
//            Node root = constractTree(s);
//            pairSum(root,root,20);
//
//        }
//    }



