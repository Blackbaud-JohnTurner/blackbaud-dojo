import java.util.Collections;
import java.util.List;

public class Hand implements Comparable{

    private List<Card> cards;
    private HandType type;

    public Hand(List<Card> cards) {
        this.cards = cards;
        this.type = HandType.HighCard;
    }
    /*
    HandType determineHandType(List<Card> cards) {
        for (HandType hand : HandType.values()) {
            if (hand)
        }
    }
    */
    public Card get(int index) {
        return cards.get(index);
    }

    public void sortHand(){
        Collections.sort(cards);
    }

    public List<Card> getHand() {
       return cards;
    }

    public int size() {
        return cards.size();
    }

    @Override
    public int compareTo(Object o) {
        Hand otherHand = (Hand) o;
        if(this.type.ordinal() > otherHand.type.ordinal()) {
            return 1;
        } else if(this.type.ordinal() < otherHand.type.ordinal()) {
            return -1;
        }
        return 0;
    }

}