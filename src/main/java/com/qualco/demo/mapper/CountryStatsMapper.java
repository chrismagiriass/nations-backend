package com.qualco.demo.mapper;

import com.qualco.demo.dto.CountryMaxGdpDto;
import com.qualco.demo.dto.CountryStatsViewDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CountryStatsMapper {
    List<CountryMaxGdpDto> getCountriesWithMaxGdpPerPopulation();


    List<CountryStatsViewDto> getFilteredCountryStats(@Param("regionId") Integer regionId,
                                                      @Param("yearFrom") Integer yearFrom,
                                                      @Param("yearTo") Integer yearTo);


}
