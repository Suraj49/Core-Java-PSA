package Day_35_sep_12;


import java.sql.*;

public class A {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/test_x","root","surajtest");

            Statement cmt = con.createStatement();
            cmt.executeUpdate
                    ("UPDATE registration SET mobile='12347856' WHERE name='suraj'");



        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}

