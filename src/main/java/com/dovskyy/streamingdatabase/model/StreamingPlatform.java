package com.dovskyy.streamingdatabase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
    * This class represents the StreamingPlatform entity. For example, Netflix, Amazon Prime, etc.
 */
@Entity
public class StreamingPlatform {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
