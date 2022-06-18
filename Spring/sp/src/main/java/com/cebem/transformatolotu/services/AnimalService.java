package com.cebem.transformatolotu.services;

import com.cebem.transformatolotu.models.Villager;

import org.springframework.stereotype.Service;

@Service
public class AnimalService {
 
    public Villager getVillagerFromAPI(){
        // TODO mejorar el random
        long randomNumber = Math.round(Math.random()*826)+1;
        String url = "http://acnhapi.com/v1/villagers/"+randomNumber;
        Object restTemplate;
        Villager villager = restTemplate.getForObject(url,Villager.class);
        return villager;
    }
}
