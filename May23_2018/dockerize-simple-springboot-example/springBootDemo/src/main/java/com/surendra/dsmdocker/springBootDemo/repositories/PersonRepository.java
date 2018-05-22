package com.surendra.dsmdocker.springBootDemo.repositories;

import com.surendra.dsmdocker.springBootDemo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
