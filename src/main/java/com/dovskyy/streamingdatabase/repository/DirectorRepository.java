package com.dovskyy.streamingdatabase.repository;

import com.dovskyy.streamingdatabase.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {
}
