//package WEB_APP.Update;
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
// Remove All Comment
///
//@WebServlet("/update")
//public class UpadateRegistration extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public UpadateRegistration() {
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
//
//        String num=request.getParameter("num");
//        String email=request.getParameter("email");
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp1","root","surajtest");
//            Statement stm = con.createStatement();
//            stm.executeUpdate("UPDATE registration SET mobile ='"+num+"'WHERE email='"+email+"'");
//            con.close();
//
//
//        }catch(Exception e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//}
