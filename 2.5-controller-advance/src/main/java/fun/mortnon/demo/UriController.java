package fun.mortnon.demo;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

/**
 * @author dev2007
 * @date 2023/8/12
 */
@Controller
public class UriController {
    @Get("/get/{user}")
    public String getUser(@PathVariable String user) {
        return "user:" + user;
    }

    @Get(uris = {"/get/default/{user}", "/get/other/{user}"})
    public String getUsers(@PathVariable String user) {
        return "user:" + user;
    }
}
