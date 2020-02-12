package com.cts.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySource("classpath:application.properties")
//@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("com.cts.product.service"), @ComponentScan("com.cts.product.dao") })
public class AppConfig {


	/*
	 * @Autowired private Environment env;
	 * 
	 * // ProperyPl
	 * 
	 * @Bean public DataSource getDataSource() { BasicDataSource dataSource = new
	 * BasicDataSource();
	 * dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
	 * dataSource.setUrl(env.getProperty("jdbc.url"));
	 * dataSource.setUsername(env.getProperty("jdbc.username"));
	 * dataSource.setPassword(env.getProperty("jdbc.password")); return dataSource;
	 * }
	 * 
	 * @Bean public LocalSessionFactoryBean getSessionFactory() {
	 * 
	 * LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
	 * 
	 * factoryBean.setDataSource(getDataSource());
	 * 
	 * 
	 * Properties props = new Properties(); props.put("hibernate.show_sql",
	 * env.getProperty("hibernate.show_sql")); props.put("hibernate.hbm2ddl.auto",
	 * env.getProperty("hibernate.hbm2ddl.auto")); props.put("hibernate.format_sql",
	 * env.getProperty("hibernate.format_sql")); props.put("hibernate.dialect",
	 * env.getProperty("hibernate.dialect"));
	 * factoryBean.setHibernateProperties(props);
	 * 
	 * factoryBean.setAnnotatedClasses(Product.class);
	 * 
	 * return factoryBean; }
	 * 
	 * @Bean public HibernateTransactionManager getTransactionManager() {
	 * HibernateTransactionManager transactionManager = new
	 * HibernateTransactionManager();
	 * transactionManager.setSessionFactory(getSessionFactory().getObject()); return
	 * transactionManager; }
	 * 
	 */

}
