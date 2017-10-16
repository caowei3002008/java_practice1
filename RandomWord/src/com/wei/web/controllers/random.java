package com.wei.web.controllers;

import com.wei.web.models.Generate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/random")
public class random extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Integer clicks = (Integer) session.getAttribute("clicks");
        String random = (String) session.getAttribute("random");
        if(clicks == null){
            session.setAttribute("clicks",0);
        }else{
            Integer clicks1 = (Integer) session.getAttribute("clicks");
            clicks1++;
            session.setAttribute("clicks",clicks1);
        }

        if(random == null){
            session.setAttribute("random","AAAAAAAAAAAAAA");
        }else{
//            String random1 = (String) session.getAttribute("random");
            Generate g1 = new Generate();
            String random1 = g1.generateRandomWords();
            session.setAttribute("random",random1);
        }
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request,response);
    }
}
