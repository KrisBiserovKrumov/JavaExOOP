package hero.core;

import hero.core.interfaces.MachineFactory;
import hero.core.interfaces.PilotFactory;
import hero.core.interfaces.MachinesManager;

import hero.entities.FighterImpl;
import hero.entities.PilotImpl;
import hero.entities.TankImpl;
import hero.entities.interfaces.Fighter;
import hero.entities.interfaces.Machine;
import hero.entities.interfaces.Pilot;
import hero.entities.interfaces.Tank;

import java.util.LinkedHashMap;
import java.util.Map;

public class MachinesManagerImpl implements MachinesManager {

    private Map<String, Pilot> pilotsList = new LinkedHashMap<>();
    private Map<String, Machine> machineList = new LinkedHashMap<>();

    public MachinesManagerImpl(PilotFactory pilotFactory, MachineFactory machineFactory,
                               Map<String, Pilot> pilots, Map<String, Machine> machines) {


    }


    @Override
    public String hirePilot(String name) {
        Pilot pilot = new PilotImpl(name);
        pilotsList.putIfAbsent(name, pilot);
        return String.format("Pilot %s hired", name);
    }

    @Override
    public String manufactureTank(String name, double attackPoints, double defensePoints) {
        Tank tank = new TankImpl(name, attackPoints, defensePoints);
        if (machineList.containsKey(name)) {
            return String.format("Machine %s is manufactured already", name);
        }
        machineList.putIfAbsent(name, tank);

        return String.format("Tank %s manufactured - attack: %.2f; defense: %.2f", name, attackPoints, defensePoints);
    }

    @Override
    public String manufactureFighter(String name, double attackPoints, double defensePoints) {
        Fighter fighter = new FighterImpl(name, attackPoints, defensePoints);

        if (machineList.containsKey(name)) {
            return String.format("Machine %s is manufactured already", name);
        }
        machineList.putIfAbsent(name, fighter);

        return String.format("Fighter %s manufactured - attack: %.2f; defense: %.2f", name, attackPoints, defensePoints);
    }

    @Override
    public String engageMachine(String selectedPilotName, String selectedMachineName) {
        this.pilotsList.get(selectedPilotName).addMachine(this.machineList.get(selectedMachineName));
        this.machineList.get(selectedMachineName).setPilot(this.pilotsList.get(selectedPilotName));


        return String.format("Pilot %s engaged machine %s", selectedPilotName, selectedMachineName);
    }

    @Override
    public String attackMachines(String attackingMachineName, String defendingMachineName) {
        if (!(machineList.containsKey(attackingMachineName) && machineList.containsKey(defendingMachineName))) {
            if (machineList.containsKey(attackingMachineName)) {
                return String.format("Machine %s could not be found", defendingMachineName);
            }
            return String.format("Machine %s could not be found", attackingMachineName);
        }

        Machine attacker = machineList.get(attackingMachineName);
        Machine defender = machineList.get(defendingMachineName);
        if (attacker.getAttackPoints() > defender.getDefensePoints()) {
            if (attacker.getAttackPoints() >= defender.getHealthPoints()) {
                defender.setHealthPoints(0);
            } else {
                defender.setHealthPoints(defender.getHealthPoints()-attacker.getAttackPoints());
            }
        }
        attacker.getTargets().add(defendingMachineName);


        return String.format("Machine %s was attacked by machine %s - current health: %s",
                defender.getName(), attacker.getName(), defender.getHealthPoints());
    }

    @Override
    public String pilotReport(String pilotName) {
        return null;
    }

    @Override
    public String toggleFighterAggressiveMode(String fighterName) {
        Fighter fighter = (Fighter) machineList.get(fighterName);
        fighter.getAggressiveMode();
        return String.format("Fighter %s toggled aggressive mode", fighterName);
    }

    @Override
    public String toggleTankDefenseMode(String tankName) {
        Tank tank = (Tank) machineList.get(tankName);
        tank.getDefenseMode();
        return String.format("Tank %s toggled defense mode", tankName);
    }
}
