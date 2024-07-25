package com.slavapleshkov.springboot.spring_rest.controller;

import com.slavapleshkov.springboot.spring_rest.dto.TownDto;
import com.slavapleshkov.springboot.spring_rest.service.TownService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/town")
public class TownController {

    private final TownService townService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TownDto> getAll() {
        return townService.findAll();
    }

    @GetMapping("/{id:\\d+}")
    @ResponseStatus(HttpStatus.OK)
    public TownDto getById(@PathVariable int id) {
        return townService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TownDto create(@RequestBody TownDto dto) {
        return townService.save(dto);
    }

    @PatchMapping("/{id:\\d+}")
    @ResponseStatus(HttpStatus.OK)
    public TownDto update(@PathVariable int id, @RequestBody TownDto dto) {
        return townService.update(dto, id);
    }
}
