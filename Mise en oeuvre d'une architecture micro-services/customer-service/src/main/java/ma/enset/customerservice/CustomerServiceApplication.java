package ma.enset.customerservice;

import ma.enset.customerservice.dtos.CustomerRequestDTO;
import ma.enset.customerservice.services.CustomerService;
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
    CommandLineRunner start(CustomerService customerService) {
        return args -> {
            customerService.save(new CustomerRequestDTO("C01", "Soukayna", "soukaynaayoujjil@gmail.com"));
            customerService.save(new CustomerRequestDTO("C02", "Hayat", "hayatayoujjil@gmail.com"));
            customerService.save(new CustomerRequestDTO("C03", "Aya", "ayaayoujjil@gmail.com"));
        };
    }
}
