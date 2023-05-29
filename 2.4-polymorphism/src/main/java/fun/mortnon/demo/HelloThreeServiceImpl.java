package fun.mortnon.demo;

import jakarta.inject.Singleton;

/**
 * @author dev2007
 * @date 2023/5/29
 */
@Singleton
@HelloQualifier("Three")
public class HelloThreeServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "three,hello world.";
    }

    @Override
    public String echo(String txt) {
        return "three response：" + txt;
    }
}
