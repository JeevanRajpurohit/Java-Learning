package com.example.springBootWithMongoDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(String id){
        return productRepository.findById(id);
    }

    public Product createProduct(Product product){
       return productRepository.save(product);
    }

    public Product updateProduct(String id, Product productDetails){
        Product product1= productRepository.findById(id).orElseThrow(()-> new RuntimeException("Product Not found"));
        product1.setName(productDetails.getName());
        product1.setPrice(productDetails.getPrice());
        product1.setDescription(productDetails.getDescription());
        return productRepository.save(product1);
    }
    public void deleteProduct(String id){
        productRepository.deleteById(id);
    }

}
