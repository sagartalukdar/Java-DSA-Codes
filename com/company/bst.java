package com.company;

import java.time.chrono.MinguoEra;
import java.util.ArrayList;

public class bst {
    static class Nud{
        int data;
        Nud left;
        Nud right;
        Nud(int n){
            this.data=n;
        }
    }
    public static Nud insert(Nud root,int val){
        if (root==null){
            root=new Nud(val);
            return root;
        }
        if (root.data>val){
            root.left=insert(root.left,val);
        }
        else {
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Nud root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static boolean search(Nud root,int key){
        if (root==null){
            return false;
        }
        if(root.data>key){
            return search(root.left,key);
        } else if (root.data<key) {
            return search(root.right,key);
        }else {
            return true;
        }
    }
    public static Nud delete(Nud root,int val){
       if (root.data>val){
           root.left=delete(root.left,val);
       }else if (root.data<val){
           root.right=delete(root.right,val);
       }else {
           if (root.left==null&&root.right==null){
               return null;
           }else if (root.right==null){
               return root.left;
           }else if (root.left==null){
               return root.right;
           }else {
               Nud is=inordersuccessor(root.right);
               root.data= is.data;
               root.right=delete(root.right, is.data);
           }
       }return root;
    }
    public static Nud inordersuccessor(Nud root){
        while (root.left!=null){
            root=root.left;
        }return root;
    }
   public static void inrange(Nud r,int x,int y){
        if (r==null){
            return;
        }
        if (r.data>=x&&r.data<=y){
            inrange(r.left,x,y);
            System.out.println(r.data);
            inrange(r.right,x,y);
        }else if (r.data>=y){
            inrange(r.left,x,y);
        }
        else if(r.data<=x){
            inrange(r.right,x,y);
        }
   }
   public static void print(ArrayList<Integer>arr){
        for (int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+"->");
        }
       System.out.println();
   }
   public static void paths(Nud r, ArrayList<Integer>ar){
        if (r==null){
            return;
        }
       ar.add(r.data);
        if (r.left==null&&r.right==null){
            print(ar);
        }else {
            paths(r.left,ar);
            paths(r.right,ar);
        }ar.remove(ar.size()-1);


   }
    public static void main(String[] args) {
        int []vals={5,1,3,4,2,7};
        Nud root=null;
        for (int i=0;i< vals.length;i++){
            root=insert(root,vals[i]);
        }
        inorder(root);
        System.out.println();
        delete(root,5);
        inorder(root);
        System.out.println("****");
        inrange(root,1,5);
        ArrayList<Integer>arr=new ArrayList<>();
        paths(root,arr);

    }
    }