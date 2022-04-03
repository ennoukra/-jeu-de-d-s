package com.example.exercice2;

import com.example.exercice2.bo.User;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@WebFilter(filterName = "FilterLogin", servletNames = "ServletLogin")
public class FilterLogin implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        String username = request.getParameter("userName");
        String password = request.getParameter("password");

        if(username == "" || password == ""){
            request.setAttribute("errorMessage", "All attrubutes are required!");
            request.getRequestDispatcher("WEB-INF/pages/index.jsp").forward(request, response);
        }else {
            List list = User.list;

            Iterator<User> it = list.iterator();
            while(it.hasNext()){
                User user = it.next();
                if(username == user.getUserName() && password == user.getPassworld()){
                    HttpSession session = request.getSession();
                    session.setAttribute("login", true);
                    request.getRequestDispatcher("WEB-INF/pages/Game.jsp").forward(request, response);
                    return;
                }
            }

            request.setAttribute("errorMessage", "Password or username not correct!");


        }

        chain.doFilter(request, response);
    }
}
