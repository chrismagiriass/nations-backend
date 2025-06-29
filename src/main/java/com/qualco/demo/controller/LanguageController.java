package com.qualco.demo.controller;

import com.qualco.demo.dto.CountryLanguageDto;
import com.qualco.demo.dto.PageResponse;
import com.qualco.demo.service.LanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/languages")
@RequiredArgsConstructor
public class LanguageController {

    private final LanguageService languageService;

    @GetMapping("/by-country-id/{countryId}")
    public ResponseEntity<PageResponse<CountryLanguageDto>> getLanguagesByCountryId(@PathVariable int countryId,
                                                                                    @RequestParam(defaultValue = "1") int page,
                                                                                    @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(languageService.getLanguagesByCountryId(countryId, page, size));
    }
}
