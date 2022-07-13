package com.obm.ukrainiansmessanger.controllers;

import com.obm.ukrainiansmessanger.models.Role;
import com.obm.ukrainiansmessanger.models.User;
import com.obm.ukrainiansmessanger.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }
    @PostMapping("/registration")
    public String addUser(@RequestParam String username,User user, Model model){
       User userFromDb = userRepository.findByUsername(user.getUsername());
       if(userFromDb != null){
           model.addAttribute("message", "Такий користувач вже існує");
           return "registration";
       }
       user.setUsername(username);
       user.setRoles(Collections.singleton(Role.USER));
       userRepository.save(user);
        return "redirect:/login";
    }
}
