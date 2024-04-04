package org.tasks.task1;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testadd(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    @Disabled
    public void substract(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.substract(5,2));
    }

    @Test
    @Disabled
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 10));
    }
    //

    @Test
    @Disabled
    public void testPower() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.power(2, 3));
    }
}
