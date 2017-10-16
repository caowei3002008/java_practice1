package com.wei.lookify.services;

import com.wei.lookify.models.Lookify;
import com.wei.lookify.repositories.LookifyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LookifyService {
    private LookifyRepository lookifyRepository;

    public LookifyService(LookifyRepository lookifyRepository){
        this.lookifyRepository = lookifyRepository;
    }

    public List<Lookify> allLookify(){
        return lookifyRepository.findAll();
    }

    public Lookify findLookifyById(Long id){
        return lookifyRepository.findOne(id);
    }

    public void destroyLookify(Long id){
        lookifyRepository.delete(id);
    }

    public void addLookify(Lookify lookify){
        lookifyRepository.save(lookify);
    }



}
