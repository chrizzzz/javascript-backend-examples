package de.example.java.SpringBootMongo;

import org.springframework.data.annotation.Id;

public class Water {
    @Id
    private String id;

    private String type;
    private String taste;

    public Water(String type, String taste) {
        this.type = type;
        this.taste = taste;
    }

    public Water() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
