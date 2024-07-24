package com.slavapleshkov.springboot.spring_rest.mapper;

import com.slavapleshkov.springboot.spring_rest.dto.TownDto;
import com.slavapleshkov.springboot.spring_rest.model.Town;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface TownMapper {

    Town toTown(TownDto townDto);

    TownDto toDto(Town town);

    List<TownDto> toDtoList(List<Town> towns);


}
