package polymorphism.Vehicles;

public class Truck extends VehicleImp{

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }
    @Override
    protected void setFuelConsumption(double fuelConsumption){
        super.setFuelConsumption(fuelConsumption + 1.6);
    }
    @Override
    public void refuel(double liters){
        super.refuel(liters * 0.95);
    }
    @Override
   public String drive(double distance){
        return "Truck " + super.drive(distance);
    }
}
