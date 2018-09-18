package es.upm.miw.iwvg.junit;

import es.upm.miw.iwvg.domain.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(4,2);
    }

    @Test
    void testFraction() {
        this.fraction = new Fraction();
        assertEquals(1, this.fraction.getNumerator());
        assertEquals(1, this.fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(2, this.fraction.decimal());
    }

    @Test
    void testGetNumerator() {
        assertEquals(4, this.fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(2, this.fraction.getDenominator());
    }
}
