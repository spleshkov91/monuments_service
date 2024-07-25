package com.slavapleshkov.springboot.spring_rest.mapper;

import com.slavapleshkov.springboot.spring_rest.dto.TownDto;
import com.slavapleshkov.springboot.spring_rest.model.Town;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper
public interface TownMapper {

    TownMapper INSTANCE = Mappers.getMapper(TownMapper.class);

    Town toTown(TownDto townDto);

    TownDto toDto(Town town);

    List<TownDto> toDtoList(List<Town> towns);


}
