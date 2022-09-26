//package Day_45_sep_24.Session;
//
//package p1;
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//@WebServlet("/firstServlet")
//public class FirstServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public FirstServlet() {
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
//        String name = request.getParameter("name");
//
//
//        //session object
//        HttpSession session = request.getSession(true);//if true then object is created
//
//        //content is stored
//        session.setAttribute("sessionName", name);
//
//        request.setAttribute("name", name);
//        //sending the value into 2nd servlet
//        RequestDispatcher rd = request.getRequestDispatcher("secondServlet");
//        rd.forward(request, response);
//
//
//    }
//
//}
