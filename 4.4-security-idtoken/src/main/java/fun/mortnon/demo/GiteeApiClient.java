package fun.mortnon.demo;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.client.annotation.Client;
import org.reactivestreams.Publisher;

@Header(name = "User-Agent", value = "Micronaut")
@Client("https://gitee.com/api/v5")
public interface GiteeApiClient {
    @Get("/user")
    Publisher<GiteeUser> getUser(@PathVariable("access_token") String authorization);
}
