package net.rafiky.inventoryservice;

import net.rafiky.inventoryservice.entities.Product;
import net.rafiky.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                    .name("Nike").price(5000).quantity(6).build());
            productRepository.save(Product.builder()
                    .name("adidas").price(2000).quantity(9).build());
            productRepository.save(Product.builder()
                    .name("newyorker").price(7000).quantity(3).build());
        };
    }

}
