package fun.mortnon.demo;

import fun.mortnon.demo.mapper.CategoryMapper;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;

import java.util.List;

/**
 * @author dev2007
 * @date 2023/9/18
 */
@Controller("/category")
public class CategoryController {
    @Inject
    private CategoryMapper categoryMapper;

    @Get("/{id}")
    public Category show(Long id) {
        return categoryMapper.findById(id);
    }

    @Put("/")
    public HttpResponse<?> update(@Body Category category) {
        categoryMapper.update(category.getId(), category.getName());
        return HttpResponse.noContent();
    }

    @Get(value = "/list")
    public List<Category> list() {
        return categoryMapper.findAll();
    }

    @Post("/")
    public HttpResponse<Category> save(@Body Category category) {
        categoryMapper.save(category);

        return HttpResponse.created(category);
    }

    @Delete("/{id}")
    public HttpResponse<?> delete(Long id) {
        categoryMapper.deleteById(id);
        return HttpResponse.noContent();
    }
}
