package com.simple.simpleSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class featuresController {
    @GetMapping("features")
    public String features(Model model) {
        model.addAttribute("title", "Страница features");
        return "features";
    }

}