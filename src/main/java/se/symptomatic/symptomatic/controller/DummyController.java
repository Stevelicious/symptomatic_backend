package se.symptomatic.symptomatic.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import se.symptomatic.symptomatic.model.Dummy;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1")
public class DummyController {

    @ApiOperation(value = "Returns a dummy response")
    @GetMapping(value = "/dummy", produces = APPLICATION_JSON_VALUE)
    public Dummy getData() {
        return Dummy.builder().message("Hello World!").build();
    }

    @PostMapping(value = "/dummy", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public Dummy postData(@RequestBody Dummy input) {
        return Dummy.builder().message("Hello " + input.getMessage()).build();
    }
}
