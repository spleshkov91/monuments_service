package com.slavapleshkov.springboot.spring_rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
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
public class ServiceDto {

    private int id;

    private String name;

    private String description;

    public ServiceDto(ServiceDtoBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
    }

    public static ServiceDtoBuilder builder() {
        return new ServiceDtoBuilder();
    }

    public static class ServiceDtoBuilder {
        private int id;
        private String name;
        private String description;


        public ServiceDtoBuilder id(int id) {
            this.id = id;
            return this;
        }

        public ServiceDtoBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ServiceDtoBuilder description(String description) {
            this.description = description;
            return this;
        }


        public ServiceDto build() {
            return new ServiceDto(this);
        }
    }
}
