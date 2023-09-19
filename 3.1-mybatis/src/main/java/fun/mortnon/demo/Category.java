package fun.mortnon.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

/**
 * @author dev2007
 * @date 2023/9/18
 */
@Introspected
public class Category {
    @Nullable
    private Long id;

    @NotNull
    @NonNull
    private String name;

    @NonNull
    @JsonIgnore
    private Set<Book> books = new HashSet<>();

    public Category() {
    }

    public Category(@NonNull @NotNull String name) {
        this.name = name;
    }

    @Nullable
    public Long getId() {
        return id;
    }

    public void setId(@Nullable Long id) {
        this.id = id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(@NonNull Set<Book> books) {
        this.books = books;
    }
}
