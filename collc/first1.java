package collc;

import java.util.Arrays;

public class first1 {
    public static void main(String[] args) {
//        String s="das";
//        String a="asds";
//        char []c=s.toCharArray();
//        char[]d=a.toCharArray();
//        Arrays.sort(c);
//        Arrays.sort(d);
//        if (Arrays.equals(c,d)){
//            System.out.println("yes");
//        }else {
//            System.out.println("no");
//        }
     String s="the quick brownn fox jumps over lazy dog ";
     s=s.replace(" ","");
     char[]c=s.toCharArray();
     int a[]=new int[26];
     for (int i=0;i<c.length;i++){
         a[c[i]-65]++;
     }
     for (int e:a){
         if (e==0){
             System.out.println("no");
         }
     }
    }
}