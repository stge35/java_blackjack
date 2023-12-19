package blackjack.app.card;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeckServiceImpl implements CardDeckService{

    private final CardRepository cardRepository;

    public CardDeckServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public ArrayList<Card> shuffle() {
        ArrayList<Card> cardDeck = cardRepository.save();
        Collections.shuffle(cardDeck);
        return cardDeck;
    }

    @Override
    public ArrayList<Card> raiseCard(ArrayList<Card> cards) {
        cards.remove(0);
        return cards;
    }
}
