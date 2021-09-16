package hero.entities;

import hero.entities.interfaces.Machine;
import hero.entities.interfaces.Pilot;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseMachine implements Machine {


    private String name;
    private Pilot pilot;
    private double attackPoints;
    private double defensePoints;
    private double healthPoints;
    private List<String> targets;

    protected BaseMachine(String name, double attackPoints, double defensePoints, double healthPoints) {
        this.setName(name);
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.setHealthPoints(healthPoints);
        targets = new ArrayList<>();

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Machine name cannot be null or empty.");
        }
        this.name = name;

    }

    @Override
    public Pilot getPilot() {
        return this.pilot;
    }

    @Override
    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    @Override
    public double getHealthPoints() {
        return this.healthPoints;
    }

    @Override
    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;

    }



    @Override
    public double getAttackPoints() {
        return this.attackPoints;
    }

    public void setAttackPoints(double attackPoints) {
        this.attackPoints = attackPoints;
    }

    @Override
    public double getDefensePoints() {
        return this.defensePoints;
    }

    public void setDefensePoints(double defensePoints) {
        this.defensePoints = defensePoints;
    }

    @Override
    public List<String> getTargets() {
        return this.targets;
    }

    @Override
    public void attack(String target) {

        if (target == null || target.isEmpty()) {
            throw new IllegalArgumentException("Attack target cannot be null or empty string.");
        }

        this.targets.add(target);

    }
}
