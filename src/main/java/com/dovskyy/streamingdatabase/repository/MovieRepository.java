package com.dovskyy.streamingdatabase.repository;

import com.dovskyy.streamingdatabase.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
