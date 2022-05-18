package com.simple.simpleSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class addbuttonController {
    @GetMapping("addbutton")
    public String addButton(Model model) {
        model.addAttribute("title", "Пример страницы с кнопкой");
        return "addbutton";
    }

    @GetMapping("addbutton/press")
    public String addbuttonPressGet(Model model) {
        model.addAttribute("title", "Пример страницы с кнопкой");
        return "addbutton";
    }

    @PostMapping("addbutton/press")
    public String addbuttonPressPost(@RequestParam String param1,
            @RequestParam String param2,
            @RequestParam String param3,
            Model model) {

        model.addAttribute("title", "Страница с результатом");
        model.addAttribute("param1", param1);
        model.addAttribute("param2", param2);
        model.addAttribute("param3", param3);
        model.addAttribute("param4", "ssssss");
        return "resultpage";
    }
}
