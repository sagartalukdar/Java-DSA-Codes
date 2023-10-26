package javadsasys_design;
//
//import java.util.HashMap;
//      ***   two sum using hashmap  ***

//  time complexity of this bellow code is o(n),as well as space is also O(n)

//public class hashmap {
//    public static void main(String[] args) {
//        int []arr={2,5,3,4,8};
//        int target=7;
//        int[]a={-1,-1};
//        HashMap<Integer,Integer>hm=new HashMap<>();
//        for (int i=0;i<arr.length;i++){
//           hm.put(arr[i],i);
//        }
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==target && hm.containsKey(0)){
////                a[0]=hm.get(arr[i]);
//                a[0]=i;
//                a[1]=hm.get(0);
//                break;
//            }
//            else if(hm.containsKey(target-arr[i]) && hm.get(target-arr[i])>i) {
////                a[0]=hm.get(arr[i]);
//                a[0]=i;
//                a[1]=hm.get(target-arr[i]);
//                break;
//            }
//        }
//        for (int n:a){
//            System.out.println(n);
//        }
//    }
//}

//     ***  find first non-repeatative charecter in a string  ***

//import java.util.HashMap;
//
//public class hashmap {
//    public static void main(String[] args) {
//      String s="acddab";
//        HashMap<Character,Integer>hm=new HashMap<>();
//      for (int i=0;i<s.length();i++){
//         if (hm.containsKey(s.charAt(i))){
//             hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
//         }else {
//             hm.put(s.charAt(i),1);
//         }
//      }
//      boolean falg=true;
//      for (int i=0;i<s.length();i++){
//          if (hm.get(s.charAt(i))==1){
//              System.out.println("first Non_repeatative char is : "+s.charAt(i));
//              falg=false;
//              break;
//          }
//      }
//      if (falg){
//          System.out.println("no non repeatative charecter present here");
//      }
//    }
//}

//import java.util.HashMap;
//import java.util.Map;
//
////        *** Hashmap pw youtube  ***
// public class hashmap {
//     public void most_frequence(int[]arr){
//         int max=Integer.MIN_VALUE;
//         int maxele=0;
//         HashMap<Integer,Integer>hmap=new HashMap<>();
//         for (int i=0;i<arr.length;i++){
//             if (hmap.containsKey(arr[i])){
//                 hmap.put(arr[i],hmap.get(arr[i])+1);
//             }
//             else {
//                 hmap.put(arr[i],1);
//             }
//         }
//         for (int i=0;i<arr.length;i++){
//             if (hmap.get(arr[i])>max){
//                 max=hmap.get(arr[i]);
//                 maxele=arr[i];
//             }
//         }
//         System.out.println(maxele);
//     }
//    public static void main(String[] args) {
//        Map<String ,Integer> hm=new HashMap<>();
//        hm.put("abc",14);
//        hm.put("dcs",45);
//        hm.put("xyz",32);
//        System.out.println(hm.get("xyz"));
//        System.out.println(hm.get("gfg"));
//        hm.putIfAbsent("gfg",3);
//        hm.putIfAbsent("xyz",10);
//        hm.put("xyz",10);
//        System.out.println(hm.get("gfg"));
//        System.out.println(hm.get("xyz"));
//        System.out.println(hm.remove("gfg"));
//        System.out.println(hm.remove("a"));
//        System.out.println(hm.keySet());
//        System.out.println(hm.values());
//        System.out.println(hm.entrySet());
//
//        for (String s:hm.keySet()){
//            System.out.printf("the age of %s is %d \n",s,hm.get(s));
//        }
//       for (Map.Entry<String,Integer> en:hm.entrySet()){
//           System.out.printf("the age of %s is %d \n",en.getKey(),en.getValue());
//       }
//       for (var entry:hm.entrySet()){
//           System.out.printf("the age of %s is %d \n",entry.getKey(),entry.getValue());
//       }
//       hashmap h=new hashmap();
//       int[]arr={1,2,2,2,2,1,3,4,1};
//       h.most_frequence(arr);
//    }
//}


//       ****    own hashmap implementation    ****

//import java.util.LinkedList;
//import java.util.List;
//
//public class hashmap {
//    static class MyHashmap<k,v>{
//        public static final int DEFAULT_CAPACITY=4;
//        public static final float DEFAULT_LOAD_FACTOR=0.75f;
//        private class Node{
//            k key;
//            v value;
//            Node(k key,v val){
//                this.key=key;
//                this.value=val;
//            }
//        }
//        public int capacity(){
//            return buckets.length;
//        }
//        public float loadfactor(){
//            return (size*1.0f)/buckets.length;
//        }
//        private int size; //size
//        private LinkedList<Node>[] buckets;
//
//        private void   initbuckets(int n){
//            buckets=new LinkedList[n];
//            for (int i=0;i<buckets.length;i++){
//                buckets[i]=new LinkedList<>();
//            }
//        }
//        private int hashfunc(k key){
//            int h=key.hashCode();
//            return Math.abs(h)% buckets.length;
//        }
//        private int searchinbucket(LinkedList<Node>ll,k key){
//            for (int i=0;i<ll.size();i++){
//                if (ll.get(i).key==key){
//                    return i;
//                }
//            }
//            return -1;
//        }
//        private void rehash(){
//            LinkedList<Node>[] copy=buckets;
//            initbuckets(copy.length*2);
//            size=0;
//            for (var bucket:copy){
//                for (var node:bucket ){
//                    put(node.key,node.value);
//                }
//            }
//        }
//        public MyHashmap(){
//            initbuckets(DEFAULT_CAPACITY);
//        }
//
//        public int size(){
//            return size;
//        }
//        public void put(k key ,v val){
//         int bi=hashfunc(key);
//         LinkedList<Node> currbucket=buckets[bi];
//         int ei=searchinbucket(currbucket,key);
//         if (ei==-1){
//             Node n=new Node(key,val);
//             currbucket.add(n);
//             size++;
//         }else {
//         Node n=currbucket.get(ei);
//         n.value=val;
//         }
//         if (size>=buckets.length*DEFAULT_LOAD_FACTOR){
//             rehash();
//         }
//        }
//        public v get(k key){
//           int bi=hashfunc(key);
//            LinkedList<Node> currbucket=buckets[bi];
//            int ei=searchinbucket(currbucket,key);
//            if(ei!=-1){
//                Node n=currbucket.get(ei);
//                return n.value;
//            }
//            return null;
//        }
//        public v remove(k key){
//            int bi=hashfunc(key);
//            LinkedList<Node> currbucket=buckets[bi];
//            int ei=searchinbucket(currbucket,key);
//            if (ei!=-1){
//                Node n=currbucket.get(ei);
//                v val=n.value;
//                currbucket.remove(ei);
//                size--;
//                return val;
//
//            }
//            return null;
//        }
//    }
//    public static void main(String[] args) {
//   MyHashmap<String,Integer> mh=new MyHashmap<>();
//   mh.put("a",1);
//        mh.put("b",2);
//
//        mh.put("c",3);
//        System.out.println(mh.size);
//        mh.put("c",4);
//        System.out.println(mh.size);
//        System.out.println(mh.get("cv"));
//        System.out.println( mh.remove("cv"));
//
//        mh.put("w",4);
//      mh.put("e",5);
//      mh.put("p",8);
//        System.out.println(mh.get("w"));
//        System.out.println(mh.remove("r"));
//        System.out.println(mh.size);
//
//        System.out.println(mh.capacity());
//        System.out.println(mh.loadfactor());
//    }
//}

import java.util.*;


//      ***  anagram  question using hashmap   ***
//public class hashmap {
//   public static HashMap<Character,Integer> makehashmap(String s){
//       HashMap<Character,Integer>h=new HashMap<>();
//       for (int i=0;i<s.length();i++){
//           if (h.containsKey(s.charAt(i))){
//               h.put(s.charAt(i),h.get(s.charAt(i))+1);
//           }else {
//               h.put(s.charAt(i),1);
//           }
//           return h;
//       }
//   }
//    public boolean isAnagram(String s, String t) {
//   if (s.length()!=t.length())return false;
//   else {
//       HashMap<Character,Integer>h1=makehashmap(s);
//       HashMap<Character,Integer>h2=makehashmap(t);
//       return h1.equals(h2);
//   }
//    }
//}

//   ***  anagram  question using hashmap with better approach in less space  ***

//public class hashmap {
//
//    public boolean isAnagram(String s, String t) {
//     if (s.length()!=t.length())return false;
//     HashMap<Character,Integer>h=new HashMap<>();
//     for (int i=0;i<s.length();i++){
//         if (h.containsKey(s.charAt(i))){
//             h.put(s.charAt(i),h.get(s.charAt(i))+1);
//         }else {
//             h.put(s.charAt(i),1);
//         }
//     }
//     for (int i=0;i<t.length();i++){
//         if (!h.containsKey(t.charAt(i)))return false;
//         h.put(t.charAt(i),h.get(t.charAt(i))-1);
//     }
//     for (var v:h.values()){
//         if (v!=0){
//             return false;
//         }
//     }
//     return true;
//}
//    public static void main(String[] args) {
//
//    }
//}

//      *****     two  sum     ******
//public class hashmap {
//    public static void main(String[] args) {
//        int []arr={0,4,5,2,0};
//        int ans[]={-1,-1};
//        HashMap<Integer,Integer>h=new HashMap<>();
//        int target=40;
//        for (int i=0;i< arr.length;i++){
//            if (h.containsKey(target-arr[i])){
//                ans[0]=h.get(target-arr[i]);
//                ans[1]=i;
//                break;
//            }
//            else {
//                h.put(arr[i],i);
//            }
//        }
//        System.out.println(Arrays.toString(ans));
//    }
//}


//      *****        lergest subarray with sum 0      ********
//public class hashmap {
//    public static void main(String[] args) {
//        int[]arr={15,-2,2,-8,1,7,10,-25};
//        int prefixsum=0;
//        int maxlegth=0;
//        HashMap<Integer,Integer>h=new HashMap<>();
//        h.put(0,-1);
//        for (int i=0;i<arr.length;i++){
//            prefixsum+=arr[i];
//          if (h.containsKey(prefixsum)){
//             maxlegth=Math.max(maxlegth,i-h.get(prefixsum));
//          }else {
//              h.put(prefixsum,i);
//          }
//        }
//        System.out.println(maxlegth);
//    }
//}

//1=ram,5=lakshman,3=krish,6=bala,2=jay sort them by their keys
//public class hashmap {
//    /*
//    time complexity for this code is o(nlogn) because while we
//    insert each entryset then treemap internaly use sorting
//    and put them in a right place which take logn time ,and
//    we put n entrySet so   o(n)=n*logn
//       space complexity =o(n)
//     */
//    public static void main(String[] args) {
//        TreeMap<Integer,String>tm=new TreeMap<>();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the numbers of EntrySet");
//        int e=sc.nextInt();
//        for (int i=0;i<e;i++){
//            System.out.println("enter entrySet");
//            int key=sc.nextInt();
//            String value=sc.nextLine();
//
//            tm.put(key,value);
//        }
//        System.out.println(tm);
//    }
//}


//1=ram,5=lakshman,3=krish,6=bala,2=jay sort them by their values
//public class hashmap {
//            /*
//    time complexity for this code is o(nlogn) because while we
//    insert each entryset then treemap internaly use sorting
//    and put them in a right place which take logn time ,and
//    we put n entrySet so   o(n)=n*logn
//       space complexity =o(n)
//     */
//    public static void main(String[] args) {
//        TreeMap<String,Integer>tm=new TreeMap<>();
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number of entrySet:");
//        int n=sc.nextInt();
//        for (int i=0;i<n;i++){
//            System.out.println("enter Entryset:");
//            int key=sc.nextInt();
//            String value=sc.nextLine();
//            tm.put(value,key);
//        }
//        System.out.println(tm);
//    }
//}


      //   if in a hashmap have any duplicate
//       public class hashmap {
//          public static void main(String[] args) {
//              HashMap<Integer,Integer>hm=new HashMap<>();
//              Scanner sc=new Scanner(System.in);
//              System.out.println("enter the number of entryset:");
//              int n=sc.nextInt();
//              for (int i=0;i<n;i++){
//                  System.out.println("enter number ");
//                  int a=sc.nextInt();
//                  if (hm.containsKey(a)){
//                      System.out.println("yes");
//                      return ;
//                  }else {
//                      hm.put(a,0);
//                  }
//              } System.out.println("no");
//          }
//       }

//       find largest elements in a map
//      time complexity for this code is o(nlogn)    space complexity o(n)
//public class hashmap {
//    public static void main(String[] args) {
//        TreeMap<Integer,Integer>tm=new TreeMap<>();
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i=0;i<n;i++){
//            System.out.println("enter number:");
//            int a=sc.nextInt();
//            tm.put(a,0);
//        }
//        System.out.println(tm.lastEntry().getKey());
//    }
//}

//     given two string s1,s2 return true if s1 can be constructed by using
//the letters from s2 and false otherwise
//each letter in s2 can only be used once in s1
//public class hashmap {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        HashMap<Character,Integer>h1=new HashMap<>();
//        HashMap<Character,Integer>h2=new HashMap<>();
//        System.out.println("enter s1:");
//        String s1=sc.nextLine();
//        System.out.println("enter s2:");
//        String s2=sc.nextLine();
//        for (int i=0;i<s1.length();i++){
//           if (h1.containsKey(s1.charAt(i))){
//               h1.put(s1.charAt(i),h1.get(s1.charAt(i))+1);
//           }
//           else {
//               h1.put(s1.charAt(i),1);
//           }
//        }
//        for (int i=0;i<s2.length();i++){
//            if (h2.containsKey(s2.charAt(i))){
//                h2.put(s2.charAt(i),h2.get(s2.charAt(i))+1);
//            }
//            else {
//                h2.put(s2.charAt(i),1);
//            }
//        }
//        boolean po=true;
//        for (var e:h1.entrySet()){
//            if (e.getValue()>h2.get(e.getKey())|| !h2.containsKey(e.getKey())){
//                System.out.println("not posiible");
//                po=false;
//                break;
//            }
//        }
//        if (po!=false) {
//            System.out.println("possible");
//        }
//    }
//}

//  auxiliary given a pattern which containing only I and D (I stands for
// increasing and D for decreasing Device an algorithm to print the minimum
// follwing that patter digit from 1 to 9 digit can't repeat
/*
example :
intput D :output 21 ;
input "DD" :output 321;
input "ID" :output 132;
 */
//public class hashmap {
//    public static void main(String[] args) {
//        Stack<Integer>st=new Stack<>();
//        String s="DD";
//        for (int i=0;i<=s.length();i++){
//            st.push(i+1);
//            if (i==s.length() || s.charAt(i)=='I'){
//                while (!st.isEmpty()){
//                    System.out.print(st.peek()+" ");
//                    st.pop();
//                }
//            }
//        }
//    }
//}


//    number of  valid subarrays
//public class hashmap {
//    public static void main(String[] args) {
//      int []arr={1,4,2,5,3} ;
//      int []nse=new int[arr.length];
//      Stack<Integer>st=new Stack<>();
//      st.push(arr.length-1);
//      nse[nse.length-1]= nse.length;
//      for (int i= arr.length-2;i>=0;i--){
//          while (!st.isEmpty() && arr[st.peek()]>=arr[i]){
//              st.pop();
//          }
//          if (st.isEmpty())nse[i]= nse.length;
//          else nse[i]=st.peek();
//          st.push(i);
//
//      }
//      int[]subarrays=new int[nse.length];
//      int validsubarray=0;
//      for (int i=0;i< subarrays.length;i++){
//          subarrays[i]=nse[i]-i;
//          validsubarray+=subarrays[i];
//      }
//        System.out.println(Arrays.toString(subarrays));
//        System.out.println(validsubarray);
//    }
//}


//