package fun.mortnon.demo;

import io.micronaut.context.annotation.Replaces;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.security.authentication.Authentication;
import io.micronaut.security.token.jwt.bearer.AccessRefreshTokenLoginHandler;
import io.micronaut.security.token.jwt.generator.AccessRefreshTokenGenerator;
import io.micronaut.security.token.jwt.render.AccessRefreshToken;
import jakarta.inject.Singleton;

import java.util.Optional;

/**
 * @author dev2007
 * @date 2024/2/26
 */
@Singleton
@Replaces(AccessRefreshTokenLoginHandler.class)
public class MyLoginHandler extends AccessRefreshTokenLoginHandler {
    /**
     * @param accessRefreshTokenGenerator AccessRefresh Token generator
     */
    public MyLoginHandler(AccessRefreshTokenGenerator accessRefreshTokenGenerator) {
        super(accessRefreshTokenGenerator);
    }

    @Override
    public MutableHttpResponse<?> loginSuccess(Authentication authentication, HttpRequest<?> request) {
        Optional<AccessRefreshToken> accessRefreshTokenOptional = accessRefreshTokenGenerator.generate(authentication);
        if (accessRefreshTokenOptional.isPresent()) {
            return HttpResponse.ok("login success");
        }
        return HttpResponse.serverError();
    }
}
