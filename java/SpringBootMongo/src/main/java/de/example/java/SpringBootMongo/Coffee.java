package de.example.java.SpringBootMongo;

import org.springframework.data.annotation.Id;

public class Coffee {

    @Id
    private String id;

    private String name;
    private String roast;
    private String intensity;

    public Coffee(String name, String roast, String intensity) {
        this.name = name;
        this.roast = roast;
        this.intensity = intensity;
    }

    public Coffee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }
}
