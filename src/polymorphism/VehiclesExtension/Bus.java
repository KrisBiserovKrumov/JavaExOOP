package polymorphism.VehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends VehicleImp {

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }
    @Override
    protected void setFuelConsumption(double fuelConsumption){

        super.setFuelConsumption(fuelConsumption + 1.4);
    }
    @Override
    public String drive(double distance){
        return "Bus " + super.drive(distance);
    }
    @Override
    public String driveEmpty(double distance){
        return "Bus " + super.driveEmpty(distance);
    }

}
