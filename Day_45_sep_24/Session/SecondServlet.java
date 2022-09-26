//package Day_45_sep_24.Session;
//
//package p1;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//@WebServlet("/secondServlet")
//public class SecondServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public SecondServlet() {
//        super();
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//
//        Object name = request.getAttribute("name");
//        System.out.println((String)name);
//        //code to access session object
//
//        HttpSession session = request.getSession(false);
//        System.out.println(session.getAttribute("sessionName"));
//    }
//}
