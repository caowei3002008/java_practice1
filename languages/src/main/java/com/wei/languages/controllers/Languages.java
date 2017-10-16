package com.wei.languages.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import com.wei.languages.models.Language;
import com.wei.languages.services.LanguageService;
@Controller
public class Languages {
    private final LanguageService languageService;

    public Languages(LanguageService languageService){
        this.languageService = languageService;
    }

    @RequestMapping("/languages")
    public String languages(@ModelAttribute("language") Language language, Model model){
        model.addAttribute("Languages",languageService.allLanguages() );
        return "index";
    }

    @RequestMapping("/add")
    public String  addL(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("Languages",languageService.allLanguages());
            return "index";
        }else{
            languageService.addLanguage(language);
            return "redirect:/languages";
        }
    }

    @RequestMapping("/languages/{index}/")
    public String show(@PathVariable("index") Long id, Model model){
        model.addAttribute("language",languageService.findLanguageById(id));
        return "show";
    }

    @RequestMapping("/delete/{id}/")
    public String delete(@PathVariable("id") Long id){
        languageService.destroyLanguage(id);
        return "redirect:/languages";
    }

    @RequestMapping("/update/{id}/")
    public String update(@ModelAttribute("language") Language language, @PathVariable("id") Long id, Model model){
        model.addAttribute("ll",languageService.findLanguageById(id));
        model.addAttribute("id",id);
        return "edit";
    }

    @PostMapping("/languages/update/{id}")
    public String updateLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id) {
        if (result.hasErrors()) {
            return "edit";
        }else{
            languageService.updateLanguage(language);
            return "redirect:/languages";
        }
    }

}
