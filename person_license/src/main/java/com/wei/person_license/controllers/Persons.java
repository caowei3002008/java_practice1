package com.wei.person_license.controllers;

import com.wei.person_license.models.License;
import com.wei.person_license.models.Person;
import com.wei.person_license.repositories.LicenseRepository;
import com.wei.person_license.repositories.PersonRepository;
import com.wei.person_license.services.Person_LicenseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;

@Controller
public class Persons {
    private final PersonRepository personRepository;
    private final LicenseRepository licenseRepository;
    private final Person_LicenseService person_licenseService;

    public Persons(PersonRepository personRepository, Person_LicenseService person_licenseService, LicenseRepository licenseRepository) {
        this.personRepository = personRepository;
        this.person_licenseService = person_licenseService;
        this.licenseRepository = licenseRepository;
    }
    @RequestMapping("/")
    public String index(Model model){
        List<Object[]> table = licenseRepository.findEverything();
        for(Object[] row: table){
            License license = (License) row[0];
            Person person = (Person) row[1];
        }
        System.out.println(table);
        model.addAttribute("details", table);
        return "home";
    }

    @RequestMapping("/persons/new")
    public String addPage(@ModelAttribute("person") Person person){
        return "newPerson";
    }

    @PostMapping("/add")
    public String addProcess(@ModelAttribute("person") Person person){
        person_licenseService.createPerson(person);
        return "redirect:/";
    }
}
