package com.tcs.ioc.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)//运行时注解
@Target({ElementType.TYPE,ElementType.METHOD})//作用在类和方法上
@Documented
public @interface RequestMapping {
    String value() default "";
}
