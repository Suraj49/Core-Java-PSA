package Day_50_oct_03.com.webapp.controller;
//
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.web_App9.model.DAOSarvice;
//import com.web_App9.model.DAOServicImpl;
//
//@WebServlet("/verifylogin")
//public class LoginController extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public LoginController() {
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
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//
//        DAOSarvice sarvice=new DAOServicImpl();
//        sarvice.connectDB();
//        boolean status = sarvice.verifyCredentials(email, password);
//        if(status==true) {
//
//        }else {
//            request.setAttribute("error", "Invalid user name / password");
//            RequestDispatcher rd = request.getRequestDispatcher("Wellcome.jsp");
//            rd.forward(request, response);
//        }
//    }
//
//}
