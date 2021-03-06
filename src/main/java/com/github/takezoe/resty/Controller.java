package com.github.takezoe.resty;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Controller {

    /**
     *
     */
    String name();

    /**
     * Optional
     */
    String description() default "";

}
