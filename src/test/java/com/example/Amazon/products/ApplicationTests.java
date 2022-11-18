package com.example.Amazon.products;

import com.example.Amazon.products.Controller.Control;
import com.example.Amazon.products.Model.Product;
import com.example.Amazon.products.Service.ServiceImple;
import com.example.Amazon.products.VO.Rate;
import com.example.Amazon.products.VO.ResponseTemplate;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.reactivestreams.Publisher;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static reactor.core.publisher.Mono.when;

@SpringBootTest(classes = {ApplicationTests.class})
@RunWith(MockitoJUnitRunner.class)
class ApplicationTests {

    @Mock
    ServiceImple serviceImple;
    @InjectMocks
    Control c;

    @Test
    @Order(1)
    void test_addProduct() {
        Product p1 = new Product(1221, "bangles", 2, 30, "novi");

        Mockito.when(serviceImple.addProduct(p1)).thenReturn(p1);
        assertEquals(p1, c.addProduct(p1));

    }

    @Test
    @Order(2)
    public void test_deleteProduct() {
        int pId = 1221;

//    doNothing().when(serviceImple).DeleteProduct(pId);
        serviceImple.DeleteProduct(1221);
        verify(serviceImple).DeleteProduct(1221);
    }


    @Test
    @Order(3)
    public void test_getProductUpdate() {
        int pId=1221;
        Product p=new Product(1221, "bangles", 2, 30, "novi");
        Mockito.when(serviceImple.UpdateProduct(pId,p)).thenReturn(p);
        Product p1=serviceImple.UpdateProduct(pId,p);
        assertEquals(p1,c.UpdateProduct(pId,p));
    }
    @Test
    @Order(4)
    public void test_getAllProducts(){
        List<Product> p= new ArrayList<>();
        p.add(new Product(1212,"chain",2,40,"livona"));
        p.add(new Product(1232,"bangles",3,12,"novi"));
        Mockito.when(serviceImple.AllProducts()).thenReturn(p);
        assertEquals(p,c.allProducts());
    }
@Test
@Order(5)
    public void test_searchByProductName(){
        String pName="bangles";
    Product p=new Product(1221, "bangles", 2, 30, "novi");
        Mockito.when(serviceImple.searchProduct(pName)).thenReturn(p);
        assertEquals(pName,c.searchProduct(pName).getPName());
}
@Test
    @Order(6)
    public void test_getByPId(){
        int pId=1221;
        Product p= new Product(1221,"bangles",2,30,"novi");
    Rate r= new Rate(1221,"good",2);
    ResponseTemplate r1=new ResponseTemplate(p,r);
    Mockito.when(serviceImple.Product(pId)).thenReturn(r1);
    assertEquals(r1,c.GetProduct(pId));
}
}