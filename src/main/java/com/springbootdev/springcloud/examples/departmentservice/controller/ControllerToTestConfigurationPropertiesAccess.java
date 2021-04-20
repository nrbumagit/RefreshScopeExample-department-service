package com.springbootdev.springcloud.examples.departmentservice.controller;

import com.springbootdev.springcloud.examples.departmentservice.service.MapCaptureEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ControllerToTestConfigurationPropertiesAccess {

//    private final ClsBehaviorTemplateProperties sampleConfigurationProperties;
    private final MapCaptureEvent mapCaptureEvent;

    @GetMapping("/configuration")
    public String getServiceName() {
       /* return "service name : [" + sampleConfigurationProperties.getServiceName() + "] , " +
                " welcome message : [" + sampleConfigurationProperties.getWelcome() + "]"
                ;*/

        return "EventLimit value without Qualifier: "+ mapCaptureEvent.getEventLimit() +
        " , EventLimit value with Qualifier: "+ mapCaptureEvent.getEventLimitFromQualifierBean() ;
    }

}
