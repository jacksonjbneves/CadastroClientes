package com.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Jackson
 */
@SpringBootApplication
public class ClienteApplication {
    
    public static void main(String[] args) {
        System.out.println("Hello World! - Rodando Spring ");
        SpringApplication.run(ClienteApplication.class, args);
    }
}
