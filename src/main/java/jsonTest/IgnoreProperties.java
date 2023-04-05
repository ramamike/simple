package jsonTest;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IgnoreProperties {
    public static void main(String[] args) throws JsonProcessingException {
        BeanWithIgnore bean = new BeanWithIgnore(1, "John");

        System.out.println(new ObjectMapper().writeValueAsString(bean));
    }
}
