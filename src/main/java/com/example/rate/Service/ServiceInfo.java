package com.example.rate.Service;

import com.example.rate.Entity.Rate;

import java.util.Optional;

public interface ServiceInfo {
    public Rate getRating(int rid);
    public Rate  addRATING(Rate rate);
}