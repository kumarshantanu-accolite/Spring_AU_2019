package com.au.library;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@ComponentScan(basePackages = "com.au.library")
public class SpringConfig extends WebMvcConfigurerAdapter{
  
//    
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        converters.add(new MappingJackson2HttpMessageConverter());
//        super.configureMessageConverters(converters);
//    }
//    @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
    
//    @Bean
//    public DataSource dataSource() {
////    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
////        dataSource.setDriverClassName("");
////        dataSource.setUrl("");
////        dataSource.setUsername("");
////        dataSource.setPassword("");
////        return dataSource;
//        return new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.H2)
//                .build();
//    }
//    
//    
//    
//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        jdbcTemplate.setResultsMapCaseInsensitive(true);
//        return jdbcTemplate;
//    }
 }