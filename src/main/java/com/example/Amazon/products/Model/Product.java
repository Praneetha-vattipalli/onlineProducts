package com.example.Amazon.products.Model;

import lombok.*;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

@Table(name="product")
public class Product {
    @Id
    @Column(name="pid")
    int pId ;
    @Column(name="pname")
    String pName ;
    @Column(name="qty")
    int qty;
    @Column(name="cost")
    float cost;
    @Column(name="location")
    String location;
}
