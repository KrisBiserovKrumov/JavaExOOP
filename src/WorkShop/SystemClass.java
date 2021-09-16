package WorkShop;

import WorkShop.hardwareComponents.Hardware;


import java.util.LinkedHashMap;
import java.util.Map;

public class SystemClass {
    private Map<String, Hardware> hardwareCompunents;

    public SystemClass() {
        this.hardwareCompunents = new LinkedHashMap<>();
    }
    public void addHardware(Hardware hardware){
        this.hardwareCompunents.putIfAbsent(hardware.getName(),hardware);
    }
}
