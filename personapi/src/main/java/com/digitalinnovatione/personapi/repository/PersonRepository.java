package com.digitalinnovatione.personapi.repository;

import com.digitalinnovatione.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
