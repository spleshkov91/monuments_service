package com.slavapleshkov.springboot.spring_rest.mapper;

import com.slavapleshkov.springboot.spring_rest.dto.TownDto;
import com.slavapleshkov.springboot.spring_rest.model.Town;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface TownMapper {

    Town townDtoToTown(TownDto townDto);

    TownDto townToTownDto(Town town);


}
