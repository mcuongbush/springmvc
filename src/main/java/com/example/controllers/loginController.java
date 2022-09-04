package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class loginController {
public String name;
public String pass;
    @RequestMapping("/")
    public String showForm(Model model) {
        Employee em = new Employee();
        model.addAttribute("employee",em);
        return "login";
    }

    @RequestMapping(value = "/info")
    public String login(HttpServletRequest request , Model theModel){
        theModel.addAttribute("name", name);
        theModel.addAttribute("pass", pass);
        return "info";
    }
}
