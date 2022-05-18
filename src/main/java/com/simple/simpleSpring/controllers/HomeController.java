package com.simple.simpleSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        String[] flowers = new String[] { "Rose", "Lily", "Tulip", "Carnation", "Hyacinth" };
        model.addAttribute("flowers", flowers);

        return "home";
    }

}
