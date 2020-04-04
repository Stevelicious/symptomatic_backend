package se.symptomatic.symptomatic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SymptomChecker {
    long id;
    Set<SymptomCheckerDetail> symptomCheckerDetailList;
}
