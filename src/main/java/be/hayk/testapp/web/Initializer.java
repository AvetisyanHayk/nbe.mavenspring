package be.hayk.testapp.web;

import be.hayk.testapp.data.repositories.CreateRepositoryBeans;
import be.hayk.testapp.data.services.CreateServiceBeans;
import be.hayk.testapp.data.source.CreateDataSourceBean;
import javax.servlet.Filter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author Hayk
 */
public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{CreateControllerBeans.class};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
            CreateDataSourceBean.class,
            CreateRepositoryBeans.class,
            CreateServiceBeans.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        return new Filter[]{new CharacterEncodingFilter("UTF-8")};
    }

}
