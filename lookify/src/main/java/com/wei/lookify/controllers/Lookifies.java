package com.wei.lookify.controllers;

import com.wei.lookify.repositories.LookifyRepository;
import com.wei.lookify.services.LookifyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.wei.lookify.models.Lookify;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.ArrayList;

@Controller
public class Lookifies {

    private final LookifyService lookifyService;
    private final LookifyRepository lookifyRepository;

    public Lookifies(LookifyService lookifyService, LookifyRepository lookifyRepository){
        this.lookifyService = lookifyService;
        this.lookifyRepository = lookifyRepository;
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/dashboard/")
    public String dashboard(Model model){
         model.addAttribute("lookify",lookifyService.allLookify());
         return "dashboard";
    }


    @RequestMapping("/songs/new/")
    public String newAdd(@ModelAttribute("lookify") Lookify lookify){
        return "addSong";
    }

    @PostMapping("/songs/new/add/")
    public String addSong(@Valid @ModelAttribute("lookify") Lookify lookify, BindingResult result, Model model){
        if (result.hasErrors()) {
            return "addSong";
        }else{
            lookifyService.addLookify(lookify);
            return "redirect:/dashboard/";
        }
    }

    @RequestMapping("/delete/{id}/")
    public String deleteSong(@PathVariable("id") Long id){
        lookifyService.destroyLookify(id);
        return "redirect:/dashboard/";
    }

    @RequestMapping("/songs/{id}/")
    public String showSongDetails(@PathVariable("id") Long id, Model model){
        model.addAttribute("song",lookifyService.findLookifyById(id));
        return "show";
    }

    @RequestMapping(path="/dashboard/search/", method=RequestMethod.POST)
    public String searchArtists(@RequestParam(value="search") String artistSearch, Model model){
        model.addAttribute("result",lookifyRepository.findByNameContaining(artistSearch));
        model.addAttribute("searchName",artistSearch);
        return "searchResult";
    }

    @RequestMapping("/search/topTen/")
    public String topTenDisplay(Model model){
        model.addAttribute("topTen",lookifyRepository.findTop10ByOrderByRatingDesc());


        return "topTen";
    }



}
