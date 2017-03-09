package com.github.sycyhy.resource;

import com.google.auto.value.AutoValue;

/**
 * @author Lukasz Warzecha
 */
@AutoValue
public abstract class TestAutoValue {

    public abstract String getValue();

    public static TestAutoValue create(){
        return new AutoValue_TestAutoValue("value");
    }
}
