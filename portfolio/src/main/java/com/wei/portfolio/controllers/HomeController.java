package com.wei.portfolio.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
@Controller

public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "forward:/index.html";
    }
    @RequestMapping("/me")
    public String me() {
        return "forward:/aboutMe.html";
    }
    @RequestMapping("/project")
    public String project() {
        return "forward:/projectPage.html";
    }

}
