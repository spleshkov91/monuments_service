package com.slavapleshkov.springboot.spring_rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TownDto {

    private int id;

    private String name;

    private long population;

    private boolean availabilityOfSubway;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private List<MonumentDto> monuments;


    private TownDto(TownDtoBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.population = builder.population;
        this.availabilityOfSubway = builder.availabilityOfSubway;
        this.monuments = builder.monuments;
    }

    public static TownDtoBuilder builder() {
        return new TownDtoBuilder();
    }
    public static class TownDtoBuilder {
        private int id;
        private String name;
        private long population;
        private List<MonumentDto> monuments;
        private Boolean availabilityOfSubway;

        public TownDtoBuilder id(int id) {
            this.id = id;
            return this;
        }

        public TownDtoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public TownDtoBuilder population(long population) {
            this.population = population;
            return this;
        }

        public TownDtoBuilder availabilityOfSubway(boolean availabilityOfSubway) {
            this.availabilityOfSubway = availabilityOfSubway;
            return this;
        }

        public TownDtoBuilder attractionEntities(List<MonumentDto> monuments) {
            this.monuments = monuments;
            return this;
        }

        public TownDto build() {
            return new TownDto(this);
        }

    }
}
