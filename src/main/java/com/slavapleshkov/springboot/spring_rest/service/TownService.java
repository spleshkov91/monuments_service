package com.slavapleshkov.springboot.spring_rest.service;

import com.slavapleshkov.springboot.spring_rest.dto.TownDto;
import com.slavapleshkov.springboot.spring_rest.exception.EntityNotFoundException;
import com.slavapleshkov.springboot.spring_rest.exception.ExceptionMessageHelper;
import com.slavapleshkov.springboot.spring_rest.model.Town;
import com.slavapleshkov.springboot.spring_rest.repository.TownRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.slavapleshkov.springboot.spring_rest.mapper.TownMapper.INSTANCE;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TownService {

    private final TownRepository townRepository;


    public TownDto findById(int id) {
        return INSTANCE.toDto(townRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(ExceptionMessageHelper.entityNotFoundMsg(id))));
    }

    public List<TownDto> findAll() {
        return INSTANCE.toDtoList(townRepository.findAll());
    }

    @Transactional
    public TownDto save(TownDto townDto) {
        return INSTANCE.toDto(townRepository.save(INSTANCE.toTown(townDto)));
    }

    @Transactional
    public void deleteById(int id) {
        townRepository.deleteById(id);
    }

    @Transactional
    public TownDto update(TownDto townDto, int id) {
        Town town = townRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(ExceptionMessageHelper.entityNotFoundMsg(id)));

        town.setPopulation(townDto.getPopulation());
        town.setAvailabilityOfSubway(townDto.isAvailabilityOfSubway());
        return INSTANCE.toDto(townRepository.save(INSTANCE.toTown(townDto)));
    }
}
