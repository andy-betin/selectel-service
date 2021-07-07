package ru.students.selectelservice.ui.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {

    @GetMapping("/")
    public String ndex(Model model) {
        model.addAttribute("PAGE", "Index Page");
        return "index";
    }
}
