import junit.framework.Assert;
import org.junit.Test;

public final class RomanNumeralConverterTest {
    private final RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    public void testRomanNumeralOneConversion(){
        checkIntegerMatchesNumeral(1, "I");
    }

    @Test
    public void testRomanNumeralFiveConversion() {
        checkIntegerMatchesNumeral(5, "V");
    }

    @Test
    public void testRomanNumeralTenConversion() {
        checkIntegerMatchesNumeral(10, "X");
    }

    @Test
    public void testRomanNumeralFiftyConversion() {
        checkIntegerMatchesNumeral(50, "L");
    }

    @Test
    public void testRomanNumeralOneHundredConversion() {
        checkIntegerMatchesNumeral(100, "C");
    }

    @Test
    public void testRomanNumeralFiveHundredConversion() {
        checkIntegerMatchesNumeral(500, "D");
    }

    @Test
    public void testRomanNumeralThousandConversion() {
        checkIntegerMatchesNumeral(1000, "M");
    }

    @Test
    public void testRomanNumeralTwoConversion() {
        checkIntegerMatchesNumeral(2, "II");
    }

    @Test
    public void testRomanNumeralThreeConversion() {
        checkIntegerMatchesNumeral(3, "III");
    }

    @Test
    public void testRomanNumeralFourConversion() {
        checkIntegerMatchesNumeral(4, "IV");
    }

    @Test
    public void testRomanNumeralNinetyNineConversion() {
        checkIntegerMatchesNumeral(99, "XCIX");
    }

    @Test
    public void testRomanNumeralNineHundredConversion() {
        checkIntegerMatchesNumeral(900, "CM");
    }

    @Test(expected=IllegalArgumentException.class)
    public void testRomanNumeralZero() {
        converter.convertToRomanNumeral(0);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testRomanNumeralThreeThousandAndOne() {
        converter.convertToRomanNumeral(3001);
    }


    private void checkIntegerMatchesNumeral(final int i, final String expected) {
        final String result = converter.convertToRomanNumeral(i);
        Assert.assertEquals(expected, result);
    }
}
