package mechanic;

import java.util.LinkedList;

public class CarStates {
    private final LinkedList<Car> states = new LinkedList<>();

    public Car getCar() {
        return states.getFirst();
    }

    public void revert() {
        states.removeFirst();
    }

    public void addState(Car car) {
        states.addFirst(car);
    }
}
