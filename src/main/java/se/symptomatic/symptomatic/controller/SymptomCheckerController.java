package se.symptomatic.symptomatic.controller;

import org.springframework.web.bind.annotation.*;
import se.symptomatic.symptomatic.model.SymptomCheckerRequest;
import se.symptomatic.symptomatic.model.SymptomCheckerResult;

@RestController
@RequestMapping("/api/v1")
public class SymptomCheckerController {

    @GetMapping("/symptomchecker/{id}/results")
    public SymptomCheckerResult getResults(@PathVariable long id){
        // Some advanced algorithm to calculate the probability
        return new SymptomCheckerResult((int) (Math.random() * id) % 100);
    }

    @PostMapping("/symptomchecker/{id}")
    public void updateSymptoms(@RequestBody SymptomCheckerRequest symptomCheckerRequest){

    }

    @GetMapping("/symptomchecker")
    public long initiateSymptomChecker(@RequestBody SymptomCheckerRequest symptomCheckerRequest){
        return System.currentTimeMillis();
    }
}
