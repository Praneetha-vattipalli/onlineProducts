package com.example.rate.Repository;

import com.example.rate.Entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Rate,Integer> {
}
