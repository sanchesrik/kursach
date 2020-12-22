package com.kursovaya.kursach.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting( Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }
    @GetMapping("/help")
    public String about( Model model) {
        model.addAttribute("title", "Главное о нас");
        return "help";
    }

}
