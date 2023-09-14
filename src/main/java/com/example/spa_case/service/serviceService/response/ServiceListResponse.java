package com.example.spa_case.service.serviceService.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class ServiceListResponse {
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    private String poster;
    private String image;

}
