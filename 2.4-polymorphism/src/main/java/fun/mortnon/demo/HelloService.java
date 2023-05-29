package fun.mortnon.demo;

import jakarta.inject.Singleton;

/**
 * @author dev2007
 * @date 2023/5/26
 */
public interface HelloService {
    String hello();

    String echo(String txt);
}
