import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class DojoTests {

    @Test
    public void testNotFizzBuzzable(){
        FizzBuzzer fizzBuzzer = new FizzBuzzer();
        List<String> testOutput = fizzBuzzer.kataFizzBuzz(1, 2);
        assert testOutput.get(0).equals("1");
        assert testOutput.get(1).equals("2");
    }

    @Test
    public void testFizzable() {
       FizzBuzzer fizzBuzzer = new FizzBuzzer();
       List<String> testOutput = fizzBuzzer.kataFizzBuzz(3, 3);
       assert testOutput.get(0).equals("Fizz");
    }

    @Test
    public void testBuzzable() {
       FizzBuzzer fizzBuzzer = new FizzBuzzer();
       List<String> testOutput = fizzBuzzer.kataFizzBuzz(5,5);
        assert testOutput.get(0).equals("Buzz");
    }

    @Test
    public void testFizzBuzzable() {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();
        List<String> testOutput = fizzBuzzer.kataFizzBuzz(15,15);
        assert testOutput.get(0).equals("FizzBuzz");
    }
}
