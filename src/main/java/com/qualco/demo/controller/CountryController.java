package com.qualco.demo.controller;

import com.qualco.demo.dto.PageResponse;
import com.qualco.demo.model.Country;
import com.qualco.demo.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/countries")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping
    public ResponseEntity<PageResponse<Country>> getCountries(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(countryService.getPaginatedCountries(page, size));
    }
}
