package Day_34_sep_10;


import java.sql.*;

public class B {
    public static void main(String[] args) {
        try {
            //connect to database test_x
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_x","root","surajtest");
            System.out.println(con);
            //write code to insert record in test_x
            Statement st = con.createStatement();
            st.executeUpdate("insert into registration value ('Mrinal','9915245847','mk2@gmail.com','india')");


            //close database connection
            con.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

