package com.obm.ukrainiansmessanger.controllers;

import com.obm.ukrainiansmessanger.repos.UserRepository;
import com.obm.ukrainiansmessanger.service.UserService;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SecurityController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
}
