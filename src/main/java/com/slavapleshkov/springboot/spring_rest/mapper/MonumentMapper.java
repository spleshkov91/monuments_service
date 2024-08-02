package com.slavapleshkov.springboot.spring_rest.mapper;

import com.slavapleshkov.springboot.spring_rest.dto.MonumentDto;
import com.slavapleshkov.springboot.spring_rest.model.Monument;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(imports = {TownMapper.class, ServiceMapper.class})
public interface MonumentMapper {

    MonumentMapper INSTANCE = Mappers.getMapper(MonumentMapper.class);

//    @Mapping(source = "townId", target = "town")
//    @Mapping(source = "serviceIds", target = "services")
    Monument toMonument(MonumentDto monumentDto);

    MonumentDto toDto(Monument monument);

    List<MonumentDto> toDtoList(List<Monument> monuments);
}
