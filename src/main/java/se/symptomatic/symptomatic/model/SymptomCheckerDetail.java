package se.symptomatic.symptomatic.model;

import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SymptomCheckerDetail {
    Symptom symptom;
    LocalDate startDate;
    LocalDate endDate;
    double value;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SymptomCheckerDetail that = (SymptomCheckerDetail) o;
        return Objects.equals(symptom, that.symptom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symptom);
    }
}
