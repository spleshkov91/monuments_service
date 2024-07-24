package com.slavapleshkov.springboot.spring_rest.mapper;

import com.slavapleshkov.springboot.spring_rest.dto.MonumentDto;
import com.slavapleshkov.springboot.spring_rest.model.Monument;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.stereotype.Component;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
@Component
public interface MonumentMapper {

    Monument monumentDtoToMonument(MonumentDto MonumentDto);

    MonumentDto monumentToMonumentDto(Monument Monument);
}
