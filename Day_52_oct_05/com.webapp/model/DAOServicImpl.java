package Day_52_oct_05.com.webapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOServicImpl implements DAOSarvice {

    Connection con;
    Statement stmnt;

    @Override
    public void connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationapp", "root", "surajtest");
            stmnt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean verifyCredentials(String email, String password) {
        try {
            ResultSet resultSet = stmnt
                    .executeQuery("Select * from login where email='" + email + "' and password='" + password + "'");
            return resultSet.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void saveRegistration(String name, String city, String email, String mobile) {
        // TODO Auto-generated method stub

        try {
            stmnt.executeUpdate(
                    "insert into registration values('" + name + "','" + city + "','" + email + "','" + mobile + "')");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

