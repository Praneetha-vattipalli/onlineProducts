package com.example.Amazon.products.Service;



import com.example.Amazon.products.Model.Product;
import com.example.Amazon.products.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ServiceImple implements ServiceInfo {


    @Autowired
    Repo repo;


    @Override
    public Product addProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public String DeleteProduct(int pId) {
        repo.deleteById(pId);

        return "deleted";
    }

    @Override
    public void UpdateProduct(int pId, Product prod) {
        Product p = new Product();
        Optional<Product> p1 = repo.findById(pId);
        if (p1.isPresent()) {
            p.setPId(prod.getPId());
            p.setPName(prod.getPName());
            p.setQty(prod.getQty());
            p.setCost(prod.getCost());
            p.setLocation(prod.getLocation());
            System.out.println(p);
        } else {
            System.out.println("not found");
        }


    }


    @Override
    public Product searchProduct(String pName) {
        return repo.getReferenceById(pName);

    }


}
