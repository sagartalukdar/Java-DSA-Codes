package collc;

//class interrupt extends Thread{
//    @Override
//    public void run() {
//        for (int i=0;i<6;i++){
//            System.out.println("interrupt");
//            try {
//                Thread.sleep(4000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//
//    }
//}
//class sync extends Thread{
//    @Override
//     public void run() {
//        System.out.println("start");
//        synchronized (this){
//            System.out.println("run");
//            System.out.println("stop");
//        }
//
//    }
//}
//class mythread extends Thread{
//
//    @Override
//    public void run() {
//      String name=Thread.currentThread().getName();
//      if (name=="gas"){
//          gas();
//      }else {
//          liquid();
//      }
//    }
//    public void gas(){
//        System.out.println("gas");
//    }
//    public void liquid(){
//        System.out.println("liquid");
//    }
//}

//class my extends Thread{
//    @Override
//    public void run() {
//        System.out.println("thread");
//    }
//}

public class thread {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println();
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        Thread t=Thread.currentThread();
//        t.setName("mainthread");
//        t.setPriority(10);
//        System.out.println(Thread.currentThread().getPriority());
//        System.out.println(Thread.currentThread().getName());
//        mythread mt=new mythread();
//       mt.start();
////        mt.run();
//        mynewthread mnt=new mynewthread();
//        Thread t=new Thread(mnt);
//       t.start();
////        t.run();
//        mythread m1=new mythread();
//        mythread m2=new mythread();
//        m1.setName("gas");
//        m2.setName("liquid");
//
//      m2.start();m1.start();

//        System.out.println("main");
//        my m=new my();
//        System.out.println(m.isAlive());
//        m.start();
//        System.out.println(m.isAlive());
//        m.join();
//        System.out.println("main");

//        sync s1=new sync();
//        sync s2=new sync();
//        sync s3=new sync();
//        s1.start();
//        s2.start();
//        s3.start();
//        interrupt i=new interrupt();
//        i.start();
//        i.interrupt();
    }
}
