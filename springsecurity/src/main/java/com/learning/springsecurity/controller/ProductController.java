package com.learning.springsecurity.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private record Product(Integer productId,String productName,double price){

    }
    List<Product> products=new ArrayList<>(
            List.of(
                    new Product(1,"iPhone",999.9),
                    new Product(2,"Samsung",888.9)
   )
    );
@GetMapping
    public List<Product> getProducts(){
        return products;
    }
@PostMapping
public Product saveProduct(@RequestBody Product product)    {
    products.add(product);
    return product;

}


}
