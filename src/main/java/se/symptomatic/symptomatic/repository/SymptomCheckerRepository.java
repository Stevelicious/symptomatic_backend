package se.symptomatic.symptomatic.repository;

import org.springframework.stereotype.Component;
import se.symptomatic.symptomatic.exceptions.NotFoundException;
import se.symptomatic.symptomatic.model.SymptomChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class SymptomCheckerRepository {

    Map<Long, SymptomChecker> database = new HashMap<>();

    public SymptomChecker get(long id){
        return Optional.ofNullable(database.get(id))
                .orElseThrow(() -> new NotFoundException("Entity not found"));
    }

    public void save(SymptomChecker symptomChecker){
        database.put(symptomChecker.getId(), symptomChecker);
    }

    public void update(SymptomChecker symptomChecker){
        database.replace(symptomChecker.getId(), symptomChecker);
    }
}
