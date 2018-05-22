package com.surendra.dsmdocker.springBootDemo.web;

import com.surendra.dsmdocker.springBootDemo.domain.Person;
import com.surendra.dsmdocker.springBootDemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    public String showIndex(Model model) {
        List<Person> personList = personService.findAll();

        model.addAttribute("personList", personList);

        return "index"; // return index.html Template
    }
}