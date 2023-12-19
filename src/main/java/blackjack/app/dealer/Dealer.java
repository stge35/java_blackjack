package blackjack.app.dealer;

import blackjack.app.card.Card;

import java.util.ArrayList;

public class Dealer {

    private String name ="Dealer";
    private int score = 0;
    private ArrayList<Card> cards;

    public Dealer(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
