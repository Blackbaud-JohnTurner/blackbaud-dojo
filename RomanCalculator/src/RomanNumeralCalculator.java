public class RomanNumeralCalculator {
    public String increment(String input) {
        return input;

    }

    public String expandNumeral(String numeral) {
        for(RomanSubtractive x: RomanSubtractive.values()){
            numeral.replaceAll(x.toString(), x.getSubtractive());

        }
        return numeral;
    }




    enum RomanSubtractive {
        IV("IIII"), IX ("VIIII"), XL("XXXX"), XC("LXXXX"), CD("CCCC"), CM("DCCCC");

        private String subtractive;
        RomanSubtractive(String subtractive) {
            this.subtractive = subtractive;
        }

        public String getSubtractive(){
            return subtractive;
        }
    }



}
