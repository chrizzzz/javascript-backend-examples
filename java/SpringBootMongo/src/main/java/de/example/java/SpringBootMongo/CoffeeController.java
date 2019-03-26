package de.example.java.SpringBootMongo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeController {

    @Autowired
    private CoffeeRepository coffeeRepository;

    @RequestMapping("/coffee")
    public List<Coffee> getAllCoffees() {
        return coffeeRepository.findAll();
    }

    @PostConstruct
    private void postConstruct() {
        coffeeRepository.deleteAll();
        coffeeRepository.save(new Coffee("party parrot coffee", "medium", "high"));
        coffeeRepository.save(new Coffee("elegant elephant coffee", "light", "high"));
        coffeeRepository.save(new Coffee("hungry hummingbird coffee", "light", "light"));
        coffeeRepository.save(new Coffee("purple palm coffee", "dark", "low"));

    }
}
