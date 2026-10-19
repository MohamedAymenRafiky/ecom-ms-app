package net.rafiky.customerservice;

import net.rafiky.customerservice.entities.Customer;
import net.rafiky.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder()
                    .name("Aymen").email("aymen@gmail.com").build());
            customerRepository.save(Customer.builder()
                    .name("Ahmed").email("ahmed@gmail.com").build());
            customerRepository.save(Customer.builder()
                    .name("Manal").email("manal@gmail.com").build());
        };
    }

}
