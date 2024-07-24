package com.slavapleshkov.springboot.spring_rest.controller;

import com.slavapleshkov.springboot.spring_rest.model.Town;
import com.slavapleshkov.springboot.spring_rest.mapper.TownMapper;
import com.slavapleshkov.springboot.spring_rest.service.TownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TownController {

    private final TownService townService;
    private final TownMapper mapper;


    @Autowired
    public TownController(TownService townService, @Qualifier("townMapper") TownMapper mapper) {
        this.townService = townService;
        this.mapper = mapper;

    }

    @PostMapping("/town")
    public Town addNewTown(@RequestBody Town town) {
        townService.save(town);
        return town;
    }

    @GetMapping("/towns")
    public List<Town> allTowns() {
        return townService.allTowns();
    }

    @GetMapping("/town/{id}")
    public Town getTown(@PathVariable("id") int id) {
        return townService.getTownById(id);
    }
}
