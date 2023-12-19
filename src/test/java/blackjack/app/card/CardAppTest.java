package blackjack.app.card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;



class CardAppTest {


    CardDeckService cardDeckService = new CardDeckServiceImpl(new TrumpCardRepository());

    ArrayList<Card> testCard = cardDeckService.shuffle();
    Card card = new Card("Spade", "6");

    @Test
    @DisplayName("Shuffle 카드 안에 중복 카드 여부")
    public void duplicationCardInShuffleDeck_test() {
        int checkSum = 0;
        for(int i = 0; i < testCard.size(); i++) {
            if(testCard.get(i).number.equals(card.number) && testCard.get(i).shape.equals(card.shape)) {
                checkSum++;
            }
        }

        Assertions.assertEquals(1, checkSum);
    }

    @Test
    @DisplayName("Shuffle 카드 레이즈 후 맨 위 카드 삭제")
    public void deletedCardInShuffleDeckAfterRaise_test() {
        cardDeckService.raiseCard(testCard);
        Assertions.assertEquals(51, testCard.size());
    }
}