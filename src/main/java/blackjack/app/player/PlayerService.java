package blackjack.app.player;

public interface PlayerService {
    void create(Player player);

    Player findPlayer(String name);

}
