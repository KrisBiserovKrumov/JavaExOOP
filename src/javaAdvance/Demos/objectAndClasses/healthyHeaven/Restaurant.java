package javaAdvance.Demos.objectAndClasses.healthyHeaven;

import java.util.ArrayList;
import java.util.List;


public class Restaurant {
    private String name;
    private List<Salad> data;

    public Restaurant( String name) {
        this.data = new ArrayList<>();
        this.name = name;
    }
    public void add(Salad salad) {
        this.data.add(salad);
    }
    public boolean buy(String name){
        boolean isBought = false;
        for (int i = 0; i < this.data.size() ; i++) {
            String currentSalad = this.data.get(i).getName();
            if (currentSalad.equals(name)){
                isBought = true;
                this.data.remove(i);
                break;
            }
        }
        return isBought;
    }
    public Salad getHealthiestSalad(){
        Salad healthiestSalad = null;
        int minCalories = Integer.MAX_VALUE;
        for (Salad salad : data) {
            if (salad.getTotalCalories() < minCalories){
                minCalories = salad.getTotalCalories();
                healthiestSalad = salad;
            }

        }
        return healthiestSalad;
    }
    public String generateMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s have %d salads:"
                ,this.name,this.data.size()));
        sb.append(System.lineSeparator());
        for (Salad salad : data) {
            sb.append(salad.toString())
                    .append(System.lineSeparator());
        }
        return sb.toString().trim();

    }

}
