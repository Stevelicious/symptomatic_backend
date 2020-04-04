package se.symptomatic.symptomatic.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.symptomatic.symptomatic.model.SymptomChecker;
import se.symptomatic.symptomatic.model.SymptomCheckerDetail;
import se.symptomatic.symptomatic.model.SymptomCheckerResult;
import se.symptomatic.symptomatic.service.SymptomCheckerService;

@RestController
@RequestMapping("/api/v1")
public class SymptomCheckerController {

    @Autowired
    SymptomCheckerService symptomCheckerService;

    @ApiOperation("Get the result based on what the user have entered")
    @GetMapping("/symptomchecker/{id}/results")
    public SymptomCheckerResult getResults(@PathVariable("id") long id) {
        return symptomCheckerService.getResults(id);
    }

    @ApiOperation("Register or update the details for a symptom")
    @PostMapping("/symptomchecker/{id}")
    public SymptomChecker updateSymptoms(@PathVariable("id") long id, @RequestBody SymptomCheckerDetail symptomCheckerDetailRequest) {
        return symptomCheckerService.updateSymptoms(id, symptomCheckerDetailRequest);

    }

    @ApiOperation("Initiate a new symptom check")
    @PostMapping("/symptomchecker")
    public SymptomChecker initiateSymptomChecker() {
        return symptomCheckerService.initiateSymptomChecker();
    }
}
