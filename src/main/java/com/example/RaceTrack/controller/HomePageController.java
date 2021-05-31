package com.example.RaceTrack.controller;


import com.example.RaceTrack.service.LocationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@Controller
public class HomePageController {
    private LocationService locationService;

    @GetMapping ("/")
    public String HomePage() {
        return "home";
    }
    @PostMapping ("/")
    public String postLocation() {
        throw new IllegalStateException("Not implemented yet!");
    }

}
