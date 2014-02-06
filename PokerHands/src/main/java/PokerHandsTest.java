import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class PokerHandsTest {

    @Test
    public void testImport() {
        assertTrue(true);
    }

    @Test
    public void testCardCompare() {
        Card ace = new Card(Value.Ace, Suit.Spades);
        Card duece = new Card(Value.Two, Suit.Clubs);
        Card dueceCopy = new Card(Value.Two, Suit.Diamonds);
        assertEquals(1, ace.compareTo(duece));
        assertEquals(-1, duece.compareTo(ace));
        assertEquals(0, duece.compareTo(dueceCopy));
    }

    @Test
    public void handSortTest(){

        List<Card> cardList = new ArrayList<Card>();
        cardList.add(new Card(Value.Five, Suit.Spades));
        cardList.add(new Card(Value.Eight, Suit.Clubs));
        cardList.add(new Card(Value.Three, Suit.Hearts));
        cardList.add(new Card(Value.Jack, Suit.Spades));
        cardList.add(new Card(Value.King, Suit.Spades));

        Hand testHand = new Hand(cardList);

        testHand.sortHand();

        List<Card> resultList = new ArrayList<Card>();
        resultList.add(new Card(Value.Three, Suit.Hearts));
        resultList.add(new Card(Value.Five, Suit.Spades));
        resultList.add(new Card(Value.Eight, Suit.Clubs));
        resultList.add(new Card(Value.Jack, Suit.Spades));
        resultList.add(new Card(Value.King, Suit.Spades));

        Hand resultHand = new Hand(resultList);

        for(int i = 0; i < resultHand.size(); i++) {
            assertEquals(0, testHand.get(i).compareTo(resultHand.get(i)));
        }
    }

    @Test
    public void testHandCompare() {

        List<Card> cardList = new ArrayList<Card>();
        cardList.add(new Card(Value.Five, Suit.Spades));
        cardList.add(new Card(Value.Eight, Suit.Clubs));
        cardList.add(new Card(Value.Three, Suit.Hearts));
        cardList.add(new Card(Value.Jack, Suit.Spades));
        cardList.add(new Card(Value.King, Suit.Spades));

        Hand testHand = new Hand(cardList);

        List<Card> resultList = new ArrayList<Card>();
        resultList.add(new Card(Value.Three, Suit.Hearts));
        resultList.add(new Card(Value.Five, Suit.Spades));
        resultList.add(new Card(Value.Eight, Suit.Clubs));
        resultList.add(new Card(Value.Jack, Suit.Spades));
        resultList.add(new Card(Value.King, Suit.Spades));

        Hand resultHand = new Hand(resultList);


        List<Card> flushList = new ArrayList<Card>();
        resultList.add(new Card(Value.Three, Suit.Spades));
        resultList.add(new Card(Value.Five, Suit.Spades));
        resultList.add(new Card(Value.Eight, Suit.Spades));
        resultList.add(new Card(Value.Jack, Suit.Spades));
        resultList.add(new Card(Value.King, Suit.Spades));

        Hand flushHand = new Hand(flushList);

        assertEquals(0, testHand.compareTo(resultHand));
        assertEquals(1, flushHand.compareTo(resultHand));
        assertEquals(-1, resultHand.compareTo(flushHand));
    }

    @Test
    public void testDetermineHandType() {
    // add test
    }

    @Test
    public void testHandTypeIsPair() {
        HandManager hMgr = new HandManager();
        List<Card> pairList = new ArrayList<Card>();
        pairList.add(new Card(Value.Three, Suit.Spades));
        pairList.add(new Card(Value.Five, Suit.Spades));
        pairList.add(new Card(Value.Eight, Suit.Spades));
        pairList.add(new Card(Value.Jack, Suit.Spades));
        pairList.add(new Card(Value.Three, Suit.Hearts));

        Hand pairHand = new Hand(pairList);

        assertTrue(hMgr.isPair(pairHand));

    }

}

