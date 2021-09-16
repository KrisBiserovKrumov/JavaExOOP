package Barracks.models.units;



public class Gunner extends AbstractUnit{
    private static final int GORSEMAN_HEALTH = 20;
    private static final int GORSEMAN_DAMAGE = 20;

    protected Gunner() {
        super(Gunner.GORSEMAN_HEALTH, Gunner.GORSEMAN_DAMAGE);
    }
}
