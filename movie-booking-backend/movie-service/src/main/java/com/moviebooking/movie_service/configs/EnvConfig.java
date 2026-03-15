package com.moviebooking.movie_service.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:password_env.properties")
public class EnvConfig {

}