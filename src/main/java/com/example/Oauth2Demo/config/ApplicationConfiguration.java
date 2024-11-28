package com.example.Oauth2Demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ApplicationConfiguration {


    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{

         http.authorizeHttpRequests(
                a-> a.anyRequest().authenticated()
        ).oauth2Login(Customizer.withDefaults());

         return http.build();
    }


}
