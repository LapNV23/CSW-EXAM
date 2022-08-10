package com.example.nguyenvanlap.seeder;

import com.example.nguyenvanlap.entity.Product;
import com.example.nguyenvanlap.repository.ProductRepository;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Component
@Slf4j
public class ApplicationSeeder implements CommandLineRunner {
    boolean createSeedData = true;
    final ProductRepository productRepository;


    public ApplicationSeeder(ProductRepository productRepository) {
        this.productRepository = productRepository;
//        this.faker = new Faker();
    }

    @Override
    public void run(String... args) throws Exception{
        if (createSeedData) {
            seedProduct();
        }
    }
    private void seedProduct() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product-01", "Ngon", 1000, 100));
        products.add(new Product("Product-02", "Ngon lắm", 8000, 1090));
        products.add(new Product("Product-03", "Cực ngon", 700000, 8200));
        products.add(new Product("Product-04", "Ngon cực kì", 300000, 4400));
        products.add(new Product("Product-05", "Không ngon", 200000, 10000));
        productRepository.saveAll(products);
    }

}
