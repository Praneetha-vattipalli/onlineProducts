package com.example.Amazon.products.Repository;


import com.example.Amazon.products.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Repo extends JpaRepository<Product,Integer> {

    Product getReferenceById(String pName);

}
