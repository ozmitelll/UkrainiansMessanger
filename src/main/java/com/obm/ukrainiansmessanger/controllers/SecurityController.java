package com.obm.ukrainiansmessanger.controllers;

import com.obm.ukrainiansmessanger.repos.UserRepository;
import com.obm.ukrainiansmessanger.service.UserService;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
