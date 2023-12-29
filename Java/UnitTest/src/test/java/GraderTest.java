import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void fiftyNineShouldReturnF() {
        Grader grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD() {
        Grader grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnC() {
        Grader grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    void eightyNineShouldReturnB() {
        Grader grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    void ninetyNineShouldReturnA() {
        Grader grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(99));
    }

    @Test
    void zeroShouldReturnF() {
        Grader grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(0));
    }

    @Test
    void sixtyShouldReturnD() {
        Grader grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(60));
    }

    @Test
    void seventyShouldReturnC() {
        Grader grader = new Grader();
        assertEquals('C', grader.determineLetterGrade(70));
    }

    @Test
    void eightyShouldReturnB() {
        Grader grader = new Grader();
        assertEquals('B', grader.determineLetterGrade(80));
    }

    @Test
    void ninetyShouldReturnD() {
        Grader grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(90));
    }

    @Test
    void negativeOneShouldReturnIllegalArgumentException() {
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> {
            grader.determineLetterGrade(-1);
        });

    }
}