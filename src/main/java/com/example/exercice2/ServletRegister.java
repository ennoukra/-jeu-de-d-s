package com.example.exercice2;

import com.example.exercice2.bo.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;



@WebServlet(name = "ServletRegister", value = "/Register")
public class ServletRegister extends HttpServlet {

//    private final Logger LOGGER = getLogger(getClass());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/Register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        call the processRequest method
        processRequest(request, response);
        System.out.println("The mothed doPost is called successfully");
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext appContext = request.getServletContext();

//        Get the data sent as request parameter
        String firstName = request.getParameter("firstName");
        String lastName =  request.getParameter("lastName");
        String userName =  request.getParameter("username");
        String password =  request.getParameter("password");
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(userName);
        System.out.println(password);
//        if a parameter value is missing
        if(firstName == "" || lastName == "" || userName == "" || password == ""){
//            redirect to jsp
            request.setAttribute("message", "all attrubutes are required!");
            request.getRequestDispatcher("/WEB-INF/pages/Register.jsp").forward(request, response);

//            and stop execution of the servlet method
            return;
        }

        User user = new User(firstName, lastName, userName, password, 0);
        User.list.add(user);

        request.setAttribute("user", user);
        HttpSession session = request.getSession();
        session.setAttribute("login", "1");
        request.getRequestDispatcher("/WEB-INF/pages/Game.jsp").forward(request, response);

    }
}
