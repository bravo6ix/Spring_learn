package com.Ming.demo.controller;

import com.Ming.demo.model.Product;
import com.Ming.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    ProductService service;


    @RequestMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

}
