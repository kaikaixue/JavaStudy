package top.xkk.java.basic.reflection;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;

    public User() {
        this.id = null;
        this.name = null;
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
