package se.symptomatic.symptomatic.service;

import org.springframework.stereotype.Service;
import se.symptomatic.symptomatic.model.Symptom;

import java.util.ArrayList;
import java.util.List;

@Service
public class SymptomService {
    public List<Symptom> getSymptoms(){
        ArrayList<Symptom> symptoms = new ArrayList<>();
        symptoms.add(new Symptom("1","Fever"));
        symptoms.add(new Symptom("2","Cough"));
        symptoms.add(new Symptom("3","Shortness of breath"));
        symptoms.add(new Symptom("4","Fatigue"));
        symptoms.add(new Symptom("5","Sore throat"));
        return symptoms;
    }
}
