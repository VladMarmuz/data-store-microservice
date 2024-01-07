package com.example.datastoremicroservice.web.controller;

import com.example.datastoremicroservice.model.MeasurementType;
import com.example.datastoremicroservice.model.Summary;
import com.example.datastoremicroservice.model.SummaryType;
import com.example.datastoremicroservice.service.SummaryService;
import com.example.datastoremicroservice.web.dto.SummaryDTO;
import com.example.datastoremicroservice.web.mapper.SummaryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/analytics")
public class AnalyticsController {

    private final SummaryService summaryService;
    private final SummaryMapper summaryMapper;

    @GetMapping("/summary/{sensorId}")
    public SummaryDTO getSummary(@PathVariable long sensorId,
                                 @RequestParam(value = "mt", required = false)
                                 Set<MeasurementType> measurementTypes,
                                 @RequestParam(value = "st", required = false)
                                     Set<SummaryType> summaryTypes) {

        Summary summary = summaryService.get(sensorId,measurementTypes,summaryTypes);

        return summaryMapper.toDto(summary);

    }

}

