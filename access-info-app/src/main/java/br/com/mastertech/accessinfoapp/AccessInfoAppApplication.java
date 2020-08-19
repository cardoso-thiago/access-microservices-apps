package br.com.mastertech.accessinfoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@RibbonClients
public class AccessInfoAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccessInfoAppApplication.class, args);
    }
}
