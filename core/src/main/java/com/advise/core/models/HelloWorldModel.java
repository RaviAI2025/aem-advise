package com.advise.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

import javax.annotation.PostConstruct;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HelloWorldModel {

    private String message;

    @PostConstruct
    protected void init() {
        message = "Hello from Advise!";
    }

    public String getMessage() {
        return message;
    }
}
