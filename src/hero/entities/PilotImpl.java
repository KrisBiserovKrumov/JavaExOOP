package hero.entities;

import hero.entities.interfaces.Machine;
import hero.entities.interfaces.Pilot;

import java.util.ArrayList;
import java.util.List;

public class PilotImpl implements Pilot {

    private String name;
    private List<Machine> machines;

    public PilotImpl(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Pilot name cannot be null or empty string.");
        }
        this.name = name;
        this.machines = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addMachine(Machine machine) {
        if (machine == null) {
            throw new NullPointerException("Null machine cannot be added to the pilot.");
        }
        machines.add(machine);
    }

    @Override
    public List<Machine> getMachines() {
        return this.machines;
    }

    @Override
    public String report() {
        return null;
    }
}
