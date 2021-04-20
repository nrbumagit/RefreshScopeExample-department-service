package com.springbootdev.springcloud.examples.departmentservice.configuration;

import lombok.Data;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@Data
public class MapBehaviorTemplate {

    private String eventLimit;

    public MapBehaviorTemplate(String eventLimit) {
        this.eventLimit = eventLimit;
    }
}
