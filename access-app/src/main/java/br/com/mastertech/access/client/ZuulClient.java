package br.com.mastertech.access.client;

import br.com.mastertech.access.config.ResilienceConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ZUUL", configuration = ResilienceConfiguration.class)
public interface ZuulClient {

    @GetMapping("/cliente/{id}")
    Customer getCustomer(@PathVariable("id") Long id);

    @GetMapping("/porta/{id}")
    Door getDoor(@PathVariable("id") Long id);
}