//package Day_44_sep_23;
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
//        RequestDispatcher rd = request.getRequestDispatcher("secondServlet");
//        rd.forward(request, response);
//
//    }
//
//}
