package com.slavapleshkov.springboot.spring_rest.mapper;

import com.slavapleshkov.springboot.spring_rest.dto.ServiceDto;
import com.slavapleshkov.springboot.spring_rest.model.Service;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ServiceMapper {

    ServiceDto toDto(Service service);

    Service toServece(ServiceDto serviceDto);

    List<ServiceDto> toDtoList(List<Service> services);
}
