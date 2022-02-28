package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Match;

@Repository
public interface MatchRepository extends CrudRepository<Match, Long> {

}
