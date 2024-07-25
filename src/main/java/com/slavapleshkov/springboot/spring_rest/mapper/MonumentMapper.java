package com.slavapleshkov.springboot.spring_rest.mapper;

import com.slavapleshkov.springboot.spring_rest.dto.MonumentDto;
import com.slavapleshkov.springboot.spring_rest.model.Monument;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MonumentMapper {

    MonumentMapper INSTANCE = Mappers.getMapper(MonumentMapper.class);

//    @Mapping(source = "townId", target = "town")
//    @Mapping(source = "serviceIds", target = "services")
    Monument toMonument(MonumentDto monumentDto);

    MonumentDto toDto(Monument monument);

    List<MonumentDto> toDtoList(List<Monument> monuments);
}
