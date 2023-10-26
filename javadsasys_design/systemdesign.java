package javadsasys_design;

class car{//  singleton class which will has only one object.
   private static car c;
   private  car(){
   }
    public static car getcar() {
       synchronized (car.class) {
           if (c == null) {
               c = new car();
           }
       }
        return c;
    }

}
class plan{
   private static plan p=new plan();
   private plan(){
   }
    public static plan getplan(){
        return p;
    }
}
public class systemdesign {
    public static void main(String[] args) {
        car cs=car.getcar();
        car c=car.getcar();
        System.out.println(c.hashCode());
        System.out.println(cs.hashCode());

        plan p1=plan.getplan();
        System.out.println(p1.hashCode());
        plan p2=plan.getplan();
        System.out.println(p2.hashCode());

    }
}
