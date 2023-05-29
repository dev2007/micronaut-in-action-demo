package fun.mortnon.demo;

import jakarta.inject.Singleton;

/**
 * @author dev2007
 * @date 2023/5/29
 */
@Singleton
@HelloQualifier("four")
public class HelloFourServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "four,hello world.";
    }

    @Override
    public String echo(String txt) {
        return "four response:" + txt;
    }
}
