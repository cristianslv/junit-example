package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TestExample {
    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach - executes before each test method in this class");
    }

    @Test
    void lambdaExpressions() {
        var numbers = List.of(1, 2, 3);

        assertTrue(numbers.stream()
                .mapToInt(Integer::intValue)
                .sum() > 5, () -> "Sum should be greater than 5");
    }
}
