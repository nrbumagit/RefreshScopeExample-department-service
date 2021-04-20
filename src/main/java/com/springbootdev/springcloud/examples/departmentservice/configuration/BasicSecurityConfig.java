/*
package com.springbootdev.springcloud.examples.departmentservice.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        String[] actuatorReadOnlyEndpointsOpenToAll = { "/actuator/health/**", "/actuator/loggers/**", "/actuator/info", "/actuator/prometheus" };
        String actuatorRefreshEndPoint = "/actuator/refresh";
        http
                .csrf().disable()
              */
/*  .authorizeRequests()
// Here we can mention the required actuator endpoints to access without security
                    .antMatchers("/getSortHandlingUnitAggregator**")
                    .permitAll()

                    .antMatchers(HttpMethod.GET, actuatorReadOnlyEndpointsOpenToAll)
                    .permitAll()

                    .antMatchers(HttpMethod.POST, actuatorRefreshEndPoint)
                    .permitAll()

                    .antMatchers(HttpMethod.HEAD, actuatorReadOnlyEndpointsOpenToAll)
                    .permitAll()
                    //.anyRequest()
                    //.authenticated()

                .and()*//*

// This will allow all other endpoints to access without security except actuator related endpoints
                .authorizeRequests()
                    .antMatchers("/actuator/**")
                    .hasRole("ACTUATOR")
                    .anyRequest()
                    .permitAll()

                .and()
                .httpBasic()
        ;
    }
}
*/
