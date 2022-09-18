//package p1;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//@WebServlet("/Save")
//public class SaveRegistrationForm extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//
//    public SaveRegistrationForm() {
//        super();
//
//    }
//
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("get");
//    }
//
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("post");
//        String name=request.getParameter("firstName");
//        System.out.println(name);
//        String city=request.getParameter("city");
//        System.out.println(city);
//        String emailId=request.getParameter("emailId");
//        System.out.println(emailId);
//        String num=request.getParameter("num");
//        System.out.println(num);
//
//    }
//
//}
