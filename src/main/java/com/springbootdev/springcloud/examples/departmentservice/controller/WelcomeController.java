package com.springbootdev.springcloud.examples.departmentservice.controller;

import com.springbootdev.springcloud.examples.departmentservice.configuration.ClsBehaviorTemplateProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequiredArgsConstructor
public class WelcomeController
{
    private final ClsBehaviorTemplateProperties sampleConfigurationProperties;

    @Value("${app.service-name}")
    private String serviceName;

    @GetMapping("/service")
    public String getServiceName() {
        return "service name : [" + this.serviceName + "] , " +
                " welcome message : [" + sampleConfigurationProperties.getWelcome() + "]"
                ;
    }
}
