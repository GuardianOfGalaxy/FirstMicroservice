package com.firstmicroservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by RaMzEsS on 27.07.2016.
 */
//@Configuration
//@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {

    /*@Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("resource/templates/");
        resolver.setSuffix(".html");
        return resolver;
    }*/

}
