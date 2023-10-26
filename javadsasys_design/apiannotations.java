package javadsasys_design;
//import java.util.Date;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

//enum week{
//    sun,mon,tues,wednes,thurs,fri,sat
//}

//@Target({ElementType.TYPE,ElementType.FIELD})
//@Retention(RetentionPolicy.RUNTIME)
//@interface education{
//    String name() default "ksj";
//    int rate() default 2;
//}
//@education()
//class pw {
//    @education()
//int no;
//    @education()
//String add;
//}
//public class apiannotations {
//    enum result{
//        pass,fail;
//        int mark;
//        result(){
//            System.out.println("constructor");
//        }
//        public void setMark(int m){
//            this.mark=m;
//        }
//        public int getMark(){
//            return mark;
//        }
//    }
//    enum bulet{
//////        yes,no
//////    }

//    enum result{
//        pass,fail,nr;
//    }IOException {
//
////        File fd=new File("file directory");
////        System.out.println(fd.isDirectory());
////        fd.mkdir();
////        System.out.println(fd.isDirectory());
////
////        File find=new File(fd,"fileindirectory");
////        System.out.println(find.isFile());
////        find.createNewFile();
////
////        File f=new File("file directory");
////        System.out.println(f.isDirectory());
////
////        int count=0;
////         String s[]=f.list();
////         for (String ss:s){
////             count++;
////             System.out.println(ss+count);
////         }
//
//
////        File f=new File("pw");
////        System.out.println(f.exists());
////        f.delete();
////        f.createNewFile();
////        System.out.println(f.exists());
////
////        File dir=new File("ped");
////        System.out.println(dir.exists());
////        dir.mkdir();
////        System.out.println(dir.exists());
//
////        pw p=new pw();
////        Class c=p.getClass();
////        Annotation a=c.getAnnotation(education.class);
////        education e=(education) a;
////        System.out.println(e.name());
////        System.out.println(e.rate());
//
//
////     result re=result.nr;
////     switch (re){
////         case nr -> {
////             System.out.println("nr");
////             break;
////         }
////         case fail -> {
////             System.out.println("fail");
////             break;
////         }
////         case pass -> {
////             System.out.println("pass");
////             break;
////         }
////         default -> {
////             System.out.println("no");
////             break;
////         }
////     }
//
////        result.pass.setMark(45);
////        int p=result.pass.getMark();
////        System.out.println(p);
////
////        System.out.println(result.fail.getMark());
//
////        bulet b=bulet.no;
////        System.out.println(b);
////
////        bulet []bu=bulet.values();
////        for (bulet bul:bu){
////            System.out.println(bul+" "+bul.ordinal());
////        }
////
////        week w=week.thurs;
////        System.out.println(w);
////        week we=week.mon;
////        System.out.println(we);
////        week []weeks=week.values();
////        for (week wee:weeks){
////            System.out.println(wee+" "+wee.ordinal());
////        }
//
////        Date dt=new Date();
////        System.out.println(dt);
//
////        java.util.Date da=new java.util.Date();
////        System.out.println(da);
////        long l=da.getTime();
////        java.sql.Date a=new java.sql.Date(l);
////        System.out.println(a);
//
////        LocalDate ld=LocalDate.now();
////        System.out.println(ld);
////        System.out.println(ld.getYear());
////        System.out.println(ld.getMonthValue());
////        System.out.println(ld.getDayOfMonth());
//
////        LocalTime lt=LocalTime.now();
////        System.out.println(lt);
////        System.out.println(lt.getHour());
////        System.out.println(lt.getMinute());
////        System.out.println(lt.getSecond());
////        System.out.println(lt.getNano());
//
////        ArrayList a=new ArrayList();
////        a.add(1);
////        a.add(2);
////        a.add(3);
////        System.out.println(a);
//
//     //   List<Integer> a= Arrays.asList(1,4,2,5,4);
//
////    for(int e:a){
////        System.out.println(e);
////    }
////        Consumer<Integer>con=(Integer i)-> System.out.println(i);
////        Consumer<Integer>co=new Consumer<Integer>() {
////            @Override
////            public void accept(Integer i) {
////                System.out.println(i);
////            }
////        };
////        a.forEach(n-> System.out.println(n));
//
////        List<Integer>al=Arrays.asList(4,5,2,7,2);
////        Stream<Integer> s=al.stream();
//////        s.forEach(n-> System.out.print(n));
//////        System.out.println(s.count());
////       Stream <Integer>ss= s.sorted().map(n->n+1).filter(n->n%2==0);
//////       Stream<Integer>sss=ss.map(n->n+1);
//////       Stream<Integer>ssss=sss.filter(n->n%2==0);
////               ss.forEach(n-> System.out.println(n));
//
//
//
//
//    }
//    public static void main(String[] args) throws

