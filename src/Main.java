import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayDeque<Card> deck1 = new ArrayDeque<>();
        ArrayDeque<Card> deck2 = new ArrayDeque<>();
        final int size = 5;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; ++i) {
            Card card = new Card(scanner.nextInt());
            deck1.add(card);
        }

        for (int i = 0; i < size; ++i) {
            Card card = new Card(scanner.nextInt());
            deck2.add(card);
        }


        int turns = 0;
        String winner = "botva";

        while (!deck1.isEmpty() && !deck2.isEmpty() && turns <= 106) {
            Card card1 = deck1.pollFirst();
            Card card2 = deck2.pollFirst();
            if (card1.isGreater(card2)) {
                deck1.addLast(card1);
                deck1.addLast(card2);
                winner = "first";
            }
            else {
                deck2.addLast(card1);
                deck2.addLast(card2);
                winner = "second";
            }
            ++turns;
        }

        if (turns > 106)
            System.out.println("botva");
        else
            System.out.println(winner + " " + turns);

    }

}
