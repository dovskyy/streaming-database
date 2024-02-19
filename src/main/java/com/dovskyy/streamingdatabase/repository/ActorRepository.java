package com.dovskyy.streamingdatabase.repository;

import com.dovskyy.streamingdatabase.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
}
