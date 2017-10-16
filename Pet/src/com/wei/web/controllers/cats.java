package com.wei.web.controllers;

import com.wei.web.models.cat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cat")
public class cats extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String breed = request.getParameter("breed");
        double weight = Double.parseDouble(request.getParameter("weight"));

        cat c1 = new cat(name, breed,weight);
        request.setAttribute("cat", c1);

        RequestDispatcher view = request.getRequestDispatcher("cat.jsp");
        view.forward(request,response);
    }
}
