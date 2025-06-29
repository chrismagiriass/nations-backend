package com.qualco.demo.service;

import com.qualco.demo.mapper.RegionMapper;
import com.qualco.demo.model.Region;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegionService {

    private final RegionMapper regionMapper;

    public List<Region> getAllRegions() {
        return regionMapper.getAllRegions();
    }
}
