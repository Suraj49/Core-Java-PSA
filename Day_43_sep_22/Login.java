package Day_43_sep_22;


//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/login")
//public class Login extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public Login() {
//        super();
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        String email=request.getParameter("email");
//        String password=request.getParameter("password");
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb_1", "root", "surajtest");
//            Statement stmnt = con.createStatement();
//            ResultSet result = stmnt.executeQuery("SELECT * FROM login where email='"+email+"' and password='"+password+"'");
//            System.out.println(result.next());
//
//        }catch (Exception e) {
//            // TODO: handle exception
//            e.printStackTrace();
//        }
//
//    }
//
//
//}

