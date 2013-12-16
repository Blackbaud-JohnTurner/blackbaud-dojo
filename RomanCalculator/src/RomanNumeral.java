
public enum RomanNumeral {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private final int decimalValue;

    private RomanNumeral(int decimalValue) {
        this.decimalValue = decimalValue;
    };

    public int toDecimal() {
        return decimalValue;
    }

    public static String toRomanNumber(int decimalFromValue) {
        if (decimalFromValue < 1) {
            throw new IllegalArgumentException("");
        }
        throw new UnsupportedOperationException("");
    }


}
