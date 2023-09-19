package fun.mortnon.demo;

import io.micronaut.core.annotation.Introspected;

/**
 * @author dev2007
 * @date 2023/9/18
 */

@Introspected
public class Book {
    private String id;
    private String name;
    private Double price;

    public Book() {

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
