package com.example.Amazon.products.Service;

import com.example.Amazon.products.Model.Product;

import java.util.List;


public interface ServiceInfo {
    public Product addProduct(Product product);
    public String  DeleteProduct(int pId);
    public Product UpdateProduct(int pId,Product prod);
    public Product searchProduct(String pName);
    public List<Product> AllProducts();

}
