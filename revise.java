import java.util.*;
//class parent{
//    public parent(){
//        System.out.println("hi");
//    }
//    public parent(int mn){
//        System.out.println("hello!");
//    }
//
//}
//class child extends parent{
//    public child(){
//        super(0);
//        System.out.println("hello");
//    }
//    public child(int n){
//        System.out.println("child");
//    }
//}
//class gchild extends child{
//    public gchild(){
//        super(0);
//        System.out.println("gchild");
//    }
//}
//class sup {
//    public void foo(){
//        System.out.println("hi");
//    }
//}
//class sub extends sup{
//    public void print (){
//        System.out.println("print");
//    }
//    public void foo(){
//        System.out.println("hello!");
//    }
//}

//    public static void sum(int a,int b){
//        System.out.println(a+b);
//    }
//    public void sum1(int x,int y){
//        System.out.println(x+y);
//    }
//    public static void foo(){
//        System.out.println("hi");
//    }
//    public static void foo(int a){
//        System.out.println("hello");
//    }
//    public static void foo(int a,int b,int c){
//        System.out.println("bye");
//    }
//    public static int sum(int g,int ...marks){
//        int x=0;
//        for (int e:marks){
//            x+=e;
//        }
//        return x+g;
//    }public class revise {    //    String name = "sagar";
////        System.out.println(name.length());
////        System.out.println(name.toLowerCase());
////        System.out.println(name.toUpperCase());
////        System.out.println(name.trim());
////        System.out.println(name.substring(2));
////        System.out.println(name.substring(2,5));
////        System.out.println(name.replace('s','a'));
////        System.out.println(name.replace("sa","da"));
////        System.out.println(name.startsWith("sa"));
////        System.out.println(name.endsWith("sa"));
////        System.out.println(name.startsWith("sa",2));
////        System.out.println(name.charAt(3));
////        System.out.println(name.indexOf('s'));
////        System.out.println(name.indexOf('a',2));
////        System.out.println(name.lastIndexOf('a',2));
////        System.out.println(name.equals("sagar"));
////        System.out.println(name.equals("SAGAR"));
////        System.out.println(name.equalsIgnoreCase("sagar"));
////        System.out.println("hi my name is \" sagar");
////        switch(name) {
////            case "saf":
////                System.out.println("first");
////                break;
////            case "sag":
////                System.out.println("second");
////                break;
////            case "saga":
////                System.out.println("third");
////                break;
////            case "sagara":
////                System.out.println("forth");
////                break;
////            default:
////                System.out.println("no match");
////        }
////        int i=0;
////        while(i<5){
////            System.out.println(i);
////            i++;
////        }
////        int j=9;
////        do{
////            j--;
////            System.out.println(j);
////
////        }while (j>0);
////        for (int k=0;k<5;k++){
////            System.out.println("*");
////        }
////        for (int h=0;h<5;h++){
////            System.out.println(2*h+1);
////        }
////        for (int y=1;y<=5;y++){
////            if (y==3){
////                break;
////            }
////            System.out.println(y);
////        }
////        for (int y=1;y<=5;y++){
////            if (y==3){
////                continue;
////            }
////            System.out.println(y);
////        }
////        int w=0;
////        while (w<10){
////            if (w==5){
////                break;
////            }
////            System.out.println(w);
////            w++;
////        }
////        while (w<10){
////            w++;
////            if (w==5){
////                continue;
////            }
////            System.out.println(w);
////
////        }
////        int s=0;
////        do {
////            if (s==5){
////                break;
////            }
////            System.out.println(s);
////            s++;
////        }while (s<10);
////        int a=0;
////        do { a++;
////            if (a==8){
////                continue;
////            }
////            System.out.println(a);
////
////        }while (a<10);
////        int r=4;
////        int c=4;
////        for (int i=1;i<=r;i++){
////            for (int j=i;j<=c;j++){
////                System.out.print("*");
////            }
////            System.out.println();
//////        }
////        int sum=0;
////        for (int i=1;i<=5;i++){
////            sum+=2*i;
////        }
////        System.out.println(sum);
////       int n=5;
////
////       for (int i=10;i>=1;i--){
////           System.out.printf("%d x %d =%d ",n,i,n*i);
////           System.out.println();
////       }
////        int n=5;
////       int sum=0;
////        for (int i=10;i>=1;i--){
////            sum+=n*i;
////        }
////        System.out.println(sum);
////        int n=5;
////        int factorial=1;
////        for (int i=5;i>0;i--){
////            factorial*=i;
////        }
////        System.out.println(factorial);
////        int n=1;
////        while (n<6){
////            System.out.println(2*n);
////            n++;
////      }
////        int []arr=new int[4];
////        arr[0]=0;
////        arr[1]=1;
////        arr[2]=2;
////        arr[3]=3;
////       // arr[4]=4;
////        System.out.println(arr.length);
////        System.out.println(arr[3]);
////        for (int i=0;i<arr.length;i++){
////            System.out.println(arr[i]);
////        }
////        for (int ele:arr){
////            System.out.println(ele);
////        }
////        int [][]flat=new int[2][3];
////        flat[0][0]=1;
////        flat[0][1]=2;
////        flat[0][2]=3;
////        flat[1][0]=4;
////        flat[1][1]=5;
////        flat[1][2]=6;
////        for (int i=0;i< flat.length;i++){
////            for (int j=0;j<flat[i].length;j++){
////                System.out.print(flat[i][j]+" ");
////            }
////            System.out.println();
////        }
////        float[] marks={0.1f,2.0f,5.4f,6.41f};
////        float sum=0;
////        for (float e:marks){
////            sum+=e;
////        }
////        System.out.println(sum);
////
////        int a=1;
////        int []ad={10,4,2,5};
////        boolean isinarray=false;
////        for (int e:ad){
////            if (e==a){
////                isinarray=true;
////                break;
////            }
////        }
////        if (isinarray){
////            System.out.println("yes in here");
////        }else {
////            System.out.println("no not in here");
////        }
////        int []ad={10,4,2,5};
////        float avg=0;
////        for (int e:ad){
////            avg+=e;
////        }
////        System.out.println(avg/ad.length);
////        int [][]matrix1={{1,4,2},
////                         {5,7,6}};
////        int [][]matrix2={{7,2,0},
////                         {3,1,6}};
////        int [][]result={{0,0,0},
////                        {0,0,0}};
////        for (int i=0;i<matrix1.length;i++){
////            for (int j=0;j<matrix1[i].length;j++){
////                result[i][j]=matrix1[i][j]+matrix2[i][j];
////                System.out.print(result[i][j]+" ");
////            }
////            System.out.println();
////        }
////        int []ad={10,4,2,5};
////        int l=ad.length;
////         int n=Math.floorDiv(l,2);
////         for (int i=0;i<n;i++){
////             int temp=ad[i];
////              ad[i]=ad[l-1-i];
////             ad[l-1-i]=temp;
////         }
////         for (int e:ad){
////             System.out.println(e);
////         }
////        System.out.println(Math.floorDiv(5,2));
////        int []ad={10,4,2,5};
////        int max=Integer.MIN_VALUE;
////        for (int e:ad){
////            if (max<e){
////                max=e;
////            }
////        }
////        System.out.println(max);
////        int []ad={10,4,2,5};
////        int min=Integer.MAX_VALUE;
////        for (int e:ad){
////            if (e<min){
////                min=e;
////            }
////        }
////        System.out.println(min);
////        int []ad={1,50,7,9};
////        boolean sorted=false;
////        for (int i=0;i< ad.length-1;i++){
////            if (ad[i]>ad[i+1]){
////                sorted=true;
////                break;
////            }
////        }
////        if (sorted){
////            System.out.println("not sorted");
////        }else {
////            System.out.println(" sorted");
////        }
////        sum(1,2);
////        revise r=new revise();
////        r.sum1(1,2);
////        foo();
////        foo(1);
////        foo(1,2,3);
////        System.out.println(sum(1,2,3));
////        System.out.println(sum(1,2,4,5));
////        System.out.println(sum(4));
//       // child c=new child();
//       // parent p=new parent();
//         // gchild gc=new gchild();
//

