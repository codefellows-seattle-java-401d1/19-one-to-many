package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "theaterlocations")
public class TheaterLocation {
    @Id
    @GeneratedValue
    @SequenceGenerator(name = "theater-company-generator")
    public Long id;
    public Long movieCompanyId;
    public String name;
    public String location;

    public TheaterLocation() {}

    public TheaterLocation(long movieCompanyId, String name, String location) {
        this.movieCompanyId = movieCompanyId;
        this.name = name;
        this.location = location;
    }
}
