package com.google.spring;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configurable
@ComponentScan("com.google.spring.controller")
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

}
