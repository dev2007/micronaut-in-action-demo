package fun.mortnon.demo;

import fun.mortnon.demo.models.Category;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import jakarta.inject.Inject;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * @author dev2007
 * @date 2023/9/21
 */
@Repository
public abstract class CategoryRepositoryExtend implements CrudRepository<Category, Long> {
    @Inject
    private EntityManager entityManager;

    abstract Category findByName(String name);

    public List<Category> find() {
        String sql = "SELECT g FROM Category AS g";
        TypedQuery<Category> query = entityManager.createQuery(sql, Category.class);
        return query.getResultList();
    }
}
