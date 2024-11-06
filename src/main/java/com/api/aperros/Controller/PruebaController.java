package com.api.aperros.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PruebaController {

    @GetMapping(value = "/p1")
    public String prueba(){
        return  "PRUEBA";
    }
}
