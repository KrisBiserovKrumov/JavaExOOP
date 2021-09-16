package encapsulation.pizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dough dough = new Dough("White","Chewy",100);
        System.out.println(dough.calculateCalories());
    }
}
