package JDBC;

import java.sql.*;



public class A {
    public static void main(String[] args) {

        try {
            //connect to database test_x
            Connection con =
                    DriverManager.getConnection
                            ("jdbc:mysql://localhost:3306/test_x","root","surajtest");
            System.out.println(con);
            //write code to insert record in test_x

            Statement stm=con.createStatement();
            stm.executeUpdate("INSERT INTO registration VALUES ('shivam', '8015245847', 'sivam@gmail.com','india')");

            //close database connection
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}

