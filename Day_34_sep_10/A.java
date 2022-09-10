package Day_34_sep_10;

import java.sql.*;

public class A {
        public static void main(String[] args) {
            try {
                //connect to database test_x
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_x","root","surajtest");
                System.out.println(connection);
                //write code to insert record in test_x

                //close database connection
            }catch(Exception e) {
                e.printStackTrace();
            }
        }

}

