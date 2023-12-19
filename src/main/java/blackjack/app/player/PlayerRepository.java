package blackjack.app.player;

public interface PlayerRepository {

    void save(Player player);

    Player findByName(String name);
}
