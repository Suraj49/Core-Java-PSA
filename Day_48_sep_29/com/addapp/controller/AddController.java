//package Day_48_sep_29.com.addapp.controller;
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
//import com.app_calculator.model.AddNumber;
//
//
//@WebServlet("/addController")
//public class AddController extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public AddController() {
//        super();
//    }
//
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int num1 = Integer.parseInt( request.getParameter("num1"));
//        int num2 = Integer.parseInt( request.getParameter("num2"));
//
//        AddNumber ads=new AddNumber();
//        int result = ads.addNumber(num1, num2);
//
//        request.setAttribute("result",result);
//        RequestDispatcher rd = request.getRequestDispatcher("Add_no.jsp");
//        rd.forward(request, response);
//
//
//    }
//
//}
//
