package hero.entities;

import hero.entities.interfaces.Tank;

public class TankImpl extends BaseMachine implements Tank {


    private static final double HEALTH_POINTS = 100.0;
    private boolean defenseMode;
    private static final double ATTACK_POINTS_MODIFIER = 40.0;
    private static final double DEFFENCE_POINTS_MODIFIER = 30.0;



    public TankImpl(String name, double attackPoints, double defensePoints) {
        super(name, attackPoints, defensePoints, HEALTH_POINTS);
        this.defenseMode = true;
    }

    @Override
    public boolean getDefenseMode() {
        return this.defenseMode;
    }

    @Override
    public void toggleDefenseMode() {

        if (this.defenseMode) {
            defenseMode = false;
            super.setAttackPoints(super.getAttackPoints() - ATTACK_POINTS_MODIFIER);
            super.setDefensePoints(super.getDefensePoints() + DEFFENCE_POINTS_MODIFIER);
        } else {
            defenseMode = true;
            super.setAttackPoints(super.getAttackPoints() + ATTACK_POINTS_MODIFIER);
            super.setDefensePoints(super.getDefensePoints() - DEFFENCE_POINTS_MODIFIER);
        }

    }
}
