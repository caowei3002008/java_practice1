package com.wei.ninjagold.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class Main {
    private static Date currentDate = new Date();
    private static SimpleDateFormat formatter = new SimpleDateFormat("MMMMM dd yyyy hh:mm aaa");
    String formattedDate = formatter.format(currentDate);

    @RequestMapping("/")
    public String index(HttpSession session) {
        Integer total = (Integer) session.getAttribute("totalEarn");
        ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
        if(total == null){
            session.setAttribute("totalEarn",0);
        }

        if(activities == null){
            session.setAttribute("activities",new ArrayList<String>());
        }
        return "index";
    }
    @RequestMapping(path="/gold", method = RequestMethod.POST)
    public String result(@RequestParam(value="building") String building, Model model, HttpSession session){
        ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
        int earn = 0;
        String meg = "";
        switch(building){
            case "farm":
                earn = ThreadLocalRandom.current().nextInt(10, 20 + 1);
                meg = "Your entered a farm and earned "+earn+" gold. ("+formattedDate+")";
                break;
            case "cave":
                earn = ThreadLocalRandom.current().nextInt(5, 10 + 1);
                meg = "Your entered a cave and earned "+earn+" gold. ("+formattedDate+")";
                break;
            case "house":
                earn = ThreadLocalRandom.current().nextInt(2, 5 + 1);
                meg = "Your entered a house and earned "+earn+" gold. ("+formattedDate+")";
                break;
            case "casino":
                earn = ThreadLocalRandom.current().nextInt(-50, 50 + 1);
                if(earn>=0){
                    meg = "Your entered a casino and earned "+earn+" gold. ("+formattedDate+")";
                }else{
                    meg = "Your entered a casino and lost "+earn+" gold..Ouch. ("+formattedDate+")";
                }

                break;
            case "reset":
                session.setAttribute("totalEarn",0);
                session.setAttribute("activities",new ArrayList<String>());
                return "redirect:/";
        }
        Integer total = (Integer) session.getAttribute("totalEarn");
        total +=earn;
        session.setAttribute("totalEarn",total);
        activities.add(0,meg);
        session.setAttribute("activities",activities);
        return "redirect:/";
    }
}
