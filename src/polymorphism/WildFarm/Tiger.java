package polymorphism.WildFarm;

public class Tiger extends Felime{

    protected Tiger(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }
    @Override
    public void eat(Food food){
        if (food.getClass().getSimpleName().equals("Meat")){
            super.eat(food);
            return;
        }
        throw new IllegalArgumentException("Tigers are not eating that type of food!");
    }

    @Override
    public String makeSound() {
        return "ROAAR!!!";
    }
}
