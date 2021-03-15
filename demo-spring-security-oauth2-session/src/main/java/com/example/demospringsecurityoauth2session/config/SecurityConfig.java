package com.example.demospringsecurityoauth2session.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors()
                    .and()
                .csrf()
                    .disable()
                .sessionManagement()
                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                    .and()
                .authorizeRequests()
                    .antMatchers("/images/**", "/favicon.ico",
                        "/**/*.png", "/**/*.gif", "/**/*.svg", "/**/*.jpg", "/**/*.ttf",
                        "/swagger*/**", "/**/api-docs", "/**/ui", "/configuration/**",
                        "/**/*.html*", "/**/*.css", "/**/*.js", "/**/*.json")
                        .permitAll()
                    .antMatchers("/hello")
                    .   permitAll()
                    .anyRequest()
                        .authenticated()
                    .and()
                .headers()
                    .frameOptions().disable()

                ;
    }
}
