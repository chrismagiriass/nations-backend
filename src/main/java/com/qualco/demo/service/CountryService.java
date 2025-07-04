package com.qualco.demo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qualco.demo.dto.PageResponse;
import com.qualco.demo.mapper.CountryMapper;
import com.qualco.demo.model.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryMapper countryMapper;

    public PageResponse<Country> getPaginatedCountries(int page, int size) {
        PageHelper.startPage(page, size);
        List<Country> countries = countryMapper.getAllCountriesPaginated();
        PageInfo<Country> pageInfo = new PageInfo<>(countries);

        return PageResponse.build(
                pageInfo.getList(),
                pageInfo.getPageNum(),
                pageInfo.getPageSize(),
                (int) pageInfo.getTotal()
        );
    }
}
