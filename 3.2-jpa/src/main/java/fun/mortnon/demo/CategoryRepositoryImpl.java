package fun.mortnon.demo;

import fun.mortnon.demo.models.Category;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author dev2007
 * @date 2023/9/20
 */
@Singleton
public class CategoryRepositoryImpl implements CategoryRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    @Transactional
    public Optional<Category> findById(long id) {
        return Optional.ofNullable(entityManager.find(Category.class, id));
    }

    @Override
    @Transactional
    public Category save(String name) {
        Category category = new Category(name);
        entityManager.persist(category);
        return category;
    }

    @Override
    @Transactional
    public void deleteById(long id) {
        findById(id).ifPresent(entityManager::remove);
    }

    @Override
    @Transactional
    public List<Category> findAll() {
        String sql = "SELECT g FROM Category AS g";
        TypedQuery<Category> query = entityManager.createQuery(sql, Category.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public int update(long id, String name) {
        return entityManager.createQuery("UPDATE Category SET name = :name where id = :id")
                .setParameter("name", name)
                .setParameter("id", id)
                .executeUpdate();
    }
}
