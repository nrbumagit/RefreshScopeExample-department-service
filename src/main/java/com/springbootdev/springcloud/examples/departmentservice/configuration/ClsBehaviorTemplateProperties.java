package com.springbootdev.springcloud.examples.departmentservice.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "app")
public class ClsBehaviorTemplateProperties {

    private String serviceName;
    private String welcome;
    private String eventLimit;

}
