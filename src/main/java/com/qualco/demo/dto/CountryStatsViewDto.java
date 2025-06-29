package com.qualco.demo.dto;

import lombok.Data;

@Data
public class CountryStatsViewDto {
    private String continentName;
    private String regionName;
    private String countryName;
    private int year;
    private long population;
    private double gdp;
}

