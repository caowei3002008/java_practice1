package com.wei.learning.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class Main {
    @RequestMapping("/")
    public String index(HttpSession session) {
        String mes = (String) session.getAttribute("mes");
        if(mes == null){
            session.setAttribute("mes","");
        }
        return "index";
    }

    @RequestMapping("/m/{chapter}/0553/{assignment}")
    public String assignment(@PathVariable("assignment") String assignmentNumber, HttpSession session) {
        String mes = (String) session.getAttribute("mes");
        switch (assignmentNumber) {
            case "0733":
                mes = "Setting up your servers";

                break;
            case "0342":
                mes = "Punch Cards";
                break;
            case "0348":
                mes = "Advanced Fortran Intro";
                break;
        }
        session.setAttribute("mes",mes);
        return "assignment";
    }

    @RequestMapping("/m/{chapter}/0483/{assignment}")
    public String lesson(@PathVariable("assignment") String assignmentNumber, HttpSession session) {
        String mes = (String) session.getAttribute("mes");
        switch (assignmentNumber) {
            case "0345":
                mes = "Coding Forms";
                break;
            case "2342":
                mes = "Fortran to Binary";
                break;
        }
        session.setAttribute("mes",mes);
        return "lesson";
    }
}
