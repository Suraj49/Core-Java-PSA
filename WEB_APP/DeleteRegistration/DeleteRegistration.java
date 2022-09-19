//package WEB_APP.DeleteRegistration;
//
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/delete")
//public class DeleteRegistration extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public DeleteRegistration() {
//        super();
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String email = request.getParameter("email");
//        System.out.println(email);
//
//        try {
//
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp1", "root", "surajtest");
//            Statement stm = con.createStatement();
//            stm.executeUpdate("DELETE FROM registration where email='" + email + "'");
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
