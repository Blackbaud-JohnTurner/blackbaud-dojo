import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: John.Turner
 * Date: 11/12/13
 * Time: 12:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzzer {

    /**
     *
     * @param start - starting number is inclusive
     * @param end - ending number is inclusive
     */
    public List<String> kataFizzBuzz(int start, int end) {
        List<String> returnList = new ArrayList<String>();
        for(int i = start; i <= end; i++){
            returnList.add(kataFizzBuzzHelper(i));
        }
        return returnList;
    }
    private static boolean isFizz(int num) {
        return (num % 3 == 0);
    }

    private static boolean isBuzz(int num) {
        return (num % 5 == 0);
    }

    private boolean isFizzBuzz(int num) {
        return isFizz(num) && isBuzz(num);
    }

    private String kataFizzBuzzHelper(int n) {
        if( isFizzBuzz(n) ){
            return "FizzBuzz";
        } else if ( isFizz(n) ){
            return "Fizz";
        } else if ( isBuzz(n) ){
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }

}
