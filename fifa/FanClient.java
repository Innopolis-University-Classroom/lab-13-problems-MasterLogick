package fifa;

import java.util.UUID;

public class FanClient {
    private final UUID userId;

    public FanClient() {
        userId = UUID.randomUUID();
    }

    public void subscribeOnTeam(Team team) {
        FifaGamesManager.getInstance().addObserver(team, new Observer() {
            @Override
            public void onGame(GameEvent game) {
                System.out.println("User " + userId + " notification: team "+team.getName()+" plays in game: " + game.getOne().getName() + " - " + game.getTwo().getName());
            }
        });
    }
}
