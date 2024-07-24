package com.slavapleshkov.springboot.spring_rest.repository;

import com.slavapleshkov.springboot.spring_rest.model.Monument;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonumentRepository extends JpaRepository<Monument, Integer> {

    List<Monument> findAllByTownIdOrderByName(int townId);
}
