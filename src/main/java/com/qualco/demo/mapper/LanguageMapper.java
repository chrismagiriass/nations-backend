package com.qualco.demo.mapper;

import com.qualco.demo.dto.CountryLanguageDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LanguageMapper {
    List<CountryLanguageDto> getLanguagesByCountryId(@Param("countryId") int countryId);
}
