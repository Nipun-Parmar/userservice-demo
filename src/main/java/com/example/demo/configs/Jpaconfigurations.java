package com.example.demo.configs;

import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class Jpaconfigurations {
        @Bean(name = "entityManagerFactory")
        public LocalContainerEntityManagerFactoryBean entityManagerFactory
                (EntityManagerFactoryBuilder builder, DataSource dataSource) {

            return builder
                    .dataSource(dataSource)
                    .packages("com.example.entity")
                    .persistenceUnit("myPersistenceUnit")
                    .build();
        }
}
