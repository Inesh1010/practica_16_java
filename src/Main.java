import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayDeque<Card> firstPlayerDeck = new ArrayDeque<>();
        ArrayDeque<Card> secondPlayerDeck = new ArrayDeque<>();
        final int deckSize = 5;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < deckSize; ++i) {
            Card card = new Card(scanner.nextInt());
            firstPlayerDeck.addLast(card);
        }

        for (int i = 0; i < deckSize; ++i) {
            Card card = new Card(scanner.nextInt());
            secondPlayerDeck.addLast(card);
        }


        Card firstPlayerCard, secondPlayerCard;
        int turns = 0;
        final int MAX_TURNS = 106;
        String winner = "botva";

        while (!firstPlayerDeck.isEmpty() && !secondPlayerDeck.isEmpty() && turns <= MAX_TURNS) {
            firstPlayerCard = firstPlayerDeck.pollFirst();
            secondPlayerCard = secondPlayerDeck.pollFirst();
            if (firstPlayerCard.isGreater(secondPlayerCard)) {
                firstPlayerDeck.addLast(firstPlayerCard);
                firstPlayerDeck.addLast(secondPlayerCard);
                winner = "first";
            }
            else {
                secondPlayerDeck.addLast(firstPlayerCard);
                secondPlayerDeck.addLast(secondPlayerCard);
                winner = "second";
            }
            ++turns;
        }

        if (turns > MAX_TURNS)
            System.out.println("botva");
        else
            System.out.println(winner + " " + turns);

    }

}
