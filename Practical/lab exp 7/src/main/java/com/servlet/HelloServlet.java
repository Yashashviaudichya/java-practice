
package com.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // Handle GET Request
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.sendRedirect(request.getContextPath() + "/student.jsp");
    }

    // Handle POST Request
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        // Get form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");
        String age = request.getParameter("age");

        // Set attributes
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("course", course);
        request.setAttribute("age", age);

        // Forward data to result.jsp
        request.getRequestDispatcher("/result.jsp")
               .forward(request, response);
    }
}
