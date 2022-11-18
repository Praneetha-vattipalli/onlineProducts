package com.example.Amazon.products.VO;

import com.example.Amazon.products.Model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {
    private Product product;
    private Rate rate;
}
