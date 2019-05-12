package com.epolsoft.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/result")
public class Calculation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{


        int val1 = Integer.parseInt(request.getParameter("value1"));
        int val2 = Integer.parseInt(request.getParameter("value2"));

        int res = val1 + val2;

        request.setAttribute("result", res);

        request.getRequestDispatcher("answer.jsp").forward( request, response );


    }
}
