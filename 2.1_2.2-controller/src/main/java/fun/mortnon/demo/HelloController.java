package fun.mortnon.demo;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

/**
 * @author dev2007
 * @date 2023/3/24
 */
@Controller
public class HelloController {

    @Get("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello world";
    }

    @Post("/echo")
    @Consumes(MediaType.TEXT_PLAIN)
    public String echo(String txt) {
        return "response:" + txt;
    }
}
