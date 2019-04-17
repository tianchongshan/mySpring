package com.tcs.ioc.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)//运行时注解
@Target(ElementType.FIELD)//作用在字段上
@Documented
public @interface Autowired {
    String value() default "";
}
