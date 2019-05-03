package com.epam.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test add(2,3) should return 5")
    public void testAdd2Plus3() {
        int result = calculator.add(2, 3);

        assertEquals(result, 5);
    }

    @Test
    @DisplayName("Test add(3,3) should return 6")
    public void testAdd3Plus3() {
        int result = calculator.add(3, 3);

        assertEquals(result, 5);
    }
}
