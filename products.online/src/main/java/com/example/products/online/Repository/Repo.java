package com.example.products.online.Repository;

import com.example.products.online.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Product,Integer> {
    //Product deleteAllById(int pId);
}
