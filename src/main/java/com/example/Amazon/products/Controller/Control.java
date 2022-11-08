package com.example.Amazon.products.Controller;


import com.example.Amazon.products.Model.Product;
import com.example.Amazon.products.Repository.Repo;
import com.example.Amazon.products.Service.ServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/products")
public class Control {


    @Autowired
     ServiceImple si;



    @PostMapping("/getProd")
    public Product addProduct(@RequestBody Product product){
        Product p= si.addProduct(product);
        return p;

    }
    @DeleteMapping("/deleteProd/{pId}")
    public String  DeleteProduct(@PathVariable(value="pId") int pId)
    {
        String s=  si.DeleteProduct(pId);
        return s;
    }
    @PutMapping("/update/{pId}")
    public Product UpdateProduct(@PathVariable(value="pId") int pId,@RequestBody  Product prod){
       Product p= si.UpdateProduct(pId,prod);
        return p;
    }
    @GetMapping("/search/{pName}")
    public Product searchProduct(@PathVariable String pName){
        Product s= si.searchProduct(pName);
        return s;
    }
    @GetMapping("/getAll")
    public List<Product> allProducts(){
        List<Product> p=si.AllProducts();
        return p;

    }

}
