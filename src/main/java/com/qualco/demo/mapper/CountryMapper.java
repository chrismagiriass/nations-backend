package com.qualco.demo.mapper;

import com.qualco.demo.model.Country;

import java.util.List;

public interface CountryMapper {
    List<Country> getAllCountriesPaginated();

}
