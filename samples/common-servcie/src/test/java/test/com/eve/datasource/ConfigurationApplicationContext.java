package test.com.eve.datasource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;

/**
 * 类说明
 * <p>
 *
 * @author 谢洋
 * @version 1.0.0
 * @date 2019/7/22
 */
public class ConfigurationApplicationContext extends ClassPathXmlApplicationContext {

    public ConfigurationApplicationContext(String... configLocations) {
        super(configLocations);
    }

    @Override
    protected void initPropertySources() {
        try {
            ResourcePropertySource rps = new ResourcePropertySource(getResource("classpath:application.properties"));
            getEnvironment().getPropertySources().addFirst(rps);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
