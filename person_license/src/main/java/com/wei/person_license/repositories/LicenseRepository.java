package com.wei.person_license.repositories;


import com.wei.person_license.models.License;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LicenseRepository extends CrudRepository<License, Long>{

    @Query("SELECT d,n FROM License d JOIN d.person n")
    List<Object[]> findEverything();

}
