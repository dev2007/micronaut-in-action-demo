package fun.mortnon.demo;

import fun.mortnon.demo.models.Category;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

/**
 * @author dev2007
 * @date 2023/9/21
 */
@Repository
public interface CategoryRepositoryNew extends CrudRepository<Category,Long> {
    Category findByName(String name);
}
