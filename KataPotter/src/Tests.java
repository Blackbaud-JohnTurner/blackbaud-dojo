import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: John.Turner
 * Date: 11/12/13
 * Time: 12:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Tests {
    private static final BigDecimal TWO = BigDecimal.valueOf(2);
    private final Map<Book, Integer> order = new HashMap<>();
    private KataPotter arry;

    @Before
    public void before() {
        arry = new KataPotter();
    }

    @Test
    public void emptyOrder() {
        Assert.assertEquals(0, arry.calculateOrder(order));
    }

    @Test
    public void firstBookOnly() {
        order.put(Book.ARRY_POTTER_AND_THE_ZOMBIE_APOCALYPSE, 1);
        Assert.assertEquals(KataPotter.BOOK_COST, arry.calculateOrder(order));
    }

    @Test
    public void twoCopiesOfSameBook() {
        order.put(Book.ARRY_POTTER_AND_THE_ZOMBIE_APOCALYPSE, 2);
        Assert.assertEquals(KataPotter.BOOK_COST.multiply(TWO), arry.calculateOrder(order));
    }

    @Test
    public void twoDifferentBooks() {
        order.put(Book.ARRY_POTTER_AND_THE_ZOMBIE_APOCALYPSE, 1);
        order.put(Book.ARRY_POTTER_AND_SNAPE_KILLS_DUMBLEDORE, 1);
        Assert.assertEquals(KataPotter.BOOK_COST.multiply(TWO).multiply(KataPotter.TWO_BOOK_DISCOUNT), arry.calculateOrder(order));
    }
}
