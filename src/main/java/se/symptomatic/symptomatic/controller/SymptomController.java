package se.symptomatic.symptomatic.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.symptomatic.symptomatic.model.Symptom;
import se.symptomatic.symptomatic.service.SymptomService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SymptomController {

    @Autowired
    SymptomService symptomService;

    @ApiOperation("Returns a list of symptoms")
    @GetMapping("symptoms")
    public List<Symptom> getSymptoms(){
        return  symptomService.getSymptoms();
    }
}
