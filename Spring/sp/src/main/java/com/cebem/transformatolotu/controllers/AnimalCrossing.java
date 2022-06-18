package com.cebem.transformatolotu.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalCrossing {
     // http://localhost:8080/
     @GetMapping("/")
     public String door() {
         return "Bienvenido al servidor backend";
     }
    
}
