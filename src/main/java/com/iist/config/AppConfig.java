package com.iist.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import static org.hibernate.cfg.Environment.*;

@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value = {
		@ComponentScan("com.iist.dao"),
		@ComponentScan("com.iist.business")		
})
public class AppConfig {
		
	private  Environment evn;
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		Properties prop = new Properties();
		
		prop.put(DRIVER,evn.getProperty("db_driver"));
		prop.put(URL,evn.getProperty("db_url"));
		prop.put(USER,evn.getProperty("db_name"));
		prop.put(PASS,evn.getProperty("db_pass"));
		
		prop.put(SHOW_SQL,evn.getProperty("show_sql"));
		prop.put(HBM2DDL_AUTO,evn.getProperty("hbm2ddl.auto"));
		prop.put(C3P0_MIN_SIZE,evn.getProperty("c3p0.min_size"));
		prop.put(C3P0_MAX_SIZE,evn.getProperty("c3p0.max_size"));
		prop.put(C3P0_ACQUIRE_INCREMENT,evn.getProperty("c3p0.acquire_increment"));
		prop.put(C3P0_TIMEOUT,evn.getProperty("c3p0.timeout"));
		prop.put(C3P0_MAX_STATEMENTS,evn.getProperty("c3p0.max_statement"));
		
		factoryBean.setHibernateProperties(prop);
		factoryBean.setPackagesToScan("com.iist.bo");
		return factoryBean;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getSessionFactory().getObject());
		return transactionManager;
	}
	
}
