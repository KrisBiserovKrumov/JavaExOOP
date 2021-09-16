package polymorphism.Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = reader.readLine().split("\\s+");
        Car car = new Car(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
        tokens = reader.readLine().split(" ");
        Truck truck = new Truck(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
        int n = Integer.parseInt(reader.readLine());
        while (n-- > 0){
            tokens = reader.readLine().split(" ");
            switch (tokens[0]){
                case "Drive":
                    if (tokens[1].equals("Car")){
                        System.out.println(car.drive(Double.parseDouble(tokens[2])));
                    }else {
                        System.out.println(truck.drive(Double.parseDouble(tokens[2])));
                    }
                    break;
                case "Refuel":
                    if (tokens[1].equals("Car")) {
                        car.refuel(Double.parseDouble(tokens[2]));
                    }else {
                        truck.refuel(Double.parseDouble(tokens[2]));
                    }
                    break;
            }
        }
        System.out.println(car.toString());
        System.out.println(truck.toString());
    }
}
