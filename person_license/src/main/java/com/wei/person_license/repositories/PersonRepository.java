package com.wei.person_license.repositories;

import com.wei.person_license.models.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{
    List<Person> findAll();
//    @Query("SELECT relationships.persons.last_name, relationships.persons.first_name, relationships.licenses.number, relationships.licenses.state, relationships.licenses.expiration_date from relationships.persons JOIN relationships.licenses WHERE relationships.persons.id = relationships.licenses.person_id")
    @Query("SELECT d FROM Person d")
    List<Person> findAllPerson();
}
