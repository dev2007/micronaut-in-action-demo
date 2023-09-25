package fun.mortnon.demo;

import fun.mortnon.demo.models.Category;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.r2dbc.annotation.R2dbcRepository;
import io.micronaut.data.repository.reactive.ReactorCrudRepository;

/**
 * @author dev2007
 * @date 2023/9/25
 */
@R2dbcRepository(dialect = Dialect.H2)
public interface CategoryRepository extends ReactorCrudRepository<Category, Long> {
}
