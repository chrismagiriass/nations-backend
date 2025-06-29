package com.qualco.demo.dto;

import lombok.Data;

@Data
public class CountryMaxGdpDto {
    private String name;
    private String countryCode3;
    private int year;
    private long population;
    private double gdp;
}
