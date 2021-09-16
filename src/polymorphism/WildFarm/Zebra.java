package polymorphism.WildFarm;

public class Zebra extends Mammal{

    protected Zebra(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }


    @Override
    public String makeSound() {
        return "Zs";
    }
}
