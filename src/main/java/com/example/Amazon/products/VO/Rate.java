package com.example.Amazon.products.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rate {


        @Id
        int rId;
        String comment;
        int rating;
}
