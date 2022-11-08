package com.example.Amazon.products.Repository;


import com.example.Amazon.products.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface Repo extends JpaRepository<Product,Integer> {

    @Query("select p from Product p where p.pName = ?1")
    Product findBypName(@Param("pName")String pName);



}
