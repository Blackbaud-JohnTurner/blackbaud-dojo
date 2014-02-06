
public class Card implements Comparable {

    private Value value;
    private Suit suit;

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public Value getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Object o) {
        Card otherCard = (Card) o;
        if(this.value.ordinal() > otherCard.value.ordinal()) {
            return 1;
        } else if(this.value.ordinal() < otherCard.value.ordinal()) {
            return -1;
        }
        return 0;
    }
}
