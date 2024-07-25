package com.slavapleshkov.springboot.spring_rest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.slavapleshkov.springboot.spring_rest.model.TypeOfMonuments;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MonumentDto {

    private int id;

    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dateOfCreation;

    private TypeOfMonuments typeOfMonuments;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private TownDto town;

    private int townId;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private List<ServiceDto> serviceEntities;

    private List<Long> serviceIds;

    private MonumentDto(MonumentDtoBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.dateOfCreation = builder.dateOfCreation;
        this.typeOfMonuments = builder.typeOfMonuments;
        this.serviceIds = builder.serviceIds;
        this.townId = builder.townId;
        this.town = builder.town;
        this.serviceEntities = builder.serviceEntities;
    }

    public static MonumentDtoBuilder builder() {
        return new MonumentDtoBuilder();
    }


    public static class MonumentDtoBuilder {
        private int id;
        private String name;
        private LocalDate dateOfCreation;
        private TypeOfMonuments typeOfMonuments;
        private int townId;
        private TownDto town;
        private List<ServiceDto> serviceEntities;
        private List<Long> serviceIds;


        public MonumentDtoBuilder id(int id) {
            this.id = id;
            return this;
        }

        public MonumentDtoBuilder townId(int townId) {
            this.townId = townId;
            return this;
        }

        public MonumentDtoBuilder serviceIds(List<Long> serviceIds) {
            this.serviceIds = serviceIds;
            return this;
        }

        public MonumentDtoBuilder name(String name) {
            this.name = name;
            return this;
        }
        public MonumentDtoBuilder dateOfCreation(LocalDate dateOfCreation) {
            this.dateOfCreation = dateOfCreation;
            return this;
        }

        public MonumentDtoBuilder type(TypeOfMonuments typeOfMonuments) {
            this.typeOfMonuments = typeOfMonuments;
            return this;
        }
        public MonumentDtoBuilder town(TownDto town) {
            this.town = town;
            return this;
        }
        public MonumentDtoBuilder serviceEntities(List<ServiceDto> serviceEntities) {
            this.serviceEntities = serviceEntities;
            return this;
        }
        public MonumentDto build() {
            return new MonumentDto(this);
        }
    }

}
