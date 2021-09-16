package WorkShop.hardwareComponents;

import WorkShop.softwareCompunents.Software;

import java.util.HashMap;
import java.util.Map;

public abstract class Hardware {
    private String name;
    private String type;
    private int maxCapacity;
    private  int maxMemory;
    private Map<String, Software> softwareConpunents;
    private int usedCapacity;
    private int usedMemory;

    public Hardware(String name, String type, int maxCapacity, int maxMemory) {
        this.name = name;
        this.type = type;
        this.setMaxCapacity(maxCapacity);
        this.setMaxMemory(maxMemory);
        this.softwareConpunents = new HashMap<>();
        this.usedCapacity = 0;
        this.usedMemory = 0;
    }

    protected  void setMaxCapacity(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }

    protected  void setMaxMemory(int maxMemory){
        this.maxMemory = maxMemory;
    }
    public Boolean hasFreeCapacity(int capacity){
         return (this.maxCapacity
                - (this.usedCapacity + capacity)) >= 0;
    }
    public Boolean hasFreeMemory(int memory){
        return (this.maxCapacity
                - (this.usedCapacity + memory)) >= 0;
    }

    public void addSotware(Software software){

        if (this.hasFreeCapacity(software.getCapacityConsumption())
        && this.hasFreeMemory(software.getMemoryConsumption())){
            this.softwareConpunents.putIfAbsent(software.getName(),software);
            this.usedCapacity += software.getCapacityConsumption();
            this.usedMemory += software.getMemoryConsumption();

        }
    }

    public String getName() {
        return name;
    }
}

