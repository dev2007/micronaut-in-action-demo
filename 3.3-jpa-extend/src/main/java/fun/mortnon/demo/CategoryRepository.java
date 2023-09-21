package fun.mortnon.demo;

import fun.mortnon.demo.models.Category;

import java.util.List;
import java.util.Optional;

/**
 * @author dev2007
 * @date 2023/9/21
 */
public interface CategoryRepository {
    Optional<Category> findById(long id);

    Category save(String name);

    void deleteById(long id);

    List<Category> findAll();

    int update(long id, String name);
}
