package com.company;
class fog{
    public int a=1;
    protected int b=2;
    int c=3;
    private int d=4;
     void gh() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class modify {
    public static void main(String[] args) {
    fog f=new fog();
    f.gh();
    }
}
