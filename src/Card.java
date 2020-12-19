public class Card {

    private int value;
    private final int MIN_VALUE = 0;
    private final int MAX_VALUE = 9;

    Card(int value) { this.value = value; }

    public int getValue() { return this.value; }

}
