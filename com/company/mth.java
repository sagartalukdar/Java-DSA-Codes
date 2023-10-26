 package com.company;

 import java.util.LinkedList;
 import java.util.Queue;

 class Node{
    int data;
    Node left;
    Node right;
    public Node(int n){
        this.data=n;
        this.left=null;
        this.right=null;
    }
}
class binarytree{
    int index=-1;
    public Node buildtree(int []arr){
        index++;
        if (arr[index]==-1){
            return null;
        }
        Node newn=new Node(arr[index]);
        newn.left=buildtree(arr);
        newn.right=buildtree(arr);
        return newn;
    }
    public void preorder(Node root){
        if (root==null){
           System.out.println(-1);
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(Node root){
        if (root==null){
            System.out.println(-1);
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public void postoeder(Node root){
        if (root==null){
            return;
        }
        postoeder(root.left);
        postoeder(root.right);
        System.out.println(root.data);
    }
    public void levelorder(Node root){
        Queue<Node> q =new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node current=q.remove();
            if (current==null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }
            else{
                System.out.print(current.data+" ");
                if (current.left!=null){
                    q.add(current.left);
                }if (current.right!=null){
                    q.add(current.right);
                }
            }

        }
    }
    public int countnode(Node root){
        if (root==null){
            return 0;
        }
        int leftNode=countnode(root.left);
        int rightnode=countnode(root.right);
        return leftNode+rightnode+1;
    }
    public int sumnodes(Node root){
        if (root==null){
            return 0;
        }
        int leftNode=sumnodes(root.left);
        int rightnode=sumnodes(root.right);
        return leftNode+rightnode+ root.data;
    }
    public int height(Node root){
        if (root==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        int org=Math.max(leftheight,rightheight)+1;
        return org;
    }
    public int perameter(Node root){
        if (root==null){
            return 0;
        }
        int left=perameter(root.left);
        int right=perameter(root.right);
        int org=height(root.left)+height(root.right)+1;
        int diameter=Math.max(org,Math.max(left,right));
        return diameter;
    }
    class treeinfo{
        int ht;
        int diam;
        public treeinfo(int n,int m){
            this.ht=n;
            this.diam=m;
        }
    }
    public treeinfo diameter(Node root){
        if (root==null){
            return new treeinfo(0,0);
        }
        treeinfo left=diameter(root.left);
        treeinfo right=diameter(root.right);
        int myheight= Math.max(left.ht, right.ht)+1;
        int dia1=left.diam;
        int dia2=right.diam;
        int dia3=left.ht+ right.ht+1;
        int mydia=Math.max(dia3,Math.max(dia1,dia2));
        treeinfo t=new treeinfo(myheight,mydia);
        return t;
    }
}

public class mth {
    public static void main(String[] args) {
      int values[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      binarytree b=new binarytree();
      Node root=b.buildtree(values);
        //System.out.println(b.countnode(root));
       // System.out.println(b.sumnodes(root));
        System.out.println(b.diameter(root).diam);
    }
}