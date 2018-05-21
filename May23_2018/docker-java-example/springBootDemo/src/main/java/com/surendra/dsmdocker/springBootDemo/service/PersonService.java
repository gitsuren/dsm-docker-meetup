package com.surendra.dsmdocker.springBootDemo.service;

import com.surendra.dsmdocker.springBootDemo.domain.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();
}
