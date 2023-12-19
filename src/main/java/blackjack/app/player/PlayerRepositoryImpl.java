package blackjack.app.player;

import java.util.HashMap;
import java.util.Map;

public class PlayerRepositoryImpl implements PlayerRepository{

    private static Map<String, Player> playerMap = new HashMap<>();
    @Override
    public void save(Player player) {
        playerMap.put(player.getName(), player);
    }

    @Override
    public Player findByName(String name) {
        return playerMap.get(name);
    }
}
