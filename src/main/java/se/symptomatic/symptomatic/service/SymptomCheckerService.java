package se.symptomatic.symptomatic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.symptomatic.symptomatic.model.SymptomChecker;
import se.symptomatic.symptomatic.model.SymptomCheckerDetail;
import se.symptomatic.symptomatic.model.SymptomCheckerDetailResult;
import se.symptomatic.symptomatic.model.SymptomCheckerResult;
import se.symptomatic.symptomatic.repository.SymptomCheckerRepository;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SymptomCheckerService {

    @Autowired
    SymptomCheckerRepository symptomCheckerRepository;

    @Autowired
    SymptomService symptomService;

    public SymptomCheckerResult getResults(long id) {
        // Some advanced algorithm to calculate the probability

        SymptomChecker symptomChecker = symptomCheckerRepository.get(id);
        List<SymptomCheckerDetailResult> symptomCheckerDetailResults = symptomChecker.getSymptomCheckerDetailList().stream().map(symptomCheckerDetail ->
                new SymptomCheckerDetailResult(symptomCheckerDetail.getSymptom(), symptomService.getSymptomPercentage(symptomCheckerDetail.getSymptom().getId()))
        ).collect(Collectors.toList());

        return new SymptomCheckerResult(id, symptomCheckerDetailResults);
    }

    public SymptomChecker updateSymptoms(long id, SymptomCheckerDetail symptomCheckerDetail) {

        SymptomChecker symptomChecker = symptomCheckerRepository.get(id);
        symptomChecker.getSymptomCheckerDetailList().remove(symptomCheckerDetail);
        symptomChecker.getSymptomCheckerDetailList().add(symptomCheckerDetail);

        symptomCheckerRepository.update(symptomChecker);

        return symptomChecker;
    }


    public SymptomChecker initiateSymptomChecker() {

        SymptomChecker symptomChecker = new SymptomChecker(System.currentTimeMillis(), new HashSet<>());
        symptomCheckerRepository.save(symptomChecker);
        return symptomChecker;
    }
}
