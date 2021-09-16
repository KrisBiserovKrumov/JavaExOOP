package polymorphism.VehiclesExtension;

import java.text.DecimalFormat;

public abstract class VehicleImp implements Vehicle{
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public VehicleImp(double fuelQuantity, double fuelConsumption,double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
        this.tankCapacity = tankCapacity;
    }

    protected void setFuelConsumption(double fuelConsumption){

        this.fuelConsumption = fuelConsumption;
    }
    @Override
    public String drive(double distance){
        double fuelNeeded = distance * this.fuelConsumption;
        DecimalFormat df = new DecimalFormat("#.##");
        String result = "needs refueling";
        if (this.fuelQuantity >= fuelNeeded){
            result = String.format("travelled %s km",df.format(distance));
            this.fuelQuantity -= fuelNeeded;
        }
        return  result;
    }

    @Override
    public void refuel(double liters){
        if (liters + this.fuelQuantity > this.tankCapacity){
            System.out.println("Cannot fit fuel in tank");
        }else {
            this.fuelQuantity += liters;
        }
    }
    public String driveEmpty(double distance){
        double fuelNeeded = distance * this.fuelConsumption;
        DecimalFormat df = new DecimalFormat("#.##");
        String resultt = "needs refueling";
        if (this.fuelQuantity >= fuelNeeded){
            resultt = String.format("travelled %s km",df.format(distance));
            this.fuelQuantity -= fuelNeeded;
        }
        return  resultt;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName(),this.fuelQuantity);
    }

}
