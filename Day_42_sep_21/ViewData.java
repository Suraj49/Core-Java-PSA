package Day_42_sep_21;

//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.*;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.mysql.*;
// Remove all Comment
//@WebServlet("/ViewData")
//public class ViewData extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public ViewData() {
//        super();
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp1", "root", "surajtest");
//            Statement stmnt = con.createStatement();
//            ResultSet result = stmnt.executeQuery("SELECT * FROM registration");
//            PrintWriter out = response.getWriter();
//            out.println("<title>");
//            out.println("Retrieve Page");
//            out.println("</title>");
//            out.println("<h2>");
//            out.println("Retrieve | Registration");
//            out.println("</h2>");
//            out.println("<table>");
//            out.println("<tr>");
//            out.println("<th>");
//            out.println("Name");
//            out.println("</th>");
//            out.println("<th>");
//            out.println("City");
//            out.println("</th>");
//            out.println("<th>");
//            out.println("Email");
//            out.println("</th>");
//            out.println("<th>");
//            out.println("Mobile");
//            out.println("</th>");
//            out.println("</tr>");
//            while (result.next()) {
//                out.println("<tr>");
//                out.println("<td>");
//                out.println(result.getString(1));
//                out.println("</td>");
//                out.println("<td>");
//                out.println(result.getString(2));
//                out.println("</td>");
//                out.println("<td>");
//                out.println(result.getString(3));
//                out.println("</td>");
//                out.println("<td>");
//                out.println(result.getString(4));
//                out.println("</td>");
//                out.println("<tr>");
//            }
//            out.println("</table>");
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//    }
//
//}
//
