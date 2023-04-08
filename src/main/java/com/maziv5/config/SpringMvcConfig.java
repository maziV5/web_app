package com.maziv5.config;
/*
 * @author maziV5
 * @version 1.0
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.maziv5.controller","com.maziv5.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
