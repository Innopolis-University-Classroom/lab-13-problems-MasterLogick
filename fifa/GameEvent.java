package fifa;

public class GameEvent {
    private final Team one, two;

    public GameEvent(Team one, Team two) {
        this.one = one;
        this.two = two;
    }

    public Team getOne() {
        return one;
    }

    public Team getTwo() {
        return two;
    }
}
