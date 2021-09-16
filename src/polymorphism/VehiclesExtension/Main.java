package polymorphism.VehiclesExtension;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = reader.readLine().split("\\s+");
        Car car = new Car(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]));
        tokens = reader.readLine().split(" ");
        Truck truck = new Truck(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]));
        tokens = reader.readLine().split(" ");
        Bus bus = new Bus(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]));
        int n = Integer.parseInt(reader.readLine());
        while (n-- > 0){
            tokens = reader.readLine().split(" ");
            switch (tokens[0]){
                case "Drive":
                    if (tokens[1].equals("Car")){
                        System.out.println(car.drive(Double.parseDouble(tokens[2])));
                    }else if (tokens[1].equals("Truck")){
                        System.out.println(truck.drive(Double.parseDouble(tokens[2])));
                    }else {
                        System.out.println(bus.drive(Double.parseDouble(tokens[2])));
                    }
                    break;
                case "Refuel":
                    if (Double.parseDouble(tokens[2]) > 0) {
                        if (tokens[1].equals("Car")) {
                            car.refuel(Double.parseDouble(tokens[2]));
                        } else if (tokens[1].equals("Truck")){
                            truck.refuel(Double.parseDouble(tokens[2]));
                        }else {
                            bus.refuel(Double.parseDouble(tokens[2]));
                        }
                    }else {
                        System.out.println("Fuel must be a positive number");
                    }
                    break;
                case "DriveEmpty":
                    System.out.println(bus.driveEmpty(Double.parseDouble(tokens[2])));

            }

        }
        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(bus.toString());
    }
}
