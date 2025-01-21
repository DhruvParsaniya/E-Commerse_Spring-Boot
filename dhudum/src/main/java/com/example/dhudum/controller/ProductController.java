package com.example.dhudum.controller;

import com.example.dhudum.model.Product;
import com.example.dhudum.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

//    @PostMapping("/product")
//    public ResponseEntity<?> addProduct(@RequestPart Product prod, @RequestPart MultipartFile imgFile) throws IOException {
//        return new ResponseEntity<>(service.addProduct(prod,imgFile), HttpStatus.CREATED);
//    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }


}
