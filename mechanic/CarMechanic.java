package mechanic;

public class CarMechanic {
    private final CarStates states;

    public CarMechanic(Car initial) {
        states = new CarStates();
        states.addState(initial);
    }

    public void replaceWindows(String[] newWindows) {
        Car newState = states.getCar().clone();
        newState.setWindows(newWindows);
        states.addState(newState);
    }

    public void replaceCasing(String casing) {
        Car newState = states.getCar().clone();
        newState.setCasing(casing);
        states.addState(newState);
    }

    public void replaceDoors(String[] doors) {
        Car newState = states.getCar().clone();
        newState.setDoors(doors);
        states.addState(newState);
    }

    public void replaceEngine(String engine) {
        Car newState = states.getCar().clone();
        newState.setEngine(engine);
        states.addState(newState);
    }

    public void replaceWheels(String[] wheels) {
        Car newState = states.getCar().clone();
        newState.setWheels(wheels);
        states.addState(newState);
    }

    public Car getCar() {
        return states.getCar();
    }

    public void revert() {
        states.revert();
    }
}
