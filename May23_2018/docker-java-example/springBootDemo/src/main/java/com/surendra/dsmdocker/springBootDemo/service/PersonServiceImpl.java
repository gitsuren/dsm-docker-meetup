package com.surendra.dsmdocker.springBootDemo.service;

import com.surendra.dsmdocker.springBootDemo.domain.Person;
import com.surendra.dsmdocker.springBootDemo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
}