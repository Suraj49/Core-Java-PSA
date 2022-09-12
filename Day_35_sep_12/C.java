package Day_35_sep_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/test_x","root","surajtest");

            Statement cmt = con.createStatement();
            ResultSet executeQuery = cmt.executeQuery
                    ("select * from registration");
            while(executeQuery.next()) {
                System.out.print(executeQuery.getString(1)+" ");
                System.out.print(executeQuery.getString(2)+" ");
                System.out.print(executeQuery.getString(3)+" ");
                System.out.print(executeQuery.getString(4));
                System.out.println();

            }
            con.close();



        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}

