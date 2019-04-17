package com.tcs.ioc.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)//运行时注解
@Target(ElementType.PARAMETER)//作用在方法的参数上
@Documented
public @interface RequestParam {
    String value() default "";
}
