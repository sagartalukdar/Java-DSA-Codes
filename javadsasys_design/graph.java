package javadsasys_design;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

// **** adjecency matrix ; Space complexity O((vertices+1)*(vertices+1))****
//public class graph {
//    public static void breathFirstSearch(int start,int[][]arr,int[]v,Queue<Integer>q){
//        q.add(start);
//        v[start]=1;
//        System.out.print(start+" ");
//        while (!q.isEmpty()){
//            int a=q.poll();
//            for (int i=0;i<5;i++){
//                if(arr[a][i]==1 && v[i]!=1){
//                    System.out.print(i+" ");
//                    v[i]=1;
//                    q.add(i);
//                }
//            }
//        }
//    }
//    public static void defthFirstSearch(int start,int [][]a,int []v){
//        System.out.print(start+" ");
//        v[start]=1;
//        for (int i=0;i<5;i++){
//            if(a[start][i]==1 && v[i]!=1){
//                defthFirstSearch(i,a,v);
//            }
//        }
//    }
//    public static void main(String[] args) {
//
//         int vertex=4,edges=6;
//        Queue<Integer>q=new LinkedList<>();
//        int []visited=new int[vertex+1];
//
//        int [][]ga=new int[vertex+1][vertex+1];
//        ga[0][1]=1;
//        ga[0][2]=1;
//        ga[1][0]=1;
//        ga[1][3]=1;
//        ga[2][0]=1;
//        ga[2][3]=1;
//        ga[3][1]=1;
//        ga[3][2]=1;
//        ga[3][4]=1;
//        ga[4][2]=1;
//        ga[4][3]=1;
////        for (int[]a:ga){
////            for (int e:a){
////                System.out.print(e+" ");
////            }
////            System.out.println();
////        }
//        breathFirstSearch(3,ga,visited,q);
//        System.out.println();
//        defthFirstSearch(1,ga,visited=new int[vertex+1]);
//
//
//
//    }
//}


    //  ****  adjecency List for undirected graph ****
//        space complexity is  o(2*edges)  (because of undirected)
//public class graph {
//   public static void main(String[] args) {
//       int vertex=4,edges=6;
//      ArrayList<ArrayList<Integer>> aa=new ArrayList<>();
//      ArrayList<Integer>a=new ArrayList<>();
//       for (int i=0;i<=vertex;i++){
//           aa.add(new ArrayList<>());
//       }
//       aa.get(0).add(1);
//       aa.get(0).add(2);
//       aa.get(1).add(0);
//       aa.get(1).add(3);
//       aa.get(2).add(0);
//       aa.get(2).add(4);
//       aa.get(3).add(1);
//       aa.get(3).add(2);
//       aa.get(3).add(4);
//       aa.get(4).add(2);
//       aa.get(4).add(3);
//       System.out.println(aa);
//   }
//}



//  ****  adjecency List for directed graph ****
//     space complexity is  o(edges)  (because of directed)
//public class graph {
//    public static void main(String[] args) {
//       int vertex=4,edges=6;
//      ArrayList<ArrayList<Integer>> aa=new ArrayList<>();
//      ArrayList<Integer>a=new ArrayList<>();
//       for (int i=0;i<=vertex;i++){
//           aa.add(new ArrayList<>());
//       }
//       aa.get(0).add(1);
//       aa.get(0).add(2);
//       aa.get(2).add(4);
//       aa.get(3).add(1);
//       aa.get(3).add(2);
//       aa.get(3).add(4);
//
//       System.out.println(aa);
//    }
//}



//    ------  Disjoint set ----------
//   by rank ---
//public class graph {
//        static class disjointSet{
//             ArrayList<Integer> rank=new ArrayList<>();
//             ArrayList<Integer> parent=new ArrayList<>();
//        int n;
//        public disjointSet(int n){
//            this.n=n;
//            for (int i=0;i<=n;i++){
//                rank.add(0);
//                parent.add(i);
//            }
//        }
//        public  int findParent(int x){
//           if(x==parent.get(x))return x;
//           int finalparent= findParent(parent.get(x));
//           parent.set(x,finalparent);
//           return parent.get(x);
//        }
//        public void union(int u,int v){
//            int pu=findParent(u);
//            int pv=findParent(v);
//            if (pu==pv) return;
//            else if(rank.get(pu) <rank.get(pv)){
//                parent.set(pu,pv);
//            }else if(rank.get(pu)>rank.get(pv)){
//                parent.set(pv,pu);
//            }
//            else {
//                parent.set(pu,pv);
//                int up=rank.get(pv);
//                rank.set(pv,up++);
//            }
//        }
//    }
//    public  static void main(String[] args) {
//         disjointSet ds=new disjointSet(7);
//         ds.union(1,2);
//         ds.union(2,3);
//         ds.union(4,5);
//         ds.union(6,7);
//         ds.union(5,6);
//
//         if (ds.findParent(3)==ds.findParent(7)) System.out.println("same");
//         else System.out.println("not same");
//
//         ds.union(3,7);
//
//        if (ds.findParent(3)==ds.findParent(7)) System.out.println("same");
//        else System.out.println("not same");
//
//    }
//}

//   by size  -----
public class graph {
    static class disjointSet{
        ArrayList<Integer> size =new ArrayList<>();
        ArrayList<Integer> parent=new ArrayList<>();
        int n;
        public disjointSet(int n){
            this.n=n;
            for (int i=0;i<=n;i++){
                size.add(1);
                parent.add(i);
            }
        }
        public  int findParent(int x){
            if(x==parent.get(x))return x;
            int finalparent= findParent(parent.get(x));
            parent.set(x,finalparent);
            return parent.get(x);
        }
        public void union(int u,int v){
            int pu=findParent(u);
            int pv=findParent(v);
            if (pu==pv) return;
           else if(size.get(pu)<size.get(pv)){
               parent.set(pu,pv);
               size.set(pv,size.get(pu)+size.get(pv));
            }
           else {
               parent.set(pv,pu);
               size.set(pu,size.get(pu)+size.get(pv));
            }
        }
    }
    public  static void main(String[] args) {
        disjointSet ds=new disjointSet(7);
        ds.union(1,2);
        ds.union(2,3);
        ds.union(4,5);
        ds.union(6,7);
        ds.union(5,6);

        if (ds.findParent(3)==ds.findParent(7)) System.out.println("same");
        else System.out.println("not same");

        ds.union(3,7);

        if (ds.findParent(3)==ds.findParent(7)) System.out.println("same");
        else System.out.println("not same");

    }
}
