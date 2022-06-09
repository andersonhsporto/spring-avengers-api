package com.apivengers.controller;

import com.apivengers.model.Informations;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IronController {
    @CrossOrigin
    @GetMapping(value = "/")
    @ApiOperation(value = "return informations about the avenger")
    public Informations getAvenger(@RequestParam String avenger) {
        return new IronService().getAvenger(avenger);
    }
}
