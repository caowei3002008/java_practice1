package com.wei.lookify.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wei.lookify.models.Lookify;

@Repository
public interface LookifyRepository extends CrudRepository<Lookify, Long>{
    List<Lookify> findAll();
    List<Lookify> findByNameContaining(String search);
    List<Lookify> findTop10ByOrderByRatingDesc();


}
