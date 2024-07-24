package com.slavapleshkov.springboot.spring_rest.mapper;

import com.slavapleshkov.springboot.spring_rest.dto.MonumentDto;
import com.slavapleshkov.springboot.spring_rest.model.Monument;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MonumentMapper {

    @Mapping(source = "townId", target = "locality")
    @Mapping(source = "serviceIds", target = "services")
    Monument toMonument(MonumentDto monumentDto);

    MonumentDto toDto(Monument monument);

    List<MonumentDto> toDtoList(List<Monument> monuments);
}
