package com.example.RaceTrack.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class HomePageController {

    @GetMapping ("/")
    public String HomePage() {
        return "home";
    }
}
