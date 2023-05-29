package fun.mortnon.demo;

import jakarta.inject.Singleton;

/**
 * @author dev2007
 * @date 2023/5/26
 */
@Singleton
public class HelloService {
    public String hello() {
        return "hello world";
    }

    public String echo(String txt) {
        return "response:" + txt;
    }
}
