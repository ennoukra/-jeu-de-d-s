package com.example.exercice2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ServletGame", value = "/Game")
public class ServletGame extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, ServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        if(session.getAttribute("login") != null && (boolean) session.getAttribute("login")){
            request.getRequestDispatcher("/WEB-INF/pages/Game.jsp").forward(request, response);
        }else {
            request.setAttribute("message", "you should login first");
            request.getRequestDispatcher("/WEB-INF/pages/index.jsp").forward(request, response);
        }
    }
}
