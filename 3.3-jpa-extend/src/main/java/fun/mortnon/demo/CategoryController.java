package fun.mortnon.demo;

import fun.mortnon.demo.models.Category;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author dev2007
 * @date 2023/9/20
 */
@Controller("/category")
public class CategoryController {
    @Inject
    private CategoryRepositoryNew categoryRepository;

    @Get("/{id}")
    public Category show(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Put("/")
    public HttpResponse<?> update(@Body Category category) {
        categoryRepository.update(category);
        return HttpResponse.noContent();
    }

    @Get(value = "/list")
    public List<Category> list() {
        Iterator<Category> iterator = categoryRepository.findAll().iterator();
        List<Category> list = new ArrayList<>();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }

        return list;
    }

    @Post("/")
    public HttpResponse<Category> save(@Body Category category) {
        Category result = categoryRepository.save(category);
        return HttpResponse.created(result);
    }

    @Delete("/{id}")
    public HttpResponse<?> delete(Long id) {
        categoryRepository.deleteById(id);
        return HttpResponse.noContent();
    }
}
