package com.github.avonengel.javafeatures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwitchExpressionsTest {
    @Test
    public void testSwitchExpressions() {
        // given a String
        Object o = "Hello";

        // when we use pattern matching for instanceof
        var result = printWithType(o);

        // then the type of the object is determined
        assertEquals(String.class, result);
    }

    private static Class<?> printWithType(Object o) {
        // what is new here is that we can directly name the new variable inside the if statement
        if (o instanceof String s) {
            System.out.println("o is a String: " + s);
            return String.class;
        } else if (o instanceof Integer i) {
            System.out.println("o is an Integer: " + i);
            return Integer.class;
        } else {
            System.out.println("o is of unknown type");
            return null;
        }
    }

    @Test
    public void testSwitchExpressionsWithSwitch() {
        // given a String
        Object o = "Hello";

        // when we use pattern matching for instanceof
        var result = printWithTypeSwitch(o);

        // then the type of the object is determined
        assertEquals(String.class, result);
    }


    private static Class<?> printWithTypeSwitch(Object o) {
        // for switch expressions this form is entirely new
        switch (o) {
            case String s -> {
                System.out.println("o is a String: " + s);
                return String.class;
            }
            case Integer i -> {
                System.out.println("o is an Integer: " + i);
                return Integer.class;
            }
            case null, default -> {
                System.out.println("o is of unknown type");
                return null;
            }
        }
    }
}
