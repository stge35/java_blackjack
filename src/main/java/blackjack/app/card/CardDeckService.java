package blackjack.app.card;

import java.util.ArrayList;

public interface CardDeckService {
    ArrayList<Card> shuffle();

    ArrayList<Card> raiseCard(ArrayList<Card> cards);
}
