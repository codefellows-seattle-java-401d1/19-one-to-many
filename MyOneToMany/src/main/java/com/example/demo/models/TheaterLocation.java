package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "theaterlocations")
public class TheaterLocation {
    @Id
    public int id;
    public int moviecompanyid;
    public String name;
    public String address;

    // required default constructor
    public TheaterLocation(){

    }

    public TheaterLocation(String name, String address) {}

    public TheaterLocation(int moviecompanyid, String name, String address) {
        this.moviecompanyid = moviecompanyid;
        this.name = name;
        this.address = address;
    }
}
