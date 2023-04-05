package jsonTest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"id"})
public class BeanWithIgnore {
    public BeanWithIgnore(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id;
    public String name;
}
