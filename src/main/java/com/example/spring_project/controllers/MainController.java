package com.example.spring_project.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "index", value = "/aboutus")
public class MainController {
    @GetMapping
    public String getMapping(){
        return "index";
    }
}
