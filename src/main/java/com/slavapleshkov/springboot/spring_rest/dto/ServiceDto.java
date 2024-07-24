package com.slavapleshkov.springboot.spring_rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Builder
public class ServiceDto {

    private int id;

    private String name;

    private String description;

}
