package fun.mortnon.demo;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

/**
 * @author dev2007
 * @date 2023/8/12
 */
@Controller
public class GetController {
    @Get("/user")
    public String getName(@QueryValue String name) {
        return "name:" + name;
    }
}
