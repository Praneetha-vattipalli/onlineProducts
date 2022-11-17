package com.example.rate;

import com.example.rate.Entity.Rate;
import com.example.rate.Repository.Repo;
import com.example.rate.Service.ServiceImple;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.NoResultException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = {RateApplicationTests.class})
@RunWith(MockitoJUnitRunner.class)
class RateApplicationTests {
@Mock
Repo repo;
@InjectMocks
	ServiceImple serviceImple;
	@Test @Order(1)
	void test_getRatings(){
		int rId=1221;

		Rate r= new Rate();
		r= new Rate(1221,"good",2);

		when(repo.findById(rId)).thenReturn(Optional.of(r));
		assertEquals(r,serviceImple.getRating(rId));

	}

	@Test @Order(3)
	void test_addRating(){
		Rate r=new Rate(1221,"average",2);

		when(repo.save(r)).thenReturn(r);
		assertEquals(r,serviceImple.addRATING(r));

	}


}
