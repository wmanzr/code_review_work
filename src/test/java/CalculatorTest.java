import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.dif(3, 2));
        assertEquals(-2, calculator.dif(-1, 1));
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.div(6, 3));
        assertThrows(ArithmeticException.class, () -> calculator.div(1, 0));
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.times(2, 3));
        assertEquals(0, calculator.times(0, 5));
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        assertEquals(-8, calculator.solver());
    }
}