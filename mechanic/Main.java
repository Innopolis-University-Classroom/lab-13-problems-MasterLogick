package mechanic;

public class Main {
    public static void main(String[] args) {
        CarMechanic mechanic = new CarMechanic(new Car(
                new String[]{"wheel a", "wheel b", "wheel c", "wheel d"},
                new String[]{"window a", "window b", "window c"},
                "engine aaaaa",
                new String[]{"door a", "door b", "door c"},
                "casing 123"
        ));
        mechanic.replaceCasing("adsadafsd");
        System.out.println(mechanic.getCar());
        mechanic.replaceEngine("gfedfsdasd");
        System.out.println(mechanic.getCar());
        mechanic.revert();
        System.out.println(mechanic.getCar());
    }
}
