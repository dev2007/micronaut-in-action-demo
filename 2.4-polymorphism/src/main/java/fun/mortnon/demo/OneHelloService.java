package fun.mortnon.demo;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

/**
 * @author dev2007
 * @date 2023/5/29
 */
@Singleton
@Named("HelloOne")
public class OneHelloService implements HelloService {
    @Override
    public String hello() {
        return "one,hello world";
    }

    @Override
    public String echo(String txt) {
        return "one response:" + txt;
    }
}
