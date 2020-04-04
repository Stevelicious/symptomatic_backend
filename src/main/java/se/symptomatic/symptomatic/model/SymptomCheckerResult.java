package se.symptomatic.symptomatic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SymptomCheckerResult {

    long id;
    List<SymptomCheckerDetailResult> symptomCheckerDetailResultList;

}
