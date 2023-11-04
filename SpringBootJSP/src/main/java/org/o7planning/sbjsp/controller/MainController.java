package org.o7planning.sbjsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.o7planning.sbjsp.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    private static List<Person> persons = new ArrayList<Person>();

    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
    }

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        String message = "Hello Spring Boot + JSP";
        model.addAttribute("message", message);
        return "index";
    }
    @GetMapping({"/personList"})
    public String viewPersonList(Model model) {

        model.addAttribute("persons", persons);

        return "personList";
    }

}
