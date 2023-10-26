package com.company;

import java.util.*;

public class hashing {
    public static void main(String[] args) {
//        HashSet<Integer>hs=new HashSet<>();
//        hs.add(1);
//        hs.add(2);
//        hs.add(3);
//        hs.add(2);
//        System.out.println(hs.contains(2));
//        hs.remove(2);
//       // System.out.println(hs);
//        Iterator it=hs.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        HashMap<String,Integer>hm=new HashMap<>();
                hm.put("sagar",20);
                hm.put("ram",21);
                hm.put("shyam",22);
                hm.put("shyam",21);
                hm.put("madhu",21);
                hm.remove("madhu");
        System.out.println(hm.get("sagar"));
        System.out.println(hm.get("shyam"));
        System.out.println(hm.get("madhu"));
        for (Map.Entry<String,Integer> e:hm.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for (Map.Entry<String,Integer>e:hm.entrySet()){
            System.out.println(e);
        }
        Set<String>k=hm.keySet();
        for (String h:k){
            System.out.println(h+" "+hm.get(h));
        }
    }
}