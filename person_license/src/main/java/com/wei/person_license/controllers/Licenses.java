package com.wei.person_license.controllers;


import com.wei.person_license.models.License;
import com.wei.person_license.repositories.LicenseRepository;
import com.wei.person_license.repositories.PersonRepository;
import com.wei.person_license.services.Person_LicenseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wei.person_license.controllers.Persons;

@Controller
public class Licenses {
    private final LicenseRepository licenseRepository;
    private final PersonRepository personRepository;
    private final Person_LicenseService person_licenseService;

    public Licenses(LicenseRepository licenseRepository, Person_LicenseService person_licenseService, PersonRepository personRepository) {
        this.licenseRepository = licenseRepository;
        this.person_licenseService = person_licenseService;
        this.personRepository = personRepository;
    }

    @RequestMapping("/licenses/new")
    public String addLicense(@ModelAttribute("license")License license, Model model){
        model.addAttribute("personFullName", person_licenseService.allPerson());
        return "newLicense";
    }

    @PostMapping("/addLicense")
    public String addLicenseProcess(@ModelAttribute("license")License license){
        person_licenseService.createLicense(license);
        return "redirect:/";
    }
}
