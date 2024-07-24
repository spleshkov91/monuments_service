package com.slavapleshkov.springboot.spring_rest.service;

import com.slavapleshkov.springboot.spring_rest.model.Town;
import com.slavapleshkov.springboot.spring_rest.mapper.TownMapper;
import com.slavapleshkov.springboot.spring_rest.repository.TownRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TownService {

    private final TownRepository townRepository;



}
