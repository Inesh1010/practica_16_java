import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayDeque<Card> d1 = new ArrayDeque<>();
        ArrayDeque<Card> d2= new ArrayDeque<>();
        int s = 5;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < s; ++i) {
            Card card = new Card(scanner.nextInt());
            d1.add(card);
        }

        for (int i = 0; i < s; ++i) {
            Card card = new Card(scanner.nextInt());
            d2.add(card);
        }


        int max_turns = 106;
        int turns = 0;
        String winner = "botva";

        while (!d1.isEmpty() && !d2.isEmpty() && turns <= max_turns) {
            Card card1 = d1.pollFirst();
            Card card2 = d2.pollFirst();
            if (card1.getValue() == 0 && card2.getValue() == 9) {
                d1.addLast(card1);
                d1.addLast(card2);
                winner = "first";
            }
            else if (card2.getValue() == 0 && card1.getValue() == 9) {
                d2.addLast(card1);
                d2.addLast(card2);
                winner = "second";
            }
            else if (card1.getValue() > card2.getValue()) {
                d1.addLast(card1);
                d1.addLast(card2);
                winner = "first";
            }
            else {
                d2.addLast(card1);
                d2.addLast(card2);
                winner = "second";
            }
            ++turns;
        }

        if (turns > max_turns)
            System.out.println("botva");
        else
            System.out.println(winner + " " + turns);

    }

}
