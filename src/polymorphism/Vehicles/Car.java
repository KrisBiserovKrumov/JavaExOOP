package polymorphism.Vehicles;

public class Car extends VehicleImp{

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + 0.9);

    }
    @Override
    public String drive(double distance) {
        return "Car " +  super.drive(distance);
    }




}
