package com.wei.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Main {
    private static Date currentDate = new Date();
    private static SimpleDateFormat formatter;

//    @RequestMapping("/")
//    public String index() {
//        return "index";
//    }
    @RequestMapping("/")
    public String index(@RequestParam(value = "name", required = false) String searchQuery, Model model){
        if(searchQuery == null){
            model.addAttribute("name", "Human");
        }else {
            model.addAttribute("name", searchQuery);
        }
        return "index";
    }

    @RequestMapping("/date")
    public String getDatePage(Model model) {
        formatter = new SimpleDateFormat("EEEE, 'the ' d 'of' MMMM, yyyy");
        String formattedDate = formatter.format(currentDate);
        model.addAttribute("date", formattedDate);
        return "datePage";
    }

    @RequestMapping("/time")
    public String getTimePage(Model model) {
        formatter = new SimpleDateFormat("hh:mm aa");
        String formattedDate = formatter.format(currentDate);
        model.addAttribute("date", formattedDate);
        return "timePage";
    }
}
