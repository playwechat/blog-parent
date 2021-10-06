package com.mszlu.blog.common.aop;


import java.lang.annotation.*;

@Target(ElementType.METHOD)//放在方法上
@Retention(RetentionPolicy.RUNTIME)//runtime表示jvm层面的注解
@Documented
public @interface LogAnnotation {
    String module() default "";
    String operater() default "";
}