// abstract class phone {
// abstract public void call();
//
//}
//class vivo extends phone{
//     public void call(){
//         System.out.println("tuuuu");
//     }
//}
//abstract class sumsung extends phone{
//
//}
//
//public class revise {
//
//    public static void main(String[] args) {
// vivo v=new vivo();
// v.call();

//interface car{
//    public void horn();
//    public void run();
//}
//interface plan{
//    public void fly();
//}
//class boat{
//    public void swim(){
//        System.out.println("swim");
//    }
//}
//class aulto extends boat implements car ,plan {
//    @Override
//    public void horn() {
//        System.out.println("pip");
//    }
//
//    @Override
//    public void run() {
//        System.out.println("sooooo");
//    }
//    public void fly(){
//        System.out.println("fly");
//    }
//}
//   interface parent{
//       public void meth1();
//       public void meth2();
//}
//interface child extends parent{
//       public void meth3();
//}
//class gch implements child{
//    @Override
//    public void meth1() {
//        System.out.println("meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("meth2");
//    }
//    public void meth3(){
//        System.out.println("meth3");
//    }
//}  gch f=new gch();
//  f.meth1();
//          f.meth2();
//          f.meth3();

//class task1 extends Thread{
//    public void run(){
//        int i=0;
//        while (i<100){
//            System.out.println("hi");
//            i++;
//        }
//
//    }
//}
//class task2 extends Thread{
//    public void run(){
//        int i=0;
//        while (i<100){
//            System.out.println("hello");
//            i++;
//        }
//
//    }
//}
//class task3 implements Runnable{
//    @Override
//    public void run() {
//        int i=0;
//        while (i<100){
//            System.out.println(
//       "bye"
//            );
//            i++;
//        }
//
//    }
//}
//
//   class meth extends Thread{
//       String name;
//       public void run(){
//           int i=0;
//           while (i<100){
//               System.out.println("hi");
//               i++;
//           }
//
//           }
//
//       public meth(String name){
//          super(name);
//            this .name=name;
//       }
//   }
//   class rag extends Thread{
//       public void run(){
//           try {
//               Thread.sleep(10);
//
//           }catch (Exception e){
//               System.out.println(e);
//           }
//           int i=0;
//           while (i<100){
//               System.out.println("hello");
//               i++;
//           }
//       }
//   }

