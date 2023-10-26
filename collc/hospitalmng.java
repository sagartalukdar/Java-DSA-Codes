package collc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

class login{
    Scanner sc=new Scanner(System.in);
    public void entry(){
        System.out.println("******************************************");
        System.out.println("WELCOME TO XYZ HOSPITAL \n ENTER YOUR DETAILS TO BOOK");
        System.out.println("_______________________________________________");
        String name;
        long phoneno;
        String state;
        String city;
        System.out.println("enter your name");
        name=sc.next();
        System.out.println("enter your phone number");
        phoneno=sc.nextLong();
        System.out.println("enter your state");
        state=sc.next();
        System.out.println("enter your city");
        city=sc.next();
        System.out.println("you are loged in");
    }
}
class  type{
    public void type() {
        login l = new login();
        l.entry();
        Scanner sc = new Scanner(System.in);
        String st;
        ArrayList s = new ArrayList();
        s.add("neuro");
        s.add("brain");
        s.add("ear");
        s.add("stomach");
        System.out.println("surgeries which we have is" + s);
        System.out.println("coose your surgery");
        st = sc.next();
            String n = "neuro";
            String b = "brain";
            String e = "ear";
            String sto = "stomach";

            if (st == "neuro"){
                System.out.println("choose your choosefull one dr from bellow:");
                System.out.println("dr.dh; dr.pal ; dr.sa");
                String dr = sc.next();
            } else if (st == b) {
                System.out.println("choose your choosefull one dr from bellow:");
                System.out.println("dr.gup; dr.ch ; dr.kuna");
                String dr = sc.next();
            } else if (st == e) {
                System.out.println("choose your choosefull one dr from bellow:");
                System.out.println("dr.ach; dr.vat ; dr.sil");
                String dr = sc.next();
            } else {
                System.out.println("choose your choosefull one dr from bellow:");
                System.out.println("dr.das; dr.khandl ; dr.mukkhar");
                String dr = sc.next();
            }
    }
}
class faculties{
    public void faculties(){
        Scanner sc=new Scanner(System.in);
        ArrayList a=new ArrayList();
        a.add("mr.das");
        a.add("mr.pal");
        a.add("mr.vatt");
        a.add("mr.sha");
        a.add("mr.alsd");
        type t=new type();
        t.type();

        System.out.println("the faculties that we have is"+a);
        System.out.println("you can choose your suitable guide if you need ; they also giude " +
                "you in every situation");
        System.out.println("choese your perfect one ; kindly enter NO if you don't need");
        String s=sc.next();
    }
}
class confirm{
    public void book(){
        faculties f=new faculties();
        f.faculties();
        Scanner sc=new Scanner(System.in);
        System.out.println("will you arrived after 12am or before 12 am");
        String time=sc.next();
        System.out.println("in which month will you come in");
        String month=sc.next();
        System.out.println("enter your confirmation date");
        int date=sc.nextInt();
        System.out.println("****your booking have been confirmed****");
        System.out.println("***our ADDRESS :near bus stop BRB road STATE :wb,kulgaoun***" +
                " our helpline no.745812963 ");
        System.out.println("STAY WELL ,AND WISH FOR YOUR HEALTHY ARRIVATION ");
    }
}
public class hospitalmng {
    public static void main(String[] args) {
confirm c=new confirm();
c.book();
    }
    
}
