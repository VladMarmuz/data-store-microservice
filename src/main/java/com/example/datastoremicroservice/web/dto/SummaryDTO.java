package com.example.datastoremicroservice.web.dto;

import com.example.datastoremicroservice.model.MeasurementType;
import com.example.datastoremicroservice.model.Summary;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class SummaryDTO {

    private long sensorId;
    private Map<MeasurementType, List<Summary.SummaryEntry>> values;

}
