package com.example.demo.controllers;

import com.example.demo.models.TheaterLocation;
import com.example.demo.repositories.MovieCompanyRepository;
import com.example.demo.repositories.TheaterLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/theaterlocations")
public class TheaterLocationController {

    @Autowired
    TheaterLocationRepository theaterLocationRepository;

    @Autowired
    MovieCompanyRepository movieCompanyRepository;

    @PostMapping("add-location")
    public String addTheaterLocation(
            @RequestParam String name,
            @RequestParam String address){
        TheaterLocation newLocation = theaterLocationRepository.save(new TheaterLocation(name, address));
        System.out.println("Successfully hit add-location on Theater controller");
        return "redirect:/";
    }


}
