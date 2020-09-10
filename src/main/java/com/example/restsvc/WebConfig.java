package com.example.restsvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("com.example.restsvc")

public class WebConfig extends WebMvcConfigurerAdapter {
    //@Override
    //public void configureViewResolvers(ViewResolverRegistry registry) {
     //   registry.jsp("/WEB-INF/templates/", ".html");
 //   }
}