package edu.pwr.mlitka.myapp.config;

import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
@EnableTransactionManagement
@PropertySource({ "classpath:application.properties" })
public class PersistenceConfig {

	@Autowired
	private Environment env;

	@Bean
	public SessionFactory sessionFactory() throws Exception {
		final LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(this.restDataSource());
		sessionFactory.setPackagesToScan(new String[] { "edu.pwr.mlitka.myapp.model" });
		sessionFactory.setHibernateProperties(this.hibernateProperties());
		sessionFactory.afterPropertiesSet();
		final SessionFactory factory = sessionFactory.getObject();
		return factory;
	}

	@Bean
	public DataSource restDataSource() {
		OracleDataSource dataSource = null;
		try {
			dataSource = new OracleDataSource();
			dataSource.setDriverType(this.env.getProperty("jdbc.driverClassName"));
			dataSource.setURL(this.env.getProperty("jdbc.url"));
			dataSource.setUser(this.env.getProperty("jdbc.user"));
			dataSource.setPassword(this.env.getProperty("jdbc.pass"));
		} catch (final SQLException e) {
		}
		return dataSource;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(final SessionFactory sessionFactory) {
		final HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);
		return txManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@SuppressWarnings("serial")
	private Properties hibernateProperties() {
		return new Properties() {
			{
				this.setProperty("hibernate.dialect", PersistenceConfig.this.env.getProperty("hibernate.dialect"));
				this.setProperty("hibernate.globally_quoted_identifiers", "true");
			}
		};
	}

}
