package com.eoms.annotion;
//模拟@Autowired注解

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ TYPE, FIELD, METHOD })
@Retention(RUNTIME)
public @interface SelfAutowired {
}
