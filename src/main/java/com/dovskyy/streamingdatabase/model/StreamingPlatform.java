package com.dovskyy.streamingdatabase.model;

import jakarta.persistence.*;

import java.util.List;

/*
    * This class represents the StreamingPlatform entity. For example, Netflix, Amazon Prime, etc.
 */
@Entity
public class StreamingPlatform {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "movie_streaming_platform",
            joinColumns = @JoinColumn(name = "streaming_platform_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id")
    )
    private List<Movie> movies;
}
