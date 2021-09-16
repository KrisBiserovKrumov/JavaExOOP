package javaAdvance.Demos.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class MakeSalads {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<String> vegetable = new ArrayDeque<>();
        ArrayDeque<Integer> caloriesOfSalads = new ArrayDeque<>();
        ArrayDeque<Integer> salads = new ArrayDeque<>();

        String[] vegetablesInput = reader.readLine().split(" ");
        int[] saladsToMake = Arrays.stream(reader.readLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        for (String vegetables : vegetablesInput) {
            vegetable.offer(vegetables);
        }
        for (int salad : saladsToMake) {
            caloriesOfSalads.push(salad);
        }
        int calories = 0;
        while (caloriesOfSalads.size() > 0){
            if (vegetable.size() < 1){
                salads.offer(caloriesOfSalads.pop());
                break;
            }
            String firstVegetable = vegetable.pop();
            if (firstVegetable.equals("tomato")){
                calories += 80;
            }else if (firstVegetable.equals("carrot")){
                calories += 136;
            }else if (firstVegetable.equals("lettuce")){
                calories += 109;
            }else {
                calories += 215;
            }
            int firstSalad = caloriesOfSalads.peekFirst();
            if (firstSalad <= calories){
                Integer finishedSalad = caloriesOfSalads.pop();
                salads.offer(finishedSalad);
                calories = 0;
            }

        }
        if (salads.size() > 0) {
            for (Integer salad : salads) {
                System.out.print(salad + " ");
            }
            System.out.println();
        }if (vegetable.size() > 0 ){

            for (String veg : vegetable) {

                System.out.print(veg + " ");
            }
        }if(caloriesOfSalads.size() > 0) {

            for (Integer caloriesOfSalad : caloriesOfSalads) {

                System.out.print(caloriesOfSalad + " ");

            }
        }
    }
}
