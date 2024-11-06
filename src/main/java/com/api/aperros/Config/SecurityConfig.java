package com.api.aperros.Config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;


//Configuración cadena de filtros seguridad
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor

public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        return http
                //Desactiva CSRF
                .csrf(csrf->csrf.disable())
                //Para cada peticion HTTP
                .authorizeHttpRequests(authRequest ->
                        authRequest
                                //Autoriza a auth que es publica
                                .requestMatchers("/auth/**").permitAll()
                                .requestMatchers("/api/**").permitAll()
                                //Pide autorizacion para el resto
                                .anyRequest().authenticated()
                        )
                .formLogin(withDefaults())
                .build();
    }
}
