package hero.entities;

public class FighterImpl extends BaseMachine implements hero.entities.interfaces.Fighter {

    private static final double HEALTH_POINTS =200.0;
    private boolean aggressiveMode;
    private static final double ATTACK_POINTS_MODIFIER = 50.0;
    private static final double DEFFENCE_POINTS_MODIFIER = 25.0;



    public FighterImpl(String name, double attackPoints, double defensePoints) {
        super(name, attackPoints, defensePoints, HEALTH_POINTS);
        this.aggressiveMode = true;
    }

    
    @Override
    public boolean getAggressiveMode() {
        return this.aggressiveMode;
    }

    @Override
    public void toggleAggressiveMode() {
        if (this.aggressiveMode) {
            aggressiveMode = false;
            super.setAttackPoints(super.getAttackPoints() + ATTACK_POINTS_MODIFIER);
            super.setDefensePoints(super.getDefensePoints() - DEFFENCE_POINTS_MODIFIER);
        } else {
            aggressiveMode = true;
            super.setAttackPoints(super.getAttackPoints() - ATTACK_POINTS_MODIFIER);
            super.setDefensePoints(super.getDefensePoints() + DEFFENCE_POINTS_MODIFIER);
        }

    }
}
