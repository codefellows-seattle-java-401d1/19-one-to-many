package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "theaterlocations")
public class TheaterLocation {
    @Id
    public int id;
    public int moviecompanyid;
    public String name;
    public String location;

    // required default constructor
    public TheaterLocation() {}

    public TheaterLocation(int moviecompanyid, String name, String location) {
        this.moviecompanyid = moviecompanyid;
        this.name = name;
        this.location = location;
    }
}
