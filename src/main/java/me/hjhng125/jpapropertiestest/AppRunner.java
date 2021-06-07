package me.hjhng125.jpapropertiestest;

import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppRunner implements ApplicationRunner {

    private final DataSourceProperties dataSourceProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Map<String, Object> properties = dataSourceProperties.getProperties();

        System.out.println(properties);
    }
}
