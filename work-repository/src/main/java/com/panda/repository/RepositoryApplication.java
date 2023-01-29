package com.panda.repository;

import com.panda.repository.autoconfigure.database.DatabaseProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RepositoryApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RepositoryApplication.class, args);
//        DatabaseProperties databaseProperties = context.getBean(DatabaseProperties.class);
//        DataSourceAutoConfiguration dataSourceAutoConfiguration = context.getBean(DataSourceAutoConfiguration.class);
//        System.out.println(databaseProperties);
//        System.out.println(dataSourceAutoConfiguration);
        System.out.println("1224");
    }

}
