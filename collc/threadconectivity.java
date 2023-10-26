package collc;
class joiner {
    int x;
    boolean flag=true;
 synchronized public void produce(int j){
     try{
         if (flag==true){
              x=j;
                 System.out.println("produeses"+x);
                 flag=false;
                 notify();
         }else {
             wait();
         }

     }catch (Exception e){
         System.out.println(e);
     }

          }
 synchronized public void consume() {
     try{if (flag==false){
         System.out.println("consumes"+x);
             flag=true;
             notify();
     }else {
         wait();
     }
     }catch (Exception e){
         System.out.println(e);
     }

          }
}
class producer extends Thread{
    joiner j;
    public producer(joiner g){
        this.j=g;
    }
    @Override
    public void run() {
        int i=0;
        while (true){
            j.produce(i++);
        }

    }
    }

class consumer extends Thread{
    joiner j;
    public consumer(joiner g){
        this.j=g;
    }
    @Override
    public void run() {

        while (true){
            j.consume();
        }
    }
}
public class threadconectivity {
    public static void main(String[] args) {
         joiner j=new joiner();
         producer p=new producer(j);
         consumer c=new consumer(j);
         p.start();
         c.start();
    }
}
