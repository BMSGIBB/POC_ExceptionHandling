package com.isansa.pocerrorhandling;

import com.isansa.pocerrorhandling.exception.AppException;
import com.isansa.pocerrorhandling.exception.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/example")
@RestController
public class ExampleController {

    @RequestMapping(path = "/entity", method = RequestMethod.GET)
    public TestDto getEntity() throws Exception {
        throw new EntityNotFoundException("RestController", "Entity has not been found");
    }
}
