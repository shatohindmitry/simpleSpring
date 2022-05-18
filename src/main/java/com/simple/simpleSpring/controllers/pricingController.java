package com.simple.simpleSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pricingController {
    @GetMapping("pricing")
    public String pricing(Model model) {
        model.addAttribute("title", "Пример страницы из фрагментов");
        String[] flowers = new String[] { "Rose", "Lily", "Tulip", "Carnation", "Hyacinth" };
        model.addAttribute("flowers", flowers);

        return "pricing";
    }

}