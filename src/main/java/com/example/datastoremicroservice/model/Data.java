package com.example.datastoremicroservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Data {

    private Long id;
    private Long sensorId;
    private LocalDateTime timestamp;
    private double measurement;
    private MeasurementType measurementType;

}
