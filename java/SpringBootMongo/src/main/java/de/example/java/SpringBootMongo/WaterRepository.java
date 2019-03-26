package de.example.java.SpringBootMongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WaterRepository extends MongoRepository<Water, String> {
}
