package me.hjhng125.jpapropertiestest;

import java.util.LinkedHashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSourceProperties {

    private final JpaProperties jpaProperties;

    private final HibernateProperties hibernateProperties;

    public Map<String, Object> getProperties() {
        return new LinkedHashMap<>(hibernateProperties.determineHibernateProperties(
            jpaProperties.getProperties(),
            new HibernateSettings()));
    }

}
