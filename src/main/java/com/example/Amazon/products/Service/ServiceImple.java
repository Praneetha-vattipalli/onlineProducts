package com.example.Amazon.products.Service;



import com.example.Amazon.products.Model.Product;
import com.example.Amazon.products.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public Product UpdateProduct(int pId, Product prod) {
        Product p = new Product();
         Product p1 = repo.findById(pId).get();

            p1.setPId(prod.getPId());
            p1.setPName(prod.getPName());
            p1.setQty(prod.getQty());
            p1.setCost(prod.getCost());
            p1.setLocation(prod.getLocation());

            p= repo.save(p1);

         return p;

    }


    @Override
    public Product searchProduct(String pName) {
        Product p= repo.findBypName(pName);
        return p;
    }

    @Override
    public List<Product> AllProducts() {
        List<Product> p= repo.findAll();
        return p;
    }


}
