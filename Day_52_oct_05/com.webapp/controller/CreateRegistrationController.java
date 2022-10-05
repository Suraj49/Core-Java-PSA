package Day_52_oct_05.com.webapp.controller;
//
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
//@WebServlet("/saveReg")
//public class CreateRegistrationController extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public SaveRegistrationController() {
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
//        String name = request.getParameter("name");
//        String city = request.getParameter("city");
//        String email = request.getParameter("email");
//        String mobile = request.getParameter("mobile");
//
//        DAOSarvice sarvice=new DAOServicImpl();
//        sarvice.connectDB();
//        sarvice.saveRegistration(name, city, email, mobile);
//
//        request.setAttribute("msg", "Record is saved !");
//
//        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/CreateReg.jsp");
//        rd.forward(request, response);
//    }
//
//}
