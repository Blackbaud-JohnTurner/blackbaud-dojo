import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralCalculatorTest {
    RomanNumeralCalculator calculator
            ;
    @Before
    public void setup() {
        calculator = new RomanNumeralCalculator();
    }

    @Test
    public void testIncrement() {
        String one = RomanNumeral.I.name();

        String result = calculator.increment(one);

        assertEquals("II", result);
    }

    @Test
    public void testDecrement() {

    }


    @Test
    public void testExpandNumeral1() {
        String numeral = "IV";
        String expandedNumeral = calculator.expandNumeral(numeral);
        assertEquals("IIII", expandedNumeral);
       /*
        String numeral = "IX";
        String expandedNumeral = calculator.expandNumeral(numeral);
        assertEquals("VIIII", expandedNumeral);

        String numeral = "XL";
        String expandedNumeral = calculator.expandNumeral(numeral);
        assertEquals("XXXX", expandedNumeral);

        String numeral = "XC";
        String expandedNumeral = calculator.expandNumeral(numeral);
        assertEquals("LXXXX", expandedNumeral);

        String numeral = "CD";
        String expandedNumeral = calculator.expandNumeral(numeral);
        assertEquals("CCCC", expandedNumeral);

        String numeral = "CM";
        String expandedNumeral = calculator.expandNumeral(numeral);
        assertEquals("DCCCC", expandedNumeral);
        */
    }



}