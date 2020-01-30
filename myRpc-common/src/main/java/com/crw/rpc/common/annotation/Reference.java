package com.crw.rpc.common.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface Reference {

    Class<?> interfaceClass() default void.class;

    String interfaceName() default "";

}
