package org.tasks.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testadd(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.substract(5,2));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 10));
    }

    @Test
    public void testFactorial() {
        Calculator calculator = new Calculator();
        assertEquals(24, calculator.factorial(4));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class,() -> calculator.divide(10,0));
    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.power(2, 3));
    }
}
