package javadsasys_design;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc {
    public static void main(String[] args) {
        float f1 = new Float("20.4");
        String s1 = "sssss";
        String s1s = new String("abcv");
        double bu = new Double("125.018585");
        System.out.println(bu);

//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con= DriverManager.getConnection(
//            "jdbc:mysql://localhost:3306/student","root","root"
//            );
//            if (con.isClosed()) System.out.println("closed");
//            else System.out.println("open");
//        }catch (Exception e){
//            System.out.println(e);
//        }
    }
}
