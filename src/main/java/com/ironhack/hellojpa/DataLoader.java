package com.ironhack.hellojpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final CoffeeRepository coffeeRepository;

    public DataLoader(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // create 2 coffee
        var coffee1 = new Coffee("Choco Paradise","Colombia");
        var coffee2 = new Coffee("Light Breeze","Peru");

         // store 2 coffee in database
        coffeeRepository.save(coffee1);
        coffeeRepository.save(coffee2);

        // re
    }

}
