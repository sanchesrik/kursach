package com.kursovaya.kursach.controllers;

import org.springframework.context.annotation.ComponentScan;
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

    @GetMapping("/about")
    public String about( Model model) {
        model.addAttribute("title", "Наши товары");
        return "about";
    }

    @GetMapping("/help")
    public String help( Model model) {
        model.addAttribute("title", "Техподдержка");
        return "help";
    }


}
