package fun.mortnon.demo.models;

import io.micronaut.serde.annotation.Serdeable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.AUTO;

/**
 * @author dev2007
 * @date 2023/9/20
 */
@Serdeable
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;


    @Column(name = "name", nullable = false, unique = true)
    private String name;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}