package com.example.Oauth2Demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class TemplateController {

    @GetMapping("/")
    public String getLogin() {

        return "Welccccomeeee";
    }


}
