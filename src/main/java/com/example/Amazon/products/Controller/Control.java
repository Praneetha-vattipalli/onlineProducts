package com.example.Amazon.products.Controller;


import com.example.Amazon.products.Model.Product;
import com.example.Amazon.products.Service.ServiceImple;
import com.example.Amazon.products.VO.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/products/")
public class Control {

    //private static final String PRODUCT_SERVICE = "product_service";
    @Autowired
     ServiceImple si;



    @PostMapping("getProd")
    public Product addProduct(@RequestBody Product product){
        Product p= si.addProduct(product);
        return p;

    }
    @DeleteMapping("deleteProd/{pId}")
    public String  DeleteProduct(@PathVariable(value="pId") int pId)
    {
        String s=  si.DeleteProduct(pId);
        return s;
    }
    @PutMapping("update/{pId}")
    public Product UpdateProduct(@PathVariable(value="pId") int pId,@RequestBody  Product prod){
       Product p= si.UpdateProduct(pId,prod);
        return p;
    }
    @GetMapping("search/{pName}")
    public Product searchProduct(@PathVariable String pName){
        Product s= si.searchProduct(pName);
        return s;
    }
    @GetMapping("getAll")
    public List<Product> allProducts(){
        List<Product> p=si.AllProducts();
        return p;

    }
    @GetMapping("/")
    public String  get(){
        return "hi";

    }
    @GetMapping("{pId}")
    public ResponseTemplate GetProduct(@PathVariable(value = "pId") int pId) {

       // System.out.println("retry method call" + count++ + "times at" + new Date());
        ResponseTemplate r = si.Product(pId);
        return r;

    }

    public ResponseTemplate getAllProductsRating() {
        ResponseTemplate responseTemplate = new ResponseTemplate();
        responseTemplate.setProduct(null);
        responseTemplate.setRate(null);
        return responseTemplate;

    }

}
