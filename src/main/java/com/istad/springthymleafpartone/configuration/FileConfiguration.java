package com.istad.springthymleafpartone.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FileConfiguration implements WebMvcConfigurer {
    // htpp://localhost:8080/images/dlfjlgdlfjlfd.png
    @Value("${server.path}")
    String serverPath;
    @Value("${client.path}")
    String client;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        WebMvcConfigurer.super.addResourceHandlers(registry);
        registry.addResourceHandler("/images/**").addResourceLocations("file:"+serverPath);
    }
}
