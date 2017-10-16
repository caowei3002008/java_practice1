package com.wei.languages.services;

import com.wei.languages.models.Language;
import com.wei.languages.repositories.LanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    private LanguageRepository languageRepository;



    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }


    public List<Language> allLanguages(){
        return languageRepository.findAll();
    }

    public Language findLanguageById(Long id){
        return languageRepository.findOne(id);
    }

    public void updateLanguage(Language language){
        languageRepository.save(language);
    }

    public void destroyLanguage(Long id){
        languageRepository.delete(id);
    }

    public void addLanguage(Language language){
        languageRepository.save(language);
    }

}
