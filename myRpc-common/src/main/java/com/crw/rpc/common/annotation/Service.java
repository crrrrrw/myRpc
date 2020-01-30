package com.crw.rpc.common.annotation;


import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface Service {

    Class<?> interfaceClass() default void.class;

    String interfaceName() default "";

}
