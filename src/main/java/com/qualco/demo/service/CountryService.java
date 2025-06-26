package com.qualco.demo.service;

import com.qualco.demo.mapper.CountryMapper;
import com.qualco.demo.model.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryMapper countryMapper;

    public CountryService(CountryMapper countryMapper) {
        this.countryMapper = countryMapper;
    }

    public List<Country> getAllCountries() {
        return countryMapper.getAllCountries();
    }
}
