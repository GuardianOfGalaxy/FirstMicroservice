package com.firstmicroservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by RaMzEsS on 26.07.2016.
 */
@Controller
@RequestMapping("/home")
public class TestController {

    @RequestMapping(value = "",  method = RequestMethod.GET)
    public String users(Model model) {
        System.out.println("-----------------TestController---------------");
        return "home";
    }
}
