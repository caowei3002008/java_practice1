package com.wei.person_license.services;


import com.wei.person_license.models.License;
import com.wei.person_license.models.Person;
import com.wei.person_license.repositories.LicenseRepository;
import com.wei.person_license.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Person_LicenseService {
    private LicenseRepository licenseRepository;
    private PersonRepository personRepository;
    public Person_LicenseService(LicenseRepository licenseRepository, PersonRepository personRepository){
        this.licenseRepository = licenseRepository;
        this.personRepository = personRepository;
    }

    public List<Person> allPerson(){
        return personRepository.findAll();
    }

    public void createPerson(Person person){
        String fullName = person.getFirstName() +" "+ person.getLastName();
        person.setFullName(fullName);
        personRepository.save(person);
    }

    public Person getPerson(Long id){
        return personRepository.findOne(id);
    }
    public License createLicense(License license){
        Long personId = license.getPerson().getId();
        String LicenseNumber = String.format("%06d", personId);
        license.setNumber(LicenseNumber);
        License lic = licenseRepository.save(license);
        return lic;

    }

}
