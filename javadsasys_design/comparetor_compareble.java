package javadsasys_design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class student implements Comparable<student>{
    String name;
    int id;
    int age;

    public student(String n, int i, int a){
        this.name=n;
        this.id=i;
        this.age=a;
    }

    @Override
    public String toString() {
        return " "+name+" "+id+" "+age;
    }

    @Override
    public int compareTo(student o) {
        if (this.age<o.age){
            return 1;
        }else {
            return -1;
        }
    }
}
class c implements Comparator<student>{
    @Override
    public int compare(student o1, student o2) {
        if (o1.id>o2.id){
            return 1;
        }else {
            return -1;
        }
    }
}
public class comparetor_compareble {

    public static void main(String[] args) {
        ArrayList<student> a=new ArrayList<student>();
        student s1=new student("sa",2,83);
        student s2=new student("wimd",5,45);
        student s3=new student("lin",4,52);
        a.add(s2);
        a.add(s1);
        a.add(s3);
  c c1=new c();
  Comparator<student> co=(student o1, student o2)->{
            if (o1.id>o2.id){
                return 1;
            }else {
                return -1;
            }
        };

      Collections.sort(a,(student o1, student o2)->{
          if (o1.id>o2.id){
              return 1;
          }else {
              return -1;
          }
      });
//      Collections.sort(a);
        System.out.println(a);
    }
}
