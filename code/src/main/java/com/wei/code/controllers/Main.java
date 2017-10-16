package com.wei.code.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Main {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping(path = "/code", method = RequestMethod.POST)
    public String code(@RequestParam(value = "secret") String secret, RedirectAttributes redirectAttributes){
        switch (secret){
            case "bushido":
                return "code";
            default:
                redirectAttributes.addFlashAttribute("errors", "You must train harder");
                return "redirect:/";
        }
    }
}
