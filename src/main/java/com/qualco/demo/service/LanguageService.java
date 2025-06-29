package com.qualco.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qualco.demo.dto.CountryLanguageDto;
import com.qualco.demo.dto.PageResponse;
import com.qualco.demo.mapper.LanguageMapper;
import com.qualco.demo.model.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LanguageService {

    private final LanguageMapper languageMapper;

    public PageResponse<CountryLanguageDto> getLanguagesByCountryId(int countryId, int page, int size) {
        PageHelper.startPage(page, size);
        List<CountryLanguageDto> countryLanguageDtoList = languageMapper.getLanguagesByCountryId(countryId);

        PageInfo<CountryLanguageDto> pageInfo = new PageInfo<>(countryLanguageDtoList);

        return PageResponse.build(
                pageInfo.getList(),
                pageInfo.getPageNum(),
                pageInfo.getPageSize(),
                (int) pageInfo.getTotal()
        );
    }
}
