package polymorphism.WildFarm;

public class Cat extends Felime{
    private String breed;

    protected Cat(String name, String type, double weight, String livingRegion,String breed) {
        super(name, type, weight, livingRegion);
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Meowwww";
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.insert(super.toString().indexOf(",") + 2, this.breed + ", ");
        return stringBuilder.toString();
    }
}
