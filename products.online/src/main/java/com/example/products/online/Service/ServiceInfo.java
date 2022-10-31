package com.example.products.online.Service;

import com.example.products.online.bean.Product;
import org.springframework.stereotype.Service;

@Service
public interface ServiceInfo {
    public String addProduct(Product product);
    public String  DeleteProduct(int pId);
    public String UpdateProduct(int pId,Product prod);
    public Product searchProduct(String pName);

}
