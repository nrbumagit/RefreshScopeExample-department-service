package com.springbootdev.springcloud.examples.departmentservice.configuration;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ClsBehaviorTemplates {

    @RefreshScope
    @Bean("eventLimitTemplate")
    public MapBehaviorTemplate eventLimitTemplate(ClsBehaviorTemplateProperties clsBehaviorTemplateProperties) {
        return new MapBehaviorTemplate(clsBehaviorTemplateProperties.getEventLimit());
    }


}
