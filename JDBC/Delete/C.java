package JDBC.Delete;


import java.sql.*;

public class C {
    public static void main(String[] args) {
        try {

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_x","root","surajtest");

            Statement stm=con.createStatement();

            stm.executeUpdate("DELETE FROM registration WHERE name='ramcharn'");

            System.out.println(con);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}

