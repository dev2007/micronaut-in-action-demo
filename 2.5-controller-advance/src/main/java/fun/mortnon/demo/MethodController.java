package fun.mortnon.demo;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Patch;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;

/**
 * @author dev2007
 * @date 2023/8/12
 */
@Controller
public class MethodController {
    @Get("/get")
    public String getMethod(){
        return "get 方法";
    }

    @Put("/put")
    public String putMethod(@Body String body){
        return "put 方法，请求体：" + body;
    }

    @Patch("/patch")
    public String patchMethod(@Body String body){
        return "patch 方法，请求体：" + body;
    }

    @Post("/post")
    public String postMethod(@Body String body){
        return "post 方法，请求体：" + body;
    }

    @Post("/post/entity")
    public String postBodyMethod(@Body PostBody body){
        return "post 方法，请求体：" + body.toString();
    }
}
