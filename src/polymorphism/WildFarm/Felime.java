package polymorphism.WildFarm;

public abstract class Felime extends Mammal{

    protected Felime(String name, String type, double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }
    @Override
    public void eat(Food food){
        super.setFoodEaten(food.getQuantity());
    }
}
