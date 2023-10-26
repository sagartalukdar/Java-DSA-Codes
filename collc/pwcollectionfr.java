package collc;

import javax.lang.model.element.Element;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
//class prac{
//    String s;
//    int i;
//    String state;
//    public prac(String s,int i,String ss){
//        this.s=s;
//        this.i=i;
//        this.state=ss;       
//    }
//
//    public String getS() {
//        return s;
//    }
//
//    public int getI() {
//        return i;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    @Override
//    public String toString() {
//        return s+i+state;
//    }
//}

//class emp{
//    String name;
//    int id;
//    public emp(String n,int i){
//        this.name=n;
//        this.id=i;
//    }
//
//    @Override
//    public String toString() {
//        return "emp{" +
//                "name='" + name + '\'' +
//                ", id=" + id +
//                '}';
//    }
////    public void finalize(){
////        System.out.println("garbez");
////    }
//    public void finalize(){
//
//    }
//}
//
//class emp{
//    int id;
//    public emp(int i){
//        this.id=i;
//    }
//}
//class sir{
//
//}
class tee<T>{
    T obj;
    public tee(T o){
        this.obj=o;
    }
    public T getObj(){
        return obj;
    }
    public void disp()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         {
        System.out.println(obj.getClass().getName());
    }
}
public class pwcollectionfr {
    public static void main(String[] args) {
        tee<Integer> t=new tee<Integer>(10);
        t.disp();
        System.out.println(t.getObj());
tee<String> t2=new tee<String>("obj");
        System.out.println(t2.getObj());
//     LinkedList<Integer>l=new LinkedList<>();
//     emp e1=new emp(4);
//     emp e2=new emp(5);
//     sir s=new sir();
//
//     ArrayList<emp>ea=new ArrayList<>();
//        ea.add(e1);
//        ea.add(e2);

//        prac p1=new prac("das",5,"wb");
//        prac p2=new prac("tal",2,"jhr");
//        prac p3=new prac("pal",5,"bi");
//       Map m=new HashMap();
//       m.put(1,p1);
//       m.put(2,p2);
//       m.put(3,p3);
//        System.out.println(m);

//        emp e=new emp("sab",5);
//        WeakHashMap hm=new WeakHashMap();
//        hm.put(e,"xyz");
//        System.out.println(hm);
//        e=null;
//        System.gc();
//        System.out.println(hm);

// Hashtable ht=new Hashtable();
// ht.put(1,"a");
// ht.put(2,"c");
// ht.putIfAbsent(3,"s");
// ht.put(0,"x");
//
//        System.out.println(ht);
//
//TreeMap tm=new TreeMap();
//tm.put(1,"ra");
//tm.put(2,"ew");
//tm.put(8,"ss");
//tm.put(0,"xa");
//        System.out.println(tm);


//        LinkedList l1=new LinkedList();
//        l1.add(10);
//        l1.add(1);
//        l1.add(2);
//        System.out.println(l1);
//        System.out.println(l1.getFirst());
//       System.out.println(  l1.getLast());
//        l1.push(10);
//        System.out.println(l1);
//        System.out.println(l1.pop());
//        System.out.println(l1.peek());
//        System.out.println(l1);
//        System.out.println(l1.poll());
//        System.out.println(l1);

//        ArrayDeque dq=new ArrayDeque();
//        dq.add(10);
//        dq.add(1);
//        dq.add(5);
//        dq.addFirst(100);
//        dq.addLast(100);
//        System.out.println(dq);
//        dq.offer(50);
//        dq.offerFirst(111);
//        dq.offerLast(111);
//        System.out.println(dq);

//        PriorityQueue pq=new PriorityQueue();
//        pq.add(10);
//        pq.add(1010);
//        pq.add(101010);
//        pq.add(5);
//        pq.add(42);
//        pq.add(75);
//
//        System.out.println(pq);

//        TreeSet ts=new TreeSet();
//        ts.add(10);
//        ts.add(52);
//        ts.add(41);
//        ts.add(85);
//        ts.add(78);
//        System.out.println(ts);
//        System.out.println( ts.ceiling(40));
//        System.out.println(ts.floor(40));
//        System.out.println(ts.floor(41));
//        System.out.println(ts.ceiling(41));
//        System.out.println(ts.higher(41));
//        System.out.println(ts.lower(41));
//        System.out.println(ts.lower(40));
//        System.out.println(ts.higher(40));
//
//        HashSet hs=new HashSet();
//        hs.add(10);
//        hs.add(465);
//        hs.add(78);
//        hs.add(63);
//        hs.add(10);
//        System.out.println(hs);
//
//        LinkedHashSet lh=new LinkedHashSet();
//        lh.add(10);
//        lh.add(42);
//        lh.add(10);
//        lh.add(50);
//        System.out.println(lh);

//        ArrayList a=new ArrayList();
//        a.add(42);
//        a.add(72);
//        a.add(98);
//
//
//        Iterator it=a.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//fail fast:
//      ListIterator li=a.listIterator(a.size());
//      while (li.hasPrevious()){
//          System.out.println(li.previous());
//      }
//       //fail safe:
//
//        CopyOnWriteArrayList coa=new CopyOnWriteArrayList();
//        coa.add(12);
//        coa.add(52);
//        coa.add(127);
//        coa.add(14);
//
//        ListIterator ci=coa.listIterator();
//       while (ci.hasNext()){
//           System.out.println(ci.next());
//           coa.add(10);
//       }

//        Vector v=new Vector();
//        v.add(200);
//        v.add(30);
//        v.add(59);
//
//       Enumeration e=v.elements();
//       while (e.hasMoreElements()){
//           System.out.println(e.nextElement());
//       }
//    HashMap hm=new HashMap();
//hm.put('a',1);
//hm.put('c',null);
//hm.put('b',2);
//hm.put(null,null);
//hm.put('d',7);
//hm.put(null,5);
//
//Set key=hm.keySet();
//Iterator it=key.iterator();
//while (it.hasNext()){
//  //  System.out.println(it.next());
//    Character c=(Character) it.next();
//    System.out.println(c);
//}
//Collection values=hm.values();
//Iterator vit= values.iterator();
//while (vit.hasNext()){
//    //System.out.println(vit.next());
//    Integer i=(Integer) vit.next();
//    System.out.println(i);
//        }
//Set s=hm.entrySet();
//Iterator sit=s.iterator();
//while (sit.hasNext()){
//   // System.out.println(sit.next());
//    Map.Entry e=(Map.Entry) sit.next();
//    System.out.println(e);
//}
//        LinkedHashMap lhm=new LinkedHashMap();
//        lhm.put('a',41);
//        lhm.put('b',null);
//        lhm.put(null,null);
//        lhm.put('c',32);
//        lhm.put('b',74);
       // System.out.println(lhm.get('c'));


    }
}
