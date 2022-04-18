package mechanic;

import java.util.Arrays;

public class Car implements Cloneable {
    private String[] wheels;
    private String[] windows;
    private String engine;
    private String[] doors;
    private String casing;

    public Car(String[] wheels, String[] windows, String engine, String[] doors, String casing) {
        this.wheels = wheels;
        this.windows = windows;
        this.engine = engine;
        this.doors = doors;
        this.casing = casing;
    }

    @Override
    public Car clone() {
        return new Car(Arrays.copyOf(wheels, wheels.length), Arrays.copyOf(windows, windows.length), engine, Arrays.copyOf(doors, doors.length), casing);
    }

    public String[] getWheels() {
        return wheels;
    }

    public void setWheels(String[] wheels) {
        this.wheels = wheels;
    }

    public String[] getWindows() {
        return windows;
    }

    public void setWindows(String[] windows) {
        this.windows = windows;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String[] getDoors() {
        return doors;
    }

    public void setDoors(String[] doors) {
        this.doors = doors;
    }

    public String getCasing() {
        return casing;
    }

    public void setCasing(String casing) {
        this.casing = casing;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + Arrays.toString(wheels) +
                ", windows=" + Arrays.toString(windows) +
                ", engine='" + engine + '\'' +
                ", doors=" + Arrays.toString(doors) +
                ", casing='" + casing + '\'' +
                '}';
    }
}
