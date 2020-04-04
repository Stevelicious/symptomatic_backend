package se.symptomatic.symptomatic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SymptomCheckerRequest {
    Symptom symptom;
    LocalDate startDate;
    LocalDate endDate;
    int severity;
}
