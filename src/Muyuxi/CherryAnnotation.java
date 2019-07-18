package Muyuxi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description
 * @author: Muyuxi
 * @Date 2019-07-15 12:56
 */

@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(value = RetentionPolicy.SOURCE)
public @interface CherryAnnotation {
    String name();
    int age() default 18;
    int[] array();
}
