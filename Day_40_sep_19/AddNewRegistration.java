package Day_40_sep_19;
//
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
// Remove aLL comment
//@WebServlet("/save")
//public class AddNewRegistration extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public AddNewRegistration() {
//        super();
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String name = request.getParameter("Fname");
//        String city = request.getParameter("city");
//        String mobile = request.getParameter("mobileNo");
//        String email = request.getParameter("emailId");
//        System.out.println(name);
//        System.out.println(city);
//        System.out.println(mobile);
//        System.out.println(email);
//
//        try {
//
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp1", "root", "surajtest");
//            Statement stm = con.createStatement();
//            stm.executeUpdate("INSERT INTO registration VALUES ('" + name + "', '" + city + "', '" + mobile + "','"
//                    + email + "')");
//            System.out.println(con);
//            con.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}
//

