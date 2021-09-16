package polymorphism.WildFarm;

public class Mouse extends Mammal {


    protected Mouse(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }


    @Override
    public String makeSound() {
        return "SQUEEEAAAK!";

    }
}
