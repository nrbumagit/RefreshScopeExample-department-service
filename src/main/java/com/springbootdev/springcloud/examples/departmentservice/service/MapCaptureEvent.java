package com.springbootdev.springcloud.examples.departmentservice.service;

import com.springbootdev.springcloud.examples.departmentservice.configuration.ClsBehaviorTemplateProperties;
import com.springbootdev.springcloud.examples.departmentservice.configuration.MapBehaviorTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class MapCaptureEvent {

    @Qualifier("eventLimitTemplate")
    private final MapBehaviorTemplate eventLimitTemplate;

    private final ClsBehaviorTemplateProperties clsBehaviorTemplateProperties;

    public String getEventLimit(){
        return clsBehaviorTemplateProperties.getEventLimit();
    }

    public String getEventLimitFromQualifierBean(){
        return eventLimitTemplate.getEventLimit();
    }

}
