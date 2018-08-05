package com.example.demo.controllers;

import com.example.demo.repositories.MovieCompanyRepository;
import com.example.demo.repositories.TheaterLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

public class TheaterLocationController {
    @Autowired
    MovieCompanyRepository movieCompanyRepository;

    @Autowired
    TheaterLocationRepository theaterLocationRepository;


}
