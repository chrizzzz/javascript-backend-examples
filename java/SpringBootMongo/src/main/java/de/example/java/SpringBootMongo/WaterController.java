package de.example.java.SpringBootMongo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WaterController {

    @Autowired
    private WaterRepository waterRepository;

    @RequestMapping("/water")
    public List<Water> getAllWaters() {
        return waterRepository.findAll();
    }

    @PostConstruct
    private void postConstruct() {
        waterRepository.deleteAll();
        waterRepository.save(new Water("purifed", "none"));
        waterRepository.save(new Water("coconut", "coconut"));
        waterRepository.save(new Water("sparkling", "lemon"));
        waterRepository.save(new Water("spring", "mint"));

    }
}
