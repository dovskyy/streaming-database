package com.dovskyy.streamingdatabase.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String sex;
    private LocalDate dateOfBirth;
    private String nationality;

    @OneToMany(mappedBy = "actor", cascade = CascadeType.ALL)
    private List<Movie> movies;
}
