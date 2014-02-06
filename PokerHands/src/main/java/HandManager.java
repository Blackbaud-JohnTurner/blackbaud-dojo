
public class HandManager {
    public HandType determineHandType(final Hand hand) {
        /*
        if(isStraight(hand) && isFlush(hand)) {
            return HandType.StraightFlush;
        }
        if(isFourOfAKind(hand)) {
            return HandType.FourOfKind;
        }
        if(isFullHouse(hand)) {
            return HandType.FullHouse;
        }
        if(isFlush(hand)) {
            return HandType.Flush;
        }
        if(isStraight(hand)) {
            return HandType.Straight;
        }
        if(isThreeOfAKind(hand)) {
            return HandType.ThreeOfKind;
        }
        if(isTwoPair(hand)) {
            return HandType.TwoPair;
        }
        */
        if(isPair(hand)) {
            return HandType.Pair;
        }
        return HandType.HighCard;
    }

    boolean isPair(final Hand hand) {
        for(int i=0; i<hand.size(); i++){
            for(int j=0; j<hand.size(); j++){
                if(j==i){ continue;}
                if(hand.get(j).getValue().compareTo(hand.get(i).getValue()) == 0)
                    return true;
            }
        }
        return false;
    }
    /*
    boolean isTwoPair(final Hand hand) {}

    boolean isThreeOfAKind(final Hand hand) {}

    boolean isFullHouse(final Hand hand) {}

    boolean isFourOfAKind(final Hand hand) {}

    boolean isStraight(final Hand hand) {}

    boolean isFlush(final Hand hand) {}
    */
}
