package br.com.mastertech.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@RibbonClients
public class CustomerAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerAppApplication.class, args);
    }
}
