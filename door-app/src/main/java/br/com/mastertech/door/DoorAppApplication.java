package br.com.mastertech.door;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

@SpringBootApplication
@RibbonClients
public class DoorAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(DoorAppApplication.class, args);
    }
}
