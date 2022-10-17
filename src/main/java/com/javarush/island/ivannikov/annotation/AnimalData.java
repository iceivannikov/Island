package com.javarush.island.ivannikov.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface AnimalData {
    String name();
    double maxWeight();
    int maxCount();
    int maxMove() default 0;
    double maxEat() default 0;
}
