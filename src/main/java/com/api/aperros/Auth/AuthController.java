package com.api.aperros.Auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
@RequiredArgsConstructor
public class AuthController {

    @PostMapping(value = "/login")
    public String login(){
        return "Logueado de endpoint PUBLICO";
    }

    @PostMapping(value = "/registro")
    public String registro(){
        return "Logueado de endpoint PUBLICO REGISTRO";
    }

}
