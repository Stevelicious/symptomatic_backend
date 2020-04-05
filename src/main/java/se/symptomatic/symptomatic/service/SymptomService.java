package se.symptomatic.symptomatic.service;

import org.springframework.stereotype.Service;
import se.symptomatic.symptomatic.exceptions.NotFoundException;
import se.symptomatic.symptomatic.model.Symptom;

import java.util.ArrayList;
import java.util.List;

@Service
public class SymptomService {
    public List<Symptom> getSymptoms(){
        ArrayList<Symptom> symptoms = new ArrayList<>();
        symptoms.add(new Symptom(1,"Fever"));
        symptoms.add(new Symptom(2,"Cough"));
        symptoms.add(new Symptom(3,"Difficulty breathing"));
        symptoms.add(new Symptom(4,"Tiredness"));
        symptoms.add(new Symptom(5,"Chest tightness"));
        return symptoms;
    }

    public double getSymptomPercentage(long id){
        switch ((int)id){
            case 1:
                return 93.0;
            case 2:
                return 70.0;
            case 3:
                return 31.0;
            case 4:
                return 50.0;
            case 5:
                return 29.0;
            default:
                throw new NotFoundException("Symptom " +id + " not found");
        }

    }
}
