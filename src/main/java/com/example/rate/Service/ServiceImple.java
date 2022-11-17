package com.example.rate.Service;

import com.example.rate.Entity.Rate;
import com.example.rate.Exception.RateNotFoundException;
import com.example.rate.Repository.Repo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@Slf4j
public class ServiceImple implements ServiceInfo{
    @Autowired
    Repo repo;
    @Override
    public Rate getRating(int rId) {

        return repo.findById(rId).orElseThrow(()->new RateNotFoundException("No Rate with id " + " rid " + "is found in Record"));

    }



    @Override
    public Rate addRATING(Rate rate) {
        Rate r=repo.save(rate);
        return r;
    }
}
