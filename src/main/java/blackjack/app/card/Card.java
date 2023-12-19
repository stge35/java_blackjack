package blackjack.app.card;

public class Card {

    // 카드 클래스는 플레이어, 딜러, 카드 덱에서 사용하는 클래스
    public String shape;
    public String number;

    public Card(String shape, String number) {
        this.shape = shape;
        this.number = number;
    }


}
