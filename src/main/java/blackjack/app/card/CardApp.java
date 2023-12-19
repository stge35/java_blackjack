package blackjack.app.card;

import java.util.ArrayList;

public class CardApp {
    public static void main(String[] args) {

        CardDeckService cardDeckService = new CardDeckServiceImpl(new TrumpCardRepository());

        ArrayList<Card> testCard = cardDeckService.shuffle();
        Card card = new Card("Spade", "5");

        int checkSum = 0;
        for(int i = 0; i < testCard.size(); i++) {
            if(testCard.get(i).number.equals(card.number) && testCard.get(i).shape.equals(card.shape)) {
                checkSum++;
            }
        }
        System.out.println(checkSum);;
        System.out.println(testCard.get(0).number);
        System.out.println(testCard.get(0).shape);
        cardDeckService.raiseCard(testCard);
        System.out.println(testCard.get(0).number);
        System.out.println(testCard.get(0).shape);
        cardDeckService.raiseCard(testCard);
        System.out.println(testCard.get(0).number);
        System.out.println(testCard.get(0).shape);
        cardDeckService.raiseCard(testCard);
        System.out.println(testCard.get(0).number);
        System.out.println(testCard.get(0).shape);


    }
}
