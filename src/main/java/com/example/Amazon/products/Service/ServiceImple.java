package com.example.Amazon.products.Service;



import com.example.Amazon.products.Model.Product;
import com.example.Amazon.products.Repository.Repo;
import com.example.Amazon.products.VO.Rate;
import com.example.Amazon.products.VO.ResponseTemplate;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class ServiceImple implements ServiceInfo {


    @Autowired
     Repo repo;
    @Override
    public Product addProduct(Product product) {
        Product p=repo.save(product);
        return p;
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
    @Autowired
    RestTemplate restTemplate;
    public ResponseTemplate Product(int  pId){
        ResponseTemplate r=new ResponseTemplate();
       Product product = repo.findById(pId).get();
        Rate rate= restTemplate.getForObject("http://RATE-SERVICE/api/rating/" +  product.getPId(),Rate.class);
        r.setProduct(product);
        r.setRate(rate);

        return r;
    }


}
