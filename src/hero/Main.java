package hero;

import hero.core.MachineFactoryImpl;
import hero.core.MachinesManagerImpl;

import hero.core.PilotFactoryImpl;
import hero.core.interfaces.MachineFactory;
import hero.core.interfaces.PilotFactory;
import hero.core.interfaces.MachinesManager;
import hero.entities.interfaces.Machine;
import hero.entities.interfaces.Pilot;


import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PilotFactory pilotFactory = new PilotFactoryImpl();
        MachineFactory machineFactory = new MachineFactoryImpl();
        Map<String, Pilot> pilots = new LinkedHashMap<>();
        Map<String, Machine> machines = new LinkedHashMap<>();

        MachinesManager machinesManager = new MachinesManagerImpl(pilotFactory, machineFactory, pilots, machines);

    }
}
