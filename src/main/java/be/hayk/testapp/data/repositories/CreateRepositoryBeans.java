package be.hayk.testapp.data.repositories;

import be.hayk.testapp.domain.TestEntity;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 *
 * @author Hayk
 */
@Configuration
@EnableJpaRepositories
public class CreateRepositoryBeans {

    @Autowired
    private DataSource dataSource;

    @Bean
    LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(dataSource);
        factory.setPackagesToScan(TestEntity.class.getPackage().getName());
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setShowSql(true);
        factory.setJpaVendorAdapter(adapter);
        factory.getJpaPropertyMap().put("hibernate.format_sql", true);
        factory.getJpaPropertyMap().put("hibernate.use_sql_comments", true);
        return factory;
    }
}
