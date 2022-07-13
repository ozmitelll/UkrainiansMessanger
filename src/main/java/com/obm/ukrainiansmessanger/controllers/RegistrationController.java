package com.obm.ukrainiansmessanger.controllers;

import com.obm.ukrainiansmessanger.models.User;
import com.obm.ukrainiansmessanger.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String addUser(User user, Map<String, Object> model){
       User userFromDb = userRepository.findByUsername(user.getUsername());
       if(userFromDb != null){
           model.put("message", "Такий користувач вже існує");
           return "registration";
       }

      userRepository.save(user);
        return "redirect:/login";
    }
}
