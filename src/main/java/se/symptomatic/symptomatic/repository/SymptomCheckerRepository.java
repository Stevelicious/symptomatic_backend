package se.symptomatic.symptomatic.repository;

import org.springframework.stereotype.Repository;
import se.symptomatic.symptomatic.exceptions.NotFoundException;
import se.symptomatic.symptomatic.model.SymptomChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class SymptomCheckerRepository {

    Map<Long, SymptomChecker> fakeDatabase = new HashMap<>();

    public SymptomChecker get(long id) {
        return Optional.ofNullable(fakeDatabase.get(id))
                .orElseThrow(() -> new NotFoundException("Entity not found"));
    }

    public void save(SymptomChecker symptomChecker) {
        fakeDatabase.put(symptomChecker.getId(), symptomChecker);
    }

    public void update(SymptomChecker symptomChecker) {
        fakeDatabase.replace(symptomChecker.getId(), symptomChecker);
    }
}
