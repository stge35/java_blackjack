package blackjack.app.player;

public class PlayerServiceImpl implements PlayerService{

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public void create(Player player) {
        playerRepository.save(player);
    }

    @Override
    public Player findPlayer(String name) {
        return playerRepository.findByName(name);
    }
}
