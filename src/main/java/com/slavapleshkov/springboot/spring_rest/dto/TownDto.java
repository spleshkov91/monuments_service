package com.slavapleshkov.springboot.spring_rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Builder
public class TownDto {

    private int id;

    private String name;

    private long population;

    private boolean availabilityOfSubway;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private List<MonumentDto> monuments;

}
