package com.example.Amazon.products.Service;

import com.example.Amazon.products.Model.Product;

import org.springframework.stereotype.Service;

@Service
public interface ServiceInfo {
    public Product addProduct(Product product);
    public String  DeleteProduct(int pId);
    public void UpdateProduct(int pId,Product prod);
    public Product searchProduct(String pName);

}
