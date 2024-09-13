package com.Ming.demo.service;

import com.Ming.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "iPhone", 50000),
            new Product(102, "Canon Camera", 70000),
            new Product(103, "Shure Mic", 50000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                //.findFirst().get();
                .findFirst().orElse(new Product(100, "No Item", 0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }
}
