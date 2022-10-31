package com.example.products.online.Service;

import com.example.products.online.Repository.Repo;
import com.example.products.online.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceImple implements ServiceInfo{
    @Autowired
    Repo repo;
    @Override
    public String addProduct(Product product) {
     Product p=repo.save(product);
        return "saved";
    }

    @Override
    public String DeleteProduct(int pId) {
        repo.deleteById(pId);

        return "deleted";
    }

    @Override
    public String UpdateProduct(int pId, Product prod) {

        return null;
    }

    @Override
    public Product  searchProduct(String pName) {
        Optional<Product> p1=repo.findById(Integer.valueOf(pName));
        return p1;
    }
}
