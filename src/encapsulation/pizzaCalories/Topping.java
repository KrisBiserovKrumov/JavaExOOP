package encapsulation.pizzaCalories;

public class Topping {
    private String ToppingType;
    private double weight;

    public Topping(String ToppingType, double weight) {
        this.setToppingType(ToppingType);
        this.setWeight(weight);
    }

    private void setWeight(double weight) {
        Validator.validateToppingWeight(this.ToppingType,weight);
        this.weight = weight;
    }

    private void setToppingType(String type) {
        Validator.validateToppingType(type);
        this.ToppingType = type;
    }
    public double calculateCalories(){
        double calories = this.weight * 2;
        switch (this.ToppingType) {
            case "Meat":
                calories *= 1.2;
                break;
            case "Veggies":
                calories *= 0.8;
                break;
            case "Cheese":
                calories *= 1.1;
                break;
            default:
                calories *= 0.9;

                break;
        }
        return calories;
    }
}
