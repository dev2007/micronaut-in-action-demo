package fun.mortnon.demo;

import jakarta.inject.Qualifier;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author dev2007
 * @date 2023/5/29
 */
@Qualifier
@Retention(RUNTIME)
public @interface HelloQualifier {
    String value();
}
