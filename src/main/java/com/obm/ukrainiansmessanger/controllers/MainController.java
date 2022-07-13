package com.obm.ukrainiansmessanger.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Model model, @RequestParam(defaultValue = "World")String name){
        model.addAttribute("name",name);
        return "index";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
