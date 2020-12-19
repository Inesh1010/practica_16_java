public class Card {

    private int value;
    private final int MIN_VALUE = 0;
    private final int MAX_VALUE = 9;

    Card(int value) { this.value = value; }

    public int getValue() { return this.value; }

    public boolean isGreater(Card card) {
        if (this.value == MIN_VALUE && card.getValue() == MAX_VALUE)
            return true;
        else if (this.value == MAX_VALUE && card.getValue() == MIN_VALUE)
            return false;
        return this.value > card.getValue();
    }

}
