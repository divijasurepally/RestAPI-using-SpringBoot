package com.restapi.restdemo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import filter.ApiKeyFilter;

public class ApiKeyConfig {
  @Bean
  public FilterRegistrationBean<ApiKeyFilter> apiKeyFilter() {
    FilterRegistrationBean<ApiKeyFilter> registrationBean = new FilterRegistrationBean<>();
    registrationBean.setFilter(new ApiKeyFilter("my-secret-api-key"));
    registrationBean.addUrlPatterns("/api/*"); // Specify the URL pattern to apply the filter to
    return registrationBean;
  }

}
