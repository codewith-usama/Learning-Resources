import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlusTwoShouldFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void SevenPlusTwoShouldNine() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(9, calculator.add(2, 7));
        assertTrue(calculator.add(2, 7) == 9);
    }

    @Test
    void threePlusSevenShouldTen() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3, 7));
    }
}