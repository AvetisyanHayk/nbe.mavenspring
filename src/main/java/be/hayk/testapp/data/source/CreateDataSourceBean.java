package be.hayk.testapp.data.source;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

/**
 *
 * @author Hayk
 */
@Configuration
public class CreateDataSourceBean {
    @Bean
    DataSource dataSource() {
        return new JndiDataSourceLookup().getDataSource("jdbc/testappdb");
    }
}
