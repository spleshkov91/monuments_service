package com.slavapleshkov.springboot.spring_rest.service;

import com.slavapleshkov.springboot.spring_rest.model.Town;
import com.slavapleshkov.springboot.spring_rest.mapper.TownMapper;
import com.slavapleshkov.springboot.spring_rest.repository.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class TownService {

    private final TownRepository townRepository;
    private final TownMapper townMapper;


    @Autowired
    public TownService(TownRepository townRepository, TownMapper townMapper) {
        this.townRepository = townRepository;

        this.townMapper = townMapper;
    }

    @Transactional
    public void save(Town town) {
        townRepository.save(town);
    }

    public void update(Town town) {

    }

    @Transactional
    public List<Town> allTowns() {
        return  townRepository.findAll();
    }


    public Town getTownById(int id){
       Optional<Town> foundTown = townRepository.findById(id);
       return foundTown.orElse(null);
        //return townMapper.townToTownDto(town);
    }



}
