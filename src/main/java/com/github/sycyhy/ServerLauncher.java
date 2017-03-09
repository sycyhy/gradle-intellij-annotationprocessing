package com.github.sycyhy;

import com.github.sycyhy.resource.TestAutoValue;
import com.github.sycyhy.resource.TestLombok;

/**
 * @author Lukasz Warzecha
 */
public class ServerLauncher {

    public static void main(String... args) throws Exception {
        // testing lombok
        TestLombok testLombok = new TestLombok();
        testLombok.setFlag(true);
        System.out.println(testLombok.toString());

        // testing autovalue
        TestAutoValue value = TestAutoValue.create();
        System.out.println(value.toString());
    }

}
