package com.example.rate.Controller;

import com.example.rate.Entity.Rate;
import com.example.rate.Service.ServiceImple;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/api/rating")
public class Control {

@Autowired
ServiceImple serviceImple;




    @GetMapping("/get/{rId}")
    public Rate getRatting(@PathVariable(value="rId")int rId){
        log.info("inside rate controller");
        Rate r=serviceImple.getRating(rId);
        return r;

    }
    @PostMapping("/add")
    public Rate addRating(@RequestBody Rate rate){
        Rate r=serviceImple.addRATING(rate);
        return r;

    }
}
