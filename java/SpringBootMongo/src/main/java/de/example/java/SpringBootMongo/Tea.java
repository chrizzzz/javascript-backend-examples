package de.example.java.SpringBootMongo;

import org.springframework.data.annotation.Id;

public class Tea {

    @Id
    private String id;

    private String name;
    private String type;
    private String steepingTime;

    public Tea(String name, String type, String steepingTime) {
        this.name = name;
        this.type = type;
        this.steepingTime = steepingTime;
    }

    public Tea() {
    }

    @Override
    public String toString() {
        return "Tea{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", type='" + type + '\'' + ", steepingTime='"
                + steepingTime + '\'' + '}';
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSteepingTime() {
        return steepingTime;
    }

    public void setSteepingTime(String steepingTime) {
        this.steepingTime = steepingTime;
    }
}
