package fun.mortnon.demo;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

/**
 * @author dev2007
 * @date 2023/5/29
 */
@Singleton
@Named("HelloTwo")
public class TwoHelloService implements HelloService {
    @Override
    public String hello() {
        return "two,hello world.";
    }

    @Override
    public String echo(String txt) {
        return "two response:" + txt;
    }
}
