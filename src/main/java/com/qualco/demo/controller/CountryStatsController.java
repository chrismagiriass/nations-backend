package com.qualco.demo.controller;

import com.qualco.demo.dto.CountryMaxGdpDto;
import com.qualco.demo.dto.CountryStatsViewDto;
import com.qualco.demo.dto.PageResponse;
import com.qualco.demo.service.CountryStatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/stats")
@RequiredArgsConstructor
public class CountryStatsController {

    private final CountryStatsService statsService;

    @GetMapping("/max-gdp-per-population")
    public ResponseEntity<PageResponse<CountryMaxGdpDto>> getMaxGdpPerPopulation(@RequestParam(defaultValue = "1") int page,
                                                                                 @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(statsService.getMaxGdpPerPopList(page, size));
    }

    @GetMapping("/view")
    public ResponseEntity<PageResponse<CountryStatsViewDto>> getStatsView(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(required = false) Integer regionId,
            @RequestParam(required = false) Integer yearFrom,
            @RequestParam(required = false) Integer yearTo
    ) {
        return ResponseEntity.ok(statsService.getFilteredStats(regionId, yearFrom, yearTo, page, size));
    }
}

