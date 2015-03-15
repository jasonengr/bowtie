package com.kenzan.ribbonproxy.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.netflix.client.http.HttpRequest.Verb;


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Hystrix {
    
    public String groupKey();
    
    public String commandKey();
    
}
