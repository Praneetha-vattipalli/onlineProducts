package com.example.rate.Controller;

import com.example.rate.Entity.Rate;
import com.example.rate.Service.ServiceImple;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



@RestController
@Slf4j
@RequestMapping(path ="/api/rating")
public class Control {

@Autowired
ServiceImple serviceImple;
@GetMapping(path="/get/{rId}")
    public Rate getRatting(@PathVariable(value="rId")int rId){
        log.info("inside rate controller");
        return serviceImple.getRating(rId);


    }
    @PostMapping(path= "/add")
    public Rate addRating(@RequestBody Rate rate){
        return serviceImple.addRATING(rate);


    }
}
