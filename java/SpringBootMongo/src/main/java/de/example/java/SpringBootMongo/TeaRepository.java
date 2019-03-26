package de.example.java.SpringBootMongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeaRepository extends MongoRepository<Tea, String> {

}
