//package com.ysdemo.demo;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//@Configuration
//@EnableWebMvc // let spring to generate all objects that SpringMVC running required
//public class ApplicaitonConfiguration {
//    @Bean(name = "sessionFactory")
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource());
//        sessionFactory.setPackagesToScan("com.laioffer.jupiter.entity");
//        sessionFactory.setHibernateProperties(hibernateProperties());
//        return sessionFactory;
//    }
//
//    @Bean(name = "dataSource")
//    public DataSource dataSource() {
//        String RDS_INSTANCE = "";
//        String USERNAME = "";
//        String PASSWORD = "";
//        String DB_NAME = "";
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://" + RDS_INSTANCE + ":3306/"+ DB_NAME + "?createDatabaseIfNotExist=true&serverTimezone=UTC");
//        dataSource.setUsername(USERNAME);
//        dataSource.setPassword(PASSWORD);
//
//        return dataSource;
//    }
//
//}
