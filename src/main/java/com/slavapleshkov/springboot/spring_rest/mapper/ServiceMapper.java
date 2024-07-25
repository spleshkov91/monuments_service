package com.slavapleshkov.springboot.spring_rest.mapper;

import com.slavapleshkov.springboot.spring_rest.dto.ServiceDto;
import com.slavapleshkov.springboot.spring_rest.model.Service;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ServiceMapper {

    ServiceMapper INSTANCE = Mappers.getMapper(ServiceMapper.class);

    ServiceDto toDto(Service service);

    Service toServece(ServiceDto serviceDto);

    List<ServiceDto> toDtoList(List<Service> services);
}
