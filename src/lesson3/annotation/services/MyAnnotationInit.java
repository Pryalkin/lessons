package lesson3.annotation.services;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotationInit {

    boolean suppressException() default false;
}
