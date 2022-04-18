package fifa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FifaGamesManager {
    private static final FifaGamesManager manager = new FifaGamesManager();
    private final Map<Team, List<Observer>> observers;

    private FifaGamesManager() {
        observers = new HashMap<>();
    }

    public static FifaGamesManager getInstance() {
        return manager;
    }

    public void addObserver(Team team, Observer observer) {
        List<Observer> observerList = observers.getOrDefault(team, new ArrayList<>());
        observerList.add(observer);
        observers.put(team, observerList);
    }

    public void onTeamsWillPlay(Team one, Team two) {
        for (Observer observer : observers.getOrDefault(one, new ArrayList<>())) {
            observer.onGame(new GameEvent(one, two));
        }
        for (Observer observer : observers.getOrDefault(two, new ArrayList<>())) {
            observer.onGame(new GameEvent(one, two));
        }
    }
}
