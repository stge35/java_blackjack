package blackjack.app.player;

import blackjack.app.card.Card;

import java.util.ArrayList;

public class Player {

    private String name;
    private int score = 0;
    private ArrayList<Card> cards;

    public Player(String name, ArrayList<Card> cards) {
        this.name = name;
        this.cards = cards;
    }

    public String getName() {
        return name;
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
