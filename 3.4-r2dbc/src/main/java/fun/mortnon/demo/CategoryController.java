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
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author dev2007
 * @date 2023/9/20
 */
@Controller("/category")
public class CategoryController {

    @Inject
    private CategoryRepository categoryRepository;

    @Get("/{id}")
    public Mono<Category> show(Long id) {
        return categoryRepository.findById(id);
    }

    @Put("/")
    public Mono<HttpResponse<?>> update(@Body Category category) {
        return categoryRepository.update(category).map(cate -> HttpResponse.noContent());
    }

    @Get(value = "/list")
    public Flux<Category> list() {
        return categoryRepository.findAll();
    }

    @Post("/")
    public Mono<HttpResponse<Category>> save(@Body Category category) {
        return categoryRepository.save(category).map(HttpResponse::created);
    }

    @Delete("/{id}")
    public HttpResponse<?> delete(Long id) {
        categoryRepository.deleteById(id);
        return HttpResponse.noContent();
    }


}
