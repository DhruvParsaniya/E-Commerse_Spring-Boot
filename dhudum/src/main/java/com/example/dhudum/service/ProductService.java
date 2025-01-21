package com.example.dhudum.service;

import com.example.dhudum.model.Product;
import com.example.dhudum.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

//    public Product addProduct(Product prod, MultipartFile imgFile) throws IOException {
//        prod.setImgName(imgFile.getOriginalFilename());
//        prod.setImgType(imgFile.getContentType());
//        prod.setImgData(imgFile.getBytes());
//        return repo.save(prod);
//    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product());
    }

}
