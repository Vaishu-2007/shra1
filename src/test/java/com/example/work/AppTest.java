
package com.example.work;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAddition() {
        assertEquals(30.0, 20.0 + 10.0);
    }

    @Test
    public void testSubtraction() {
        assertEquals(10.0, 20.0 - 10.0);
    }

    @Test
    public void testMultiplication() {
        assertEquals(200.0, 20.0 * 10.0);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, 20.0 / 10.0);
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
    }
}
