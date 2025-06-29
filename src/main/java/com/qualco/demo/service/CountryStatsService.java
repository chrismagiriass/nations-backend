package com.qualco.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qualco.demo.dto.CountryMaxGdpDto;
import com.qualco.demo.dto.CountryStatsViewDto;
import com.qualco.demo.dto.PageResponse;
import com.qualco.demo.mapper.CountryStatsMapper;
import com.qualco.demo.model.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryStatsService {
    private final CountryStatsMapper statsMapper;

    public PageResponse<CountryMaxGdpDto> getMaxGdpPerPopList(int page, int size) {
        PageHelper.startPage(page, size);
        List<CountryMaxGdpDto> countryMaxGdpDtoList = statsMapper.getCountriesWithMaxGdpPerPopulation();
        PageInfo<CountryMaxGdpDto> pageInfo = new PageInfo<>(countryMaxGdpDtoList);

        return PageResponse.build(
                pageInfo.getList(),
                pageInfo.getPageNum(),
                pageInfo.getPageSize(),
                (int) pageInfo.getTotal()
        );
    }

    public PageResponse<CountryStatsViewDto> getFilteredStats(Integer regionId, Integer yearFrom, Integer yearTo,
                                                      int page, int size) {
        PageHelper.startPage(page, size);
        List<CountryStatsViewDto> countryMaxGdpDtoList = statsMapper.getFilteredCountryStats(regionId, yearFrom, yearTo);
        PageInfo<CountryStatsViewDto> pageInfo = new PageInfo<>(countryMaxGdpDtoList);

        return PageResponse.build(
                pageInfo.getList(),
                pageInfo.getPageNum(),
                pageInfo.getPageSize(),
                (int) pageInfo.getTotal()
        );
    }
}
