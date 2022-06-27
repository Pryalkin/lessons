package lesson3.annotation.services;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotationService {

    String name();
    boolean lazyLoad() default false;
}
