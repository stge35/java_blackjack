package blackjack.app.card;

import java.util.ArrayList;

public class TrumpCardRepository implements CardRepository{

    private final TrumpCard trumpCard = new TrumpCard();
    private final ArrayList<Card> deck = new ArrayList<Card>();

    @Override
    public ArrayList<Card> create() {
        for(int i = 0; i < trumpCard.shapes.length; i++) {
            for(int j = 0; j < trumpCard.numbers.length; j++) {
                deck.add(new Card(trumpCard.shapes[i], trumpCard.numbers[j]));
            }
        }
        return deck;
    }
}
