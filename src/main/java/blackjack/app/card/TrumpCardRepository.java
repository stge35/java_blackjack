package blackjack.app.card;

import java.util.ArrayList;

public class TrumpCardRepository implements CardRepository{

    String[] shapes = {"Spade", "Heart", "Diamond", "Clover"};
    String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final ArrayList<Card> deck = new ArrayList<Card>();

    @Override
    public ArrayList<Card> save() {
        for(int i = 0; i < shapes.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                deck.add(new Card(shapes[i], numbers[j]));
            }
        }
        return deck;
    }
}