//     meth m=new meth("sagar");
//     meth m1=new meth("sad");
//     meth m2=new meth("talukdar");
//     meth m4=new meth("das");
//     rag r=new rag();
//     r.start();
//     r.setPriority(Thread.MIN_PRIORITY);
//     m.setPriority(Thread.NORM_PRIORITY);
//     m.setPriority(Thread.MAX_PRIORITY);
//     try {
//         m.sleep(100);
//     }catch (Exception e){
//         System.out.println(e);
//     }

      //  System.out.println(m.getPriority());
//     try {
//         r.join();
//     }catch (Exception e){
//         System.out.println(e);
//     }

//     m.start();
//     m1.start();
//     m2.start();
//     m4.start();
//        System.out.println(m.getName());
//System.out.println(m1.getName());
//System.out.println(m2.getName());
//System.out.println(m4.getName());
//        Scanner sc=new Scanner(System.in);
//        int []marks={1,4,2,5};
//        System.out.println("enter the index you want");
//        int ind=sc.nextInt();
//        System.out.println("enter the number");
//        int num=sc.nextInt();
//        try {
//            int n = marks[ind] / num;
//            System.out.println(n);
//            try{
//                System.out.println("hi");
//            }catch (Exception e){
//                System.out.println(e);
//            }
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("array index out of bound");
//            System.out.println(e);
//        }
//        catch (ArithmeticException e){
//            System.out.println("arithmatic exception");
//            System.out.println(e);
//        }catch (InputMismatchException e){
//            System.out.println("input smatch exception");
//            System.out.println(e);
//        }
//        catch (Exception e){
//            System.out.println("some exception here");
//            System.out.println(e);
//        }
//class myexception extends Exception{
//    @Override
//    public String toString() {
//        return "exception here";
//    }
//
//    @Override
//    public String getMessage() {
//        return "exception ";
//    }
//}
//        public class revise {
//
//            public static void main(String[] args)  {
//                Scanner sc = new Scanner(System.in);
//                System.out.println("enter n");
//                int n = sc.nextInt();
//                if (n < 5) {
//                    try {
//                        throw new myexception();
//                    }catch (Exception e){
//                        System.out.println(e);
//                    }
//
//
//                }
//class myexception extends Exception{
//    @Override
//    public String getMessage() {
//        return "exception here";
//    }
//}
//public class revise {
//    static Scanner sc =new Scanner(System.in );
//    public static void fun()throws Exception{
//        int a=8;
//        System.out.println("enter b");
//        int b=sc.nextInt();
//        if (b<4){
//            try{
//                throw new myexception();
//            }catch (Exception e){
//                System.out.println(e);
//            }
//             finally {
//                System.out.println("hi");
//            }
//
//        }
//        try{
//            System.out.println(a/b);
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
public class revise {
    public static void main(String[] arg) throws Exception {
//      int n=6;
//      int c=3;
//
//      while (true){
//          try{int a=n/c;
//              System.out.println(a);
//          }catch (Exception e){
//              System.out.println(e);
//              break;
//          }finally {
//              System.out.println("hi");
//          }
//          c--;
//      }
//        ArrayList<Integer>l1=new ArrayList<>();
//        ArrayList<Integer>l2=new ArrayList();
//        l2.add(7);
//        l2.add(8);
//        l2.add(9);
//
//        l1.add(1);
//        l1.add(2);
//        l1.add(3);
//        l1.addAll(0,l2);
//        System.out.println(l1.contains(8));
//        System.out.println(l1.get(3));
//        System.out.println(l1.indexOf(7));
//        l1.remove(0);
//        l1.set(0,6);
//        l1.clear();
//        for (int i=0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }
//        LinkedList<Integer> l=new LinkedList<>();
//        l.addFirst(1);
//        l.addLast(7);
//        l.add(5);
//        l
//        l.add(2,9);
//        for (int i=0;i<l.size();i++){
//            System.out.println(l.get(i));
//        }
//        System.out.println(l.getLast());

//        Stack<Integer>s=new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(8);
//        System.out.println(s.pop());
//        System.out.println(s.peek());
//        System.out.println(s);
//HashSet<Integer>h=new HashSet<>();
//h.add(1);
//h.add(1);
//        System.out.println(h);
      HashMap<String,Integer>s=new HashMap<>()  ;
      s.put("sagar",1);
      s.put("sa",21);


    }
}



