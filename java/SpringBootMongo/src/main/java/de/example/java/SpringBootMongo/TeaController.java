package de.example.java.SpringBootMongo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeaController {

    @Autowired
    private TeaRepository teaRepository;

    @RequestMapping("/tea")
    public List<Tea> getAllTeas() {
        List<Tea> teas = teaRepository.findAll();
        return teas;
    }

    @PostConstruct
    private void postConstruct() {
        teaRepository.deleteAll();
        teaRepository.save(new Tea("earl grey", "black", "3min"));
        teaRepository.save(new Tea("wild berries", "fruit", "8min"));
        teaRepository.save(new Tea("peppermint", "herbs", "5min"));
        teaRepository.save(new Tea("sencha", "green", "2min"));

    }

}
