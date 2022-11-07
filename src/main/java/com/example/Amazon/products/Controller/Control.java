package com.example.Amazon.products.Controller;


import com.example.Amazon.products.Model.Product;
import com.example.Amazon.products.Service.ServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
@RequestMapping("api/products")
public class Control {


    @Autowired
    private ServiceImple si;

    @PostMapping("/getProd")
    public String addProduct(@RequestBody Product product){
        si.addProduct(product);
        return "added";
    }
    @DeleteMapping("/deleteProd/{pId}")
    public String  DeleteProduct(@PathVariable(value="pId") int pId)
    {
        String s=  si.DeleteProduct(pId);
        return s;
    }
    @PutMapping("/update/{pId}")
    public String UpdateProduct(@PathVariable(value="pId") int pId,@RequestBody  Product prod){
        si.UpdateProduct(pId,prod);
        return "updated";
    }
    @GetMapping("/search/{pName}")
    public Product searchProduct(@PathVariable(value=" pName") String pName){
        Product s= si.searchProduct(pName);
        return s;
    }

}
