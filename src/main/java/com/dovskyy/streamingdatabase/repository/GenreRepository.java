package com.dovskyy.streamingdatabase.repository;

import com.dovskyy.streamingdatabase.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
