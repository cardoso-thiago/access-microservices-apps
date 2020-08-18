package br.com.mastertech.access;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RibbonClients
public class AccessAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccessAppApplication.class, args);
    }
}
