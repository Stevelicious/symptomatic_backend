package se.symptomatic.symptomatic.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import se.symptomatic.symptomatic.model.SymptomCheckerRequest;
import se.symptomatic.symptomatic.model.SymptomCheckerResult;

@RestController
@RequestMapping("/api/v1")
public class SymptomCheckerController {

    @ApiOperation("Get the result based on what the user have entered")
    @GetMapping("/symptomchecker/{id}/results")
    public SymptomCheckerResult getResults(@PathVariable long id){
        // Some advanced algorithm to calculate the probability
        return new SymptomCheckerResult((int) (Math.random() * id) % 100);
    }

    @ApiOperation("Register or update the details for a symptom")
    @PostMapping("/symptomchecker/{id}")
    public void updateSymptoms(@RequestBody SymptomCheckerRequest symptomCheckerRequest){

    }

    @ApiOperation("Initiate a new symptom check")
    @PostMapping("/symptomchecker")
    public long initiateSymptomChecker(@RequestBody SymptomCheckerRequest symptomCheckerRequest){
        return System.currentTimeMillis();
    }
}