//public class apiannotations {
//    public static void main(String[] args) throws IOException {
//        File f=new File("pw");
//        System.out.println(f.isDirectory());
////        f.mkdir();
//        File ff=new File(f,"pwfile");
//        System.out.println(ff.isFile());
////        ff.createNewFile();
//        FileWriter fw=new FileWriter(ff,true);
//        fw.write("which");
//       fw.write("\n");
//       fw.write("is");
//       fw.write("very");
//       fw.write("\n");
//        fw.write("bad");
//      fw.write("\n");
//        char c[]={'c','o','u','r','s','e'};
//        fw.write(c);
//        fw.write("\n");
//
////        fw.close();
//        fw.flush();
//
//    public class apiannotations {
//        public static void main(String[] args) throws IOException {
//            File ff=new File("pw");
//            System.out.println(ff.isDirectory());
//            File f=new File(ff,"pwfile");
//            System.out.println(f.isFile());
//
//            FileReader fr=new FileReader(f);
//
//            char[]c=new char[(int) f.length()];
//            fr.read(c);
//            for (char ch:c){
//                System.out.print(ch);
//            }
//            int i=fr.read();
////            System.out.println((char) i);
//            while (i!=-1){
//                System.out.println((char) i);
//                i=fr.read();
//            }

//        public class apiannotations {
//            public static void main(String[] args) throws IOException {
//                File ff=new File("pw");
//             System.out.println(ff.isDirectory());
//            File f=new File(ff,"pwfile");
//            System.out.println(f.isFile());
//
//            FileWriter fw=new FileWriter(f);
//           PrintWriter pw =new PrintWriter(fw);
//           pw.println(10);
//           pw.println('c');
//           pw.print(false);
//           pw.print("string");
//
//            fw.flush();
       

//            FileReader fr=new FileReader(f);
//            BufferedReader br=new BufferedReader(fr);
//
//            char[]c=new char[(int) f.length()];
//            br.read(c);
//            for (char ch:c){
//                System.out.print(ch);
//            }

//            FileWriter fw=new FileWriter(f ,true);
//            BufferedWriter bw=new BufferedWriter(fw);
//            bw.write("c++");
//            bw.newLine();
//            bw.write("course");
//            bw.newLine();
//            char[]c={'p','w'};
//            bw.write(c);
//            bw.close();
//class cricket implements Serializable{
//    String s;
//    int id;
//    public cricket(String name,int i){
//        this.s=name;
//        this.id=i;
//    }
//    public void disp(){
//        System.out.println(s);
//        System.out.println(id);
//    }
//}
//      public class apiannotations {
//          public static void main(String[] args) throws IOException, ClassNotFoundException {
//
//
////              FileOutputStream fos=new FileOutputStream("pwfile.txt");
////              ObjectOutputStream oos=new ObjectOutputStream(fos);
////              oos.writeObject(c);
////
////              oos.close();
//
//              FileInputStream fis=new FileInputStream("pwfile.txt");
//              BufferedInputStream bis=new BufferedInputStream(fis);
//              ObjectInputStream ois=new ObjectInputStream(bis);
//             cricket c=(cricket) ois.readObject();
//              c.disp();
//              ois.close();
//          }
//}
//class cricket implements Serializable{
//    String name;
//    int id;
//    public cricket(String s,int i){
//        this.name=s;
//        this.id=i;
//    }
//    public void display(){
//        System.out.println(name);
//        System.out.println(id);
//    }
//}
//        public class apiannotations {
//    public static void main(String[] args) throws Exception {
//  FileInputStream fis=new FileInputStream("pwfile.txt");
//  ObjectInputStream ois=new ObjectInputStream(fis);
//  cricket c=(cricket) ois.readObject();
//  c.display();
//   ois.close();
//    }
//}

//class ball implements Serializable{
//    String name;
//    transient int id;
//    public ball(String s,int i){
//        this.name=s;
//        this.id=i;
//    }
//    public void disp(){
//        System.out.println(name);
//        System.out.println(id);
//    }
//}
//public class apiannotations {
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ball b=new ball("ball",10);
//        FileOutputStream fos=new FileOutputStream("pw.txt");
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//
//        oos.writeObject(b);
//        oos.close();
//
//        FileInputStream fis=new FileInputStream("pw.txt");
//        ObjectInputStream ois=new ObjectInputStream(fis);
//        ball ba=(ball) ois.readObject();
//        ba.disp();
//        ois.close();
//    }
//}