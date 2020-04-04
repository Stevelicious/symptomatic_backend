package se.symptomatic.symptomatic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SymptomCheckerDetailResult{
    Symptom symptom;
    double percentage;

}
