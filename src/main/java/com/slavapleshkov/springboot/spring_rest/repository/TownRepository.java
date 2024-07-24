package com.slavapleshkov.springboot.spring_rest.repository;

import com.slavapleshkov.springboot.spring_rest.model.Town;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TownRepository extends JpaRepository<Town, Integer> {

}
