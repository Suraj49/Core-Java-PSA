package JDBC;


import java.sql.*;
import java.util.Scanner;



public class B {
    public static void main(String[] args) {

        try {
            Scanner scn=new Scanner(System.in);

            System.out.println("Enter your name:");
            String name=scn.next();

            System.out.println("Enter your mobile :");
            String num=scn.next();

            System.out.println("Enter your email :");
            String email=scn.next();

            System.out.println("Enter your city :");
            String city=scn.next();
            //connect to database test_x
            Connection con =
                    DriverManager.getConnection
                            ("jdbc:mysql://localhost:3306/test_x","root","surajtest");
            System.out.println(con);
            //write code to insert record in test_x

            Statement stm=con.createStatement();
            stm.executeUpdate("INSERT INTO registration VALUES ('"+name+"', '"+num+"', '"+email+"','"+city+"')");

            //close database connection
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}

